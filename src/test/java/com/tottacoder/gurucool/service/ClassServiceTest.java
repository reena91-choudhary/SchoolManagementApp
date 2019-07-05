package com.tottacoder.gurucool.service;

import com.tottacoder.gurucool.model.Class;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ClassServiceTest {
	private ClassService cs;
	
	@Before
	public void init() {
		cs = new ClassService();
	}
	
	
	@Test
	public void getClassDetails_idOne_returnsNurseryClass() {
		
		Class actualClass = cs.getClassDetails(1);
		assertEquals("Nursery", actualClass.getClassName());
		assertEquals("Manjulika", actualClass.getClassTeacher());
		assertEquals(4, actualClass.getStudents().size());
		
		assertEquals(11, actualClass.getStudents().get(0).getId());
		assertEquals("Abhishek Choudhary", actualClass.getStudents().get(0).getName());
		assertEquals(1, actualClass.getStudents().get(0).getRollNo());
		
	}
	
	@Test
	public void getClassDetails_idNotInDB_returnsNull() {
		
		Class actualClass = cs.getClassDetails(10);
		assertNull(actualClass);
		
	}
	
	

}
