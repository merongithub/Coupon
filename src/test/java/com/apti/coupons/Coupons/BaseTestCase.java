package com.apti.coupons.Coupons;

import java.util.Date;

import org.junit.Ignore;
import org.junit.runner.RunWith;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.apti.coupons.interfaces.dto.Coupon;
import com.apti.coupons.interfaces.dto.Store;

@Ignore 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:Coupon-persistence-appContext.xml", "classpath:test-context.xml" })
@Rollback
public class BaseTestCase {
    
    
  public Store getStore() {
        Store store = new Store();
        store.setCity("Seattel");
        store.setState("WA");
        store.setLat(83929382.383829);
        store.setLongtiude(382923839.3838);
        store.setZip("98133");
        return store;
        
    }
  
 public Coupon getCoupon()
  {
      
  Coupon coupon=new Coupon();
  coupon.setCategory("Digital-Items");
  coupon.setCouponcode("Er-st-vmx");
  coupon.setDescription("Free ipad and iphone");
  coupon.setExpire_at(new Date());
  coupon.setPublished_at(new Date());
  coupon.setTitel("Groupon");
  coupon.setStore(getStore());
  return coupon;
  }

}
