package com.example.demo.dtos;

import com.example.demo.entities.User;
import com.example.demo.entities.UserHistory;


public class UserDto extends BaseDto<User, UserHistory> {
    private int id;
    private String name;

    public UserDto(User entity) {
        super(entity);
    }

    public UserDto(){
    }


    @Override
    public User toEntity(User originalEntity) {
        User user = new User();
        return new User(this.id, this.name, originalEntity.getAddress());
    }

    @Override
    public void fromEntity(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
