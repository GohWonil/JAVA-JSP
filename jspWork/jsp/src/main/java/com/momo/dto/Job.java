package com.momo.dto;

/**
 * Dto란?
 * 데이터 전송 객체(Data Transfer Object)
 * 데이터를 전송하거나 전달하기 위해 사용되는 객체
 */

public class Job {
	private String jobCode;
	private String jobName;
	
	@Override
	public String toString() {
		return jobCode + "/" + jobName;
	}
	
	public String getJobCode() {
		return jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	
}
