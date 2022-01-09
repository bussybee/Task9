package ru.vsu.cs.maslovaei;

import java.util.List;

public class CreateNewLIst {

    public static List<Integer> createNewList(List<Integer> list1, List<Integer> list2){
        list1.retainAll(list2);

            return list1;
    }

}
