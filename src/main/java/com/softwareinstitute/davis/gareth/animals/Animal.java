package com.softwareinstitute.davis.gareth.animals;

import com.softwareinstitute.davis.gareth.exceptions.VomitException;

public abstract class Animal {

    /////////////////////////////Attributes///////////////////////////////
    private String colour;
    private int age;
    private String lastAte;


    //////////////////////////////Constructors//////////////////////////////
    protected Animal(){
        super();
    }




    ///////////////////////////////Methods/////////////////////////////////
    public abstract void eat(String food) throws VomitException;

    public void sleep(int time){

    }

    public String excrete(){
        return "Poo and Corn";
    }

    public abstract String reproduce(Animal parent);

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastAte() {
        return lastAte;
    }

    public void setLastAte(String lastAte) {
        this.lastAte = lastAte;
    }

    @Override
    public String toString() {
        return "Animal is a "+this.getClass()+"{" +
                "colour='" + colour + '\'' +
                ", age=" + age +
                ", lastAte='" + lastAte + '\'' +
                '}';
    }
}
