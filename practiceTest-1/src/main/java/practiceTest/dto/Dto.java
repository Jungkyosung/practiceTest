package practiceTest.dto;

import lombok.Data;

@Data
public class Dto {

	private int fanIdx;
	private String ftitle;
	private String fcontents;
	private int fhitCnt;
	private String fcreatedDt;
	private String fcreatedId;
	private String fupdatedDt;
	private String fupdatedId;
	private String fdeletedYn;
	
	private int celebrityIdx;
	private String celebrityName;
	private String celebrityImage;
	private String youtube;
	private String instagram;
	
	private int typeIdx;
	private String typeName;
	
	private int page;			//현재 페이지 번호
	private int recordSize;		//페이지당 출력할 데이터 개수
	private int pageSize;		//화면 하단에 출력할 페이지 사이즈
	private String keyword;		//검색 키워드
	private String searchType;	//검색 유형
	
	
}