package com.mmall.common;

import sun.dc.pr.PRError;

/**
 * ClassName: ResponseCode
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/4/8
 */

public enum ResponseCode {
	// 成功
	SUCCESS(0, "SUCCESS"),
	// 错误
	ERROR(1, "ERROR"),
	NEED_LOGIN(10, "NEED_LOGIN"),
	ILLEGAL_ARGYMENT(2, "ILLEGAL_ARGYMENT");

	private final int code;
	private final String desc;

	ResponseCode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
