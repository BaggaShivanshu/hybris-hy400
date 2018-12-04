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
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;

/**
 * @deprecated Since 6.7, properties were moved to {@link AsSearchResultData}.
 */
@Deprecated
public  class AsPaginationData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsPaginationData.activePage</code> property defined at extension <code>adaptivesearch</code>. */
		
	private int activePage;

	/** <i>Generated property</i> for <code>AsPaginationData.pageCount</code> property defined at extension <code>adaptivesearch</code>. */
		
	private int pageCount;

	/** <i>Generated property</i> for <code>AsPaginationData.pageSize</code> property defined at extension <code>adaptivesearch</code>. */
		
	private int pageSize;

	/** <i>Generated property</i> for <code>AsPaginationData.resultCount</code> property defined at extension <code>adaptivesearch</code>. */
		
	private int resultCount;
	
	public AsPaginationData()
	{
		// default constructor
	}
	
		
	
	public void setActivePage(final int activePage)
	{
		this.activePage = activePage;
	}

		
	
	public int getActivePage() 
	{
		return activePage;
	}
	
		
	
	public void setPageCount(final int pageCount)
	{
		this.pageCount = pageCount;
	}

		
	
	public int getPageCount() 
	{
		return pageCount;
	}
	
		
	
	public void setPageSize(final int pageSize)
	{
		this.pageSize = pageSize;
	}

		
	
	public int getPageSize() 
	{
		return pageSize;
	}
	
		
	
	public void setResultCount(final int resultCount)
	{
		this.resultCount = resultCount;
	}

		
	
	public int getResultCount() 
	{
		return resultCount;
	}
	


}
