import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class calcolatriceTest {

	@Test
	void testSomma() 
	{
		calcolatrice c =new calcolatrice();
		
		double res = c.somma(5,6);
		
		Assert.assertEquals(11,res,0);
	}
	
	@Test
	void testSomma2() 
	{
		calcolatrice c =new calcolatrice();
		
		double res = c.somma(6,6);
		
		Assert.assertEquals(11, res, 0);
	}

}
