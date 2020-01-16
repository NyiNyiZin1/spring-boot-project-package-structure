package com.example.demo.entities;

public abstract class BaseEntity<T> {
    abstract public T createHistory(String action) throws CloneNotSupportedException;
}
