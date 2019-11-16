
package projetodesafiojava;

import java.util.ArrayList;
import javax.swing.JTextArea;


public class Veiculo {
    
   private String modelo;
   private TipoVeiculo tipoVeiculo;
   private String cambio;
   private String cores;
   
   
   public Veiculo(String modelo, TipoVeiculo veiculo, String cambio,String cores, JTextArea mmlog){
      
      this.modelo = modelo;
      this.tipoVeiculo = veiculo;
      this.cambio = cambio;
      this.cores = cores;      
      mmlog.append(toString());
      
   }
   
   public static void listaVeiculos (ArrayList<Veiculo> lista, JTextArea memo){              
      String a = "";
       for (Veiculo lista1 : lista) {
           memo.setText("");
           a = lista.toString().replace("[", "");
           a = a.replace("]","") ;
           a = a.replace(",","");
           memo.append(a);
       }                                 
       
   }
   
   
   public String getModelo(){       
       return modelo;       
   }
   
   public void setModelo(String modelo){
       this.modelo = modelo;
   }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Modelo: "+ this.getModelo() + "\nTipo: "+this.getTipoVeiculo() + "\nCâmbio: "+ this.getCambio()+
                "\nCores: "+this.cores + "\n----------------------\n";
    }                                               
   
    
    public static String frear(){
        
        return "\nFrear";
    }
    
    public static String acelerar(){
        
        return "\nAcelerar";
    }
   
    public static void estacionar(JTextArea memo){
        memo.append("\nEstacionar");
    }
    
}
