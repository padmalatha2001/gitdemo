package in.serosoft.dao;

import java.util.List;

import in.serosoft.entity.Result;
import in.serosoft.model.ResultModel;

public interface ResultDAO {
	public Boolean create(Result result);
	public Result findById(Long id);
	public List<Result> findAll();
	public ResultModel calculateResult(Long studentId);


}
