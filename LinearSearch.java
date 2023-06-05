package academy.devonline.java.basic.section01_setup.section06_setup;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
        var qer = 26;
        var index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==qer){
                index = i;
                break;
            }




        }
        System.out.println(index);











    }

}
