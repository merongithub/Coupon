package com.apti.coupons.webservices;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.apti.coupons.interfaces.ICouponService;
import com.apti.coupons.interfaces.dto.Coupon;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.*;

@Named
@Path("/v1/coupon")
@Api(value = "CouponResources", position = 1)
public class CouponResources {
    
    
    @Inject
    private ICouponService couponService;
    
    /**
     * This resources return coupon using couponId
     * To Use this resource you have to know the couponId
     * 
     * @param couponId
     * @return Returns the Coupon that corresponds the id
     */
    @GET
    @ApiOperation(value = "Use this resource to perform a get with couponId")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Returns a list of matched Coupons with your Id") })
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("/{couponId}")
    public Response getResponsbyId(@ApiParam(required = true, value = "couponId") @PathParam("couponId") Long couponId) {
        Coupon coupon = couponService.findCouponById(couponId);
        GenericEntity<Coupon> entity = new GenericEntity<Coupon>(coupon) {
        };
        return Response.ok(entity).build();
    }
    
    /**
     * This Response is use to create a Coupon
     * To create a Coupon , you have to pass json
     * 
     * @param coupon
     * @return a newly created Coupon
     */
    
    @POST
    @ApiOperation(value = "Use this resources to create a Coupon")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Returns a created Resources") })
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response createResume(Coupon coupon) {
        Coupon couponResponse = couponService.saveCoupon(coupon);
        return Response.ok(couponResponse).build();
    }

    /**
     * Resource to edit a coupon
     * Pass couponId and new Coupon
     * @param couponId
     * @param coupon
     * @return returns updated Coupon
     */
    @PUT
    @ApiOperation(value = "Use this resources to edit a Coupon")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Returns a edited Coupon Resources") })
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Path("/{couponId}")
    public Response updateCoupon(@ApiParam(required = true, value = "couponId") @PathParam("couponId") Long couponId, Coupon coupon) {
        Coupon updatedCoupon = couponService.editeCoupon(couponId, coupon);
        return Response.ok(updatedCoupon).build();
    }
    
    /**
     * Use this service to delete a coupon
     * you need to send the Id to delete the coupon
     * @param couponId
     * @return returns true if coupon deleted and false otherwise 
     */
    @DELETE
    @ApiOperation(value = "Service used to delete the Coupon")
    @ApiResponses(value = {})
    @Path("/{couponId}")
    public Response deleteCoupon(@ApiParam(required = true, value = "couponId") @PathParam("couponId") Long couponId) {
        boolean deleted = couponService.deleteCoupon(couponId);
        return Response.ok(deleted).build();
    }
    
}
