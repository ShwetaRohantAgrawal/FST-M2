package activities;

//import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Activity1 {
    static List list;

    @BeforeEach
    public void setUp(){
        list = new ArrayList<String>();

        list.add("alpha");
        list.add("beta");

    }

    @Test
    public void insertTest(){
        assertEquals(2, list.size(), "Wrong size");
        list.add("gamma");
        assertEquals(3, list.size(), "Wrong size");

        List testlist = new ArrayList<String>();
        testlist.add("alpha");
        testlist.add("beta");
        testlist.add("gamma");

        assertEquals(testlist.get(0),list.get(0),"Wrong Element");
        assertEquals(testlist.get(1),list.get(1),"Wrong Element");
        assertEquals(testlist.get(2),list.get(2),"Wrong Element");
    }

    @Test
    public void replaceTest(){
        assertEquals(2, list.size(), "Wrong size");
        list.add("gamma");
        assertEquals(3, list.size(), "Wrong size");
        list.set(1,"testreplace");

        List testlist = new ArrayList<String>();
        testlist.add("alpha");
        testlist.add("testreplace");
        testlist.add("gamma");

        assertEquals(testlist.get(0),list.get(0),"Wrong Element");
        assertEquals(testlist.get(1),list.get(1),"Wrong Element");
        assertEquals(testlist.get(2),list.get(2),"Wrong Element");
    }
}
