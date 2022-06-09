package com.mono.lib.config;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mono.lib.model.Client;
import com.mono.lib.model.Currency;
import com.mono.lib.model.Webhook;
import java.util.List;
import org.junit.jupiter.api.Test;

class MapperTest {

  private static final String TEST_CURRENCY =
      "[\n"
          + "  {\n"
          + "    \"currencyCodeA\": 840,\n"
          + "    \"currencyCodeB\": 980,\n"
          + "    \"date\": 1552392228,\n"
          + "    \"rateSell\": 27,\n"
          + "    \"rateBuy\": 27.2,\n"
          + "    \"rateCross\": 27.1\n"
          + "  }\n"
          + "]";

  private static final String TEST_CLIENT =
      "{\n"
          + "  \"clientId\": \"3MSaMMtczs\",\n"
          + "  \"name\": \"Мазепа Іван\",\n"
          + "  \"webHookUrl\": \"https://example.com/some_random_data_for_security\",\n"
          + "  \"permissions\": \"psfj\",\n"
          + "  \"accounts\": [\n"
          + "    {\n"
          + "      \"id\": \"kKGVoZuHWzqVoZuH\",\n"
          + "      \"sendId\": \"uHWzqVoZuH\",\n"
          + "      \"balance\": 10000000,\n"
          + "      \"creditLimit\": 10000000,\n"
          + "      \"type\": \"black\",\n"
          + "      \"currencyCode\": 980,\n"
          + "      \"cashbackType\": \"UAH\",\n"
          + "      \"maskedPan\": [\n"
          + "        \"537541******1234\"\n"
          + "      ],\n"
          + "      \"iban\": \"UA733220010000026201234567890\"\n"
          + "    }\n"
          + "  ],\n"
          + "  \"jars\": [\n"
          + "    {\n"
          + "      \"id\": \"kKGVoZuHWzqVoZuH\",\n"
          + "      \"sendId\": \"uHWzqVoZuH\",\n"
          + "      \"title\": \"На тепловізор\",\n"
          + "      \"description\": \"На тепловізор\",\n"
          + "      \"currencyCode\": 980,\n"
          + "      \"balance\": 1000000,\n"
          + "      \"goal\": 10000000\n"
          + "    }\n"
          + "  ]\n"
          + "}";

  private static final String TEST_WEBHOOK =
      "{\n"
          + "\"webHookUrl\": \"https://example.com/some_random_data_for_security\"\n"
          + "}";

  @Test
  public void testMapToCurrencyList() throws JsonProcessingException {
    List<Currency> currencyList = Mapper.toCurrencyList(TEST_CURRENCY);
    assertFalse(currencyList.isEmpty());
  }

  @Test
  public void testMapToClient() throws JsonProcessingException {
    Client client = Mapper.toClient(TEST_CLIENT);
    assertNotNull(client);
  }

  @Test
  public void testMapToWebhook() throws JsonProcessingException {
    Webhook webhook = Mapper.toWebhook(TEST_WEBHOOK);
    assertNotNull(webhook);
  }
}