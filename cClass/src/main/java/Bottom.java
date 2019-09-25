package main.java;

/**
 * Created by dingw on 5/31/2019.
 */

public class Bottom {
    private String name;
    private Integer number;

    public Bottom(){}
    public Bottom(String id, Integer n){ name = id; number = n; }

    public Integer getNumber(){ return number; }
    public void setNumber(Integer value){ number = value; }
    public String getName(){ return name;}
    public void setName(String value){ name = value; }

    @Override
    public String toString(){

        StringBuilder builder = new StringBuilder("Bottom{");

        if(name != null)
            builder.append(" Name<").append(name).append(">");
        if(number != null)
            builder.append(" Number<").append(number).append(">");

        return builder.append(" }").toString();
    }
}
