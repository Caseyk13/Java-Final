package model;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Casey Kluesner  - cjkluesner1@dmacc.edu  
* CIS171 <20432>
* Apr 22, 2024  
*/
class bussinessLogicPaintTest {

	
	@Test
	void test1() {
		bussinessLogicPaint a = new bussinessLogicPaint("trim",1500);
		equals(a.getTrim());
		equals(a.getProjectSq());
		equals(a.getCeiling());
		assertEquals("ceiling", a.getCeiling());
		assertEquals("Trim", a.getTrim());
		assertEquals("walls",a.getWall());
		
	}

	}


