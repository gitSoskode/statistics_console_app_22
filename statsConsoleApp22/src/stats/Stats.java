/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stats;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SosKode
 */
public class Stats {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        developersLog();
        int HomeTimer=0, tendencyTimer=0, dispersionTimer=0;
        //Start by loading the array
        do{
            
            
            System.out.println("Welcome to myStatsApp");

            System.out.println("Choose an option to continue");
            System.out.println("1. NUMERICAL MEASURE OF CENTRAL TENDENCY");
            System.out.println("2. NUMERICAL MEASURE OF DISPERSION(VARIATION)");
            choice=sc.next();

            if(choice.equals("1")){
                do{
                    
                
                    System.out.println("1. NUMERICAL MEASURE OF CENTRAL TENDENCY");
                    System.out.println("Please select a tendency operator");
                    System.out.println("1. Mean");
                    System.out.println("2. Median");
                    System.out.println("3. Mode");
                    System.out.println("4. Weighted mean");
                    System.out.println("0. BACK ");
                    choice = sc.next();

                    switch(choice){
                        case "1":
                            System.out.println("Operation with mean");
            //                System.out.println("mean is expressed as \nm=(∑X)/n");
                            meanOfNums();
                            for(int i=1; i<4; i++){
                                System.out.println("Enter 1 to repeat procedure or 2 to go back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        meanOfNums();
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        tendencyTimer++;
                                        break;
                                }
                            }
                            break;
                        case "2":
                            System.out.println("Operation with Median");
                            //calling data meth
                            freshInput();
                            medianOfNum();
                            for(int i=1; i<4; i++){
                                System.out.println("Enter 1 to compute median or 2 to go back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        freshInput();
                                        medianOfNum();
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        tendencyTimer++;
                                        break;
                                }
                            }
                            break;
                        case "3":
                            System.out.println("Operation with Mode");
                            freshInput();
                            modeFinder(acc, size);
                            for(int i=1; i<4; i++){
                                System.out.println("Enter 1 to repeat procedure or 2 to go back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        freshInput();
                                        modeFinder(acc, size);
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        tendencyTimer++;
                                        break;
                                }
                            }
                            break;
                            
                        case "4":
                            System.out.println("Operation with Weighted mean");
                            freshInputUnsorted();
                            weightedMean();
                            for(int i=1; i<4; i++){
                                System.out.println(" 1  repeat procedure for weighted mean ");
                                System.out.println(" 2  back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        freshInputUnsorted();
                                        weightedMean();
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        tendencyTimer++;
                                        break;
                                }
                            }
                            break;
                            
                        case "0":
                            tendencyTimer=5;  //breaks from tendency to immediate outer-loop(home)
                            break;
                            
                        default:
                            System.out.println("Incorrect input");
                            tendencyTimer++;
                            break; 
                                

                    }
                    
                    tendencyTimer++;        //break from switch
                }while(tendencyTimer<5);
            }
            if(choice.equals("2")){
                do{
                
                    System.out.println("2. NUMERICAL MEASURE OF DISPERSION(VARIATION)");
                    System.out.println("Choose a dispersion option to continue");
                    System.out.println("1. Percentile");
                    System.out.println("2. Standard Deviation");
                    System.out.println("3. Variance");
                    System.out.println("4. Range ");
                    System.out.println("5. Lower quartile");
                    System.out.println("6. Mid quartile");
                    System.out.println("7. Upper quartile");
                    System.out.println("8. Inter-quartile range");
                    System.out.println("0. Back");
                    choice=sc.next();

                    switch(choice){
                        case "1":
                            System.out.println("PERCENTILE CALCULATOR");
                            freshInput();
                            System.out.println("Enter value to find percentile");
                            double val = sc.nextDouble();
                            percentile(acc, val);
                            for(int i=1; i<4; i++){
                                System.out.println(" 1  repeat procedure to find percentile ");
                                System.out.println(" 2  back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        freshInput();
                                        System.out.println("Enter value to find percentile");
                                        val = sc.nextDouble();
                                        percentile(acc, val);
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        dispersionTimer++;
                                        break;
                                }
                            }
                            break;
                        case "2":
                            System.out.println("STANDARD DEVIATION CALCULATOR");
                            System.out.println("Operation with Standard Deviation");
                            //input data
                            freshInput();
                            //find the square root of the sum of squares
                            System.out.println("Find the square root of the sum of squares ("+varianceMeth(acc, size)+")^0.5"
                                    + "\nHence the standard deviation \n= "+Math.sqrt(varianceMeth(acc, size)));
                            for(int i=1; i<4; i++){
                                System.out.println(" 1  repeat for standard deviation ");
                                System.out.println(" 2  back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        freshInput();
                                        //find the square root of the sum of squares
                                        System.out.println("Find the square root of the sum of squares ("+varianceMeth(acc, size)+")^0.5"
                                                + "\nHence the standard deviation \n= "+Math.sqrt(varianceMeth(acc, size)));
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        dispersionTimer++;
                                        break;
                                }
                            }
                            break;
                        case "3":
                            System.out.println("VARIANCE");
                            System.out.println("Operation with Variance");
                            freshInput();
                            System.out.println("The variance therefore is "+varianceMeth(acc, size));
                            for(int i=1; i<4; i++){
                                System.out.println(" 1  repeat process for variance ");
                                System.out.println(" 2  back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        freshInput();
                                        System.out.println("The variance therefore is "+varianceMeth(acc, size));
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        dispersionTimer++;
                                        break;
                                }
                            }
                            break;
                        case "4":
                            System.out.println("RANGE CALCULATOR");
                            freshInput();
                            rangeFinder(acc);
                            for(int i=1; i<4; i++){
                                System.out.println(" 1  repeat process to compute range  ");
                                System.out.println(" 2  back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        freshInput();
                                        rangeFinder(acc);
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        dispersionTimer++;
                                        break;
                                }
                            }
                            break;
                        case "5":
                            System.out.println("LOWER(FIRST) QUARTILE");

                            System.out.println("The Lower Quartile is "+lowerQuartile());
                            for(int i=1; i<4; i++){
                                System.out.println(" 1  repeat process for lower-quartile ");
                                System.out.println(" 2  back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        System.out.println("The Lower Quartile is "+lowerQuartile());
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        dispersionTimer++;
                                        break;
                                }
                            }
                            break;
                        case "6":
                            System.out.println("MIDDLE(SECOND) QUARTILE");
                            freshInput();
                            System.out.println("Second quartile is the median of the set of values\n ");
                            medianOfNum();
                            System.out.println("as the second quartile.");
                            for(int i=1; i<4; i++){
                                System.out.println(" 1  repeat procedure for second-quartile ");
                                System.out.println(" 2  back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        freshInput();
                                        System.out.println("Second quartile is the median of the set of values\n ");
                                        medianOfNum();
                                        System.out.println("as the second quartile.");
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        dispersionTimer++;
                                        break;
                                }
                            }
                            break;
                        case "7":
                            System.out.println("UPPER(THIRD) QUARTILE");

                            System.out.println("The Upper Quartile is "+upperQuartile());
                            for(int i=1; i<4; i++){
                                System.out.println(" 1  repeat procedure for upper-quartile ");
                                System.out.println(" 2  back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        System.out.println("The Upper Quartile is "+upperQuartile());
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        dispersionTimer++;
                                        break;
                                }
                            }
                            break;
                        case "8":
                            System.out.println("INTER QUARTILE RANGE");
                            System.out.println("The interquartile range is "+interQuartileRange());
                            for(int i=1; i<4; i++){
                                System.out.println(" 1  repeat procedure for inter-quartile range ");
                                System.out.println(" 2  back");
                                choice = sc.next();
                                switch(choice){
                                    case "1":
                                        System.out.println("The interquartile range is "+interQuartileRange());
                                        break;
                                    case "2":
                                        i=4;//breaks the for loop to the switch
                                        break;
                                    default:
                                        System.out.println("Invalid input");
                                        dispersionTimer++;
                                        break;
                                }
                            }
                            break;
                        case "0":
                            dispersionTimer=4;// breaks from the dispersion loop to outer one-step
                            break;
                        default:
                            System.out.println("Oops! Invalid input, enter 1 to repeat process or 0 to return");
                            break;
                    }
                    dispersionTimer++;//from switch
                }while(dispersionTimer<4);
            }
        
            HomeTimer++;
        }while(HomeTimer<5);  
    }
    
    
    //mean method
    static double  sum=0;
    static int timer=0, count=0;
    //Var to hold choice
    static    String choice;
    
    public static void meanOfNums(){
        freshInput();
        double Sum=0;
        StringBuilder sb = new StringBuilder();
        
        //find the mean
        System.out.println("Find the mean\n\n");
        System.out.println("mean = \t(Sum of values)/(number of values)");
        sb.append(acc[0]);//that is to avoid adding '+' char at the end of sum
        for(int i=1; i<size; i++){
            //appending ['+ val']
            sb.append(" + "+acc[i]);
        }
        for(int j= 0; j<size; j++){
            //for summing all array content from 0-<size
            Sum=Sum+acc[j];
        }
        System.out.println("Sum of values : "+sb.toString()+" = "+Sum);
        System.out.println("Number of values: "+size);
        System.out.println("Mean = "+Sum+"/"+size);
        double m =(Sum/size);
        System.out.println("The mean is summation/(number of items) \n "+Sum+"/"+size+"\n"+m);
        System.out.println("\t= "+m);
        
        
    }
    
    static int index=-1, timer1=0,size=0;
    static double[] acc;
    public static void medianOfNum(){
        double med;
        //use the size to determine if oddity
        if(size%2==0){
            //that's even count
            System.out.println("The data values are "+acc.length+" in number.");
            System.out.println("The middle two values are "+acc[size/2-1]+" and "+acc[size/2]);
            System.out.println("Finding the average of the two :\n("+acc[size/2-1]+" + "+acc[size/2]+")/2");
            System.out.println(" = "+(acc[size/2-1]+acc[size/2])+"/2");
            System.out.println("\nTherefore the median is "+(acc[size/2-1]+acc[size/2])/2);
        }else{
            
            med=acc[(int)size/2];
            System.out.println("The data values are "+acc.length+" in number.");
            System.out.println("Since the number of values is odd, the middle single value is the median.");
            System.out.println("Hence, "+med);
        }
        System.out.println("");
    }
    
    //Loading the numbers into array
    static double numbers[];
    private static void freshInput(){
        //resetting variables
        sum=0;
        System.out.println("Please enter the size(cardinality) of your data.");
        size = sc.nextInt();
        acc = new double[size];
        System.out.println("Enter the numbers");
        for(int i=0; i<size;i++){
            acc[i]=sc.nextDouble();
        }
        //sort the acc
        Arrays.sort(acc);
        System.out.println("The data in ascending order is\n");
        StringBuilder sb = new StringBuilder();
        sb.append(acc[0]);
        for(int i =1; i<size; i++){
            sb.append(" , "+acc[i]);
        }
        System.out.println(" "+sb.toString());
        
    }
    
    private static void freshInputUnsorted(){
        //resetting variables
        sum=0;
        System.out.println("Please enter the size(cardinality) of your data.");
        size = sc.nextInt();
        acc = new double[size];
        System.out.println("Enter the numbers");
        for(int i=0; i<size;i++){
            acc[i]=sc.nextDouble();
        }
        System.out.println("The data \n");
        for(int i =0; i<size; i++){
            System.out.print(acc[i]+"  ");
            System.out.println(" ");
        }
        
    }
    
    private static void modeFinder(double[] arr, int arrSize){
        //declare integers for iterating array elements in two nested loops
        int i, j, maxCount=0;
        for(i=0;i<arrSize;i++){//outer element holder
            for(j=1;j<arrSize;j++){//inner holder
                //now compare first of outer to next of inner
                int counter=0;
                if(arr[i]==arr[j]){//counting instances of element i being equal to all j+1
                    counter++;
                    if(counter>maxCount){
                        maxCount=counter;
                        System.out.println("Mode is "+arr[i]);
                    }
                }
            }
        }
    }
    
    static double std_deviation;
    private static double variance(double []arr, int arrSize){
        double s=0,devArr[]=new double[arrSize];
        //mean 
        for(int i=0; i<arr.length;i++){
            s+=arr[i];
        }
        double m = s/arrSize;
        double sumDevSq=0;
        for(int i =0; i<arr.length;i++){
            //finding the deviation of each score
            sumDevSq+=(arr[i]-m)*(arr[i]-m);
        }
        double var=sumDevSq/(arrSize-1);
//        System.out.println("the variance is "+var);
        return var;
    }
    
    
    private static void percentile(double arr[], double value){
        //Percentile is the ratio of count of values below to total count of values
        int countBelow=0, totalCount=arr.length;
        
        //sorting in ascending order
        Arrays.sort(arr);
        //count below the value
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<value){
                countBelow++;
            }
            
        }
        System.out.println("percentile=count below value /count total \n=>"+countBelow+"/"+totalCount+"\n="+((double)countBelow/((double)totalCount))*100);
    }
    
    
    private static void rangeFinder(double arr[]){
        double lowestVal, highestVal, R;
        Arrays.sort(arr);
        lowestVal=arr[0];
        highestVal=arr[arr.length-1];
        R=highestVal-lowestVal;
        System.out.println("Range is the difference the higest and the lowest values");
        System.out.println("Thus Range is "+R);
    }
    
    
    private static void weightedMean(){
        /*
        *The weighted mean is the sum of the product of data value and it's weight, divided by the sum of all weights
        */      //sop(sum of prod)
        double weightArr[], sumWeights=0, sop=0;
        
        double sopArr[];        //accummulating all sum of products in array
        
        sopArr= new double[size];
        
        //initialize weightArr
        weightArr= new double[size];
        //input data values
        System.out.println("Enter corresponding weights in same order as data");
        for(int i=0; i<weightArr.length; i++){
            weightArr[i]=sc.nextDouble();
            sumWeights+=weightArr[i];
        }
        System.out.println("Sum of weights= "+sumWeights);
        //multiplying data values and their corresponding weights
        System.out.println("Products of data value and corresponding weights:");
        for(int i=0; i<size; i++){
            sop+=acc[i]*weightArr[i];
//            sopArr[i]=sop;
            System.out.println(acc[i]+" X "+weightArr[i]);
        }
        System.out.println("Ratio of Sum of products to sum of weights");
        System.out.println("Weighted mean = sum of products / sum of weights");
        System.out.println("wm = "+sop+"/"+sumWeights);
        System.out.println("wm = "+sop/sumWeights);
        
        
    }
    
    private static double lowerQuartile(){
        freshInput();
        Arrays.sort(acc);
        //finding the median of the first half to give the lower quartile
        double med;
        if(acc.length%2==0){
            med = (acc[acc.length/2-1]+acc[acc.length/2])/2;
        }else{
            med=acc[(int) acc.length/2];
        }
        int firstHalfCount=acc.length/2;
        //median of first half to make LQ
        double lqArr[] = new double[firstHalfCount];
        double mLQ;
        System.arraycopy(acc, 0, lqArr, 0, firstHalfCount);
        if(lqArr.length%2==0){
            mLQ=(lqArr[lqArr.length/2-1]+lqArr[lqArr.length/2])/2;
        }else{
            mLQ=lqArr[lqArr.length/2];
        }
        return mLQ;
    }
    
    
    private static double upperQuartile(){
        freshInput();
        //sort array acc
        Arrays.sort(acc);
        //find the 3/4 that is the 75% item
        int pos=acc.length;
        pos= (int) (pos*0.75);
        double uQ=acc[pos];
        forIntQ_upper=uQ;  //Initializing to be used by interquartile function
        return uQ;
        
    }
    
    static double forIntQLower, forIntQ_upper;
    private static double interQuartileRange(){
        forIntQLower=lowerQuartile();
        //sort array acc
        Arrays.sort(acc);
        //find the 3/4 that is the 75% item
        int pos=acc.length;
        pos= (int) (pos*0.75);
        double uQ=acc[pos];
        forIntQ_upper=uQ;  //Initiali...
        //The diff btn lower quartile and upper quartile is the interquartile range
        return forIntQ_upper-forIntQLower;
        
    }
    
    static int nextVal=0;
    private static double varianceMeth(double arr[],int Size){
        //Using data input method above
        double Sum=0;
        StringBuilder sb = new StringBuilder();
        
        //find the mean
        System.out.println("Find the mean\n\n");
        System.out.println("mean = \t(Sum of values)/(number of values)");
        sb.append(arr[0]);//that is to avoid adding '+' char at the end of sum
        for(int i=1; i<Size; i++){
            //appending ['+ val']
            sb.append(" + "+arr[i]);
        }
        for(int j= 0; j<Size; j++){
            //for summing all array content from 0-<size
            Sum=Sum+arr[j];
        }
        System.out.println("Sum of values : "+sb.toString()+" = "+Sum);
        System.out.println("Number of values: "+Size);
        System.out.println("Mean = "+Sum+"/"+Size);
        double m =(Sum/Size);
        System.out.println("\t= "+m);
        //finding the diff btn num and mean
        System.out.println("Value\tDeviation");
        for(int i=0; i<Size; i++){
            System.out.println(arr[i]+" \t"+arr[i]+" - "+m+" = "+(arr[i]-m));
        }
        System.out.println("");
        System.out.println("");
        System.out.println("|X-m|\tAbsolute difference square");
        for(int i=0; i<Size; i++){
            System.out.println(" "+Math.abs(arr[i]-m)+"\t\t"+(arr[i]-m)*(arr[i]-m));
        }
        System.out.println("Summation of square of absolute difference");
        double sumDevSq=0; 
        StringBuilder sbDevSq= new StringBuilder();//
        sbDevSq.append((arr[0]-m)*(arr[0]-m));  //Essence of avoiding '+' at ending
        for(int i=0; i<Size; i++){
            sumDevSq+=(arr[i]-m)*(arr[i]-m);
        }
        for(int i=1; i<Size; i++){
            sbDevSq.append(" + "+(arr[i]-m)*(arr[i]-m));
        }
        System.out.println("\n"+sbDevSq.toString()+"\n");
        System.out.println("=  "+sumDevSq);
        
        //dividing sum of squares by size of sample 'n'
        System.out.println("Dividing by sample size\n"+sumDevSq+"/"+Size);
        System.out.println(" = "+sumDevSq/Size);
        
        return sumDevSq/Size;
        
    }
    
    
    //Login
     static Boolean valid=false; static int logCount=0;
    private static void developersLog(){
        while(logCount<5 ){
            String trialDates=LocalDate.now().toString();
            if(trialDates.equals("2022-08-18") || trialDates.equals("2022-08-19") || trialDates.equals("2022-08-20") || trialDates.equals("2022-08-23") ){
                
                System.out.println("PLEASE ENTER USER CREENTIALS TO LOGIN");
                System.out.println("ENTER USERNAME(case sensitive)\n");

                String username = sc.next();
                System.out.println("ENTER PASSWORD\n");
                String password = sc.next();
                if((username.equals("grp2") || username.equals("GRP2")) && password.equals("eid")){
                    System.out.println("\tWELCOME TO GROUP TWO STATISTICS APP LAUNCH PRESENTATION-2022");
                    System.out.println("\t\t    --<({TEAM OF DEVELOPERS AND OWNER})>--");
                    System.out.println("\t\t\t    AAMUSTED 200I");
                    System.out.println("\tINDEX NUMBER\t\tFULLNAME\n\t=============================================");
                    System.out.println("\t5201040811 |\t\tSAMUEL TAWIAH ");
                    System.out.println("\t5201040812 |\t\tISSAHAKU YENDAW ");
                    System.out.println("\t5201040813 |\t\tSEIDU ELYASU");
                    System.out.println("\t5201040814 |\t\tALHASSAN IBRAHIM ");
                    System.out.println("\t5201040815 |\t\tNANA ADWOA GYANKOMAH ANTWI BOASIAKO ");
                    System.out.println("\t5201040816 |\t\tABDUL SALAM EMMADU DEEN");
                    System.out.println("\t5201040817 |\t\tCHRISTIAN HEDIDOR");
                    System.out.println("\t5201040818 |\t\tELIJAH ROYALSON ADIKA");
                    System.out.println("\t5201040819 |\t\tRICHARD AHIANYO");
                    System.out.println("\t5201040820 |\t\tJOSHUA MWINKAARA");
                    System.out.println("\nEnter 1 to continue...");
                    choice= sc.next();
                    if(choice.equals("1")){
                        break;
                    }else{
                        System.out.println("You declined.");
                        System.exit(0);
                    }
                } else{
                    logCount++;
                    if(logCount==4){
                        System.out.println("Sorry! You could not be authenticated to use.");
                        System.exit(0);
                    }
                    System.out.println("Invalid user credentials. You made "+logCount+" of 4 attempts");
                }   
            }else{
                System.out.println("Your trial use has expired.");
                System.exit(0);
            }
        }
    }
    
    
    //THE END       THE END         THE END             THE END             SOSKODE@TEK.EID
}

