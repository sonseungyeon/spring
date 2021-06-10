package com.myapp.marvel;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MarvelMovieMapper {

	@Select("select * from marvelmovie")
	public List<MarvelMovie> selectMarvelMovie();
	
	@Insert("insert into marvelmovie(marvel_id,title,title_eng,release_date,world_box_office,write_date,update_date)"
			+ " values(#{marvelId},#{title},#{titleEng},#{releaseDate},#{worldBoxOffice},#{writeDate},#{updateDate})")
	public int insertMarvelMovie(MarvelMovie marvelMovie);
	
	@Delete("delete from marvelmovie where marvel_id = #{marvelId}")
	public int deleteMarvelMovie(int marvelId);
}
