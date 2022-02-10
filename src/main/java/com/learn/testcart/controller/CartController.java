package com.learn.testcart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.learn.testcart.controller.dto.CartRequestDto;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/test/carts")
@Slf4j
public class CartController
{
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public void createCart(@RequestBody CartRequestDto cartRequest){
		log.info("The user's email id of card {}" + cartRequest.getEmail());
	}
}
