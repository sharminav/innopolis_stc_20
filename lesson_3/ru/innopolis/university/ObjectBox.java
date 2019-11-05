package ru.innopolis.university;

import java.util.*;

public class ObjectBox {

    Collection coll;

    public ObjectBox() {
        coll = new ArrayList();
    }

    public void addObject (Object obj) {
        //System.out.println("start add");
        coll.add(obj);
        //System.out.println("end add");
    }

    public void deleteObject (Object obj) {
        if (coll.contains(obj)) {
            coll.remove(obj);
        }
    }

    public void dumps(String comment) {
        System.out.print(comment + " ");
        for (Object obj : coll) {
            System.out.print(obj.toString() + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        String result = "";
        for (Object obj: coll) {
            result = result + " " + ((float)obj);
        }
        return result;
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (Object obj: coll) {
            result = (int)(result + ((float)obj));
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
