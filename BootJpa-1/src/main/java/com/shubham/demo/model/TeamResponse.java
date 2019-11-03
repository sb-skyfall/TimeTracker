package com.shubham.demo.model;

import org.springframework.web.multipart.MultipartFile;

public class TeamResponse {
	private String teamName;
	private MultipartFile file;
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
}
