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
package de.hybris.platform.cmswebservices.dto;

import java.io.Serializable;
import de.hybris.platform.cmswebservices.dto.PageContentSlotContainerWsDTO;
import java.util.List;

/**
 * List of page content slot containers
 */
public  class PageContentSlotContainerListWsDTO  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PageContentSlotContainerListWsDTO.pageContentSlotContainerList</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<PageContentSlotContainerWsDTO> pageContentSlotContainerList;
	
	public PageContentSlotContainerListWsDTO()
	{
		// default constructor
	}
	
		
	
	public void setPageContentSlotContainerList(final List<PageContentSlotContainerWsDTO> pageContentSlotContainerList)
	{
		this.pageContentSlotContainerList = pageContentSlotContainerList;
	}

		
	
	public List<PageContentSlotContainerWsDTO> getPageContentSlotContainerList() 
	{
		return pageContentSlotContainerList;
	}
	


}
