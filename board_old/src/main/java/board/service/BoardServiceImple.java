
package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import board.dto.BoardDto;
import board.mapper.BoardMapper;

@Service
@Transactional
public class BoardServiceImple implements BoardService {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardDto> selectBoardListForSample() throws Exception{
		return boardMapper.selectBoardListForSample();
	}
	
	
	@Override
	public List<BoardDto> selectBoardList() throws Exception{
		return boardMapper.selectBoardList();
	}

	@Override
	public void insertBoard(BoardDto boardDto) throws Exception {
		boardMapper.insertBoard(boardDto);
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public BoardDto selectBoardDetail(int boardIdx) throws Exception {
		
		boardMapper.updateHitCount(boardIdx);			//조회수 증가
		int i = 10 / 0;									//오류코드
		return boardMapper.selectBoardDetail(boardIdx); //게시판 상세 내용 조회
		
	}

	@Override
	public void updateBoard(BoardDto boardDto) throws Exception {
		boardMapper.updateBoard(boardDto);
		
	}

	@Override
	public void deleteBoard(int boardIdx) throws Exception {
		boardMapper.deleteBoard(boardIdx);
		
	}
	
	
	
}
