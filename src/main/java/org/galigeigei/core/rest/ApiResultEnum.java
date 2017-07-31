package org.galigeigei.core.rest;

/**
 * @author fudongri
 */
public enum ApiResultEnum {

	SYSTEM_ERROR(-1, "服务器异常，正在紧急修复..."), 
	SUCCESS(0, "成功"), 
	PARAM_ERROR(1001, "参数错误：")
	
	;

	private int code;

	private String msg;

	private ApiResultEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
