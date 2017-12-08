/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Maxi
 */
public class Factura extends Precio {
    private String emisor;
    private String cliente;

    public Factura() {
    }

    public Factura(String emisor, String cliente,double valor) {
        super(valor);
        this.emisor = emisor;
        this.cliente = cliente;
    }

    public Factura(String emisor, String cliente) {
        //super();
        this.emisor = emisor;
        this.cliente = cliente;
    }
    
    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
            public void imprimirFactura(){
                System.out.println("Emisor: "+emisor
                                   +" Cliente "+cliente
                                   +" Precio $" +  getValor()  );
            } 
}
