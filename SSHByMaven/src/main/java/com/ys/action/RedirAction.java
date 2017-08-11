package com.ys.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ys.service.Service;

@SuppressWarnings({ "rawtypes", "serial" })
public class RedirAction extends ActionSupport{
	private Service service;
	
	public void setService(Service service) {
		this.service = service;
	}
	
	private List list;
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String execute() throws Exception {
		list=service.getAll();
		System.out.println();
		return SUCCESS;
	}
}
