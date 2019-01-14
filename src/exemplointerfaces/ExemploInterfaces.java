/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerfaces;

/**
 *
 * @author Samuel
 */
public class ExemploInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa per= new Persoa();
        Canario ca= new Canario();
        Galo ga= new Galo();
        Tenor te= new Tenor();
        ca.cantar();
        te.cantar();
        IpodeCantar obx= new Persoa();
    }
    
}
