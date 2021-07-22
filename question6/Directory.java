package ca.bcit.winter2021.comp2522.midterm.question6;
import java.util.ArrayList;

public class Directory {
    private ArrayList<Directory> directories;
    private String directoryName;
    private ArrayList<String> files;
    private String fileName;
    private String name;
    private String type;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.directories = new ArrayList<>();
        this.files = new ArrayList<>();
    }
    public Directory() {
        this.directories = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public Directory(String name, String type, ArrayList<Directory> directories) {
        this.name = name;
        this.type = type;
        this.directories = directories;
    }

    public Directory(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public ArrayList<Directory> getDirectories() {
        return directories;
    }
    public void setDirectories(ArrayList<Directory> directories) {
        this.directories = directories;
    }

    public void addFiles(String files) {
        this.files.add(files);
    }
    public void addDirectories(Directory directories) {
        this.directories.add(directories);
    }
    public String getDirectoryName(Directory directory) {
        return directory.directoryName;
    }
    public String toString() {

        String result = "";
        if(files.size()!=0){
            for(int i=0; i< files.size();i++) {
                result = result + files.get(i) +"\n";
            }
        }
        if(directories.size()!=0){
            for(int i=0;i<directories.size();i++){
                String directoryName = getDirectoryName(this.directories.get(i));
                result = result + directoryName + " : (which is a Directory)"+"\n";
            }
        }
        return result;
    }
}