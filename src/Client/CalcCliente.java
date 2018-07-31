/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import interfaces.CalcInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sala303
 */
public class CalcCliente {
    static CalcInterface c;
    public static void main(String[] args) throws RemoteException, IOException{
        try {
            c = (CalcInterface) Naming.lookup("Calc");
            int n1, n2, choice, res;
            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("    MENU");
                System.out.println("1   SUMA");
                System.out.println("2   RESTA");
                System.out.println("3   MULTIP");
                System.out.println("4    DIVISION");
                System.out.println("    OPCION");
                choice = Integer.parseInt(b.readLine());
                if (choice !=5) {
                System.out.println("NUMERO uno");
                n1 = Integer.parseInt(b.readLine());
                System.out.println("NUMERO dos");
                n2 = Integer.parseInt(b.readLine());
                res = c.calculate(n1, n2, choice);
                System.out.println("Resultado: "+ res);
                }
            } while (choice !=5);
            
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(CalcCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
