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
 * @deprecated Since 6.7, use {@link de.hybris.platform.core.model.c2l.LanguageModel} instead.
 */
@Deprecated
public  class AsLanguageData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AsLanguageData.isocode</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String isocode;

	/** <i>Generated property</i> for <code>AsLanguageData.name</code> property defined at extension <code>adaptivesearch</code>. */
		
	private String name;
	
	public AsLanguageData()
	{
		// default constructor
	}
	
		
	
	public void setIsocode(final String isocode)
	{
		this.isocode = isocode;
	}

		
	
	public String getIsocode() 
	{
		return isocode;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	

	@Override
	public boolean equals(final Object o)
	{
	
		if (o == null) return false;
		if (o == this) return true;

		try
		{
			final AsLanguageData other = (AsLanguageData) o;
			return new org.apache.commons.lang.builder.EqualsBuilder()
			.append(getIsocode(), other.getIsocode()) 
			.append(getName(), other.getName()) 
			.isEquals();
		} 
		catch (ClassCastException c)
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return new org.apache.commons.lang.builder.HashCodeBuilder()
		.append(getIsocode()) 
		.append(getName()) 
		.toHashCode();
	}

}
