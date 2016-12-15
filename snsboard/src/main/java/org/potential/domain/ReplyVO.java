package org.potential.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReplyVO {

	
//	private Integer rno;
//	private Integer rrno;
//	private Integer rorder;	// 복층형 데이터 
	private Integer mno;
	private String content;
	private Date regDate;
	private Date updateDate;
}
