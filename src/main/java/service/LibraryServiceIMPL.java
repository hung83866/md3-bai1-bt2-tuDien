package service;

import model.Library;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;

public class LibraryServiceIMPL {
    public static List<Library> libraries;
    static {
        libraries = asList(
                new Library("XIN CHAO","hello"),
        new Library("TAM BIET ","bye"),
        new Library("HON","kiss"),
        new Library("YEU","love"),
        new Library("CAM ON","thank you"),
        new Library("XIN LOI","sorrry"),
        new Library("SO 1","one"),
        new Library("SO 2","two"),
        new Library("SO 3","three"),
        new Library("SO 4","four"),
        new Library("SO 5","five"),
        new Library("SO 6","six"),
        new Library("SO 7","seven"),
        new Library("SO 8","eight"),
        new Library("SO 9","nine"),
        new Library("SO 10","ten")
        );
    }
}
