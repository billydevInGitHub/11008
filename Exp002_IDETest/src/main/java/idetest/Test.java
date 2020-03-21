package idetest;

import temp2.interface4;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class Test implements TestInterface, TestInterface2, Interface3, interface4 {


    private String stringtestnew;

    private static String test2;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Test() {
    }

    @Override
    public String toString() {

        stringtestnew = "Test`{}asdasdf";

        stringtestnew = "Test`{}";
        stringtestnew = "Test`{}";
        return stringtestnew;
    }

    public static void main(String[] args) {


        File file = new File("c:\\Temp\\tttt.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("this is test1");

        System.out.println("edit on git hub");
        System.out.println("edit on git hub new change from github2");
        System.out.println("edit on git hub new change from github3");
        System.out.println(test2);

        Test2 tt2 = new Test2();

        Test2.testRefactoringAAA = String.valueOf(5);
        int j = 9;
        for (int i = 0; i < j; i++) {

        }
        List<String> list;

        int jj = 9;
        for (int i = 0; i < jj; i++) {

        }

        String s = null;
        if (!s.equals("sfs")) {

        }
        s.compareTo("sdf");

        System.out.println(s.toLowerCase());
        System.out.println(test2);

    }

}
