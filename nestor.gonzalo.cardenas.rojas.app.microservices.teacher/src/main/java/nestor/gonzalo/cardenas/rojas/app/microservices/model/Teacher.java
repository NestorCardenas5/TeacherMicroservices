package nestor.gonzalo.cardenas.rojas.app.microservices.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "teacher")
public class Teacher {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	@NotEmpty
	private String fullName;
	@NotEmpty
	private String gender;
	@NotEmpty
	private String typeDocument;
	@NotEmpty
	@Size(min = 8, max = 8, message = "The document number contains 8 digits")
	private String numberDocument;
}
