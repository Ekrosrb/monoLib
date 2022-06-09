package com.mono.lib.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {

  public Currency() {
  }

  public Currency(int currencyCodeA, int currencyCodeB, long date, double rateSell, double rateBuy,
      double rateCross) {
    this.currencyCodeA = currencyCodeA;
    this.currencyCodeB = currencyCodeB;
    this.date = date;
    this.rateSell = rateSell;
    this.rateBuy = rateBuy;
    this.rateCross = rateCross;
  }

  private int currencyCodeA;
  private int currencyCodeB;
  private long date;
  private double rateSell;
  private double rateBuy;
  private double rateCross;

  public int getCurrencyCodeA() {
    return currencyCodeA;
  }

  public void setCurrencyCodeA(int currencyCodeA) {
    this.currencyCodeA = currencyCodeA;
  }

  public int getCurrencyCodeB() {
    return currencyCodeB;
  }

  public void setCurrencyCodeB(int currencyCodeB) {
    this.currencyCodeB = currencyCodeB;
  }

  public long getDate() {
    return date;
  }

  public void setDate(long date) {
    this.date = date;
  }

  public double getRateSell() {
    return rateSell;
  }

  public void setRateSell(double rateSell) {
    this.rateSell = rateSell;
  }

  public double getRateBuy() {
    return rateBuy;
  }

  public void setRateBuy(double rateBuy) {
    this.rateBuy = rateBuy;
  }

  public double getRateCross() {
    return rateCross;
  }

  public void setRateCross(double rateCross) {
    this.rateCross = rateCross;
  }

  @Override
  public String toString() {
    return "Currency{" +
        "currencyCodeA=" + currencyCodeA +
        ", currencyCodeB=" + currencyCodeB +
        ", date=" + date +
        ", rateSell=" + rateSell +
        ", rateBuy=" + rateBuy +
        ", rateCross=" + rateCross +
        '}';
  }
}
