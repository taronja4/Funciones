import java.util.InputMismatchException;
import java.util.Scanner;

public class ej1 {
    public static int potencia(int num1, int pot){
        return (int) Math.pow(num1,pot);
    }

    public static int digitos(int num){
        int cant=0;
        while (num!=0){
            num=num/10;
            cant++;
        }
        return cant;
    }

    public static int voltea(int num){
        int volteado=0;
        int digito;
        while (num>0){
            digito=num%10;
            num=num/10;
            volteado=volteado*10+digito;
        }
        return volteado;
    }

    public static int digitoN(int num,int num2){
        int numero=voltea(num)/potencia(10,num2);
        int sol=numero%10;
        return sol;

    }

    public static boolean esCapicua(int num){
        if (num==voltea(num)){
            return true;
        }
        return false;
    }

    public static boolean esPrimo(int num){
        int cont=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                cont++;
            }
        }
        if (cont==2){
            return true;
        }
        return false;
    }

    public static int siguientePrimo(int num){
        if (esPrimo(num)){
            num++;
        }
        do {
            if (!esPrimo(num)){
                num++;
            }
        } while (!esPrimo(num));
        return num;
    }

    public static int posicionDeDigito(int num,int index){
        int numvol=voltea(num);
        int cont =1;
        do {
            numvol=numvol/10;
            cont++;
            if (numvol<=0){
                return -1;
            }
        }while (numvol%10!=index);
        return cont;
    }

    public static void juntaNumeros(int num,int num2){
        System.out.print(num);
        System.out.println(num2);
    }

    public static void pegaPorDelante(int num1,int num2){
        System.out.print(num2);
        System.out.println(num1);
    }

    public static void pegaPorDetras(int num,int num2){
        System.out.print(num);
        System.out.println(num2);
    }

    public static int quitaPorDtras(int num,int quit){
        return num/potencia(10,quit);
    }

    public static String trozoDeNumero(int num,int ini,int fin){
        String all=String.valueOf(num);
        return all.substring(ini,fin+1);
    }

    public static int quitarPorDlante(int num,int quit){
        int num1;
        num1=voltea(num);
        num1=num1/potencia(10,quit);
        num1=voltea(num1);
        return num1;

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean boo=true;

        do {
            try {
                System.out.println("0. Salir");
                System.out.println("1. Es capicua?");
                System.out.println("2. Es primo?");
                System.out.println("3. siguiente primo");
                System.out.println("4. potencia");
                System.out.println("5. cuenta el numero de digitos de un entero");
                System.out.println("6. darle la vuelta a un numero");
                System.out.println("7. digito de la posicion n");
                System.out.println("8. primera posicion de un digito n en un entero");
                System.out.println("9. quitar por detras");
                System.out.println("10. quitar por delante");
                System.out.println("11. poner por detras");
                System.out.println("12. poner por delante");
                System.out.println("13. trozo de un numero entero");
                System.out.println("14. juntar dos numeros");
                System.out.println("Introduce un numero valido:");
                int opcion=sc.nextInt();


                switch (opcion){
                    case 0:
                        System.out.println("Hasta luego!");
                        boo=false;
                        break;
                    case 1:
                        System.out.println("Introduce un numero que sea capicua o no");
                        int cap=sc.nextInt();
                        System.out.println("¿El numero introducido es capicua? "+esCapicua(cap));
                        break;
                    case 2:
                        System.out.println("Introduce un numero que sea primo o no:");
                        int prim=sc.nextInt();
                        System.out.println("El numero introducido es primo? "+esPrimo(prim));
                        break;
                    case 3:
                        System.out.println("introduce un numero y te mostrare el siguiente primo a ese numero");
                        int prim2=sc.nextInt();
                        System.out.println("El siguiente primo es: "+siguientePrimo(prim2));
                        break;
                    case 4:
                        System.out.println("introduce una base");
                        int base=sc.nextInt();
                        System.out.println("introduce un exponente");
                        int exp=sc.nextInt();
                        System.out.println("El resultado de la potencia es: "+potencia(base,exp));
                        break;
                    case 5:
                        System.out.println("introduce un numero y te dare su longitud:");
                        int dig=sc.nextInt();
                        System.out.println("La longitud del numero es: "+digitos(dig));
                        break;
                    case 6:
                        System.out.println("introduce un numero y le dare la vuelta");
                        int volt=sc.nextInt();
                        System.out.println("El numero volteado es: "+voltea(volt));
                        break;
                    case 7:
                        System.out.println("Introduce un numero");
                        int num2=sc.nextInt();
                        System.out.println("introduce la posicion de digito que quieres mostrar");
                        int dign=sc.nextInt();
                        System.out.println("el digito que esta en la posicion "+dign+" es: "+digitoN(num2,dign));
                        break;
                    case 8:
                        System.out.println("introduce un numero");
                        int num3=sc.nextInt();
                        System.out.println("introduce un numero que este en el numero anterior y te mostrare en la posicion que esta");
                        int pos=sc.nextInt();
                        System.out.println("El numero "+pos+" se encuentra en la posicion: "+posicionDeDigito(num3,pos));
                        break;
                    case 9:
                        System.out.println("introduce un numero");
                        int num4=sc.nextInt();
                        System.out.println("introduce la cantidad de digitos que quieres quitar por detras");
                        int quitar=sc.nextInt();
                        System.out.println("El numero sin "+quitar+" digitos por detras seria:"+quitaPorDtras(num4,quitar));
                        break;
                    case 10:
                        System.out.println("introduce un numero");
                        int num5=sc.nextInt();
                        System.out.println("introduce la cantidad de digitos que quieres quitar por delante");
                        int quit2=sc.nextInt();
                        System.out.println("El numero sin "+quit2+" digitos por delante seria: "+quitarPorDlante(num5,quit2));
                        break;
                    case 11:
                        System.out.println("introduce un numero");
                        int num6=sc.nextInt();
                        System.out.println("introduce otro numero que quieras agregar por detras al numero anterior");
                        int det=sc.nextInt();
                        System.out.print("El numero final seria: ");
                        pegaPorDetras(num6,det);
                        break;
                    case 12:
                        System.out.println("introduce un numero");
                        int num7=sc.nextInt();
                        System.out.println("introduce el numero que quieres agregar por delante al numero anterior");
                        int delan=sc.nextInt();
                        System.out.println("El numero final seria: ");
                        pegaPorDelante(num7,delan);
                        break;
                    case 13:
                        System.out.println("introduce un numero");
                        int num8=sc.nextInt();
                        System.out.println("introduce la posicion inicial que quieres del numero anterior");
                        int inic=sc.nextInt();
                        System.out.println("introduce la posicion final que quieres del numero anterior");
                        int fina= sc.nextInt();
                        System.out.println("El trozo del numero se quedaria en: "+trozoDeNumero(num8,inic,fina));
                        break;
                    case 14:
                        System.out.println("introduce un numero");
                        int num9= sc.nextInt();
                        System.out.println("introduce otro numero que quieras juntar con el anterior");
                        int junt=sc.nextInt();
                        System.out.println("El numero final seria: ");
                        juntaNumeros(num9,junt);
                        break;
                    default:
                        System.out.println("opcion no valida.");
                }
            }catch (InputMismatchException e){
                System.out.println("Solo se pueden introducir numeros");
                sc.nextLine();
            }

        }while (boo);
    }
}
