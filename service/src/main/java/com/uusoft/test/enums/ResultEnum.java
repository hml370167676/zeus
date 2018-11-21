package com.uusoft.test.enums;

/**
 * <p>Description:</p>
 *
 * @author minglu@toutoujinrong.com
 * @date 10/9/2018 4:28 PM
 */
public enum ResultEnum {

  RETURN_SUCCESS("0000","成功"),
  RETURN_FAIl("9999","失败");

  private String resultCode;
  private String resultMsg;

  private ResultEnum(String resultCode, String resultMsg) {
    this.resultCode = resultCode;
    this.resultMsg = resultMsg;
  }


  public String getResultCode() {
    return resultCode;
  }

  public String getResultMsg() {
    return resultMsg;
  }

}
