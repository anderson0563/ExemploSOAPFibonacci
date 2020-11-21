/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciclientside;

/**
 *
 * @author anderson
 */
public class FibonacciClientSide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int NFibonacci = fibonacci(6);
        System.out.println(NFibonacci);
    }

    private static int fibonacci(int n) {
        pacotecliente.FibonacciWebService_Service service = new pacotecliente.FibonacciWebService_Service();
        pacotecliente.FibonacciWebService port = service.getFibonacciWebServicePort();
        return port.fibonacci(n);
    }
    
}
