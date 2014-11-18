package jp.fores.gruul.dto;

import java.util.Date;

import lombok.Data;

@Data
public class User {

	private String uuid;
	private String nickname;
	private Date createdAt;
}
