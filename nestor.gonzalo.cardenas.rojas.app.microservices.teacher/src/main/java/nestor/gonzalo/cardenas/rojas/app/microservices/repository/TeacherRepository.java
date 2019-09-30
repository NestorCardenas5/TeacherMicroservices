package nestor.gonzalo.cardenas.rojas.app.microservices.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import nestor.gonzalo.cardenas.rojas.app.microservices.model.Teacher;

public interface TeacherRepository extends ReactiveMongoRepository<Teacher, String> {
	
}
