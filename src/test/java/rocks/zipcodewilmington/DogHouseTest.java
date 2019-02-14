package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog actualDog = AnimalFactory.createDog(name, birthDate);

        int id = actualDog.getId();

        DogHouse.clear();
        //When
        DogHouse.add (actualDog);
        //Then
        Dog retrivedDog = DogHouse.getDogById(id);

        Assert.assertEquals(actualDog,retrivedDog);

    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
public void removeTest(){
        //Given

    String name ="Milo";
    Date birthDate = new Date();
    Dog actualDog = AnimalFactory.createDog(name, birthDate);

    int id = actualDog.getId();
    DogHouse.clear();

    DogHouse.add(actualDog);//adding dog to doghouse

    Dog addedDog = DogHouse.getDogById(id);//retriving addeddog by id
    Assert.assertEquals(actualDog,addedDog);//checking the add successful
    //when


    DogHouse.remove(actualDog);//remove actualdog

    //then
    Dog retrivedDog = DogHouse.getDogById(id);//if romove done the retriveddog is null
    Assert.assertNull(retrivedDog);

}

// TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removebyIntegerTest(){
        //Given

        String name ="Milo";
        Date birthDate = new Date();
        Dog actualDog = AnimalFactory.createDog(name, birthDate);

        int id = actualDog.getId();
        DogHouse.clear();

        DogHouse.add(actualDog);//adding dog to doghouse

        Dog addedDog = DogHouse.getDogById(id);//retriving addeddog by id
        Assert.assertEquals(actualDog,addedDog);//checking the add successful
        //when


        DogHouse.remove(id);//remove actualdog using Integer id

        //then
        Dog retrivedDog = DogHouse.getDogById(id);//if romve done the retriveddog is null
        Assert.assertNull(retrivedDog);

    }
    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogByIdTest(){

        //Given

        String name ="Milo";
        Date birthDate = new Date();
        Dog actualDog = AnimalFactory.createDog(name, birthDate);

        int id = actualDog.getId();//intiating id with actualdog id
        DogHouse.clear();

        DogHouse.add(actualDog);//adding dog to doghouse
     //when
        Dog addedDog = DogHouse.getDogById(id);//retriving addeddog by id

        // then
        Assert.assertEquals(actualDog,addedDog);//checking the add successful


    }


    }



