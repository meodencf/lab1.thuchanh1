package bai1.a.thuchanh1;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanly {

    private ArrayList<Vehicle> listVehicle;

    public Quanly() {
        this.listVehicle = new ArrayList<Vehicle>();
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng xe: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho xe thứ " + (i + 1) + ":");
            System.out.print("Nhập giá trị xe: ");
            float trigiaxe = sc.nextFloat();
            System.out.print("Nhập tên chủ xe: ");
            String tenchuxe = sc.next();
            System.out.print("Nhập loại xe: ");
            String loaixe = sc.next();
            System.out.print("Nhập dung tích xy lanh: ");
            int dungtich = sc.nextInt();
            Vehicle vehicle = new Vehicle(trigiaxe, tenchuxe, loaixe, dungtich);
            listVehicle.add(vehicle);
            System.out.println();
        }
    }

    public void xuatBangKe() {

        System.out.println("ten chu xe      " + "loai xe                 " + "Dung tich      " + "Tri gia   " + "Tien thue  ");
        System.out.println("=====================================================================================");
        for (Vehicle vehicle : listVehicle) {
            System.out.println(vehicle.getTenchuxe() + "      " + vehicle.getLoaixe() + "                 " + vehicle.getDungtich()
                    + "      " + String.format("%.2f", vehicle.getTrigiaxe()) + "   " + String.format("%.2f", vehicle.tinhtienthue()));

        }
    }
}
