package person;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper//빈으로 등록하면서 가져오게 됨.
public interface PersonMapper {
	//마이바티스 annotation방식으로 쿼리문 작성하기
	
//	@Insert("insert into person values(#{id},#{name},#{age})")
	public void insertPerson(Person person);
	
//	@Delete("delete from person where id =#{id}")
	public void deletePerson(int id);
	
//	@Update("update person set name=#{name}, age=#{age} where id =#{id}")
	public int updatePerson(Person person);
	
	//xml 파일로 쿼리를 구현
//	@Select("select * from user")
	public List<Person> selectList();
	
	@Select("select * from user where id=#{id}")
	public Person selectOne(int id);
	
	@Select("select id, name, age from person limit #{startRow},#{cnt}")
	public List<Person> selectListSome(@Param("startRow")int startRow, @Param("cnt")int cnt);
}
