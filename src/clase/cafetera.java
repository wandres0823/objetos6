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
       private int Capacidad_Maxima;
    private int Capacidad_Actual;

    public cafetera(){
        this.Capacidad_Maxima=1000;
        this.Capacidad_Actual=0;
    }
    
    public cafetera(int Capacidad_Maxima, int Capacidad_Actual) {
        this.Capacidad_Maxima = Capacidad_Maxima;
        this.Capacidad_Actual = Capacidad_Actual;
    }

    public int getCapacidad_Maxima() {
        return Capacidad_Maxima;
    }

    public void setCapacidad_Maxima(int Capacidad_Maxima) {
        this.Capacidad_Maxima = Capacidad_Maxima;
    }

    public int getCapacidad_Actual() {
        return Capacidad_Actual;
    }

    public void setCapacidad_Actual(int Capacidad_Actual) {
        this.Capacidad_Actual = Capacidad_Actual;
    }
    
    public void LlenaCafetera(){
        this.Capacidad_Actual=this.Capacidad_Maxima;
    }
    
    public void ServiTaza(int egreso){
        int aux;
        
        aux=this.getCapacidad_Actual()-egreso;
        this.setCapacidad_Actual(aux);
    }
        
    public void VaciarCafetera(){
        this.Capacidad_Actual=0;
    }
    
    public void AgregarCafe(int ingreso){
        int aux;
        aux=this.getCapacidad_Actual()+ingreso;
        this.setCapacidad_Actual(aux);
    }
}

    
 
   
   
    
 