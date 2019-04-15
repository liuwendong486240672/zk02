package com.bawei.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bawei.entity.Crimi;
import com.bawei.service.CriService;
import com.bawei.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class CriController {
	@Autowired
	private CriService service;
	@RequestMapping("list.do")
	public String getList(HttpServletRequest request,@RequestParam(defaultValue=("1"))Integer cpage,@RequestParam(defaultValue=(""))String name){
		PageHelper.startPage(cpage, 2);
		List list = service.getList(name);
		PageInfo info = new PageInfo<>(list);
		PageUtils page = new PageUtils(cpage, (int)info.getTotal(), 2, "list.do", request);
		request.setAttribute("list", info.getList());
		request.setAttribute("name", name);
		return "list";
	}
	//完成“添加”功能
	@RequestMapping("add.do")
	@ResponseBody
	public boolean add(Crimi c){
		System.out.println(c);
		try {
			service.add(c);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	//(6)完成修改功能。
	@RequestMapping("update.do")
	@ResponseBody
	public boolean update(Crimi c){
		System.out.println(c);
		try {
			service.update(c);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	@RequestMapping("del.do")
	@ResponseBody
	public boolean del(int id){
		System.out.println(id);
		try {
			service.del(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	@RequestMapping("getById.do")
	@ResponseBody
	public Object getById(int id){
		Crimi c = service.getById(id);
		Map map = new HashMap<>();
		map.put("c", c);
		return map;
	}
	
}
