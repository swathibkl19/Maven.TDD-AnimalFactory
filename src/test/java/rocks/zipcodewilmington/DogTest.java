package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog("milo", null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }



    @Test
    public void setDogNameTest(){

        String givenName = "Zula";


        // When (a cat is constructed)
        Dog dog = new Dog(null, null, null);
        dog.setName(givenName);
        Assert.assertEquals(givenName,dog.getName());


    }

    @Test
    public void speakTest(){

        // When (a cat is constructed)
        Dog dog = new Dog(null, null, null);
        Assert.assertEquals("bark!",dog.speak());


    }
    @Test
    public void birthDateTest(){

        //Creating the cat DB
        Date givenBirthDate = new Date();

        //Creating the NEW CAT
        Dog dog = new Dog(null,null,null);

        //Assigning the above BD
        dog.setBirthDate(givenBirthDate);

        Assert.assertEquals(givenBirthDate , dog.getBirthDate());

    }

    @Test
    public void testFoodTest(){
        //Creating the Food
        Food f = new Food();

        Dog dog  = new Dog(null,null,null);

        dog.eat(f);
        dog.eat(f);

        Assert.assertEquals("2",dog.getNumberOfMealsEaten().toString());

    }

    @Test
    public void getIdTest(){

        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(null, null, givenId);
        Assert.assertEquals("0",dog.getId().toString());


    }


    @Test
    public void instanceOfTest(){

        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(null, null, givenId);

        Assert.assertThat(dog ,instanceOf(rocks.zipcodewilmington.animals.Mammal.class));
    }

    @Test
    public void animalinstanceOfTest(){

        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(null, null, givenId);

        Assert.assertThat(dog ,instanceOf(rocks.zipcodewilmington.animals.Animal.class));
    }
}
