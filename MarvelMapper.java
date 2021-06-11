package com.myapp.marvel;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MarvelMapper {
	
	// 조회, 삽입, 수정, 삭제

	@Select("select * from marvel_movie")
	public List<Marvel> selectAllMarvel();

	// preparedstatement를 mybatis가 해주었던 것을 타입을 다 알아서 찾아주는 것
	// 카멜표기법을 _로 알아서 맞춰서 해주는 것
	@Insert("insert into marvel_movie values(#{marvelId}," + "#{title}, #{titleEng}, #{releaseDate}, #{worldBoxOffice},"
			+ "#{writeDate}, #{updateDate})")
	@Options(useGeneratedKeys =true, keyProperty="marvelId")
	public int insertMarvel(Marvel marvel);

	// 수정할 테이블을 위해 가져오는 데이터
	@Select("select * from marvel_movie where marvel_id=#{marvelId}")
	public Marvel selectMarvelById(int marvelId);

	@Update("update marvel_movie set title =#{title}, title_eng= #{titleEng}, release_date=#{releaseDate},"
			+ " world_box_office=#{worldBoxOffice}, write_date=#{writeDate}, update_date=#{updateDate}"
			+ " where marvel_id = #{marvelId}")
	public int updateMarvel(Marvel marvel);
	
	@Delete("delete from marvel_movie where marvel_id=#{marvelId}")
	public int deleteMarvelById(int marvelId);
	
	@Select("select * from movie")
	public List<Movie> selectAllMovie();
}
