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
package de.hybris.platform.cmswebservices.data;

import java.io.Serializable;
import de.hybris.platform.cmswebservices.data.AbstractRestrictionData;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import java.util.List;

/**
 * @deprecated Deprecated since 6.6
 */
@Deprecated
public  class RestrictionListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>RestrictionListData.restrictions</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<AbstractRestrictionData> restrictions;

	/** <i>Generated property</i> for <code>RestrictionListData.pagination</code> property defined at extension <code>cmswebservices</code>. */
		
	private PaginationWsDTO pagination;
	
	public RestrictionListData()
	{
		// default constructor
	}
	
		
	
	public void setRestrictions(final List<AbstractRestrictionData> restrictions)
	{
		this.restrictions = restrictions;
	}

		
	
	public List<AbstractRestrictionData> getRestrictions() 
	{
		return restrictions;
	}
	
		
	
	public void setPagination(final PaginationWsDTO pagination)
	{
		this.pagination = pagination;
	}

		
	
	public PaginationWsDTO getPagination() 
	{
		return pagination;
	}
	


}
