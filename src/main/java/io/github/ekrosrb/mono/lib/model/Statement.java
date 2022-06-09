package io.github.ekrosrb.mono.lib.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Statement {

  public Statement() {
  }

  public Statement(String id, long time, String description, int mcc, int originalMcc, boolean hold,
      long amount, long operationAmount, int currencyCode, long commissionRate, long cashbackAmount,
      String comment, String receiptId, String invoiceId, String counterEdrpou,
      String counterIban) {
    this.id = id;
    this.time = time;
    this.description = description;
    this.mcc = mcc;
    this.originalMcc = originalMcc;
    this.hold = hold;
    this.amount = amount;
    this.operationAmount = operationAmount;
    this.currencyCode = currencyCode;
    this.commissionRate = commissionRate;
    this.cashbackAmount = cashbackAmount;
    this.comment = comment;
    this.receiptId = receiptId;
    this.invoiceId = invoiceId;
    this.counterEdrpou = counterEdrpou;
    this.counterIban = counterIban;
  }

  private String id;
  private long time;
  private String description;
  private int mcc;
  private int originalMcc;
  private boolean hold;
  private long amount;
  private long operationAmount;
  private int currencyCode;
  private long commissionRate;
  private long cashbackAmount;
  private String comment;
  private String receiptId;
  private String invoiceId;
  private String counterEdrpou;
  private String counterIban;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getMcc() {
    return mcc;
  }

  public void setMcc(int mcc) {
    this.mcc = mcc;
  }

  public int getOriginalMcc() {
    return originalMcc;
  }

  public void setOriginalMcc(int originalMcc) {
    this.originalMcc = originalMcc;
  }

  public boolean isHold() {
    return hold;
  }

  public void setHold(boolean hold) {
    this.hold = hold;
  }

  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }

  public long getOperationAmount() {
    return operationAmount;
  }

  public void setOperationAmount(long operationAmount) {
    this.operationAmount = operationAmount;
  }

  public int getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(int currencyCode) {
    this.currencyCode = currencyCode;
  }

  public long getCommissionRate() {
    return commissionRate;
  }

  public void setCommissionRate(long commissionRate) {
    this.commissionRate = commissionRate;
  }

  public long getCashbackAmount() {
    return cashbackAmount;
  }

  public void setCashbackAmount(long cashbackAmount) {
    this.cashbackAmount = cashbackAmount;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getReceiptId() {
    return receiptId;
  }

  public void setReceiptId(String receiptId) {
    this.receiptId = receiptId;
  }

  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public String getCounterEdrpou() {
    return counterEdrpou;
  }

  public void setCounterEdrpou(String counterEdrpou) {
    this.counterEdrpou = counterEdrpou;
  }

  public String getCounterIban() {
    return counterIban;
  }

  public void setCounterIban(String counterIban) {
    this.counterIban = counterIban;
  }

  @Override
  public String toString() {
    return "Statement{" +
        "id='" + id + '\'' +
        ", time=" + time +
        ", description='" + description + '\'' +
        ", mcc=" + mcc +
        ", originalMcc=" + originalMcc +
        ", hold=" + hold +
        ", amount=" + amount +
        ", operationAmount=" + operationAmount +
        ", currencyCode=" + currencyCode +
        ", commissionRate=" + commissionRate +
        ", cashbackAmount=" + cashbackAmount +
        ", comment='" + comment + '\'' +
        ", receiptId='" + receiptId + '\'' +
        ", invoiceId='" + invoiceId + '\'' +
        ", counterEdrpou='" + counterEdrpou + '\'' +
        ", counterIban='" + counterIban + '\'' +
        '}';
  }
}
