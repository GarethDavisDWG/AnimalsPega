package com.softwareinstitute.davis.gareth.animals;

public abstract class Bird extends Animal{

    ///////////////////////Attributes/////////////////////////




    //////////////////////////Constructors////////////////////





    ///////////////////////////Methods///////////////////////

    public String reproduce(Animal parent){
        return "I laid an egg with a " + parent.getClass() + " chick inside";
    }



}
