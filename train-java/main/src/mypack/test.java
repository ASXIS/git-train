package mypack;

public class test extends Person{
    private int myObj = 5;
    
    
    public int getmyObj(){
        return myObj;
    }
    
    public test(){
        System.out.println("test hello test");
        
    }
    public test(int myObj, String name, double w, double h, double d){
        super(name, w, h ,d);  
        this.myObj = myObj;
          
        
        
    }

}
