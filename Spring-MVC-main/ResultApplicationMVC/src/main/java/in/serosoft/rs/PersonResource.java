package in.serosoft.rs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.serosoft.entity.Person;
import in.serosoft.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonResource {
	
	@Autowired
	private PersonService personService;

	@PostMapping(value="/create",consumes="application/json")
	public Boolean create(@RequestBody Person person) {
		return personService.create(person);
	}

	@GetMapping(value="/findById/{geetha}",produces="application/json")
	public Person findById(@PathVariable("geetha")Long id) {
		return personService.findById(id);
	}

	@GetMapping(value="/findAll",produces="application/json")
	public List<Person> findAll() {
		return personService.findAll();
	}

}
