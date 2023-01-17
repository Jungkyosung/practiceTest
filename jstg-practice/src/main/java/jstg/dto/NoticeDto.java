package jstg.dto;

import lombok.Data;

@Data
public class NoticeDto {
	
	private int nboardIdx;
	private String ntitle;
	private String ncontents;
	private int nhitCnt;
	private String ncreatedDt;
	private String ncreatedId;
	private String updatedId;
	private String updatedDt;
	private String ndeletedYn;
}
