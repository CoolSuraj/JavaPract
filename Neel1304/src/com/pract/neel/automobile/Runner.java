package com.pract.neel.automobile;

public class Runner {
    public static void main(String[] args) {

        Toto tt = new Toto();
        System.out.println(tt);
        tt.run();
        tt.changeDirection("Left");
        tt.changeDirection("Right");
        tt.abreak();

        motorcycle yamaha = new motorcycle();
        System.out.println(yamaha);
        yamaha.run();
        yamaha.changeDirection("Left");
        yamaha.changeDirection("Right");
        yamaha.abreak();

        Automobile tvs = new motorcycle();
        System.out.println(tvs);
        tvs.run();
        tvs.changeDirection("Left");
        tvs.changeDirection("Right");
        tvs.abreak();

        cycle hercules = new cycle();
        System.out.println(hercules);
        hercules.run();
        hercules.changeDirection("Left");
        hercules.changeDirection("Right");
        hercules.abreak();


        // cycle atlas = (cycle) new twowheeler(); // this is example of downcasting in
        // java
        // // on this line runtime exception is occured.
        // atlas.toString();
        // atlas.run();
        // atlas.changeDirection("Left");
        // atlas.changeDirection("Right");
        // atlas.abreak();
        // atlas.getGear();

    }
}
