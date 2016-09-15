/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author walbonis1
 */
public class cafetera {
    private int capamaxima;
    private int cantidadactual;

    public cafetera(int capamaxima, int cantidadactual) {
        this.capamaxima = 1000;
        this.cantidadactual = 0;
    }

    public int getCapamaxima() {
        return capamaxima;
    }

    public int getCantidadactual() {
        return cantidadactual;
    }

    public void setCapamaxima(int capamaxima) {
        this.capamaxima = capamaxima;
    }

    public void setCantidadactual(int cantidadactual) {
        this.cantidadactual = cantidadactual;
    }
    
    public void servir(int servida){
        String alcanza;
        int auxi;
        int res;
        if(servida>this.cantidadactual){
            alcanza="no alcanzara el cafe"+0;
            auxi=Integer.parseInt(alcanza);
        }else{
            res=this.getCantidadactual()- servida;
            auxi=res;
            
        }
        this.setCantidadactual(auxi);
    }
    public void limpiar(){
        this.setCantidadactual(0);
    }
    
    public void agregar(int agre){
        int auxi;
        if(agre> this.capamaxima){
        auxi=1000;
        }else{    
        }
            auxi= this.getCantidadactual()+agre;
       
    }
    public void lleno(int llenar){
        int auxi=1000;
        this.setCantidadactual(auxi);
    }
}
