// Q5: Try to call the constructor multiple times with the same object

class MultiCall {
    // Constructor
    MultiCall() {
        System.out.println("Constructor called.");
    }

    
    void callConstructor() {
        
        MultiCall obj = new MultiCall(); 
    }

    public static void main(String[] args) {
        MultiCall obj = new MultiCall();  
        obj.callConstructor();            
    }
}
