package ca.bcit.winter2021.comp2522.midterm.question6;

import java.util.ArrayList;

public class Ellipse {
    private int coefficientX;
    private int coefficientY;
    private int size;
    //constructors
    public Ellipse(int coefficientX, int coefficientY, int size) {
        this.coefficientX = coefficientX;
        this.coefficientY = coefficientY;
        this.size = size;
    }

    public static void runAllTestScenariosForQuestion6() {
//        Ellipse eclipse = new Ellipse();
//        eclipse.drawEllipse();


        URL url = new URL("www.ciccc.ca/", "madp401");
        url.setProtocol("https://");

        System.out.println(url);

        Directory directory = new Directory("courseInfo", "txt");
        Directory directory2 = new Directory("txtsampleExam", "pdf");

        ArrayList<Directory> directories = new ArrayList<>();

        directories.add(directory);
        directories.add(directory2);

        Directory mainDirectory = new Directory("Lecture", "file", directories);
        for (Directory d : mainDirectory.getDirectories()) {
            System.out.println(d.toString());
        }
    }

    @Override
    public String toString() {
        return coefficientX + "X^2" + " + " +coefficientY + "Y^2" + " = " +size;
    }
}