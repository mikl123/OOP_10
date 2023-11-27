package com.example;

public class CacheDocument extends SmartDocument{
    private boolean isCached = false;
    public CacheDocument(String gcsPath) {
        super(gcsPath);
    }
    public String parse(){
        String res= super.parse();
        if(isCached){
          System.out.println("Already Cached");
        }
        this.isCached = true;
        return res;
    }
    
}
