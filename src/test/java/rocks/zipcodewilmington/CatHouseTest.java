package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest(){

        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Cat actualCat = AnimalFactory.createCat(name, birthDate);

        int id = actualCat.getId();

        CatHouse.clear();
        //When
        CatHouse.add (actualCat);
        //Then
        Cat retrivedCat = CatHouse.getCatById(id);

        Assert.assertEquals(actualCat,retrivedCat);

    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removebyIntegerTest(){

    //Given

            String name ="Milo";
       Date birthDate = new Date();
       Cat actualCat = AnimalFactory.createCat(name, birthDate);

    int id = actualCat.getId();
        CatHouse.clear();

        CatHouse.add(actualCat);//adding dog to doghouse

    Cat addedCat = CatHouse.getCatById(id);//retriving addeddog by id
        Assert.assertEquals(actualCat,addedCat);//checking the add successful
    //when


        CatHouse.remove(id);//remove actualdog using Integer id

    //then
    Cat retrivedCat = CatHouse.getCatById(id);//if romve done the retriveddog is null
        Assert.assertNull(retrivedCat);

}

// TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeTest(){

        //Given

        String name ="Milo";
        Date birthDate = new Date();
        Cat actualCat = AnimalFactory.createCat(name, birthDate);

        int id = actualCat.getId();
        CatHouse.clear();

        CatHouse.add(actualCat);//adding dog to doghouse

        Cat addedCat = CatHouse.getCatById(id);//retriving addeddog by id
        Assert.assertEquals(actualCat,addedCat);//checking the add successful
        //when


        CatHouse.remove(actualCat);//remove actualdog

        //then
        Cat retrivedCat = CatHouse.getCatById(id);//if romove done the retriveddog is null
        Assert.assertNull(retrivedCat);

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getCatByIdTest(){

        //Given

        String name ="Milo";
        Date birthDate = new Date();
        Cat actualCat = AnimalFactory.createCat(name, birthDate);

        int id = actualCat.getId();//intiating id with actualdog id
        DogHouse.clear();

        CatHouse.add(actualCat);//adding dog to doghouse
        //when
        Cat addedCat = CatHouse.getCatById(id);//retriving addeddog by id

        // then
        Assert.assertEquals(actualCat,addedCat);//checking the add successful


    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void GetNumberOfcatsTest() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }

}

