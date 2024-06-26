package controller;

import java.util.ArrayList;
import model.SinhVien;

public class Main {

    public static void main(String[] args) {

        SinhVien banHoc1 = new SinhVien("01", "Le Thanh Lam", "IT", true);
        SinhVien banHoc2 = new SinhVien("02", "Truong Nam Kha", "IT", false);
        SinhVien banHoc3 = new SinhVien("03", "Huynh Ngoc Son", "IT", false);
        SinhVien banHoc4 = new SinhVien("04", "Dau Doan Hoan Thien", "IT", false);

        ArrayList<SinhVien> listSinhVien = new ArrayList<>();

        listSinhVien.add(banHoc1);
        listSinhVien.add(banHoc2);
        listSinhVien.add(banHoc3);
        listSinhVien.add(banHoc4);

        System.out.println("Thong tin sinh vien: ");

        for (int i = 0; i < listSinhVien.size(); i++) {
            System.out.println(listSinhVien.get(i).toString());
        }

        System.out.println(" ");

        System.out.println("Xoa sinh vien co index 2 hien tai ra khoi lop ");
        listSinhVien.remove(2);
        System.out.println("Sinh vien co index 3 thay the index 2: " + listSinhVien.get(2));
        for (int i = 0; i < listSinhVien.size(); i++) {
            System.out.println(listSinhVien.get(i).toString());
        }


        System.out.println(" ");

        System.out.println("Sua thong tin sinh vien co id 02:");
        for (SinhVien sv : listSinhVien) {
            if (sv.getId().equals("02")) {
                sv.setName("Nguyen Quang A");
                sv.setMajor("Chef");
                sv.setGender(false);
                System.out.println(listSinhVien.get(1));
                break;
            }
        }
        
        System.out.println("");
        
        System.out.println("In thong tin toan bo sinh vien nam: ");
        for (SinhVien sinhVien : listSinhVien) {

            if (sinhVien.getGender()==false) {

                System.out.println(sinhVien.toString());

            }
        }
        System.out.println("");
        System.out.println("In thong tin toan bo sinh vien nu: ");
        for (SinhVien sinhVien : listSinhVien) {
            if(sinhVien.getGender()){
                System.out.println(sinhVien.toString());
            }
            
        }
    }
}
