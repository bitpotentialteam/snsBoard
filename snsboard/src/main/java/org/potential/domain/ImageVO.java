package org.potential.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImageVO {

	
	private Integer mno;
	private Integer bno;
	private Integer ino;
	private String image;
	private Date regDate;
	private Date updateDate;
	
}
