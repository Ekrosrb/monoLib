package io.github.ekrosrb.mono.lib.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Webhook {

  public Webhook() {
  }

  public Webhook(String webHookUrl) {
    this.webHookUrl = webHookUrl;
  }

  private String webHookUrl;

  public String getWebHookUrl() {
    return webHookUrl;
  }

  public void setWebHookUrl(String webHookUrl) {
    this.webHookUrl = webHookUrl;
  }

  @Override
  public String toString() {
    return "Webhook{" +
        "webHookUrl='" + webHookUrl + '\'' +
        '}';
  }
}
