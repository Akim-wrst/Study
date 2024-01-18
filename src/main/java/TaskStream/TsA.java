package TaskStream;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

class TsA {
    public static void main(String[] args) {
        //BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        System.out.println("Sum = " + add.apply(2, 3));
        System.out.println("----------------------------------------------------------");
        List<String> list= new ArrayList<>();
        list.add("Akim");
        list.add("Pasha");
        list.add("Sasha");
        list.add("Antonio");
        list.add("Santonio");
        list.add("Santiago");
        List<String>list99 = list.stream().filter(str -> str.startsWith("S")).collect(Collectors.toList());
        System.out.println(list99);
        System.out.println("----------------------------------------------------------");
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(9);
        list1.add(5);
        list1.add(2);
        list1.add(9);
        list1.add(5);
        list1.stream().map(e -> e*e).forEach(System.out::println);
        System.out.println("----------------------------------------------------------");
        //list.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("----------------------------------------------------------");
        //int result = list1.stream().reduce((a, e) -> a+e).get();
        int result = list1.stream().reduce(Integer::sum).get();
        System.out.println(result);
        System.out.println("----------------------------------------------------------");
        /*OptionalDouble average = list1.stream().mapToInt(e -> e).average();
        if (average.isPresent())
        {
            System.out.print(average.getAsDouble());
        }*/
        OptionalDouble result1 = list1.stream().mapToInt(e -> e).average();
        System.out.println(result1);
        System.out.println("----------------------------------------------------------");
        int max = list1.stream().max((a,e)->a-e).get();
        System.out.println(max);
        System.out.println("----------------------------------------------------------");
        int min = list1.stream().min((a,e)->a-e).get();
        System.out.println(min);
        System.out.println("----------------------------------------------------------");
        boolean result2 = list1.contains(9);
        System.out.println(result2);
        System.out.println("----------------------------------------------------------");
        List<Integer> list3 = list1.stream().distinct().toList();
        System.out.println(list3);
        System.out.println("----------------------------------------------------------");
        //List<Integer> list4 = list.stream().map(e->e.length()).collect(Collectors.toList());
        List<Integer> list4 = list.stream().map(String::length).collect(Collectors.toList());
        System.out.println(list4);
        System.out.println("----------------------------------------------------------");
        String names = list.stream().collect(Collectors.joining());
        System.out.println(names);
        System.out.println("----------------------------------------------------------");
        List<Integer> list5 = list1.stream().filter(e->e%2 == 0).collect(Collectors.toList());
        System.out.println(list5);

    }
}
