package com.j2.factory.pizzafm;

public abstract class Pizzastore{
  abstract Pizza CreatePizza(String item);
  public Pizza orderPizza(String type){
  PIzza pizza;
  pizza =createPizza(type);
  pizza.prepare();
  pizza.bake();
  pizza.cut();
  pizza.box();
  return pizza;
  }
}