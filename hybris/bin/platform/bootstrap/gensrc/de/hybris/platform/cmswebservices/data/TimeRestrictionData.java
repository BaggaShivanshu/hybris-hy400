/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at May 8, 2018 2:42:48 PM
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
package de.hybris.platform.cmswebservices.data;

import java.util.Date;

/**
 * @deprecated Deprecated since 6.6
 */
@Deprecated
public  class TimeRestrictionData extends AbstractRestrictionData 
{

 

	/** <i>Generated property</i> for <code>TimeRestrictionData.activeFrom</code> property defined at extension <code>cmswebservices</code>. */
		
	private Date activeFrom;

	/** <i>Generated property</i> for <code>TimeRestrictionData.activeUntil</code> property defined at extension <code>cmswebservices</code>. */
		
	private Date activeUntil;
	
	public TimeRestrictionData()
	{
		// default constructor
	}
	
		
	
	public void setActiveFrom(final Date activeFrom)
	{
		this.activeFrom = activeFrom;
	}

		
	
	public Date getActiveFrom() 
	{
		return activeFrom;
	}
	
		
	
	public void setActiveUntil(final Date activeUntil)
	{
		this.activeUntil = activeUntil;
	}

		
	
	public Date getActiveUntil() 
	{
		return activeUntil;
	}
	


}
