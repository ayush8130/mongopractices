package org.helloworlddocument;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Embedded
public class Intro {

	
	
    @Property
	private String name;		


	
}
