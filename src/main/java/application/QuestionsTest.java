package application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuestionsTest {

	@Test
	public void test() {

		Questions f = new Questions();

		int sizequestions = 100;  
		int sizereponses = 100;

		int random_size = f.getQuestions().size();
		 

		assertEquals (f.getQuestions().size(), sizequestions );
		assertEquals (f.getReponses().size(), sizereponses );
		assertTrue (f.getRandom() <= random_size );
		assertTrue (f.getRandom() > 0);
		//assertEquals (f.initQuestions().contains(f),false);
	

	}

}


