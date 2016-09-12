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
    public void CRUDETestofCoupon() {
        
        //create test
        Coupon storedCoupon = getCoupon();
        Coupon createdCoupon = couponRepository.save(storedCoupon);
        Assert.assertNotNull(createdCoupon);
        Assert.assertEquals(storedCoupon.getCategory(), createdCoupon.getCategory());
        
        //read test
        Coupon dbCoupon = couponRepository.findById(createdCoupon.getId());
        Assert.assertNotNull(dbCoupon);
      
        //update test
        dbCoupon.setTitel("NewTitle");
        Coupon editedCoupon=couponRepository.save(dbCoupon);
        Assert.assertEquals(editedCoupon.getTitel(),"NewTitle");
        
         //Delete test
         couponRepository.delete(editedCoupon);
         Coupon deletedCoupon=couponRepository.findById(editedCoupon.getId());
         Assert.assertNull(deletedCoupon);
    }
        
}
