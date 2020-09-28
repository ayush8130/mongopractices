package com.helloworld.web;

import org.helloworlddocument.HelloWorldDocument;
import org.helloworldservice.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class HelloWorldController {

	
	@Autowired HelloWorldService helloWorldService;
	
	 
   
	@ResponseBody
	@RequestMapping(value = "/helloworld" , method =  RequestMethod.POST  , produces = "application/Json")
	  public  ResponseEntity<Object> createworld(@RequestBody HelloWorldDocument helloWorld) {
		try {
		HelloWorldDocument world = helloWorldService.save(helloWorld);
		return new ResponseEntity<Object>(world , new HttpHeaders(), HttpStatus.OK);
		}catch (Exception e) {
			return null;	
		}
				
    	}
	
	
	/*
     * get request
     * get request for message	
     * 
     
	@ResponseBody
	@RequestMapping(value = "/helloworld/{id}" , method =  RequestMethod.GET  , produces = "application/Json")
	public List<HelloWorldDocument> getMessage(@PathVariable("id") String id) {
		List<HelloWorldDocument> welcome = helloWorldService.getMessage(id);
		return welcome;
		
	} 
*/

}
