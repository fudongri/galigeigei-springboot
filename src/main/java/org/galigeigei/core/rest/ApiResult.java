package org.galigeigei.core.rest;

/**
 * http请求返回结果
 * @author fudongri
 */
public class ApiResult {

	public static ApiResultModel succ(Object data) {
		ApiResultModel result = new ApiResultModel();
		result.setCode(ApiResultEnum.SUCCESS.getCode());
		result.setMsg(ApiResultEnum.SUCCESS.getMsg());
		result.setData(data);
		return result;
	}

	public static ApiResultModel succ() {
		return succ(null);
	}

	public static ApiResultModel error(int code, String msg) {
		ApiResultModel result = new ApiResultModel();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
	
	public static ApiResultModel error(ApiResultEnum resultEnum) {
		ApiResultModel result = new ApiResultModel();
		result.setCode(resultEnum.getCode());
		result.setMsg(resultEnum.getMsg());
		return result;
	}

}
