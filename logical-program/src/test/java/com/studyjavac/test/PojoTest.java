package com.studyjavac.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PojoTest {

	@InjectMocks
	private Student student;
	
	@Before
	public void setUp(){
		student.setsId(101);
		student.setsName("vivek");
		student.setMobileNo("9770367297");
	}

	@Test
	public void testSetterAndGetter() {

		Assert.assertEquals(student.getsId(), 101);
		Assert.assertEquals(student.getsName(),"vivek");
		Assert.assertEquals(student.getMobileNo(), "9770367297");
	}

}
