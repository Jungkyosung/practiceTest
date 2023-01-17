package board.mapper;

import org.apache.ibatis.annotations.Mapper;

import board.dto.ArticleDto;

@Mapper
public interface SampleMapper {

	ArticleDto selectOneArticle() throws Exception;
}
