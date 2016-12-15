package org.potential.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DiaryVO {

	
	private Integer mno;
	private Integer dno;
	private Integer ino;
	private String content;
	private Date regDate;
	private Date updateDate;
}
