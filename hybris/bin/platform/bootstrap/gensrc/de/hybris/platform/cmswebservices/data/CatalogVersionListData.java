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
import de.hybris.platform.cmsfacades.data.CatalogVersionData;
import java.util.List;

/**
 * The list of content catalog versions.
 */
public  class CatalogVersionListData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CatalogVersionListData.versions</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<CatalogVersionData> versions;
	
	public CatalogVersionListData()
	{
		// default constructor
	}
	
		
	
	public void setVersions(final List<CatalogVersionData> versions)
	{
		this.versions = versions;
	}

		
	
	public List<CatalogVersionData> getVersions() 
	{
		return versions;
	}
	


}
