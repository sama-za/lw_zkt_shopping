package com.example.lw_zkt_shopping.test0707;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("工人" + this.getName() + "正在工作");
    }

    @Override
    public double gerAnnual() {
        return super.gerAnnual();
    }

}
