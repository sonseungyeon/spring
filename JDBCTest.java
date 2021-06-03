package spring04_mybatis;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring04_mybatis/springContext.xml")
public class JDBCTest {
// 객체는 Sqlsession이라는 타입으로 받아볼수 있음.
	@Autowired
	SqlSession sqlSession;
	
	
	@Test @Ignore
	public void test() {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring04_mybatis/springContext.xml");
//		assertNotNull(ctx);
		DataSource ds =ctx.getBean(DataSource.class);
		assertNotNull(ds);
		
		SqlSessionFactoryBean ssfb= ctx.getBean(SqlSessionFactoryBean.class);
		assertNotNull(ssfb);
		
		SqlSessionTemplate sqlSession = ctx.getBean(SqlSessionTemplate.class);
		assertNotNull(sqlSession);
	}

	@Test @Ignore
	public void insertTest() {
		
		Person person = new Person(0,"하이머딩거",50);
		//sqlSession.update("네임스페이스.사용할 쿼리가 있는 태그의 id") 
		int affectedRows = sqlSession.update("personSession.insertPerson", person);
		System.out.println("적용된 row :"+affectedRows);
	}
	
	
	@Test @Ignore
	public void selectTest() {
		//해당되는 아이를 리스트로 가져옴
		List<Person> personList = sqlSession.selectList("personSession.selectPersonList");
		for(Person person:personList) {
			System.out.println(person);
		}
	}
	
	@Test @Ignore
	public void deleteTest() {
		sqlSession.delete("personSession.deletePerson",1);
	}
	
	@Test @Ignore
	public void selectOneTest() {
		Person person = sqlSession.selectOne("personSession.selectPersonById",2);
			System.out.println(person);
		
	}
	
	@Test 
	public void updateTest() {
		Person person = new Person(2,"카타리나",20);
		int affectedRows = sqlSession.update("personSession.updatePerson",person);
		System.out.println("수정된 rows :"+affectedRows);
	}
}
