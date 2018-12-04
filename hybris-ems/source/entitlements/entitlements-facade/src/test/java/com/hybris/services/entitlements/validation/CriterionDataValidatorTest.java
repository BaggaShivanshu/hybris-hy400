/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 *
 */
package com.hybris.services.entitlements.validation;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.hybris.services.entitlements.condition.CriterionData;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/META-INF/entitlement-service-test-spring.xml")
public class CriterionDataValidatorTest
{
	@Autowired
	@Qualifier("criterionDataValidator")
	private CriterionDataValidator criterionDataValidator;

	@Test(expected = IllegalArgumentException.class)
	public void testValidateWrongValue()
	{
		ValidationViolations validationViolations = new ValidationViolations();
		CriterionData criterionData = new CriterionData();
		criterionDataValidator.validate("Wrong Value", validationViolations);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testValidateNull()
	{
		ValidationViolations validationViolations = new ValidationViolations();
		CriterionData criterionData = new CriterionData();
		criterionDataValidator.validate(null, validationViolations);
	}

	@Test
	public void testValidateCriterionData()
	{
		ValidationViolations validationViolations = new ValidationViolations();
		CriterionData criterionData = new CriterionData();
		criterionData.setType("metered");
		criterionDataValidator.validate(criterionData, validationViolations);
	}

	@Test
	public void testValidateCriterionDataUnknownType()
	{
		ValidationViolations validationViolations = new ValidationViolations();
		CriterionData criterionData = new CriterionData();
		criterionData.setType("UnknownType");
		criterionDataValidator.validate(criterionData, validationViolations);
	}

	@Test
	public void test()
	{
		ValidationViolations validationViolations = new ValidationViolations();
		CriterionData criterionData = new CriterionData();
		criterionData.setType("UnknownType");
		assertTrue(criterionDataValidator.supportsClass(CriterionData.class));
		assertFalse(criterionDataValidator.supportsClass(String.class));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSupportsClassNull()
	{
		assertFalse(criterionDataValidator.supportsClass(null));
	}

}
