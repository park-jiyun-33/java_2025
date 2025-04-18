package spring002_di_ex;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:config/test1.xml")  // 설정
@ContextConfiguration(locations = "classpath:config/test2.xml")  // 설정
public class DiTest2 {
	
	@Autowired ApplicationContext context; //1. bean(스프링이 관리하는 객체들)
	// 2. ApplicationContext - bean 생성부터 소멸까지 관리
	// 3. @Autowired - 생성자, 프로퍼티 있는지 테스트하고 자동연결, 적용
	@Ignore public void test() {
		AnimalFarm farm = context.getBean("animalFarm",AnimalFarm.class);
		farm.print();
	}
	@Test  public void test2() {
		AnimalFarm animalFarm = context.getBean("animalFarm", AnimalFarm.class);
		
	}
}
