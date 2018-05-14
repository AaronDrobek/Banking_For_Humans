package com.manheim.apprenticeship;

  public abstract class Human {

    protected String name;
    protected int age;

      public String getName() {
          return name;
      }

      private void setName(String name) {
          this.name = name;
      }

      private int getAge() {
          return age;
      }

      private void setAge(int age) {
          this.age = age;
      }


//    public Human(String name, int age){
//
//        name= this.name;
//        age= this.age;
//    }
/////making the fields/properties protected negates the need to create a constructor

 }
