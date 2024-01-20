package in.serosoft.rs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.serosoft.entity.Student;
import in.serosoft.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentResource {
	
	
	@Autowired
	private StudentService studentService;

	@PostMapping(value="/create",consumes="application/json")
	public Boolean create(@RequestBody Student student) {
		return studentService.create(student);
	}

	@GetMapping(value="/findById/{geetha}",produces="application/json")
	public Student findById(@PathVariable("geetha")Long id) {
		Student student=studentService.findById(id);
		return student;
	}

	@GetMapping(value="/findAll",produces="application/json")
	public List<Student> findAll() {
		List<Student> students=studentService.findAll();
		return students;
	}


}
