package mypack;
public class Person {
    private double d,w,h;
    private String name;
       public Person(String name, double w, double h, double d){
         this.name = name;
         this.w = w;
         this.d = d;
         this.h = h;
       }

    public Person(){
      System.out.println("Person");
    }
    public double getW(){
      return w;
    }
    public void setW(double w){
      this.w = w;
    }

    public void setD(double d){
      this.d = d;
    }

    public void setH(double h){
      this.h = h;
    }

    public double volume(){
      return w * h *d;
    }

    public double surfaceArea(){
      return (2.0*w*h);
    }
    public String getName(){
      return name;
    }
    public void setName(String newName){
      this.name = newName;
    }
    

  }
