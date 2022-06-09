package io.github.ekrosrb.mono.lib.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Jar {

  public Jar() {
  }

  public Jar(String id, String sendId, String title, String description, int currencyCode,
      long balance, long goal) {
    this.id = id;
    this.sendId = sendId;
    this.title = title;
    this.description = description;
    this.currencyCode = currencyCode;
    this.balance = balance;
    this.goal = goal;
  }

  private String id;
  private String sendId;
  private String title;
  private String description;
  private int currencyCode;
  private long balance;
  private long goal;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSendId() {
    return sendId;
  }

  public void setSendId(String sendId) {
    this.sendId = sendId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(int currencyCode) {
    this.currencyCode = currencyCode;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public long getGoal() {
    return goal;
  }

  public void setGoal(long goal) {
    this.goal = goal;
  }

  @Override
  public String toString() {
    return "Jar{" +
        "id='" + id + '\'' +
        ", sendId='" + sendId + '\'' +
        ", title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", currencyCode=" + currencyCode +
        ", balance=" + balance +
        ", goal=" + goal +
        '}';
  }
}
