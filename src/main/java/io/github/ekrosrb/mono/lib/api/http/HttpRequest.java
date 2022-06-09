package io.github.ekrosrb.mono.lib.api.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.net.ssl.HttpsURLConnection;

public class HttpRequest {

  private HttpRequest() {
  }

  private static final String HOST = "https://api.monobank.ua";
  private static final String CURRENCY_PATH = "/bank/currency";
  private static final String CLIENT_INFO_PATH = "/personal/client-info";
  private static final String WEBHOOK_PATH = "/personal/webhook";
  private static final String STATEMENT_PATH = "/personal/statement/%s/%s/%s";

  private static final int CONNECTION_TIMEOUT = 10000;
  private static final int SUCCESS_CODE = 200;

  private static final String X_TOKEN = "X-Token";

  public static String requestCurrency() throws IOException {
    HttpsURLConnection connection = createConnection(CURRENCY_PATH);
    if (connection.getResponseCode() != SUCCESS_CODE) {
      return "[]";
    }
    return readInputStream(connection.getInputStream());
  }

  public static String requestClientInfo(String xToken) throws IOException {
    HttpsURLConnection connection = createConnection(CLIENT_INFO_PATH);
    connection.setRequestProperty(X_TOKEN, xToken);
    if (connection.getResponseCode() != SUCCESS_CODE) {
      return "{}";
    }
    return readInputStream(connection.getInputStream());
  }

  public static String requestStatementInfo(String xToken, String account, long from, long to)
      throws IOException {
    String path = String.format(STATEMENT_PATH, account, from, to);
    HttpsURLConnection connection = createConnection(path);
    connection.setRequestProperty(X_TOKEN, xToken);
    if (connection.getResponseCode() != SUCCESS_CODE) {
      return "[]";
    }
    return readInputStream(connection.getInputStream());
  }

  public static String requestWebhook(String xToken, String webhook) throws IOException {
    HttpsURLConnection connection = createConnection(WEBHOOK_PATH);
    connection.setRequestProperty(X_TOKEN, xToken);
    connection.setRequestProperty("Content-Type", "application/json");
    connection.setRequestMethod("POST");
    OutputStream os = connection.getOutputStream();
    OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
    osw.write("{\"webHookUrl\":\"" + webhook + "\"}");
    osw.flush();
    osw.close();
    if (connection.getResponseCode() != SUCCESS_CODE) {
      return "{}";
    }
    return readInputStream(connection.getInputStream());
  }

  private static String readInputStream(InputStream inputStream) throws IOException {

    int i;
    StringBuilder value = new StringBuilder();
    while ((i = inputStream.read()) != -1) {
      value.append((char) i);
    }
    inputStream.close();
    return value.toString();
  }

  private static HttpsURLConnection createConnection(String path) throws IOException {
    HttpsURLConnection connection =
        (HttpsURLConnection) new URL(HOST + path).openConnection();
    connection.setConnectTimeout(CONNECTION_TIMEOUT);
    return connection;
  }
}
