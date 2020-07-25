package br.com.devdojo.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/**
 * @author igor - By DevDojo
 */
@Entity
public class Student extends  AbstractEntity {

    @NotEmpty(message = "O campo nome do estudante é obrigatório")
    private String name;

    @Email
    @NotEmpty(message = "O campo e-mail do estudante é obrigatório")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
