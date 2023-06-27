package com.design_patterns.design_pattern.Prototype_design_pattern;

public class Sheep implements Animal{
    public  Sheep(){
        System.out.println("Sheep is Made");
    }
    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made");
        Sheep sheepObj = null;

        try {
            // Calls the Animal super classes clone() Then casts the results to Sheep

            sheepObj = (Sheep) super.clone();
        }catch(CloneNotSupportedException e) { // this is thrown when you're trying to clone an object that does not extend cloneable
            e.printStackTrace();
        }
        return sheepObj;
    }

    public String toString(){
        return "Dolly is my Hero";
    }
}
