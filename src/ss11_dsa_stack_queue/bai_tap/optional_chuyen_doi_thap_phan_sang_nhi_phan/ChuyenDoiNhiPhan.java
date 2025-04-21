package ss11_dsa_stack_queue.bai_tap.optional_chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Stack;

public class ChuyenDoiNhiPhan {
    public static String chuyenDoi(int thapPhan){
        Stack<Integer> stack = new Stack<>();
        while (thapPhan > 0){
            int phanTu = thapPhan % 2;
            stack.push(phanTu);
            thapPhan = thapPhan / 2;
        }
        String nhiPhan = "";
        while (!stack.isEmpty()){
            nhiPhan += stack.pop();
        }
        return nhiPhan;
    }


}
