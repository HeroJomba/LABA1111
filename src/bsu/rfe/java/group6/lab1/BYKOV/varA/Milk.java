package bsu.rfe.java.group6.lab1.BYKOV.varA;

public class Milk extends Food {
    @Override // явное переопределение метода
    public boolean equals(Object obj) {
        if (!(obj instanceof Milk)){
            return false;
        }
        if (fill == null || ((Milk)obj).fill == null){
            return false;
        }
        if(!(fill.equals(((Milk) obj).fill))){
            return false;
        }

        return super.equals(obj);
    }

    private String fill;

    public String getFilling(){
        return fill;
    }

    public void setFilling(String fill){
        this.fill = fill;
    }

    public Milk(String fill){
        super ("Молоко");
        this.fill = fill;
    }

    public void consume(){
        System.out.println(this + " выпито");
    }

    @Override
    public String toString() {
        return super.toString() + " жирностью '" + fill.toUpperCase() + "'";
    }

}


