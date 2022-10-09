package com.example.copytrade.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "newtable1")
public class Newtable1 implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, precision = 0)
    private BigInteger id;
    @Basic
    @Column(name = "full_name", nullable = true, length = -1)
    private String fullName;
    @Basic
    @Column(name = "tutorial_id", nullable = false)
    private long tutorialId;
    @Basic
    @Column(name = "status", nullable = true, precision = 0)
    private BigInteger status;
    @ManyToOne
    @JoinColumn(name = "tutorial_id", referencedColumnName = "id", nullable = false)
    private Tutorials tutorialsByTutorialId;
}
