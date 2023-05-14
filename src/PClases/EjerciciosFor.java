//Autor Equipo 6
package PClases;
import java.util.Scanner;

public class EjerciciosFor {
    public void muestreoEdad() {
        Scanner entrada = new Scanner(System.in);
        int Categoria = 0, NumPersonas = 0;
        float Promedio = 0, PesoP = 0;

        System.out.println("Ingresa A Que Categoria Quieres Registrar");
        System.out.println("1. Niños (0-12), 2. Jovenes(13-29), 3. Adultos(30-59), 4. Viejos(+60=: ");
        Categoria = entrada.nextInt();

        switch (Categoria) {
            case 1 -> {
                System.out.println("Ingresa Cuantos Reguistros Quieres Hacer: ");
                NumPersonas = entrada.nextInt();
                System.out.println("Ingresa El Peso De Las Personas: ");

                for (int i = 0; i < NumPersonas; i++) {
                    PesoP = entrada.nextFloat();
                    Promedio += PesoP;
                }
                break;
            }
            case 2 -> {
                System.out.println("Ingresa Cuantos Reguistros Quieres Hacer: ");
                NumPersonas = entrada.nextInt();
                System.out.println("Ingresa El Peso De Las Personas: ");

                for (int i = 0; i < NumPersonas; i++) {
                    PesoP = entrada.nextFloat();
                    Promedio += PesoP;
                }
                break;
            }
            case 3 -> {
                System.out.println("Ingresa Cuantos Reguistros Quieres Hacer: ");
                NumPersonas = entrada.nextInt();
                System.out.println("Ingresa El Peso De Las Personas: ");

                for (int i = 0; i < NumPersonas; i++) {
                    PesoP = entrada.nextFloat();
                    Promedio += PesoP;
                }
                break;
            }
            case 4 -> {
                System.out.println("Ingresa Cuantos Reguistros Quieres Hacer: ");
                NumPersonas = entrada.nextInt();
                System.out.println("Ingresa El Peso De Las Personas: ");

                for (int i = 0; i < NumPersonas; i++) {
                    PesoP = entrada.nextFloat();
                    Promedio += PesoP;
                }
                break;
            }
        }
        System.out.println("Promedio Del Peso: " + (Promedio / NumPersonas));
    }
    
    public void centroVA() {
        Scanner entrada = new Scanner(System.in);
        float Promedio = 0;
        int NumCarros = 0, A = 0, B = 0, PContaminacion = 0;

        System.out.println("Ingrese Cuantas Unidades Quiere Inspeccionar: ");
        NumCarros = entrada.nextInt();

        System.out.println("Ingresa El Numero De Contaminacion Del Auto: ");
        for (int i = 0; i < NumCarros; i++) {
            PContaminacion = entrada.nextInt();

            Promedio += PContaminacion;

            if (i == 0) {
                A = PContaminacion;
                B = PContaminacion;
            } else {
                if (A >= PContaminacion) {
                    if (B > PContaminacion) {
                        B = PContaminacion;
                    }
                } else {
                    A = PContaminacion;
                    if (B > PContaminacion) {
                        B = PContaminacion;
                    }
                }
            }
        }
        if (A == B) {
            System.out.println("Todos Los Numeros Son Iguales");
        } else {
            System.out.println("El Numero Mas Al De Contaminacion Es: " + A);
            System.out.println("El Numero Menos Al De Contaminacion Es: " + B);
        }
        System.out.println("El Promedio Es " + (Promedio / NumCarros));
    }
    
     public void Modulo5Ejercicio1(){
     //1) En un supermercado se hace una promoción, mediante la cual el cliente obtiene un descuento dependiendo de un número 
        //que se escoge al azar. Si el numero escogido es menor que 74 el descuento es del 15% sobre el total de la compra, 
        //si es mayor o igual a 74 el descuento es del 20%. Obtener cuánto dinero se le descuenta.
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite el total de la compra: ");
        double totalCompra;
        totalCompra = entrada.nextDouble( );
        
        System.out.println("Elija un numero del 1 al 100");
        int num;
        num = entrada.nextInt( );
        
        double descuento;
        
        if(num<74) {
            System.out.println("Su descuento es del 15% ");
            descuento = totalCompra - (totalCompra * 0.15);
            System.out.println("El total de su compra con descuento es de: " + descuento);
        } else {
            System.out.println("Su descuento es del 20%");
            descuento = totalCompra - (totalCompra * 0.20);
            System.out.println("El total de su compra con descuento es de: " + descuento);
        }
}      

    public void Modulo5Ejercicio2(){
         Scanner input = new Scanner(System.in);
		
		System.out.println("Calcular el precio del billete de ida y vuelta en ferrocarril");
		System.out.print("Indique la distancia del viaje de ida: ");
		double distanciaIda = input.nextDouble();
		System.out.print("Indique el tiempo de estancia: ");
		double tiempoEstancia = input.nextDouble();
		
		double distanciaTotal = distanciaIda * 2;
		double precioTotal = distanciaTotal * 10;
		
		if(tiempoEstancia > 7 && distanciaTotal > 800) {
			precioTotal = (precioTotal * 30) / 100;
		}
		
		System.out.println("El precio total del billete de ida y vuelta es de: " + precioTotal + " pesos");
    }
    
