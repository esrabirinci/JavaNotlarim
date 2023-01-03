package day29abstractioncollections;

public interface Engine extends Vehicle{

    //Class ----->Interface ==> Implements
    //Class ----->Class ==> extends
    //Interface --->Interface ==> extends
    //Interface --->Class ==> MÜMKÜN DEĞİL (bir class bir interface in parenti olaMAZ)

    // tipler aynı olduğunda extends, farklı olduğunda implements.


    /*
     interface deki tüm variableler otomatik olarak (default) "public" dir.
     interface deki tüm variableler otomatik olarak (default) "final" dir.
     interface deki tüm variableler otomatik olarak (default) "static" dir.
     */
    int price = 2000;
    double weight = 23.5;


    void run();

}
