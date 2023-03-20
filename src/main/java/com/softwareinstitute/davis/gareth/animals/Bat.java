package com.softwareinstitute.davis.gareth.animals;

import com.softwareinstitute.davis.gareth.interfaces.Flying;

public class Bat extends Mammal implements Flying {

    ///////////////////////Attributes/////////////////////////




    //////////////////////////Constructors////////////////////





    ///////////////////////////Methods///////////////////////

    public void eat(String food){
        this.setLastAte(food);
    }


    @Override
    public void takeOff() {

    }

    @Override
    public void flight() {

    }

    @Override
    public void landing() {

    }
}
