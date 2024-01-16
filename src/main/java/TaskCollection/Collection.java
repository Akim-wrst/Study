package TaskCollection;

import java.util.*;

class Collection {

    static List<Integer> DeleteDuplicate(List<Integer> list, List<Integer> list2) {
        List<Integer> listResult = new ArrayList<>();
        for (int i : list2) {
            if (list.contains(i)) {
                listResult.add(i);
            }
        }
        return listResult;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(1);
        list2.add(3);
        list2.add(1);
        list2.add(5);
        list2.add(8);

        int max = list.stream().max((x, y) -> x - y).get();
        System.out.println(max);

        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);

        Collections.reverse(list);
        System.out.println(list);

        System.out.println(list.contains(4));

        System.out.println(Collection.DeleteDuplicate(list, list2));

        list.removeAll(list2);
        System.out.println(list);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zxzx");
        map.put(2, "sdsd");
        map.put(3, "fgfg");
        map.put(4, "sdsd");

        System.out.println(map.containsKey(3));

        System.out.println(map.get(2));

        System.out.println(map.entrySet());

        map.entrySet().removeIf(e -> e.setValue("sdsd").equals("sdsd"));
        System.out.println(map);

        Queue<String> queue = new LinkedList<>();
        queue.offer("Akim");

        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue.poll());
    }
}


