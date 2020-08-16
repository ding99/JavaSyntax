package main.java;

import util.args.*;

/**
 * Created by dingw on 5/31/2019.
 */

public class Entrance {

    public static void main(String[] args) throws Exception {
        System.out.println("== Start");

        try {
            Args arg = new Args("l,p#,d*,t#", args);

            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String dir = arg.getString('d');
            int time = arg.getInt('t');

            System.out.println("logging " + logging + ", port " + port + ", dir " + dir + ", duration " + time);
        }
        catch(ArgsException e){
            System.out.printf("Argument error:%s\n", e.errorMessage());
        }

        System.out.println("== End");
    }

}
