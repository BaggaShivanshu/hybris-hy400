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
package de.hybris.platform.cmsfacades.data;

import java.util.List;

/**
 * @deprecated Deprecated since 6.6
 */
@Deprecated
public  class CategoryRestrictionData extends AbstractRestrictionData 
{

 

	/** <i>Generated property</i> for <code>CategoryRestrictionData.recursive</code> property defined at extension <code>cmsfacades</code>. */
		
	private boolean recursive;

	/** <i>Generated property</i> for <code>CategoryRestrictionData.categories</code> property defined at extension <code>cmsfacades</code>. */
		
	private List<String> categories;
	
	public CategoryRestrictionData()
	{
		// default constructor
	}
	
		
	
	public void setRecursive(final boolean recursive)
	{
		this.recursive = recursive;
	}

		
	
	public boolean isRecursive() 
	{
		return recursive;
	}
	
		
	
	public void setCategories(final List<String> categories)
	{
		this.categories = categories;
	}

		
	
	public List<String> getCategories() 
	{
		return categories;
	}
	


}
