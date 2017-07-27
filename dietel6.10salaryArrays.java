
public class Main{

    public static void main(String[] args){
    int[] sales = {250,300,6000,5600 ,10000 , 2500 , 1500, 6300 , 54000 , 40000};
    //int[] salary = new int[10];
    int[] frequency = new int[11];
    for( int i = 0 ; i<sales.length; i++){
        int saleVariable = sales[i];
        int SalaryVariable = salaryMethod(saleVariable);
       
        switch(SalaryVariable){
            case 2: frequency[SalaryVariable]++;
                    break;
            case 3: frequency[SalaryVariable]++;
                    break;
            case 4: frequency[SalaryVariable]++;
                    break;
            case 5: frequency[SalaryVariable]++;
                    break;
            case 6: frequency[SalaryVariable]++;
                    break;
            case 7: frequency[SalaryVariable]++;
                    break;
            case 8: frequency[SalaryVariable]++;
                    break;
            case 9: frequency[SalaryVariable]++;
                    break;
            case 10: frequency[SalaryVariable]++;
                    break;
        }
       
    }

    System.out.println("Salary Range \t Number of People");
    for(int j = 2 ; j<frequency.length; j++){
        for(int k = j; k<=j; k++){
            if(k==10){
            System.out.printf("$%,d & over\t\t",1000);
            }else{
              System.out.printf("$%d00-$%d99\t\t", k, k);
            }
            System.out.printf("%d", frequency[j]);
            System.out.println();
        } 
    }
    
    
    }
    public static int salaryMethod(int saleVariable){
        int salaryVariable1 = (int)(saleVariable*.09+200)/100;
        if(salaryVariable1>=10){
            salaryVariable1=10;
        }
        return salaryVariable1;
    }
}
