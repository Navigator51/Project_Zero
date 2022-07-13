import java.util.List;
import java.util.stream.Collectors;

public class WorkingWithStreams {

    public static void main(String[] args) {
         List<String> stringList = List.of("cat", "dog", "Java", "javascript", "javacat", "kotlin", "cat");
         List<String> result = filterCat(stringList);
        System.out.println(result);
    }
    // создать метод, принимающий на вход список строк и выдающий список строк без строк "кот"

    private static List<String> filterCat(List<String> stringList) {
        return stringList.stream()
                .filter(anyString -> !anyString.equals("cat"))
                .collect(Collectors.toList());

    }
}
