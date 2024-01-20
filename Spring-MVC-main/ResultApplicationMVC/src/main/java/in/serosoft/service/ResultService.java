package in.serosoft.service;

import java.util.List;

import in.serosoft.entity.Result;
import in.serosoft.model.ResultModel;

public interface ResultService {
	
	public Boolean create(Result result);
	public Result findById(Long id);
	public List<Result> findAll();
	public ResultModel calculateResult(Long studentId);


}
