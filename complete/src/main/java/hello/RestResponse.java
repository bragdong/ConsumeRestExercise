package hello;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class RestResponse {
 
  private String[] messages;
  private ZipCode[] result;
  
  public RestResponse(){    
  }
  
  public String[] getMessages() {
    return messages;
  }
  public void setMessages(String[] messages) {
    this.messages = messages;
  }
  public ZipCode[] getResult() {
    return result;
  }
  public void setResult(ZipCode[] result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "RestResponse [messages=" + Arrays.toString(messages) + ", result=" + Arrays.toString(result) + "]";
  }
 
}
