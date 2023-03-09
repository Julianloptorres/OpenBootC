
public class Condicionales {
    public static void main(String[] args) throws Exception {
        
//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        int numeroIf = 10;

        if (numeroIf<0){
            System.out.println("La variable numeroIf " + numeroIf + " es negativo");
        }
        else if(numeroIf>0){
            System.out.println("La variable numeroIf " + numeroIf + " es positivo");
        } else {
            System.out.println("La variable numeroIf es 0");
        }

//  Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
// Incrementar el valor de la variable en uno cada vez que se ejecute.
//Mostrarlo por pantalla cada vez que se ejecute.
        
        int numeroWhile = 1;
        numeroWhile++;
        System.out.println("La variable númeroWhile ahora es: " + numeroWhile);

//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        
        int DoWhile = 3;
        do{
            DoWhile++;
            System.out.println("La variable númeroWhile ahora es: " + DoWhile);
        }
        while(DoWhile < 3);

//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        for
        (int numeroFor = 0;
        numeroFor <= 5;
        numeroFor++){
            System.out.println("La variablae numeroFor es: " + numeroFor);
        }

//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
        int numeroEstacion  = 12;
        String estacion = "", mes = "";

        switch(numeroEstacion){
            case 12:
            mes = "Diciembre";
            case 1:
                mes = "Enero";
            case 2:
                mes = "Febrero";
                estacion = "Invierno";
                break;

            case 3:
                mes = "Marzo";
            case 4:
                mes = "Abril";
            case 5:
                mes = "Mayo";
                estacion = "Primavera";
                break;

            case 6:
                mes = "Junio";
            case 7:
                mes = "Julio";
            case 8:
                mes = "Agosto";
                estacion = "Verano";
                break;

            case 9:
                mes = "Septiembre";
            case 10:
                mes = "Octubre";
            case 11:
                mes = "Noviembre";
                estacion = "Otoño";
                break;}

            System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);

}}
