package com.codecool.wardrobe;

import com.codecool.wardrobe.model.*;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    List<Hanger> hangers=new ArrayList<>();
    public static int LIMIT=20;

    public boolean add(Hanger hanger){
        if (hangers.size()<LIMIT) {
            hangers.add(hanger);
            return true;
        }
        return false;
    }

    public Clothes getOne(int id){
        for (Hanger hanger : hangers) {
            Clothes temp=hanger.getOne(id);
            if (temp!=null)
                return temp;
        }
        return null;
    }

    public boolean hasRoomFor(ClothesType type){
        if (hangers.size()<LIMIT)
            return true;

        for (Hanger hanger:hangers) {
            if (hanger.hasRoomFor(type))
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        Wardrobe wardrobe=new Wardrobe();
        Hanger simpleHanger1=new SimpleHanger();

        Hanger doubleHanger1=new DoubleHanger();


        Clothes c1=new Clothes("Nike",ClothesType.SHIRT);
        Clothes c2=new Clothes("Bla",ClothesType.BLOUSE);
        Clothes c3=new Clothes("skirtbrand",ClothesType.SKIRT);
        Clothes c4=new Clothes("trouserbrand",ClothesType.TROUSER);


        simpleHanger1.add(c1);
        simpleHanger1.add(c2);
        Clothes removed=simpleHanger1.getOne(c1.getId());
        System.out.println(removed.getId());
        simpleHanger1.add(c3);
        simpleHanger1.add(c2);
        wardrobe.add(simpleHanger1);

        doubleHanger1.add(c4);
        if (doubleHanger1.hasRoomFor(removed.getType()))
            doubleHanger1.add(removed);

        wardrobe.add(doubleHanger1);

        wardrobe.getOne(c4.getId());











    }




}
