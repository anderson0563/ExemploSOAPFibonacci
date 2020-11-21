/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author anderson
 */
@WebService(serviceName = "FibonacciWebService")
public class FibonacciWebService {

    /**
     * WS para calcular o Fibonacci de n.
     * @param inteiroN
     * @return 
     */
    @WebMethod(operationName = "fibonacci")
    public int fibonacciServerSide(@WebParam(name = "n") int inteiroN) {
        if(inteiroN==0 || inteiroN==1) return inteiroN;
        return fibonacciServerSide(inteiroN-1) +
               fibonacciServerSide(inteiroN-2);
    }
}
