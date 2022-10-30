package pl.agh.edu.recomendationsystem.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id @GeneratedValue
    private Long id;
    private String name;

    public User(String name) {
        this.name = name;
    }
}
