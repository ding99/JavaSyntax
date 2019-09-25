package main.java;

/**
 * Created by dingw on 5/31/2019.
 */

public class Top {

    private String name;
    private Integer number;

    private Trim trim;

    private Middle mid01;
    private Middle mid02;

    public Top(){}
    public Top(String s, Integer i){ name = s; number = i; }

    public Integer getNumber(){ return number; }
    public void setNumber(Integer value){ number = value; }
    public String getName(){ return name; }
    public void setName(String value){ name = value; }

    public Trim getTrim(){ return trim; }
    public void setTrim(Trim value){ trim = value; }

    public Middle getMid01(){ return mid01; }
    public void setMid01(Middle value){ mid01 = value; }
    public Middle getMid02(){ return mid02; }
    public void setMid02(Middle value){ mid02 = value; }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("Top{");

        if(name != null)
            builder.append(" Name<").append(name).append(">");
        if(number != null)
            builder.append(" Number<").append(number).append(">");

        if(trim != null)
            builder.append(" ").append(trim.toString());

        if(mid01 != null)
            builder.append(" ").append(mid01.toString());
        if(mid02 != null)
            builder.append(" ").append(mid02.toString());

        return builder.append(" }").toString();
    }
}
