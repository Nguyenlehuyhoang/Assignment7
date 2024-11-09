
package taovathemphantuvaoarraylist;

import java.util.ArrayList;

public class TimKiemMotPhanTuArrayList {
    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();

        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");
        String searchKeyword = "Python";
        if (keywords.contains(searchKeyword)) {
            System.out.println(searchKeyword + " co trong danh sach.");
        } else {
            System.out.println(searchKeyword + " khong co trong danh sach.");
        }
    }
}
