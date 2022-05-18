package id.ac.uin.student.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "First name is required")
    @Column(nullable = false, name = "firstName")
    private String firstName;

    @NotEmpty(message = "last name is required")
    @Column(nullable = false, name = "lastName")
    private String lastName;

    @NotEmpty(message = "email is required")
    @Column(nullable = false, name = "email", unique = true)
    private String email;

    @NotEmpty(message = "phone is required")
    @Column(nullable = false, name = "phone_number", unique = true)
    private String phone;

}
