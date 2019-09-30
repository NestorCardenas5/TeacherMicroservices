package nestor.gonzalo.cardenas.rojas.app.microservices.service;

import nestor.gonzalo.cardenas.rojas.app.microservices.model.Teacher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TeacherInterface {
	void create(Teacher teacher);

	Flux<Teacher> findAll();

	Mono<Teacher> findById(String id);

	Mono<Teacher> save(Teacher teacher);

	Mono<Void> delete(String id);

}
