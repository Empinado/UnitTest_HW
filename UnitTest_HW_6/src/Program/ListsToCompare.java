package Program;

import java.util.List;
public class ListsToCompare {

    public List<Integer> list1;
    public List<Integer> list2;

    public ListsToCompare(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double calculateListAverage(List<Integer> numList) {
        if (numList.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int num : numList) {
            sum += num;
        }
        return (double) sum / numList.size();
    }

    public String listsCompare() {
        double average1 = calculateListAverage(list1);
        double average2 = calculateListAverage(list2);

        if (average1 > average2) {
            return "First list average is bigger than second list average";
        } else if (average1 < average2) {
            return "Second list average is bigger than first list average";
        } else {
            return "Averages are equal";
        }
    }
}
