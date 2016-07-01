package com.apti.coupons.persistance;

import java.util.List;

import javax.inject.Singleton;

import org.springframework.stereotype.Repository;

import com.apti.coupons.interfaces.ICouponPersistance;
import com.apti.coupons.interfaces.dto.Coupon;

@Repository("couponRepository")
@Singleton
public interface CouponRepository extends ICouponPersistance {
   
	List<Coupon> findByCouponName(Long CouponId, String couponName);
	Coupon save(Coupon entity);
	void deleteId(Long id);	



}
