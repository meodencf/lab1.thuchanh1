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

        System.out.printf("%-15s %-20s %-15s %-10s %-10s\n", "tên chủ xe", "loại xe", "Dung tích", "Trị giá", "Tiền thuế");
        System.out.println("=====================================================================================");
        for (Vehicle vehicle : listVehicle) {
            System.out.printf("%-15s %-20s %-15d %-10.2f %-10.2f\n", vehicle.getTenchuxe(), vehicle.getLoaixe(),
                    vehicle.getDungtich(), vehicle.getTrigiaxe(), vehicle.tinhtienthue());
        }
    }
}
