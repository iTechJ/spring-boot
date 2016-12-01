package com.techart.lab.entity;

import javax.persistence.*;

/**
 * Created by alexander on 11/21/16.
 */
@Entity
@Table(name = "record")
public class Record {

    private Integer id;

    private String text;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "text", nullable = false)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
