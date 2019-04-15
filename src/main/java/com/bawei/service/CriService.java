package com.bawei.service;

import java.util.List;

import com.bawei.entity.Crimi;

public interface CriService {

	List getList(String name);
	//完成“添加”功能
	void add(Crimi c);

	void del(int id);

	Crimi getById(int id);
	//(6)完成修改功能。
	void update(Crimi c);

}
