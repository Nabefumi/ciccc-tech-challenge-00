package ca.bcit.winter2021.comp2522.midterm.question6;
public class TestQuestion6 {
    public static void runAllTestScenariosForQuestion6(){
        Ellipse test1 = new Ellipse(4,5,7);
        System.out.println(test1);

        URL test2 = new URL("https", "ciccc.ca", "madp401");
        System.out.println(test2);

        Directory test3 = new Directory();
        Directory Assignments = new Directory("Assignments");
        Directory Lectures = new Directory("Lectures");

        test3.addDirectories(Assignments);
        test3.addDirectories(Lectures);
        test3.addFiles("Courseinfo.txt");
        test3.addFiles("sampleExam.pdf");
        System.out.println(test3);
    }
}