package com.vet.vetapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "animals")
@Data
@NoArgsConstructor
public class Animals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id")
    private Long id;

    @Column(name = "sex_of_animal")
    private String sexOfAnimal;


    @Column(name = "breed")
    private String breedOfAnimal;

    @Column(name = "type")
    private String typeOfAnimal;
    @OneToOne
    private UserPet userPet;

    public Animals (Long id, String sexOfAnimal, String breedOfAnimal, String typeOfAnimal, UserPet userPet) {
        this.id = id;
        this.sexOfAnimal = sexOfAnimal;
        this.breedOfAnimal = breedOfAnimal;
        this.typeOfAnimal = typeOfAnimal;
        this.userPet = userPet;
    }

}
