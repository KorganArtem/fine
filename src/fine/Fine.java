/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fine;

import java.io.IOException;

/**
 *
 * @author Artem
 */
public class Fine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Worker wrk = new Worker();
        wrk.getAllData();
        wrk.getAllFine();
        wrk.addvalueToProfile();
    }
    
}
