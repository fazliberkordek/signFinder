import java.util.Scanner;

/**
 * @author fazliberkordek
 */

    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int month, day;
            String sign = "";
            boolean isError = false;
            //Month of birth :
            System.out.print("Your month of birth:");
            month = input.nextInt();
            //Day of the users birth:
            System.out.print("Your day of birth :");
            day = input.nextInt();

            // First lets filter by month:

            if (month == 1) { // Month is January
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        sign = "Oğlak";
                    } else {
                        sign = "Kova burcu";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 2) {
                if (day >= 1 && day < 28) {
                    if (day < 20) {
                        sign = "Kova";
                    } else {
                        sign = "Balık";
                    }
                } else {
                    isError = true;
                }

            } else if (month == 4) {
                if(day>=1 && day<31){
                    if(day<20){
                        sign = "Balık";
                    }else {
                        sign="Koç";
                    }
                }else {
                    isError=true;
                }

            } else if (month == 5) {
                if(day>=1 && day<31){
                    if(day<21){
                        sign="Koç";
                    }else{
                        sign="Boğa";
                    }
                }else {
                    isError=true;
                }
            }else if (month == 6){
                if(day>=1 && day<31){
                    if(day<22){
                        sign="Boğa";
                    }else {
                        sign="İkizler";
                    }
                }else{
                    isError=true;
                }
            }else if(month==7){
                if(day>=1 && day<31){
                    if(day<22){
                        sign="İkizler";
                    }else{
                        sign = "Yengeç";
                    }
                }else{
                    isError=true;
                }
            } else if (month==8) {
                if(day>=1&&day<31){
                    if(day<22){
                        sign="Yengeç";
                    }else{
                        sign="Aslan";
                    }
                }else{
                    isError=true;
                }

            } else if (month==9) {
                if (day>=1 && day<31){
                    if(day <22){
                        sign="Aslan";
                    }else{
                        sign= "Başak";
                    }
                }else {
                    isError=true;
                }
            }else if (month==10){
                if(day>=1 && day<31){
                    if(day<22){
                        sign= "Başak";
                    }else{
                        sign= "Terazi";
                    }
                }else{
                    isError=true;
                }
            }else if (month==11){
                if(day>=1 && day<30){
                    if(day<21){
                        sign="Terazi";
                    }else {
                        sign="Akrep";
                    }
                }else{
                    isError=true;
                }
            } else if (month == 12) {
                if(day>=1 && day<31){
                    if(day<21){
                        sign="Akrep";
                    }else {
                        sign="Yay";
                    }
                }else {
                    isError=true;
                }

            }else{
                isError=true;
            }

            if(isError){
                System.out.println("Invalid input");

        }else {
                System.out.println("Your sign is : "+ sign);
            }
    }


}