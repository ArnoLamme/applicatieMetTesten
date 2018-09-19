package be.vdab.oef;

public class Veiling {
    private int hoogsteBod = 0;
    
    public void doeBod(int bedrag){
        if(bedrag > this.hoogsteBod){
            this.hoogsteBod = bedrag;
        }
    }
    
    public int getHoogsteBod(){
        return this.hoogsteBod;
    }
}