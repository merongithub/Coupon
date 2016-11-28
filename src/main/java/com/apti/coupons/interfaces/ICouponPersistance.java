package com.apti.coupons.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.apti.coupons.interfaces.dto.Coupon;

public interface ICouponPersistance extends CrudRepository<Coupon, Long> {
	
	Coupon findById(Long couponId);
	Coupon save(Coupon entity);
	
}