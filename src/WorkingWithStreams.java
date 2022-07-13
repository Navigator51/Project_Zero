import java.security.DigestException;
import java.util.List;
import java.util.stream.Collectors;

public class WorkingWithStreams {

    public static void main(String[] args) {
        List<String> stringList = List.of("cat", "dog", "Java", "javascript", "javacat", "kotlin", "cat");
        List<String> result = filterCat(stringList);
        System.out.println(result);

        List<Cat> catList = List.of(new Cat(), new Cat("red"), new Cat("grey", "Barsic"),
                new Cat("Murzic", "pantera", 6));
        List<Dog> dogList = rechengeCats(catList);
        System.out.println(dogList);
    }
    // создать метод, принимающий на вход список строк и выдающий список строк без строк "кот"

    private static List<String> filterCat(List<String> stringList) {
        return stringList.stream()
                .filter(anyString -> !anyString.equals("cat"))
                .collect(Collectors.toList());

    }
    // создать медод, принимающий на вход список объектов котов
    // метод должен преобразовать всех котов в собак по следующему принципу
    // имя совпадает, цвет совпадает, количество жизней уменьшить втрое.
    // коты и собаки должны иметь специфичные поля, которые при преобразовании принимают значение по умолчанию
    // в конечном списке не должно быть собак с цветом RED

    private static List<Dog> rechengeCats(List<Cat> catList) {
        return catList.stream()
                .map(Cat::toDog)
                .filter(anyDog -> !anyDog.getColor(anyDog).equals("red"))
                .peek(a -> {
                    int mutatedCountLife = a.getCountLife(a) / 3;
                    a.setCountLife(mutatedCountLife);
                })
                .toList();
    }
}

