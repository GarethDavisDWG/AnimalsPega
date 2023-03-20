package com.softwareinstitute.davis.gareth.animals;

public abstract class Mammal extends Animal{
    ///////////////////////Attributes/////////////////////////




    //////////////////////////Constructors////////////////////





    ///////////////////////////Methods///////////////////////

    public String reproduce(Animal parent){
        return "I did a live birth of a baby " + parent.getClass();
    }




}
