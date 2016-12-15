package org.potential.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TimeLineVO {

	
	private Integer mno;
	private Integer writerMno;
	private Integer tno;
	private String content;
	private Date regDate;
	private Date updateDate;
}
