package org.helloworldservice;


import org.helloworlddocument.HelloWorldDocument;
import org.helloworldrepository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	
	@Autowired HelloWorldRepository helloWorldRepository;

	/*
	 * 
	 
	@Override
	public List<HelloWorldDocument> getMessage(String id) {
		List<HelloWorldDocument> message = helloWorldRepository.findAllById(id);
		return message;
	}
*/
	@Override
	public HelloWorldDocument save(HelloWorldDocument helloWorld) {
		return helloWorldRepository.save(helloWorld);
	}

	
}
