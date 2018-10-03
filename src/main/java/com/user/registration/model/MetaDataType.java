package com.user.registration.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="MetaDataType" , propOrder= {
		"limit",
		"offset",
		"total",
		"serviceReferenceId",
		"outcome",
		"any"
})


@XmlRootElement(name="reponse")
@JsonSerialize(using=XmlAnyJsonSerialiser.class)
public class MetaDataType implements Serializable {

	private static final long serialVersionUID = 1L;
	@XmlElement(required=true)
	protected MetaDataType limit;
	@XmlAnyElement(lax=true)
	protected List<Object> offset;
	total
	
	serviceReferenceId
	
	outcome
	
	any
	
	
	
}
