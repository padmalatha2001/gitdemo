package com.project.dao;

import java.util.List;

import com.project.entity.Result;
import com.project.model.ResultModel;

public interface ResultDAO {
	
	public Boolean create(Result result);
	public Result findById(Long id);
	public List<Result> findAll();
	public ResultModel calculateResult(Long studentId);


}
