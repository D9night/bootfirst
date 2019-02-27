package com.liuxscomp.model;

/**
 * 医生 实体
 */
public class Doctor {
    /* 主键 */
    private int id;
    /* 姓名 */
    private String name;
    /* 昵称 */
    private String nickname;
    /* 等级 */
    private String level;
    /* 性别*/
    private String sex;
    /* 年龄 */
    private int age;

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
