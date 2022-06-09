package com.mono.lib.api;

import static java.lang.System.*;

import com.mono.lib.api.http.HttpRequest;
import com.mono.lib.config.Mapper;
import com.mono.lib.model.Client;
import com.mono.lib.model.Currency;
import com.mono.lib.model.Statement;
import com.mono.lib.model.Webhook;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class MonoAPI {

  private static List<Currency> currencyCache;
  private static long lastCurrencyCacheUpdate = 0;
  private static final long UPDATE_TIME = 30000;

  public static List<Currency> getCurrency(){
    if(currencyCache != null && currentTimeMillis() - lastCurrencyCacheUpdate > UPDATE_TIME){
      lastCurrencyCacheUpdate = currentTimeMillis();
      return currencyCache;
    }
    try {
      currencyCache = Mapper.toCurrencyList(HttpRequest.requestCurrency());
      return currencyCache;
    } catch (IOException e) {
      return Collections.emptyList();
    }
  }

  public static Client getClient(String xToken){
    try {
      return Mapper.toClient(HttpRequest.requestClientInfo(xToken));
    } catch (IOException e) {
      return new Client();
    }
  }

  public static List<Statement> getStatementList(String xToken, String account, long from, long to){
    try {
      return Mapper.toStatementList(HttpRequest.requestStatementInfo(xToken, account, from, to));
    } catch (IOException e) {
      e.printStackTrace();
      return Collections.emptyList();
    }
  }

  public static Webhook setWebhook(String xToken, String webhookUrl){
    try {
      return Mapper.toWebhook(HttpRequest.requestWebhook(xToken, webhookUrl));
    } catch (IOException e) {
      return new Webhook();
    }
  }

}
