package test;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        int[][] maTranChiPhi = {
            {9, 2, 7, 8},
            {6, 4, 3, 7},
            {5, 8, 1, 8},
            {7, 6, 9, 4}
        };

        GeneticAlgorithm thuatToan = new GeneticAlgorithm(maTranChiPhi, 10, 100, 0.8, 0.1);
        PhanCong ketQua = thuatToan.giaiQuyet();

        System.out.println("Phan cong toi uu: " + Arrays.toString(ketQua.congViec));
        System.out.println("Chi phi toi uu: " + ketQua.doThichNghi);
    }
}
