package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Controller    
@Api(value="user", description="Operations pertaining to Online Store")
@RequestMapping(value="/user")
public class UserController {
	
	@ApiOperation(value = "View the Specific info of the product")
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public String viewProduct(@ApiParam(name="productId", value="The Id of the product to be viewed", required=true) @PathVariable String productid){
		
		return "Hello";
	}

}
