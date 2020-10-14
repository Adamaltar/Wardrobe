package com.codecool.wardrobe.model;

import java.util.ArrayList;
import java.util.List;

public class DoubleHanger extends Hanger {
    Clothes upper;
    Clothes lower;


    @Override
    public Clothes getOne(int id) {
        if (upper.getId()==id){
            Clothes temp=upper;
            upper=null;
            System.out.printf("Clothes with id %d successfully removed from hanger %n",id);
            return temp;
        } else if (lower.getId()==id){
            Clothes temp=lower;
            lower=null;
            System.out.printf("Clothes with id %d successfully removed from hanger %n",id);
            return temp;
        }
        System.out.printf("Clothes with id %d were not on this hanger %n",id);
        return null;
    }

    @Override
    public List<Clothes> getAll() {
        if (upper==null && lower==null)
            return null;

        List<Clothes> temp=new ArrayList<>();
        if (upper!=null)
            temp.add(upper);
        if (lower!=null)
            temp.add(lower);
        return temp;
    }

    @Override
    public boolean hasRoomFor(ClothesType type) {
        return (upper==null && type.isUpperClothes()) || (lower==null && type.isLowerClothes());
    }

    @Override
    public boolean add(Clothes clothes) {
        if (hasRoomFor(clothes.getType())){
            if (clothes.getType().isLowerClothes())
                lower = clothes;
            else
                upper = clothes;

            System.out.printf("Clothes with id %d added to hanger %n",clothes.getId());
            return true;
        }
        System.out.printf("Clothes with id %d could not be added to hanger %n",clothes.getId());
        return false;
    }
}
