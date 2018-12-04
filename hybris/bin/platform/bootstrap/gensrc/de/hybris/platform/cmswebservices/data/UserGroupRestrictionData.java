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

import java.util.List;

/**
 * @deprecated Deprecated since 6.6
 */
@Deprecated
public  class UserGroupRestrictionData extends AbstractRestrictionData 
{

 

	/** <i>Generated property</i> for <code>UserGroupRestrictionData.includeSubgroups</code> property defined at extension <code>cmswebservices</code>. */
		
	private boolean includeSubgroups;

	/** <i>Generated property</i> for <code>UserGroupRestrictionData.userGroups</code> property defined at extension <code>cmswebservices</code>. */
		
	private List<String> userGroups;
	
	public UserGroupRestrictionData()
	{
		// default constructor
	}
	
		
	
	public void setIncludeSubgroups(final boolean includeSubgroups)
	{
		this.includeSubgroups = includeSubgroups;
	}

		
	
	public boolean isIncludeSubgroups() 
	{
		return includeSubgroups;
	}
	
		
	
	public void setUserGroups(final List<String> userGroups)
	{
		this.userGroups = userGroups;
	}

		
	
	public List<String> getUserGroups() 
	{
		return userGroups;
	}
	


}
