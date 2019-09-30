package nestor.gonzalo.cardenas.rojas.app.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nestor.gonzalo.cardenas.rojas.app.microservices.model.Teacher;
import nestor.gonzalo.cardenas.rojas.app.microservices.service.TeacherServiceImplement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TeacherController {
	@Autowired
	private TeacherServiceImplement teacherServiceImplement;
	@PostMapping("/teacher")
	public void create(@RequestBody Teacher teacher) {
		teacherServiceImplement.create(teacher);
	}

	@GetMapping("/teacher")
	public Flux<Teacher> findAll() {
		return teacherServiceImplement.findAll();
	}

	@GetMapping("/teacher/{id}")
	public Mono<Teacher> getCourses(@PathVariable String id) {

		return teacherServiceImplement.findById(id);
	}

	@PutMapping("/teacher")
	public Mono<Teacher> save(@RequestBody Teacher teacher) {
		return teacherServiceImplement.save(teacher);
	}
	@DeleteMapping("/teacher/{id}")
	public void delete(@PathVariable("id") String id){
		teacherServiceImplement.delete(id).subscribe();
	}

}
