import java.util.Scanner;
public class grades {
    int tamano;
    int array [];
    grades(int size){
        tamano = size;
        array = new int [tamano];
    }  
    void fillArray(){
        Scanner in = new Scanner(System.in);
        int value=0;
        int i=0;
        do{
            System.out.print("Enter a grade of 7 to 10: ");
            value = in.nextInt();        
            if(value >= 7 && value <= 10){
              array[i] = value;
              i++;
            }
            else{
            System.out.println("Error incorrect value");
            }
        }while(i != tamano);
    }
    void printArray(){
        for(int i = 0; i < tamano; i++)
        System.out.println("Student " + (i+1) + " grade is: " + array[i]);
    } 
    void averageArray(){
        int sum = 0;
       for(int i=0; i < tamano ; i++)
        sum = sum + array[i];
        int average = sum / tamano;
        System.out.println("Average grade is: " + average); 
    }
    void passArray(){
        int contador = 0;
        for(int i = 0; i < tamano; i++)
        if(array [i] >= 8 && array[i] <= 10)
        contador++;
        System.out.println("The number of pass students is: " + contador);
    }
    void failArray(){
        int contador = 0;
        for(int i = 0; i < tamano; i++)
        if(array [i] <= 7)
        contador++;
        System.out.println("The number of fail students is: " + contador);
    }
    void averagePass(){
        int sum = 0;
        int contador = 0;
        for(int i = 0; i < tamano; i ++)
        if(array [i] >= 8 && array[i] <= 10){
        sum = sum + array[i];
        contador++;
    }
        int averPass = sum / contador;
        System.out.println("The average grade of the passing students is: " + averPass);        
    }
    void averageFail(){
        int sum = 0;
        int contador = 0;
        for(int i = 0; i < tamano; i ++)
        if(array[i] <= 7){
        sum = sum + array[i];
        contador++;
    }
        int averFail = sum / contador;
        System.out.println("The average grade of failed students is: " + averFail);
    }
}
class gradesDemo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type the size of the array: ");
        int tamano = in.nextInt();
        grades objectArray = new grades(tamano);
        objectArray.fillArray();
        objectArray.printArray();
        objectArray.averageArray();
        objectArray.passArray();
        objectArray.failArray();
        objectArray.averagePass();
        objectArray.averageFail();
    }    
}
