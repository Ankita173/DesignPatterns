import java.util.Arrays;

public class ListFileSystem {
    public static void main(String[] args) {
        FileSystem f1 = new File("ankita.txt");
        FileSystem f2 = new File("saransh.txt");
        FileSystem f3 = new File("simmi.txt");
        FileSystem f4 = new File("saru.txt");
        FileSystem d1 = new Directory("ofc", Arrays.asList(f1));
        FileSystem d2 = new Directory("ofc", Arrays.asList(f2));
        FileSystem d3 = new Directory("home", Arrays.asList(f3));
        FileSystem d4 = new Directory("home", Arrays.asList(f4));
        FileSystem d5 = new Directory("she", Arrays.asList(d1, d3));
        FileSystem d6 = new Directory("he", Arrays.asList(d2, d4));
        FileSystem d7 = new Directory("Us", Arrays.asList(d5, d6));

        d7.ls();
    }
}
