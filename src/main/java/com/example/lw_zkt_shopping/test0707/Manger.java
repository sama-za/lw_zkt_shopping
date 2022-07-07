package com.example.lw_zkt_shopping.test0707;

public class Manger extends Employee  {
    private double boon;
    public Manger(String name, double salary,double boon) {
        super(name, salary);
        this.boon = boon;
    }

    @Override
    public double gerAnnual() {
        return super.gerAnnual() + boon;
    }

    public double getBoon() {
        return boon;
    }

    public void setBoon(double boon) {
        this.boon = boon;
    }

    public void  manger(){
        System.out.println("经理" + this.getName() + "正在管理");
    }

}
