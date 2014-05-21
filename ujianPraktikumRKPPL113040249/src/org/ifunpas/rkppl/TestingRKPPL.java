package org.ifunpas.rkppl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestingRKPPL {

	Soal soal;
	
	@Before
	public void mulaiTest(){
		System.out.println("Mulai Test");
		soal = new Soal();
	}

	@Test
	public void test1(){
		//test function pangkat dengan bilangan 2 pangkat 2
		assertEquals("Harusnya ", 4, soal.pangkat(2, 2));
		assertSame("Harusnya ", 4, soal.pangkat(2, 2));
	}
	
	@Test
	public void test2(){
		//test function faktorial dengan bilangan 2
		assertEquals("Harusnya ", 2, soal.faktorial(2));
		assertSame("Harusnya ", 2, soal.faktorial(2));
	}
}
