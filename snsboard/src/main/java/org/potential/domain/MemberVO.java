package org.potential.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberVO {
	
	
	private Integer mno;
	private String id;
	private String pw;
	private String name;
	private String email;
	private Date regDate;
	private Date updateDate;

}
