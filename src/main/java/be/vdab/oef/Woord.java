package be.vdab.oef;

public class Woord {
    private final String woord;
    
    public Woord(String woord){
        this.woord = woord;
    }
    
    public boolean isPalindroom(){
        return this.woord.equals(new StringBuilder(this.woord).reverse().toString());
    }
}