package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        // Objeler oluşturma
        Lamp lamp = new Lamp(LampType.NORMAL, true, 80);
        Bed bed = new Bed("Çift Kişilik", 4, 1, 2, 2);
        Wardrobe wardrobe = new Wardrobe(2, 4, 40.0);
        Carpet carpet = new Carpet(3, 5, PaintColor.RED);
        Ceiling ceiling = new Ceiling(3, PaintColor.RED);

        // Duvarlar oluşturma
        Wall wall1 = new Wall("NORTH");
        Wall wall2 = new Wall("SOUTH");
        Wall wall3 = new Wall("EAST");
        Wall wall4 = new Wall("WEST");

        // Bedroom objesi oluşturma
        Bedroom bedroom = new Bedroom("Ana Yatak Odası", wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);

        // Tüm metodları test etme
        System.out.println("=== BEDROOM TEST ===");
        System.out.println("Oda Adı: " + bedroom.getName());

        System.out.println("\n=== LAMP TEST ===");
        bedroom.getLamp().turnOn();
        System.out.println("Lamp Style: " + bedroom.getLamp().getStyle());
        System.out.println("Battery: " + bedroom.getLamp().isBattery());
        System.out.println("Rating: " + bedroom.getLamp().getGlobRating());

        System.out.println("\n=== BED TEST ===");
        bedroom.getBed().make();
        System.out.println("Bed Style: " + bedroom.getBed().getStyle());
        System.out.println("Pillows: " + bedroom.getBed().getPillows());
        System.out.println("Height: " + bedroom.getBed().getHeight());
        System.out.println("Sheets: " + bedroom.getBed().getSheets());
        System.out.println("Quilts: " + bedroom.getBed().getQuilts());

        System.out.println("\n=== WARDROBE TEST ===");
        bedroom.getWardrobe().add();
        System.out.println("Width: " + bedroom.getWardrobe().getWidth());
        System.out.println("Height: " + bedroom.getWardrobe().getHeight());
        System.out.println("Weight: " + bedroom.getWardrobe().getWeight());

        System.out.println("\n=== CARPET TEST ===");
        bedroom.getCarpet().lying();
        System.out.println("Color: " + bedroom.getCarpet().getColor());
        System.out.println("Width: " + bedroom.getCarpet().getWidth());
        System.out.println("Height: " + bedroom.getCarpet().getHeight());

        System.out.println("\n=== CEILING TEST ===");
        bedroom.getCeiling().create();
        System.out.println("Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Color: " + bedroom.getCeiling().getColor());

        System.out.println("\n=== WALL TEST ===");
        bedroom.getWall1().create();
        System.out.println("Wall 1 Direction: " + bedroom.getWall1().getDirection());
        bedroom.getWall2().create();
        System.out.println("Wall 2 Direction: " + bedroom.getWall2().getDirection());
        bedroom.getWall3().create();
        System.out.println("Wall 3 Direction: " + bedroom.getWall3().getDirection());
        bedroom.getWall4().create();
        System.out.println("Wall 4 Direction: " + bedroom.getWall4().getDirection());
    }
}