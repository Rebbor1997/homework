package com.company.lesson6;

public class Person implements Footwear, Trousers, Jacket {
    public String name;
    public String jacket;
    public String trousers;
    public String footwear;

    public Person(String name, String jacket, String trousers, String footwear){
        this.name = name;
        this. jacket = jacket;
        this. trousers = trousers;
        this. footwear = footwear;
    }




    public void putOn() {
        System.out.printf(
                "name - %s\njacket - %s\ntrousers - %s\nfootwear - %s\n",
                this.name, this.jacket, this.trousers, this.footwear);
    }
    public void takeOff(){
        System.out.printf(
                "name - %s\njacket - %s\ntrousers - %s\nfootwear - %s\n",
                this.name, this.jacket, this.trousers, this.footwear
        );
    }

}
