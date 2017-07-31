package org.galigeigei.core.handler;

import org.galigeigei.core.exception.AppException;
import org.galigeigei.core.rest.ApiResult;
import org.galigeigei.core.rest.ApiResultEnum;
import org.galigeigei.core.rest.ApiResultModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 * @author fudongri
 */
@RestControllerAdvice
public class AppExceptionHandler {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@ExceptionHandler(Exception.class)
	public ApiResultModel handle(Exception e) {
		if (e instanceof AppException) {
			AppException apiException = (AppException) e;
			return ApiResult.error(apiException.getCode(), apiException.getMessage());
		}

		logger.error("", e);
		return ApiResult.error(ApiResultEnum.SYSTEM_ERROR.getCode(), ApiResultEnum.SYSTEM_ERROR.getMsg());

	}

}
