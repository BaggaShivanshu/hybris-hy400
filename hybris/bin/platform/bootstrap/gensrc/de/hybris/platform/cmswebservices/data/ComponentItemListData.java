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

import java.io.Serializable;
import de.hybris.platform.cmswebservices.data.AbstractCMSComponentData;
import de.hybris.platform.webservicescommons.dto.PaginationWsDTO;
import java.util.List;

/**
 * DTO which serves as a wrapper object that contains a list of {@link ComponentItemListData} as well as pagination and sorting pertaining to the request
 *
 * @deprecated Deprecated since 6.6
 */
@Deprecated
public  class ComponentItemListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ComponentItemListData.componentItems</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<AbstractCMSComponentData> componentItems;

	/** <i>Generated property</i> for <code>ComponentItemListData.pagination</code> property defined at extension <code>cmswebservices</code>. */
		
	private PaginationWsDTO pagination;
	
	public ComponentItemListData()
	{
		// default constructor
	}
	
		
	
	public void setComponentItems(final List<AbstractCMSComponentData> componentItems)
	{
		this.componentItems = componentItems;
	}

		
	
	public List<AbstractCMSComponentData> getComponentItems() 
	{
		return componentItems;
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
