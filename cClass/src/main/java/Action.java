package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dingw on 5/31/2019.
 */

public class Action {

    private void display(List<Top> tops){
        System.out.print("-- ");
        for(Top top : tops)
            System.out.println(top.toString().trim());
    }

    private void change(Top top, String id, List<Trim> trims){
        ArrayList<Top> tops = new ArrayList<>();
        tops.add(top);

        if(trims != null) {
            ArrayList<Top> tops2 = new ArrayList<>();
            int n = 1;
            Top nTop;

            for(Trim t : trims){
                nTop = new Top(new StringBuilder(id).append(n).toString(), n++);
                nTop.setMid01(top.getMid01());
                nTop.setMid02(top.getMid02());
                nTop.setTrim(t);

                tops2.add(nTop);
            }

            tops.addAll(tops2);
        }

        display(tops);
    }

    public void work(){
        Top top = new Top("TOP", 100);
        top.setMid01(new Middle("MID01", 201, new Bottom("BOTTOM1", 301)));
        top.setMid02(new Middle("MID02", 202, new Bottom("BOTTOM2", 302)));

        change(top, "FIRST", null);

        top.setNumber(101);
        change(top, "CHANGE", Arrays.asList(new Trim[]{new Trim(1.1, 1.2),new Trim(2.1, 2.2),new Trim(3.1, 3.2)}));

        top.setNumber(102);
        top.getMid01().getBottom().setNumber(305);
        top.getMid02().setNumber(203);
        top.getMid02().getBottom().setNumber(306);
        change(top, "SINGLE", Arrays.asList(new Trim[]{new Trim(0.1,0.2)}));
    }
}
