package com.chen.PrototypePattern;

class Prototype implements Cloneable { 
	
    public Prototype clone(){    
        Prototype prototype = null;    
        try{    
            prototype = (Prototype)super.clone();    
        }catch(CloneNotSupportedException e){    
            e.printStackTrace();    
        }    
        return prototype;     
    }  
    
}    