package com.raphael.SpringDataJPA0205ate06.entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@AttributeOverrides({
		@AttributeOverride(
				name = "name",
				column = @Column(name = "TeacherName")
		),
		@AttributeOverride(
				name = "email",
				column = @Column(name = "TeacherEmail")
		)
})
public class Teacher {

	private String name;
	private String email;
}
