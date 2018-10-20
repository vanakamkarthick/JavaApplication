package service;

import java.util.List;

public class LinearSearch implements SearchService {
    @Override
    public void logic(List<Integer> elements,Integer value) {
        int index = -1;
        for (Integer element :elements) {
            if (element.equals(value)) {
               index= elements.indexOf(element);
               break;
            }
        }
        if (index ==-1) {System.out.println("Not Found");return;}
        System.out.println("Element at "+index+"\'th location");
    }
}
