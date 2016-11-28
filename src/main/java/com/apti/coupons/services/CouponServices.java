package com.apti.coupons.services;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.apti.coupons.interfaces.ICouponPersistance;
import com.apti.coupons.interfaces.ICouponService;
import com.apti.coupons.interfaces.dto.Coupon;

@Service
public class CouponServices implements ICouponService {

	
@Inject	
private ICouponPersistance persitance;

public Coupon findCouponById(Long id) {
	       
	return persitance.findById(id);
}

public Coupon saveCoupon(Coupon coupon) {
	
	return persitance.save(coupon);
}

}
