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

    @Test
    public void ArrayDequeTest(){
        ArrayDeque<Integer> testAd= new ArrayDeque<>();
        testAd.offerLast(1);
        testAd.offerLast(2);
        Integer expected = 2;
        Integer actual = testAd.peekLast();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void VectorTest(){
        Vector<Integer> testVector = new Vector<>();
        testVector.setSize(10);
        testVector.add(1);
        Integer expected = 11;
        Integer actual = testVector.size();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void TreeMapTest(){
        TreeMap<Integer, Integer> testTree = new TreeMap<>();
        testTree.put(1,2);
        testTree.put(3,4);
        testTree.put(5,6);
        Set exSet = testTree.descendingKeySet();
        Iterator exIterator = exSet.iterator();
        Integer actual = 0;
        while(exIterator.hasNext()){
            actual = (Integer) exIterator.next();
        }
        Integer expected = 1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void StackTest(){
        Stack<Integer> testStack = new Stack<>();
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.push(4);
        testStack.push(5);
        testStack.pop();
        Assert.assertFalse(testStack.isEmpty());
        Integer expected = 4;
        Integer actual = testStack.peek();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void TreeSetTest(){
        TreeSet<Integer> testSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        testSet.add(8);
        Integer actual = testSet.first();
        Integer expected = 1;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void PriorityQueueTest(){
        PriorityQueue<Integer> testPq =  new PriorityQueue<>(Arrays.asList(1,2,3,4,5));
        Integer expected = 5;
        Integer actual = testPq.size();
        Assert.assertEquals(expected,actual);
        // attempted to add null and failed due to null pointer
    }

    public void Comparable(){


    }



}


