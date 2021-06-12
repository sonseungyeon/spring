package com.myapp.marvel;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

//interface를 mapper로 등록하기 위해 사용하는 어노테이션
@Mapper
public interface MarvelMapper {

	//조회 삽입 수정 삭제
	@Select("select * from marvel_movie")
	public List<Marvel> selectMarvelList();
	
	@Insert("insert into marvel_movie values(#{marvelId}, #{title}, #{titleEng}, #{releaseDate}, #{worldBoxOffice}, #{writeDate}, #{updateDate})")
	public int insertMarvel(Marvel marvel);
	
	@Select("select * from marvel_movie where marvel_id =#{marvelId}")
	public Marvel selectMarvelOneById(int marvelId);
	
	@Update("update marvel_movie set title=#{title}, title_eng= #{titleEng}, release_date=#{releaseDate},"
			+ "	world_box_office=#{worldBoxOffice}, write_date=#{writeDate}, update_date=#{updateDate}"
			+ " where marvel_id = #{marvelId}")
	public int updateMarvel(Marvel marvel);
	
	@Delete("delete * from marvel_movie where marvel_id=#{marvelId}")
	public int deleteMarvel(int marvelId);
}
