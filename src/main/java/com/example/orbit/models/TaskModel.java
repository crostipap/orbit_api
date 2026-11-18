package com.example.orbit.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "users")
@Data
public class TaskModel {

}
