package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bawei.dao.CriDao;
import com.bawei.entity.Crimi;

@Service
@Transactional
public class CriServiceImp implements CriService{
	@Autowired
	private CriDao dao;

	@Override
	public List getList(String name) {
		// TODO Auto-generated method stub
		return dao.getList(name);
	}
	//完成“添加”功能
	@Override
	public void add(Crimi c) {
		// TODO Auto-generated method stub
		dao.add(c);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		dao.del(id);
	}

	@Override
	public Crimi getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}
	//(6)完成修改功能。
	@Override
	public void update(Crimi c) {
		// TODO Auto-generated method stub
		dao.update(c);
	}
	
}
