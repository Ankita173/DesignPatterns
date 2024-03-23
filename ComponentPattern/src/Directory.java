import java.util.List;

public class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> files;

    public Directory(String name, List<FileSystem> files) {
        this.files = files;
        this.directoryName = name;
    }

    public void ls() {
        System.out.println("Directory name: "+directoryName);
        for (FileSystem file : files) {
            file.ls();
        }
    }
}
