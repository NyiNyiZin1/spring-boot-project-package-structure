package com.example.demo.dtos;

public abstract class BaseDto<T, L> {
    abstract public T toEntity(T originalEntity);
    abstract public void fromEntity(T entity);
    BaseDto(){

    }

    BaseDto(T entity){
        fromEntity(entity);
    }


}
