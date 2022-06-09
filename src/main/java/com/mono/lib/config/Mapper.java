package com.mono.lib.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.mono.lib.model.Client;
import com.mono.lib.model.Currency;
import com.mono.lib.model.Statement;
import com.mono.lib.model.Webhook;
import java.util.ArrayList;
import java.util.List;

public class Mapper {

  private static final ObjectMapper MAPPER = new ObjectMapper();

  public static List<Currency> toCurrencyList(String value) throws JsonProcessingException {
    List<Currency> currencies = new ArrayList<>();
    ArrayNode arrayNode = (ArrayNode) MAPPER.readTree(value);
    for (JsonNode node : arrayNode) {
      currencies.add(MAPPER.treeToValue(node, Currency.class));
    }
    return currencies;
  }

  public static Client toClient(String value) throws JsonProcessingException {
    return MAPPER.readValue(value, Client.class);
  }

  public static List<Statement> toStatementList(String value) throws JsonProcessingException {
    List<Statement> statements = new ArrayList<>();
    ArrayNode arrayNode = (ArrayNode) MAPPER.readTree(value);
    for (JsonNode node : arrayNode) {
      statements.add(MAPPER.treeToValue(node, Statement.class));
    }
    return statements;
  }

  public static Webhook toWebhook(String value) throws JsonProcessingException {
    return MAPPER.readValue(value, Webhook.class);
  }
}
