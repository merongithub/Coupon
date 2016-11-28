package com.apti.coupons.Coupons;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import com.apti.coupons.interfaces.ICouponPersistance;
import com.apti.coupons.interfaces.dto.Coupon;


public class CouponRepositoryTest extends BaseTestCase {
 /**
  * TODO: include all the CourdTest here
  * 
  */
	@Inject
	ICouponPersistance couponRepository;
	
	@Test
	public void testFindCouponbyId() {
    Coupon coupon=couponRepository.findById(new Long(1));
         
    System.out.println(coupon.getCategory());
    Assert.assertNotNull(coupon);
     
	}

}
