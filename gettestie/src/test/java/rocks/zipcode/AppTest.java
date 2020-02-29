package java.rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class AppTest {

    @Test
    public void HashSetTest(){
        HashSet<Integer> testSet = new HashSet<>(Arrays.asList(1,1,1,1,1,1,2,3,4,5));
        testSet.remove(Arrays.asList(1));
        Assert.assertFalse(testSet.contains(1));
    }

    @Test
    public void ArrayListTest(){
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(2,5,3,6,7,6,4));
        testList.clear();
        Assert.assertTrue(testList.isEmpty());



        }


    public void HashMapTest(){}

    public void LinkedListTest(){}

    public void ArrayDequeTest(){}

    public void VectorTest(){}

    public void TreeMapTest(){}

    public void StackTest(){}

    public void TreeSetTest(){}

    public void PriorityQueueTest(){}

    public void Comparable(){}




}


