package com.codecool.wardrobe.model;

public enum ClothesType {
    SHIRT,BLOUSE,SKIRT,TROUSER;

    public boolean isLowerClothes(){
        return (this==ClothesType.SKIRT) || (this==ClothesType.TROUSER);
    }

    public boolean isUpperClothes(){
        return (this==ClothesType.BLOUSE) || (this==ClothesType.SHIRT);
    }


}
