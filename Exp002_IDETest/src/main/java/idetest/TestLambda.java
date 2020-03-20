package idetest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person{
    String sirName;

    public Person(String sName){
        this.sirName=sName;
    }

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }
}

public class TestLambda {

    public static void main(String[] args) {
        List<Person> personList= new ArrayList<>();
        personList.add(new Person("Person1"));
        personList.add(new Person("Person2"));

        Collections.sort(personList, (p1, p2)-> {
            return p1.getSirName().compareTo(p2.getSirName());
        });
        }
    }

