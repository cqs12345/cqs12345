package com.ck.entity;

/**
 * @Descrition:
 * @Author caoqs
 * @Date 2021/5/13 10:23
 */
public class teacher {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public teacher() {
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
