package com.softwareinstitute.davis.gareth.animals.tests;

import com.softwareinstitute.davis.gareth.animals.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void testing_cat_age(){
        Cat testCat = new Cat();
        testCat.setAge(17);
        assertEquals(17,testCat.getAge(),"The expected age of the cat was not the same");
    }
}
