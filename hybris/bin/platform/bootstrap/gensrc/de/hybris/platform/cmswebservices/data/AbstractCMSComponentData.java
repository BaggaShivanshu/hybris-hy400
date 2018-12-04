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
import java.util.Date;

/**
 * Abstract cms component data
 *
 * @deprecated Deprecated since 6.6
 */
@Deprecated
public  class AbstractCMSComponentData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.pk</code> property defined at extension <code>cmswebservices</code>. */
		
	private String pk;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.creationtime</code> property defined at extension <code>cmswebservices</code>. */
		
	private Date creationtime;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.modifiedtime</code> property defined at extension <code>cmswebservices</code>. */
		
	private Date modifiedtime;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.uid</code> property defined at extension <code>cmswebservices</code>. */
		
	private String uid;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.name</code> property defined at extension <code>cmswebservices</code>. */
		
	private String name;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.visible</code> property defined at extension <code>cmswebservices</code>. */
		
	private Boolean visible;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.typeCode</code> property defined at extension <code>cmswebservices</code>. */
		
	private String typeCode;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.slotId</code> property defined at extension <code>cmswebservices</code>. */
		
	private String slotId;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.pageId</code> property defined at extension <code>cmswebservices</code>. */
		
	private String pageId;

	/** <i>Generated property</i> for <code>AbstractCMSComponentData.position</code> property defined at extension <code>cmswebservices</code>. */
		
	private Integer position;
	
	public AbstractCMSComponentData()
	{
		// default constructor
	}
	
		
	
	public void setPk(final String pk)
	{
		this.pk = pk;
	}

		
	
	public String getPk() 
	{
		return pk;
	}
	
		
	
	public void setCreationtime(final Date creationtime)
	{
		this.creationtime = creationtime;
	}

		
	
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
	
		
	
	public void setVisible(final Boolean visible)
	{
		this.visible = visible;
	}

		
	
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
	
		
	
	public void setSlotId(final String slotId)
	{
		this.slotId = slotId;
	}

		
	
	public String getSlotId() 
	{
		return slotId;
	}
	
		
	
	public void setPageId(final String pageId)
	{
		this.pageId = pageId;
	}

		
	
	public String getPageId() 
	{
		return pageId;
	}
	
		
	
	public void setPosition(final Integer position)
	{
		this.position = position;
	}

		
	
	public Integer getPosition() 
	{
		return position;
	}
	


}
