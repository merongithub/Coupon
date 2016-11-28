package com.apti.coupons.Coupons;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;

import com.apti.coupons.interfaces.ICouponService;
import com.apti.coupons.interfaces.dto.Coupon;

public class CouponServiceTest extends BaseTestCase{
	
	@Inject
	private ICouponService iServices;
	
	@Test
	public void createCoupon()
	{
	Coupon coupon=iServices.findCouponById(new Long(1));
    System.out.println(coupon.getCategory());
    Assert.assertNotNull(coupon);
  	}

}
