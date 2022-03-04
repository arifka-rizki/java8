import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 20; i++){
            numbers.add(generateRandomInt(1, 20));
        }
        List<Integer> evenNumber = numbers.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());

        List<Integer> startWithOne = numbers.stream()
                .map(n -> n.toString())
                .filter(n -> n.startsWith("1"))
                .map(n -> Integer.parseInt(n))
                .collect(Collectors.toList());

        Integer total = numbers.stream()
                .reduce(0, (a,b) -> a+b);

        List<Integer> sortNumber = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("---Sorted---");
        printList(sortNumber);
        System.out.println("---Even Number---");
        printList(evenNumber);
        System.out.println("---Start with 1---");
        printList(startWithOne);
        System.out.println("---Total---");
        System.out.println(total);
    }

    private static int generateRandomInt(int min, int max){
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
    private static void printList(List<Integer> list){
        for(Integer n : list){
            System.out.println(n);
        }
    }
}
