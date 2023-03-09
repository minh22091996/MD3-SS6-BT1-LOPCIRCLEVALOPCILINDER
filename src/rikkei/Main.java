package rikkei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("nhap ban kinh hinh tron");
        circle.setRadius(sc.nextFloat());
        System.out.println("dien tich hinh tron la :");
        System.out.println(circle.getArea());

        System.out.println("nhap chieu cao hinh tru");
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(sc.nextFloat());
        System.out.println("nhap ban kinh hinh tru");
        cylinder.setRadius(sc.nextFloat());
        System.out.println("the tich hinh tru la");
        System.out.println(cylinder.getVolume());

    }
}
