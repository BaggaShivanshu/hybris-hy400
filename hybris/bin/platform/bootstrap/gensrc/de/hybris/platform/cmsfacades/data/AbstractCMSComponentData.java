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

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public  class AbstractCMSComponentData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.pk</code> property defined at extension <code>cmsfacades</code>. */
		
	private String pk;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.creationtime</code> property defined at extension <code>cmsfacades</code>. */
		
	private Date creationtime;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.modifiedtime</code> property defined at extension <code>cmsfacades</code>. */
		
	private Date modifiedtime;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.uid</code> property defined at extension <code>cmsfacades</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.name</code> property defined at extension <code>cmsfacades</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.visible</code> property defined at extension <code>cmsfacades</code>. */
		
	private Boolean visible;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.typeCode</code> property defined at extension <code>cmsfacades</code>. */
		
	private String typeCode;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.slotId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String slotId;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.pageId</code> property defined at extension <code>cmsfacades</code>. */
		
	private String pageId;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.position</code> property defined at extension <code>cmsfacades</code>. */
		
	private Integer position;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.catalogVersion</code> property defined at extension <code>cmsfacades</code>. */
		
	private String catalogVersion;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.otherProperties</code> property defined at extension <code>cmsfacades</code>. */
		
	private Map<String, Object> otherProperties;
	
	public AbstractCMSComponentData()
	{
		// default constructor
	}
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.6
     */
		
	
	public void setPk(final String pk)
	{
		this.pk = pk;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.6
	 */
		
	
	public String getPk() 
	{
		return pk;
	}
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.6
     */
		
	
	public void setCreationtime(final Date creationtime)
	{
		this.creationtime = creationtime;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.6
	 */
		
	
	public Date getCreationtime() 
	{
		return creationtime;
	}
	
		
	
	public void setModifiedtime(final Date modifiedtime)
	{
		this.modifiedtime = modifiedtime;
	}

		
	
	public Date getModifiedtime() 
	{
		return modifiedtime;
	}
	
		
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

		
	
	public String getUid() 
	{
		return uid;
	}
	
		
	
	public void setName(final String name)
	{
		this.name = name;
	}

		
	
	public String getName() 
	{
		return name;
	}
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.6
     */
		
	
	public void setVisible(final Boolean visible)
	{
		this.visible = visible;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.6
	 */
		
	
	public Boolean getVisible() 
	{
		return visible;
	}
	
		
	
	public void setTypeCode(final String typeCode)
	{
		this.typeCode = typeCode;
	}

		
	
	public String getTypeCode() 
	{
		return typeCode;
	}
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.6
     */
		
	
	public void setSlotId(final String slotId)
	{
		this.slotId = slotId;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.6
	 */
		
	
	public String getSlotId() 
	{
		return slotId;
	}
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.6
     */
		
	
	public void setPageId(final String pageId)
	{
		this.pageId = pageId;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.6
	 */
		
	
	public String getPageId() 
	{
		return pageId;
	}
	
	@Deprecated
    /**
     * @deprecated Deprecated since 6.6
     */
		
	
	public void setPosition(final Integer position)
	{
		this.position = position;
	}

	@Deprecated
	/**
	 * @deprecated Deprecated since 6.6
	 */
		
	
	public Integer getPosition() 
	{
		return position;
	}
	
		
	
	public void setCatalogVersion(final String catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

		
	
	public String getCatalogVersion() 
	{
		return catalogVersion;
	}
	
		
	
	public void setOtherProperties(final Map<String, Object> otherProperties)
	{
		this.otherProperties = otherProperties;
	}

		
	
	public Map<String, Object> getOtherProperties() 
	{
		return otherProperties;
	}
	


}
