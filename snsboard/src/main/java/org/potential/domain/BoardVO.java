package org.potential.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardVO {

	
	private Integer mno;
	private Integer bno;
	private Integer ino;
	private String title;
	private String content;
	private Integer viewCount;
	private Integer likeCount;
	private Integer replyCount;
	private Date regDate;
	private Date updateDate;
}
