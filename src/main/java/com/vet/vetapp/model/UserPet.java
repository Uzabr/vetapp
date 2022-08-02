package com.vet.vetapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "user_pet")
@Data
public class UserPet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_id")
    private Long id;

    @Column(name = "nickname")
    private String petNickname;

    @Column(name = "birth_date")
    private Date birthDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users users;

    @OneToOne
//    @JoinColumn(name = "animal_id")
    private Animals animals;



    public UserPet (Long id, String petNickname, Date birthDate, Animals animals) {
        this.id = id;
        this.petNickname = petNickname;
        this.birthDate = birthDate;
        this.animals = animals;
    }

}
