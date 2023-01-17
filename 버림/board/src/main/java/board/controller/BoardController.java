package board.controller;

import java.util.List;

//import org.mybatis.logging.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.dto.BoardDto;
import board.service.BoardService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {

	//private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/board/openBoardList.do")
	public ModelAndView openBoardList() throws Exception{
		
		log.trace("TRACE ...");
		log.debug("DEBUG ...");
		log.info("INFO ...");
		log.warn("WARN ...");
		log.error("ERROR ...");
		
		
		ModelAndView mv = new ModelAndView("/board/boardList");
	
		List<BoardDto> list = boardService.selectBoardList();
		mv.addObject("list", list);	
		
		
		return mv;	
	}
	
	
	@RequestMapping("/board/openBoardWrite.do")
	public String openBoardWrite() throws Exception {
		return "/board/boardWrite";
	}
	
	@RequestMapping("/board/insertBoard.do")
	public String insertBoard(BoardDto boardDto) throws Exception {
		boardService.insertBoard(boardDto);
		return "redirect:/board/openBoardList.do";
	}
	
	@GetMapping("/board/openBoardDetail.do")
	public ModelAndView openBoardDetail(@RequestParam int boardIdx) throws Exception{
		ModelAndView mv = new ModelAndView("/board/boardDetail");
		
		BoardDto boardDto = boardService.selectBoardDetail(boardIdx);
		mv.addObject("board", boardDto);
		
		return mv;
	}
	
	@PostMapping("/board/updateBoard.do")
	public String updateBoard(BoardDto boardDto) throws Exception{
		boardService.updateBoard(boardDto);
		return "redirect:/board/openBoardList.do";
	}
	
	@PostMapping("/board/deleteBoard.do")
	public String deleteBoard(BoardDto boardDto) throws Exception{
		boardService.deleteBoard(boardDto.getBoardIdx());
		return "redirect:/board/openBoardList.do";
	}
		
}
