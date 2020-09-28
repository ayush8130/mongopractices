package org.helloworldrepository;


import org.helloworlddocument.HelloWorldDocument;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface HelloWorldRepository extends MongoRepository<HelloWorldDocument, String> {
      
	
 //     public List<HelloWorldDocument> findAllById(String id);

//	public HelloWorldDocument save(HelloWorld helloWorld);
                                                            
     
}
