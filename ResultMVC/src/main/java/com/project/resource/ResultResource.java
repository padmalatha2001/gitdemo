package com.project.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.entity.Result;
import com.project.model.ResultModel;
import com.project.service.ResultService;

@Controller
@RequestMapping("/results")
public class ResultResource {

	
	@Autowired
	private ResultService resultService;

	@PostMapping (value="/create",consumes="application/json"  )
	public Boolean create(@RequestBody Result result) {
		return resultService.create(result);
	}

	@GetMapping(value="/findById/{surya}",produces="application/json"  )
	public Result findById(@PathVariable("surya") Long id) {
		return resultService.findById(id);
	}

	@GetMapping(value="/findAll",produces="application/json")
	public List<Result> findAll() {
		return resultService.findAll();
	}
	
	@GetMapping(value="/calculateResult/{id}",produces="application/json"  )
	public ResultModel calculateResult(@PathVariable("id")  Long studentId) {
		return resultService.calculateResult(studentId);
	}
	
	@GetMapping(value="/displayResult")
	public String ModelAndView(@RequestParam("rno")  Long studentId) {
		ResultModel result= resultService.calculateResult(studentId);
		System.out.println(result);
		ModelAndView mv =new ModelAndView();
		mv.addObject("mv", result);
		mv.setViewName("/Result.jsp");
		return "/Result.jsp";
	}
	
}
