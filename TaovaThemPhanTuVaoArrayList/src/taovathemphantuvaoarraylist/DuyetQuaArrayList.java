
package taovathemphantuvaoarraylist;

import java.util.ArrayList;

public class DuyetQuaArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Ha Noi");
        cities.add("Đa Nang");
        cities.add("Ho Chi Minh");
        cities.add("Nha Trang");
        cities.add("Hue");
        
        System.out.println("Danh sach cac thanh pho:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
