import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CreatRandom {
    public Integer[] creatRandom() {
    Random random = new Random();
    Integer[] array = new Integer[100];
        System.out.println("Danh sách phần tủ của mảng: ");
        for(int i= 0; i < 100 ; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        CreatRandom random = new CreatRandom();
        Integer[] array = random.creatRandom();

        Scanner scanner = new  Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int num = scanner.nextInt();
        try {
            System.out.println("Giá trị cua phần tử có chỉ số " + num +" là " + array[num] );
        }catch(IndexOutOfBoundsException e){
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
