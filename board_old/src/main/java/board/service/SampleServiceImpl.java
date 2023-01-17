package board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dto.ArticleDto;
import board.mapper.SampleMapper;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	private SampleMapper sampleMapper;
	
	@Override
	public ArticleDto selectOneArticle() throws Exception {
		
		return sampleMapper.selectOneArticle();
	}

}
