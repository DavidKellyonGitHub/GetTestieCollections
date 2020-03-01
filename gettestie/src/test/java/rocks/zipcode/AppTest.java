package rocks.zipcode;

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
        ArrayList<Integer> actual = new ArrayList<Integer>(Arrays.asList(2,5,3,6,7,6,4));
        Collections.sort(actual);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,3,4,5,6,6,7));
        Assert.assertEquals(expected,actual);
        }

    @Test
    public void HashMapTest(){
        HashMap<Integer, Integer> testMap= new HashMap<>();
        testMap.put(2,3);
        testMap.put(2,5);
        testMap.put(2,6);
        testMap.put(2,7);
        String expected = "2";
        Assert.assertTrue(testMap.containsKey(2));
    }

    @Test
    public void LinkedListTest(){
        LinkedList<Integer> testLinkList = new LinkedList<>();
        testLinkList.addAll(Arrays.asList(5,6,4,7,3,7));
        Assert.assertTrue(testLinkList.listIterator(1).hasNext());
    }

    public void ArrayDequeTest(){}

    public void VectorTest(){}

    public void TreeMapTest(){}

    public void StackTest(){}

    public void TreeSetTest(){}

    public void PriorityQueueTest(){}

    public void Comparable(){}




}


