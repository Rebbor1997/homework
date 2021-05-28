package com.company.lesson6;

public class Person implements IPerson {
    public String name;
    private Jacket jacket;
    private Trousers trousers;
    private Footwear footwear;

    public static void main(String[] args) {
        Person person1 = new Person("Bob", new HmJacket(), new ZaraTrousers(), new NbFootwear());
        System.out.println(person1.name);
        person1.getDressed();
        person1.undress();

    }

    public Person( String name, Jacket jacket, Trousers trousers, Footwear footwear) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.footwear = footwear;
    }
    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(HmJacket jacket) {
        this.jacket = jacket;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setTrousers(NbTrousers trousers) {
        this.trousers = trousers;
    }

    public Footwear getFootwear() {
        return footwear;
    }

    public void setFootwear(ZaraFootwear footwear) {
        this.footwear = footwear;
    }


    public void getDressed() {
        jacket.putOn();
        trousers.putOn();
        footwear.putOn();
    }

    public void undress() {
        jacket.takeOff();
        trousers.takeOff();
        footwear.takeOff();
    }
}

