package Application;

import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>( );

        System.out.println("quantos funcionarios seram adicionados? ");
        int n= sc.nextInt();




        for ( int i=0 ; i<n ; i++ ){
            System.out.println("digite os dados de seu " + (i+1) +"# funcionario");
            System.out.println("o funcionario é tercerizado? (s/n)");
            char ch = sc.next().charAt(0);

            System.out.println("nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("horas trabalhadas: ");
            int hours = sc.nextInt();
            System.out.println("valor por hora: ");
            double valuePerHour = sc.nextInt();
            if (ch == 's'){
                double additionalCharge = sc.nextDouble();

                list.add(new OutSourcedEmployee(name,hours,valuePerHour,additionalCharge));
            }else {
                list.add(new Employee(name,hours,valuePerHour));
            }


        }

        System.out.println("funcionarios:");
        for (Employee emp: list){
            System.out.println(emp.getName() + " $" + String.format("%.2f", emp.Payment()));
        }






        sc.close();
    }
}
