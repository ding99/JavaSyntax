package main.java;

/**
 * Created by dingw on 6/28/2019.
 */

public class Person {
    private String name;
    private Integer age;
    private String gender;

    public Person(){}
    public Person(String name, Integer age, String gender){ this.name = name; this.age = age; this.gender = gender; }

    public String getName(){ return name; }
    public void setName(String value) { name = value; }

    public Integer getAge(){ return age; }
    public void setAge(Integer value) { age = value; }

    public String getGender(){ return gender; }
    public void setGender(String value) { gender = value; }

    @Override
    public String toString(){
        return "Person{name=\"" + name + "\",age=" + age + ",gender=\"" + gender + "\"}";
    }
}
