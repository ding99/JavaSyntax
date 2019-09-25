package main.java;

/**
 * Created by dingw on 5/31/2019.
 */

public class Middle {
    private String name;
    private Integer number;

    private Bottom bottom;

    public Middle(){}
    public Middle(String id, Integer n, Bottom b){
        bottom = b;
        name = id;
        number = n;
    }

    public Integer getNumber(){ return number; }
    public void setNumber(Integer value){ number = value; }
    public String getName(){ return name;}
    public void setName(String value){ name = value; }

    public Bottom getBottom(){ return bottom; }
    public void setBottom(Bottom value){ bottom = value; }

    @Override
    public String toString(){

        StringBuilder builder = new StringBuilder("Middle{");

        if(name != null)
            builder.append(" Name<").append(name).append(">");
        if(number != null)
            builder.append(" Number<").append(number).append(">");

        if(bottom != null)
            builder.append(" ").append(bottom.toString());

        return builder.append(" }").toString();
    }
}
