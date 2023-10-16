package com.example.smaple1.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Todo {
    private Integer id;
    public String todo;
    private LocalDateTime inserted;
}
