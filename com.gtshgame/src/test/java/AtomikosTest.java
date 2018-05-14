

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gtshgame.service.TestService;

/**
 * @author InJavaWeTrust
 * @version 1.0.0.0  
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/applicationContext.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AtomikosTest {

	@Autowired
	private TestService testService;

//	@Test
//	public void testCallLog() {
//		callLogService.insert();
//	}
//
//	@Test
//	public void testTest() {
//		testService.insert();
//	}

	@Test
	public void testAtomikos() {
		//测试分布式事务
		testService.update();
	}

}
