/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at May 8, 2018 2:42:46 PM
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
package de.hybris.platform.cmsfacades.data;

import java.io.Serializable;

public  class PageTemplateDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageTemplateDTO.pageTypeCode</code> property defined at extension <code>cmsfacades</code>. */
		
	private String pageTypeCode;

	/** <i>Generated property</i> for <code>PageTemplateDTO.active</code> property defined at extension <code>cmsfacades</code>. */
		
	private Boolean active;
	
	public PageTemplateDTO()
	{
		// default constructor
	}
	
		
	
	public void setPageTypeCode(final String pageTypeCode)
	{
		this.pageTypeCode = pageTypeCode;
	}

		
	
	public String getPageTypeCode() 
	{
		return pageTypeCode;
	}
	
		
	
	public void setActive(final Boolean active)
	{
		this.active = active;
	}

		
	
	public Boolean getActive() 
	{
		return active;
	}
	


}
