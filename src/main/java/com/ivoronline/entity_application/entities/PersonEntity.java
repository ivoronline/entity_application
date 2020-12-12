package com.ivoronline.entity_application.entities;

import org.springframework.stereotype.Component;

@Component
public class PersonEntity {

  //PROPERTIES
  private Long    id;

  public PersonEntity() {  }

  public PersonEntity(Long id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  private String  name;
  private Integer age;

  //SETTERS
  public void setId  (Long    id)   { this.id   = id;   }
  public void setName(String  name) { this.name = name; }
  public void setAge (Integer age)  { this.age  = age;  }

  //GETTERS
  public Long    getId  () { return id;   }
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

}
