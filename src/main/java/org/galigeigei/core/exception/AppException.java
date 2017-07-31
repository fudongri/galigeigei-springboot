package org.galigeigei.core.exception;

/**
 * 
 * @author fudongri
 */
public class AppException extends RuntimeException {

	private static final long serialVersionUID = 5642867535511317660L;
	
	private int code;

	public AppException(int code, String msg) {
		super(msg);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
