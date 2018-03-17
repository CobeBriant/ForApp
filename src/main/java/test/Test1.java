package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import exam.dao.StudentDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class Test1 {

	@Autowired
	private StudentDao studentDao;
	
	@Test
	public void selectStuByName(){
//		String sql = "SELECT id,`NAME`,	`PASSWORD`,	cid , modified FROM student WHERE	NAME ='柴东福'";
		String sql = "SELECT id FROM student WHERE	NAME = ";
		String name = "柴东福";
		String sql2 = sql + "'" + name + "'";
		String id = studentDao.queryForString(sql2);
		System.out.println(id);
	}
}
