package com.mono.lib.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Client {

  public Client() {
  }

  public Client(String clientId, String name, String webHookUrl, String permissions,
      List<Account> accounts, List<Jar> jars) {
    this.clientId = clientId;
    this.name = name;
    this.webHookUrl = webHookUrl;
    this.permissions = permissions;
    this.accounts = accounts;
    this.jars = jars;
  }

  private String clientId;
  private String name;
  private String webHookUrl;
  private String permissions;
  private List<Account> accounts;
  private List<Jar> jars;

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWebHookUrl() {
    return webHookUrl;
  }

  public void setWebHookUrl(String webHookUrl) {
    this.webHookUrl = webHookUrl;
  }

  public String getPermissions() {
    return permissions;
  }

  public void setPermissions(String permissions) {
    this.permissions = permissions;
  }

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public List<Jar> getJars() {
    return jars;
  }

  public void setJars(List<Jar> jars) {
    this.jars = jars;
  }

  @Override
  public String toString() {
    return "Client{" +
        "clientId='" + clientId + '\'' +
        ", name='" + name + '\'' +
        ", webHookUrl='" + webHookUrl + '\'' +
        ", permissions='" + permissions + '\'' +
        ", accounts=" + accounts +
        ", jars=" + jars +
        '}';
  }
}
