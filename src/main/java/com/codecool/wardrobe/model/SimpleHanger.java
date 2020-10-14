package com.codecool.wardrobe.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleHanger extends Hanger{
    private Clothes upper;


    @Override
    public Clothes getOne(int id) {
        if (upper.getId()==id){
            Clothes temp=upper;
            upper=null;
            System.out.printf("Clothes with id %d successfully removed from hanger %n",id);
            return temp;
        }
        System.out.printf("Clothes with id %d were not on this hanger %n",id);
        return null;
    }

    @Override
    public List<Clothes> getAll() {

        if (upper!=null){
            List<Clothes> temp=new ArrayList<>();
            temp.add(upper);
            return temp;
        }
        return null;
    }

    @Override
    public boolean hasRoomFor(ClothesType type) {
        return (upper==null && type.isUpperClothes());
    }

    @Override
    public boolean add(Clothes clothes) {
        if (hasRoomFor(clothes.getType())) {
            upper = clothes;
            System.out.printf("Clothes with id %d added to hanger %n",clothes.getId());
            return true;
        }
        System.out.printf("Clothes with id %d could not be added to hanger, there was no room %n",clothes.getId());
        return false;
    }
}
