package com.softwareinstitute.davis.gareth.zoo;

import com.softwareinstitute.davis.gareth.animals.*;
import com.softwareinstitute.davis.gareth.exceptions.VomitException;

public class Main {

    public static void main(String[] args){
        Cat cosmo = new Cat();
        Bat man = new Bat();
        //System.out.println(cosmo.toString() + man);
        try {
            cosmo.eat("Tuna");
            System.out.println("This is the try block");
        }
        catch (VomitException ve){
            System.out.println(ve.getMessage());
            System.out.println("This is the Vomit catch block");
        }
        catch (Exception e){
            System.out.println("This is the Exception catch block");
        }
        finally {
            System.out.println("This bit is the finally block");
        }


    }
}
