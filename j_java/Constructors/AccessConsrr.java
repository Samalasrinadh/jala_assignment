// Q3: Apply private, public, protected, and default access modifiers to constructors

class AccessConstr {
    public AccessConstr() {
        System.out.println("Public Constructor called.");
    }

  
    protected AccessConstr(int a) {
        System.out.println("Protected Constructor called with value: " + a);
    }

   
    AccessConstr(String b) {
        System.out.println("Default Constructor called with value: " + b);
    }

  
    private AccessConstr(double c) {
        System.out.println("Private Constructor called with value: " + c);
    }

    // Main method to demonstrate constructor access
    public static void main(String[] args) {
        AccessConstr obj1 = new AccessConstr();      
        AccessConstr obj2 = new AccessConstr(10);    
        AccessConstr obj3 = new AccessConstr("Hello"); 
        
        
        AccessConstr obj4 = new AccessConstr(5.5);  
    }
}
