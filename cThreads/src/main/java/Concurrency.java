package main.java;

/**
 * Created by ding_ on 9/23/2020
 */

public class Concurrency {
    private long count;
    public void incrementCount(){ count++; }
    public long getCount() { return count; }

    public static void Start() throws InterruptedException{
        final Concurrency ce = new Concurrency();
        for(int i = 0; i < 1000; i++){
            new Thread(new Runnable(){
                @Override
                public void run(){
                    ce.incrementCount();
                }
            }, "Thread" + i).start();
        }
        Thread.sleep(3000);
        System.out.println("Final number: " + ce.getCount());
    }

    /** result:
     *  Final number: 1000
     *  **/
}
