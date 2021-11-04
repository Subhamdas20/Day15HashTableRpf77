package com.bz.testhashtable;

import com.bz.hashtable.MyHashMap;
import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    @Test
    public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency(){
        String sentence = "To be or not to be";
        MyHashMap<String , Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for(String word : words){
            Integer value  = myHashMap.get(word);
            if(value == null) value = 1;
            else value+=1;
            myHashMap.add(word , value);

        }

        myHashMap.show();
        int frequency =myHashMap.get("to");
        System.out.println(myHashMap);
        Assert.assertEquals(2 , 2);

    }

}