    public void Modulo5Ejercicio3(){
        Scanner entrada = new Scanner (System.in);

        double Monto,totalp,pagototal;
        System.out.println("Monto:  ");
        Monto = entrada.nextDouble();
        if(Monto<50000)
            totalp=(Monto*0.03);
        else 
            totalp=(Monto*0.02);
        pagototal=Monto+totalp;
        System.out.println("Total a Pagar:  " +pagototal);
    }
    
    public void Modulo5Ejercicio4(){
        Scanner input = new Scanner(System.in);
		
		System.out.println("Calcular el precio de la colegiatura");
		System.out.print("Indique el numero de materias que cursa el alumno: ");
		int materias = input.nextInt();
		System.out.print("Indique el promedio obtenido por el alumno en el ultimo periodo: ");
		double promedio = input.nextDouble();
		
		double precioMateria = 500;
		double precioTotal = materias * precioMateria;
		
		if(promedio >= 9) {
			precioTotal = (precioTotal * 70) / 100;
		} 
		else {
			precioTotal = (precioTotal * 110) / 100;
		}
                    System.out.println("El precio total de la colegiatura es de: " + precioTotal + " pesos");
    }
    
    public void Modulo5Ejercicio5(){
        Scanner in = new Scanner(System.in);
               
        double anios, costo_de_la_casa, enganche, ingresos, pago_parcial;
        System.out.print("Ingresa el valor de costo de la casa: ");
        costo_de_la_casa = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de ingresos: ");
        ingresos = in.nextDouble();
        in.nextLine();
        if(ingresos<8000)
        {
            enganche=costo_de_la_casa*0.15;
            anios=10;
        }
        else
        {
            enganche=costo_de_la_casa*0.3;
            anios=7;
        }
        pago_parcial=(costo_de_la_casa-enganche)/12/anios;
        System.out.println("Valor de anos: " + anios);
        System.out.println("Valor de enganche: " + enganche);
        System.out.println("Valor de pago parcial: " + pago_parcial);
    }
    
    public void pag13(){
        int ageyears, agedays;
        long ageseconds;
        
        ageyears = Integer.parseInt(args[0]);
        agedays = ageyears * 365;
        ageseconds = (ageyears * 365 * 24 * 60 * 60);
        
        System.out.println("You are" +agedays + "days old");
        System.out.println("you are" + ageseconds + "seconds old");
    }
    
    public void pag18(){
        int grade = Integer.parseInt(args[]);
        
        if (grade >=90){
         System.out.println("A");   
    }
    }
    
    public void pag20(){
        int grade = Integer.parseInt(args[0]);
        if (grade >= 90){
            System.out.println("A");   
        }
        else{
            System.out.println("Not an A");
        }
    }
    
    public void pag22(){
        int hour = integer.parseInt(args[0]);
        if (hour >=8 && hour <12){
            System.out.println("Drink Coffee");
        }
        else if (hour >=12 && hour <17){
            System.out.println("Drink Tea");
        }
        else{
            System.out.println("Drink Water");
        }
    }
    
    public void pag23(){
        int grade = integer.parseInt(arg[0]);
        if (grade>=90){
         System.out.println("A");   
        }
        else if (grade >= 80){
            System.out.println("B");
        }
        else if (grade >= 70){
            System.out.println("C");
        }
        else if (grade >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
    }
    
    public void pag26(){
        int month = Integer. parseInt( args[ 0]);
        if (month == 1 || month == 3 || month == 5 || month == 7 ||month == 8 || month == 10 || month == 12)
            System.out.println(" There are 31 days in that month.");
        else if (month == 2)
            System.out.println(" There are 28 days in that month.");
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println(" There are 30 days in that month.");
        else
            System.out.println(" Invalid month.");
    }
    public void pag30(){
         String weather = args[0];
        int age = Integer.parseInt(args[1]);
        if (weather.equals("snow"))
    {
        if (age < 15)
    {
        System.out.println("Build a snowman.");
    }
        else if (age < 90)
    {
        System.out.println("Shovel the driveway.");
    }
        else
    {
            System.out.println("Enjoy watching the snow.");
    }
    }
        else if (weather.equals("rain") || weather.equals("sleet"))
        {
    }
        if (age >=16)
    {
            System.out.println("Drive safely.");
    }
        else
    {
            System.out.println("Walk safely.");
    }
    
        else
    {
    }
        if (age > 15 && age < 25)
    {
            System.out.println("Hang out at the beach.");
    }
        else
    {
            System.out.println("Enjoy the sun.");
    }
    
        if (! weather.equals("sunny"))
    {
            System.out.println("Bring an umbrella.");
    }
    }
    
}