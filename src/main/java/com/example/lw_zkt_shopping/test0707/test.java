package com.example.lw_zkt_shopping.test0707;

public class test {

    public static void main(String[] args) {
        Employee work = new Worker("xiaowang",5000);
        Employee manger = new Manger("xiaoli",8000,200000);
        test test = new test();
        test test2 = new test();
        test.getSalary(work);
        test.getSalary(manger);
        test.appendMes(work);
        test.appendMes(manger);


    }

    public void getSalary(Employee a) {
        System.out.println(a.gerAnnual());
    }

    public void appendMes(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manger){
            ((Manger) e).manger();
        }else {
            System.out.println("bug");
        }
    }


}
