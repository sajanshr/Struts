package com.example.demo;

public class ProfileAction {
	
	public String userid;
	public String pwd;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	public String execute() throws Exception{
		if (userid.equals("john") && pwd.equals("abc")){
			return "success";
	
		}else {
			return "error";
		}
	}
	
	

}
