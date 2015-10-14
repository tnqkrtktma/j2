package com.j2.factory.pizzafm;

public class PizzaTestDrive{
  public static void main(String[] args){
    //SimplePizzaFactory fac=new SimplePizzaFactory();
    PizzaStore nystore=new NYPIzzastore();
    Pizza pizza=nystyle.orderPizza("cheese");
    System.out.printin("We ordered a" +pizza.getname());
  }
}