package ss11_dsa_stack_queue.bai_tap.optional_chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;

import static ss11_dsa_stack_queue.bai_tap.optional_chuyen_doi_thap_phan_sang_nhi_phan.ChuyenDoiNhiPhan.chuyenDoi;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thap phan");
        int thapPhan = Integer.parseInt(scanner.nextLine());
        String nhiPhan = chuyenDoi(thapPhan);
        System.out.println("he nhi phan: " + nhiPhan);
    }
}
