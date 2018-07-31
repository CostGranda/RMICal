/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implement;

import interfaces.CalcInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author sala303
 */
public class CalcImplement extends UnicastRemoteObject implements CalcInterface{
    public CalcImplement() throws RemoteException {
    }
    @Override
    public Integer calculate(Integer a, Integer b, Integer choice) throws RemoteException {
        switch (choice){
            case 1: return a+b;
            case 2: return a-b;
            case 3: return a*b;
            case 4: return a/b;
            default: System.out.println("Error");
            return 0;
        }
    }
    
}
