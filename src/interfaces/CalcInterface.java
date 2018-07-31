/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author sala303
 */
public interface CalcInterface extends Remote{
    public Integer calculate(Integer a, Integer b, Integer choice) throws RemoteException;
    
}
