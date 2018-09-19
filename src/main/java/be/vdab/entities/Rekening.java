package be.vdab.entities;

import java.math.BigDecimal;

public class Rekening {
    private BigDecimal saldo = BigDecimal.ZERO;
    
    public void storten(BigDecimal bedrag){
        this.saldo = this.saldo.add(bedrag);
    }
    
    public BigDecimal getSaldo(){
        return this.saldo;
    }
}