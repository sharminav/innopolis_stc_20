package ru.innopolis.university;

import java.util.Comparator;

public class ht2t3Person {
    String name;
    Integer age;
    ht2t3Sex.sex sex;

    String getName(){return name;}
    Integer getAge(){return age;}
    ht2t3Sex.sex getSex(){return sex;}
}


class PersonNameComparator implements Comparator<ht2t3Person>{
    public int compare(ht2t3Person a, ht2t3Person b){
        return a.getName().compareTo(b.getName());
    }
}


class PersonAgeComparator implements Comparator<ht2t3Person>{
    public int compare(ht2t3Person a, ht2t3Person b){
        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}
