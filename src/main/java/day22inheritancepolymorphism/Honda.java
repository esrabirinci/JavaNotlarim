package day22inheritancepolymorphism;

public class Honda extends Car {
    public String color;
    public Honda(){
        super("white",540000);
        System.out.println("honda constructor");

    }
    public Honda(String color){
        this.color=color;
    }

}
