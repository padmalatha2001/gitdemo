package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ResultDAO;
import com.project.entity.Result;
import com.project.model.ResultModel;
import com.project.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService {

	
	@Autowired
	private ResultDAO resultDAO;
	
	@Override
	public Boolean create(Result result) {
		// TODO Auto-generated method stub
		return resultDAO.create(result);
	}

	@Override
	public Result findById(Long id) {
		// TODO Auto-generated method stub
		return resultDAO.findById(id);
	}

	@Override
	public List<Result> findAll() {
		// TODO Auto-generated method stub
		return resultDAO.findAll();
	}

	@Override
	public ResultModel calculateResult(Long studentId) {
		// TODO Auto-generated method stub
		return resultDAO.calculateResult(studentId);
	}

}
