package idetest;


import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static final String ASFDS = "asfds";
    static String testRefactoringAAA;
    private static String lsdf;
    private static String a;
    private static int aaa;

    public static void main(String[] args) {


        System.out.println("this is test2");
//        refactoredMethod();
    }

    private static void refactoredMethod() {
        NewRefactoringMethod();
    }

    private static void NewRefactoringMethod() {
        try {
            int len = a.length();
            for (int i = 0; i < len; i++) {
                System.out.println(i);
            }
            lsdf = ASFDS;
            String s = lsdf;
            a = "asdaa";
            a = s;

            System.out.println(!s.equals("test"));

            Test test = new Test();
            List<String> list = new ArrayList<>();
            for (String s1 : list) {
                ttt(s1);
            }
            for (String s1 : list) {
                test2(s1);
            }
            Test2.aaa = 18;
            int aaa = Test2.aaa;
            ttt("aaa = " + aaa);
            ttt("aaa = " + aaa);
            System.out.println(aaa);
            testRefactorMethod();
            test2(lsdf);
            test2("asdf");
            try {
                a = String.valueOf(0);
                ttt("aaa = " + aaa);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ttt("billy is the best");

        try {
            System.out.println("this is just another test");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static void ttt(String s2) {
        System.out.println(s2);
    }

    private static void test2(String lsdf) {
        ttt(lsdf);
    }

    private static void testRefactorMethod() {
        String[] strArray = {"sd"};
        for (String s1 : strArray) {

        }
    }
}
