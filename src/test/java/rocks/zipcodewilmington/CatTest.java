package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import static org.hamcrest.CoreMatchers.instanceOf;


import java.util.ArrayList;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

//    @Test
//    public void setName(String name){
////        Cat.name();
//        //Make a cat
//        //Set the cats name
//        //Check the cats name is the given name
//    }


    @Test
    public void setNameTest(){

        String givenName = "Zula";


        // When (a cat is constructed)
        Cat cat = new Cat(null, null, null);
        cat.setName(givenName);
        Assert.assertEquals(givenName,cat.getName());


    }

    @Test
    public void speakTest(){

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(null, givenBirthDate, givenId);
        Assert.assertEquals("meow!",cat.speak());


    }
   @Test
    public void birthDateTest(){

        //Creating the cat DB
        Date givenBirthDate = new Date();

        //Creating the NEW CAT
        Cat cat = new Cat(null,null,null);

        //Assigning the above BD
        cat.setBirthDate(givenBirthDate);

        Assert.assertEquals(givenBirthDate , cat.getBirthDate());

    }

    @Test
    public void testFoodTest(){
        //Creating the Food
     Food f = new Food();

     Cat cat  = new Cat(null,null,null);

     cat.eat(f);
     cat.eat(f);

     Assert.assertEquals("2",cat.getNumberOfMealsEaten().toString());

    }

    @Test
    public void getIdTest(){

        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(null, null, givenId);
        Assert.assertEquals("0",cat.getId().toString());


    }


    @Test
    public void instanceOfTest(){

        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(null, null, givenId);

    Assert.assertThat(cat ,instanceOf(rocks.zipcodewilmington.animals.Mammal.class));
    }

    @Test
    public void animalinstanceOfTest(){

        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(null, null, givenId);

        Assert.assertThat(cat ,instanceOf(rocks.zipcodewilmington.animals.Animal.class));
    }

}
