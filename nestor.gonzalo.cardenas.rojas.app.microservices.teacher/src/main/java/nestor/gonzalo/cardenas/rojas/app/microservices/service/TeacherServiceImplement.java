package nestor.gonzalo.cardenas.rojas.app.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nestor.gonzalo.cardenas.rojas.app.microservices.model.Teacher;
import nestor.gonzalo.cardenas.rojas.app.microservices.repository.TeacherRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TeacherServiceImplement implements TeacherInterface {
	@Autowired
	public TeacherRepository teacherRepository;

	@Override
	public void create(Teacher teacher) {
		teacherRepository.save(teacher).subscribe();
	}

	@Override
	public Flux<Teacher> findAll() {

		return teacherRepository.findAll();
	}

	@Override
	public Mono<Teacher> findById(String id) {
		return teacherRepository.findById(id);
	}

	@Override
	public Mono<Teacher> save(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public Mono<Void> delete(String id) {
		return teacherRepository.deleteById(id);
	}

}
