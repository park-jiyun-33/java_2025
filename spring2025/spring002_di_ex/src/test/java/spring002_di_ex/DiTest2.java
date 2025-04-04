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
//@ContextConfiguration(locations = "classpath:config/test1.xml")  // ����
@ContextConfiguration(locations = "classpath:config/test2.xml")  // ����
public class DiTest2 {
	
	@Autowired ApplicationContext context; //1. bean(�������� �����ϴ� ��ü��)
	// 2. ApplicationContext - bean �������� �Ҹ���� ����
	// 3. @Autowired - ������, ������Ƽ �ִ��� �׽�Ʈ�ϰ� �ڵ�����, ����
	@Ignore public void test() {
		AnimalFarm farm = context.getBean("animalFarm",AnimalFarm.class);
		farm.print();
	}
	@Test  public void test2() {
		AnimalFarm animalFarm = context.getBean("animalFarm", AnimalFarm.class);
		
	}
}
