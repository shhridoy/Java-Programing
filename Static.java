package learn;

public class Static {

    public static void main(String[] args) {
        // TODO code application logic here
        StaticClass mem1 = new StaticClass("Megan", "Fox");
        StaticClass mem2 = new StaticClass("Avrile", "Levigne");
        StaticClass mem3 = new StaticClass("Taylor", "Swift");
        
        System.out.println(StaticClass.getMembers());
        
        
    }
}

/** Static member function and variable can be call without creating object
    
    It always update when a new object is created. It holds it's last value. **/
