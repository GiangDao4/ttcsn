package test;

public class CaThe {
	int[] congViec; // Hoán vị công việc (một cá thể trong quần thể)
    int doThichNghi; // Giá trị fitness của cá thể (chi phí tổng hợp)

    // Phương thức khởi tạo
    public CaThe(int n) {
        congViec = new int[n];
        doThichNghi = Integer.MAX_VALUE; // Giá trị mặc định lớn nhất
    }
}
