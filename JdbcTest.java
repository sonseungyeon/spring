package spring08_mvc02_ex;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myapp.marvel.MarvelMovie;
import com.myapp.marvel.MarvelMovieMapper;
import com.myapp.marvel.MarvelMovieService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root_context.xml")
public class JdbcTest {

	@Autowired
	DataSource datasource;
	
	@Autowired
	MarvelMovieMapper marvelMovieMapper;
	
	@Autowired
	MarvelMovieService marvelMovieService;
	
	@Test
	public void getMarvleListTest() {
		List<MarvelMovie> marvelList = marvelMovieService.getMarvelList();
		for(MarvelMovie marvel: marvelList) {
			System.out.println(marvel);
		}
		
	}

}
