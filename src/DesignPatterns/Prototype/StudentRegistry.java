package DesignPatterns.Prototype;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String,Student> map = new HashMap<>();

    public void registry(String key, Student student){
        map.put(key, student);
    }

    public Student get(String key){
        return map.get(key);
    }

}
