package com.softwareinstitute.davis.gareth.animals;

import com.softwareinstitute.davis.gareth.exceptions.VomitException;

public class Cat extends Mammal{

    ///////////////////////Attributes/////////////////////////




    //////////////////////////Constructors////////////////////





    ///////////////////////////Methods///////////////////////

    public void eat(String food) throws VomitException {
        this.setLastAte(food);
        throw new VomitException();
    }



}
