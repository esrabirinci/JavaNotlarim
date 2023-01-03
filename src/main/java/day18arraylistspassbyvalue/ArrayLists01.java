package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

       // Example 1: Bir Integer array list teki 7 hariç tüm elemanları 2 artırınız.

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages){
            if (w==7){
                continue;
            }
          //  w= w + 2; <=== Listler bu şekilde update edilemezler!! bu integere ii değiştirmek içindir, listi değiştirmek içindeğildir

            ages.set(ages.indexOf(w),w+2);
        }

        System.out.println(ages);

        //Example  2: Size verilen array listte 8  ve 8 den önceki tüm elemanları 2 katına çıkarınız
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (Integer w : nums){
            nums.set(nums.indexOf(w),w*2);
            if (w==8){
                break;
            }

        }
        System.out.println(nums);
    }
}
