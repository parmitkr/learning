package com.learning.boot.learning.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.learning.boot.learning.user.UserNotFoundException;

@RestControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request){
		
		CustomException  customException=new CustomException(ex.getMessage(),new Date(),request.getDescription(false));
		
		return new ResponseEntity(customException,HttpStatus.INTERNAL_SERVER_ERROR);
						
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserException(Exception ex, WebRequest request){
		
		CustomException  customException=new CustomException(ex.getMessage(),new Date(),request.getDescription(false));
		
		return new ResponseEntity(customException,HttpStatus.INTERNAL_SERVER_ERROR);
						
	}

}
