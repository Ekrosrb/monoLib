package io.github.ekrosrb.mono.lib.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

  public Account() {
  }

  public Account(String id, String sendId, long balance, long creditLimit, String type,
      String cashbackType, List<String> maskedPan, String iban) {
    this.id = id;
    this.sendId = sendId;
    this.balance = balance;
    this.creditLimit = creditLimit;
    this.type = type;
    this.cashbackType = cashbackType;
    this.maskedPan = maskedPan;
    this.iban = iban;
  }

  private String id;
  private String sendId;
  private long balance;
  private long creditLimit;
  private String type;
  private String cashbackType;
  private List<String> maskedPan;
  private String iban;

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

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

  public long getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(long creditLimit) {
    this.creditLimit = creditLimit;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCashbackType() {
    return cashbackType;
  }

  public void setCashbackType(String cashbackType) {
    this.cashbackType = cashbackType;
  }

  public List<String> getMaskedPan() {
    return maskedPan;
  }

  public void setMaskedPan(List<String> maskedPan) {
    this.maskedPan = maskedPan;
  }

  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  @Override
  public String toString() {
    return "Account{" +
        "id='" + id + '\'' +
        ", sendId='" + sendId + '\'' +
        ", balance=" + balance +
        ", creditLimit=" + creditLimit +
        ", type='" + type + '\'' +
        ", cashbackType='" + cashbackType + '\'' +
        ", maskedPan=" + maskedPan +
        ", iban='" + iban + '\'' +
        '}';
  }
}
