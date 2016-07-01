package com.apti.coupons.interfaces;

import com.apti.coupons.interfaces.dto.Coupon;

public interface ICouponService {
	public Coupon findCouponById(Long id);
	public Coupon saveCoupon(Coupon coupon);

}
