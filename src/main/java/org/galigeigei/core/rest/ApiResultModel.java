package org.galigeigei.core.rest;

/**
 * http请求返回结果外层模型
 * @author fudongri
 */
public class ApiResultModel{

	private int code;

	private String msg;

	private Object data;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
