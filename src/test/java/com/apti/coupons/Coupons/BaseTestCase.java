package com.apti.coupons.Coupons;

import org.junit.runner.RunWith;

import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"file:src/main/resources/Coupon-persistence-appContext.xml", "classpath:test-context.xml"})


@ContextConfiguration(locations={"classpath:/test-context.xml","classpath:Coupon-persistence-appContext.xml"})
@Rollback 
public class BaseTestCase {

}
