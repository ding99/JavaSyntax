package main.java;

/**
 * Created by ding_ on 9/23/2020
 */

public class ExamineCompare {
    public void Start(){
        System.out.println("-- Examine Compare");

        Integer x = 3;
        Integer y = null;

        try{ System.out.println(Integer.compareUnsigned(x,3) == 0 || Integer.compareUnsigned(y,0) == 0); }
        catch(Exception e){ System.out.println(e.getClass().toString()); }

        try{ System.out.println(y.compareTo(null)== 0 || true); }
        catch(Exception e){ System.out.println(e.getClass().toString()); }
    }

    /** result:
     * true
     * class java.lang.NullPointerException
     * **/
}
