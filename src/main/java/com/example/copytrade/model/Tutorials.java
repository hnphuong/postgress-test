package com.example.copytrade.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tutorials")
public class Tutorials {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private long id;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "published", nullable = true)
    private Boolean published;
    @Basic
    @Column(name = "title", nullable = true, length = 255)
    private String title;
    @OneToMany(mappedBy = "tutorialsByTutorialId")
    private Collection<Newtable1> newtable1sById;

}
