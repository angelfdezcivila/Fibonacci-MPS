public class Fibonacci {
     public int compute(int numero){

         if(numero < 0){
            throw new RuntimeException("Fibonacci no admite valores negativos");
         }else if (numero < 2){
             return numero;
         }

         int resultado = 1;
         int prevFib = 0;

         for(int i = 1; i < numero; i++){
             int temp = resultado;
             resultado+= prevFib;
             prevFib = temp;
         }

         return resultado;
     }
}
