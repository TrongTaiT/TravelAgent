package com.travelagent.entity;

public enum Status {

	PENDING, // đang xử lý
	CONFIRMED, // đã xác nhận
	PAID, // đã thanh toán tiền mặt
	DEPOSIT_PAID, // đã thanh toán qua thẻ
	EXPIRED // hết hạn

}
