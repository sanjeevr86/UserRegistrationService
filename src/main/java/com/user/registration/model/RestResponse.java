package com.user.registration.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="RestResponseType" , propOrder= {
		"metadata",
		"any"
})

@XmlRootElement(name="reponse")
@JsonSerialize(using=XmlAnyJsonSerialiser.class)
public class RestResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	@XmlElement(required=true)
	protected MetaDataType metadata;
	@XmlAnyElement(lax=true)
	protected List<Object> any;
	
	public RestResponse(MetaDataType metadata ,List<Object> any ) {
		this.metadata =metadata;
		this.any = any;
	}
	public RestResponse (){
		super();
	}
	
	public MetaDataType getMetadata() {
		return metadata;
	}
	public void setMetadata(MetaDataType metadata) {
		this.metadata = metadata;
	}
	public List<Object> getAny() {
		return any;
	}
	public void setAny(List<Object> any) {
		this.any = any;
	}
	
	
	
	
}
