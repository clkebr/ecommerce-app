package com.myshop.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity @Data @NoArgsConstructor
public class Category extends BaseEntity{
    private String name;

}
