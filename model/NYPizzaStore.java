package com.j2.factory.pizzafm;
public class NYPizzaStore extends PizzaStore{
  Pizza createPizza(String item){
    PIzza pizza = null;
    if(item.equals("cheese")){
      pizza=new NYStyleCheesePIzza();
    }
    return pizza;
  }