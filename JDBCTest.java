package spring04_mybatis_ex;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring04_mybatis_ex/springContext.xml")
public class JDBCTest {
	@Autowired
	SqlSession sqlSession;
	
	@Test @Ignore
	public void test() {
		ApplicationContext ctx = new GenericXmlApplicationContext("spring04_mybatis_ex/springContext.xml");
		assertNotNull(ctx);
		DataSource ds =ctx.getBean(DataSource.class);
		assertNotNull(ds);
		
//		SqlSessionFactoryBean ssfb= ctx.getBean(SqlSessionFactoryBean.class);
//		assertNotNull(ssfb);
	}
	
	@Test
	public void selectOne() {
		User user = sqlSession.selectOne("userSession.selectUserById",1);
		//toString을 하지 않으면 객체 값이 나옴.
		System.out.println(user);
	}
	
	@Test @Ignore
	public void insertUser() {
		User user = new User(2,"직스","직스",LocalDate.parse("2021-06-04"),"010-1111-1111","서울시",LocalDateTime.parse("2021-06-04T09:44:55"));
		int affectedRows = sqlSession.update("userSession.insertUser",user);
		System.out.println("적용된 row:"+affectedRows);
	}
	
	@Test @Ignore
	public void deleteUser() {
		sqlSession.delete("userSession.deleteUser",3);
	}
	
	@Test @Ignore
	public void updateUser() {
		User user = new User(2,"야스오","야스오",LocalDate.parse("2021-06-04"),"010-1111-1111","수원시",LocalDateTime.parse("2021-06-04T09:30:35"));
		int affectedRows = sqlSession.update("userSession.updateUser",user);
		System.out.println("적용된 row:"+affectedRows);
	}
	
	//특정값이 아이디에 포함되어있는 아이조회(콘캣사용)
	
	
}
