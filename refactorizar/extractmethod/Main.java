package refactorizar.extractmethod;

import org.w3c.dom.ls.LSOutput;

public class Main {


    void printHTML() {
        printHead();
        printBody();
        printFooter();

    }

    private void printFooter() {
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println("");
    }

    private void printHead(){
        System.out.println("This is the head");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println("");
    }

    private void printBody(){
        System.out.println("This is the body");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println("");
    };
}
