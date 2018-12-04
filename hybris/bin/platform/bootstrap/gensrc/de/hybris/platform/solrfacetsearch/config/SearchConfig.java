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
package de.hybris.platform.solrfacetsearch.config;

import java.io.Serializable;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import java.util.Collection;

public  class SearchConfig  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SearchConfig.defaultSortOrder</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private Collection<String> defaultSortOrder;

	/** <i>Generated property</i> for <code>SearchConfig.pageSize</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private int pageSize;

	/** <i>Generated property</i> for <code>SearchConfig.allFacetValuesInResponse</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private boolean allFacetValuesInResponse;

	/** <i>Generated property</i> for <code>SearchConfig.restrictFieldsInResponse</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private boolean restrictFieldsInResponse;

	/** <i>Generated property</i> for <code>SearchConfig.enableHighlighting</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private boolean enableHighlighting;

	/** <i>Generated property</i> for <code>SearchConfig.legacyMode</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private boolean legacyMode;

	/** <i>Generated property</i> for <code>SearchConfig.groupingProperty</code> property defined at extension <code>solrfacetsearch</code>. */
		
	private IndexedProperty groupingProperty;
	
	public SearchConfig()
	{
		// default constructor
	}
	
		
	
	public void setDefaultSortOrder(final Collection<String> defaultSortOrder)
	{
		this.defaultSortOrder = defaultSortOrder;
	}

		
	
	public Collection<String> getDefaultSortOrder() 
	{
		return defaultSortOrder;
	}
	
		
	
	public void setPageSize(final int pageSize)
	{
		this.pageSize = pageSize;
	}

		
	
	public int getPageSize() 
	{
		return pageSize;
	}
	
		
	
	public void setAllFacetValuesInResponse(final boolean allFacetValuesInResponse)
	{
		this.allFacetValuesInResponse = allFacetValuesInResponse;
	}

		
	
	public boolean isAllFacetValuesInResponse() 
	{
		return allFacetValuesInResponse;
	}
	
		
	
	public void setRestrictFieldsInResponse(final boolean restrictFieldsInResponse)
	{
		this.restrictFieldsInResponse = restrictFieldsInResponse;
	}

		
	
	public boolean isRestrictFieldsInResponse() 
	{
		return restrictFieldsInResponse;
	}
	
		
	
	public void setEnableHighlighting(final boolean enableHighlighting)
	{
		this.enableHighlighting = enableHighlighting;
	}

		
	
	public boolean isEnableHighlighting() 
	{
		return enableHighlighting;
	}
	
		
	@Deprecated 
	public void setLegacyMode(final boolean legacyMode)
	{
		this.legacyMode = legacyMode;
	}

		
	@Deprecated 
	public boolean isLegacyMode() 
	{
		return legacyMode;
	}
	
		
	
	public void setGroupingProperty(final IndexedProperty groupingProperty)
	{
		this.groupingProperty = groupingProperty;
	}

		
	
	public IndexedProperty getGroupingProperty() 
	{
		return groupingProperty;
	}
	


}
