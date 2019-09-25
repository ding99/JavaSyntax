package main.java;

/**
 * Created by dingw on 5/31/2019.
 */

public class Trim {
    private Double inpoint;
    private Double outpoint;

    public Trim(){}
    public Trim(Double in, Double out){ inpoint = in; outpoint = out; }

    public Double getInpoint(){ return inpoint;}
    public void setInpoint(Double value){ inpoint = value;}

    public Double getOutpoint(){ return outpoint;}
    public void setOutpoint(Double value){ outpoint = value;}

    @Override
    public String toString(){
        return new StringBuilder("Trim(").append(inpoint).append(",").append(outpoint).append(")").toString();
    }
}
