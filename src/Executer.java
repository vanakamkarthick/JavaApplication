import service.LinearSearch;
import service.SearchService;

import java.util.ArrayList;
import java.util.List;

public class Executer {
    public static void main (String args[]) {
        SearchService service = new LinearSearch();
        List<Integer> elements = new ArrayList<Integer>();
        elements.add(100);
        elements.add(203);
        elements.add(408);
        service.logic(elements,408);
        service.logic(elements,308);
    }
}