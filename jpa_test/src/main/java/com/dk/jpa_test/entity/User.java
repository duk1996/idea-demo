package com.dk.jpa_test.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "user")
@Data
@Entity
public class User {
    @Id
    private String id;

    private String name;

    private Date create_time;

    private Date update_time;

    private Integer count;


}
