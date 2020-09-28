package org.helloworlddocument;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;
import org.springframework.data.annotation.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(value = "welcome")
@Getter
@Setter
@ToString
@Data
public class HelloWorldDocument {

  @Id
  private int id;	 

  @Property
  private String welcome;	
	
  @Property
  private Intro intro ;


  }
  


