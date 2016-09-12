package com.apti.coupons.interfaces;

import com.apti.coupons.interfaces.dto.Coupon;

public interface ICouponService {
	public Coupon findCouponById(Long id);
	public Coupon saveCoupon(Coupon coupon);
	public boolean deleteCoupon(Coupon coupon);
	public Coupon editeCoupon(long id,Coupon coupon);
	public boolean deleteCoupon(Long id);

}
