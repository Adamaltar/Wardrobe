package com.codecool.wardrobe.model;

import java.util.List;

public abstract class Hanger {

    public abstract Clothes getOne(int id);
    public abstract List<Clothes> getAll();
    public abstract boolean hasRoomFor(ClothesType type);
    public abstract boolean add(Clothes clothes);

}
