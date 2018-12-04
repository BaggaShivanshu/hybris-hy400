/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at May 8, 2018 2:42:47 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.acceleratorservices.payment.data;

import java.io.Serializable;
import java.util.Map;

public  class PaymentData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PaymentData.parameters</code> property defined at extension <code>acceleratorservices</code>. */
		
	private Map<String, String> parameters;

	/** <i>Generated property</i> for <code>PaymentData.postUrl</code> property defined at extension <code>acceleratorservices</code>. */
		
	private String postUrl;
	
	public PaymentData()
	{
		// default constructor
	}
	
		
	
	public void setParameters(final Map<String, String> parameters)
	{
		this.parameters = parameters;
	}

		
	
	public Map<String, String> getParameters() 
	{
		return parameters;
	}
	
		
	
	public void setPostUrl(final String postUrl)
	{
		this.postUrl = postUrl;
	}

		
	
	public String getPostUrl() 
	{
		return postUrl;
	}
	


}
