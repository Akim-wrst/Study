package TaskGenerics;

import java.util.ArrayList;
import java.util.List;

class Box {
    boolean checkBoxInList(Box box, List<Box> list) {
        boolean result = false;
        for (Box b : list) {
            if (b == box) {
                result = true;
            }
        }
        return result;
    }

    void addBoxToList(Box box, List<Box> list) {
        list.add(box);
        System.out.println(list);
    }

    void printBoxList(List<Box> list) {
        System.out.println(list);
    }

    void copyBoxes(List<Box> sourceList, List<Box> targetList) {
        targetList.addAll(sourceList);
        System.out.println(targetList);
    }

    public static void main(String[] args) {
        Box box = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box box4 = new Box();
        List<Box> list = new ArrayList<>();
        list.add(box);
        list.add(box2);
        list.add(box3);
        list.add(box4);
        System.out.println(box.checkBoxInList(box, list));
        System.out.println("-----------------------------");
        List<Box> Consumer = new ArrayList<>();
        box.addBoxToList(box, Consumer);
        System.out.println("-----------------------------");
        box.printBoxList(list);
        System.out.println("-----------------------------");
        box.copyBoxes(list, Consumer);
    }


    @Override
    public String toString() {
        return "Box{}";
    }
}
