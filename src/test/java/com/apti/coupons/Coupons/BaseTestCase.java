package com.apti.coupons.Coupons;

import org.junit.runner.RunWith;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:Coupon-persistence-appContext.xml", "classpath:test-context.xml"})


@ContextConfiguration( "/test-context.xml")
@Rollback 
public class BaseTestCase {

}
