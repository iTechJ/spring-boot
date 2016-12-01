package com.techart.lab.dto;

/**
 * Created by alexander on 11/21/16.
 */
public class RecordDTO {

    private Integer id;

    private String text;

    public RecordDTO(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
