package com.apti.coupons.services;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apti.coupons.interfaces.ICouponService;
import com.apti.coupons.interfaces.dto.Coupon;
import com.apti.coupons.persistance.CouponRepository;

@Service
@Singleton
@Transactional(readOnly = false)
public class CouponService implements ICouponService {
    
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CouponService.class);
    
    @Inject
    private CouponRepository couponRepository;
    
    public Coupon findCouponById(Long id) {
        
        return couponRepository.findById(id);
    }
    
    public Coupon saveCoupon(Coupon coupon) {
        
        return couponRepository.save(coupon);
    }
    
    public boolean deleteCoupon(Coupon coupon) {
        
        couponRepository.delete(coupon);
        return (couponRepository.findById(coupon.getId()) == null);
    }
    
    public Coupon editeCoupon(long id, Coupon coupon) {
        Coupon dbCoupon = findCouponById(id);
        dbCoupon.setCategory(coupon.getCategory());
        dbCoupon.setCouponcode(coupon.getCouponcode());
        dbCoupon.setDescription(coupon.getDescription());
        return saveCoupon(dbCoupon);
    }

    public boolean deleteCoupon(Long id) {
        couponRepository.delete(id);
        return (couponRepository.findById(id) == null);
    }
    
}
