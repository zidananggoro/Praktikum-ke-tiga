package Modul6;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

    public static final boolean VERBOSE_FLAG = true;
    private static ArrayList<City> initialRoute = new ArrayList<City>(Arrays.asList(
       new City("Boston",42.3601,-71.0589),
       new City("San Francisco",37.7749,-122.4194),
       new City("New york",40.7128,-74.0059),
       new City("Houston",29.7604,-95.3698),
       new City("Denver",39.7392,-104.9903),
       new City("Los Angels",34.0522,-118.2437),
       new City("Chicago",41.8781,-87.6298),
       new City("Austin",30.2672,-97.7431)
    ));

    public static void main(String[] args) {
        Driver diver = new Driver();
        Instant startInstant = Instant.now();
        BruteForcee bruteForcee = new BruteForcee();
        Route curretRoute = new Route(initialRoute);
        if (VERBOSE_FLAG) diver.printHeading("Route"," Distance (in miles)  |    Shorttest Distance  |   Permutasion #");
        else System.out.print("permutasion in progress....");
        diver.printResult(bruteForcee,bruteForcee.permuteCities(0, curretRoute,new Route(curretRoute)));
        diver.printDuration(startInstant);
    }
    public void printDuration(Instant startInstant){
        Duration permutationDuration = Duration.between(startInstant,Instant.now());
        long minutes = permutationDuration.toMinutes();
        long second = permutationDuration.getSeconds();
        if (second > 59){
            long tempSecond = second - 60*minutes;
            long tempMilisecond = permutationDuration.toMillis() - second*1000;
            System.out.println("Duration: "+ minutes + "minutes "+tempSecond+" second "+tempMilisecond+" milisecond "+ "("+permutationDuration+")");
        }
        else if (second > 0){
            long tempilisecond = permutationDuration.toMillis() - second*1000;
            System.out.println("Duration: "+ second+ " second "+ tempilisecond+" milisecond "+ "("+permutationDuration+")");
        }
        else System.out.println("Duration : "+ permutationDuration.toMillis()+ " milisecond ("+permutationDuration+")");
    }
    public void printResult(BruteForcee bruteForcee,ArrayList<Route> shortRoutes){
        if(VERBOSE_FLAG) System.out.println("");
        printHeading("Shortest Router","Distance (in miles)");
        shortRoutes.stream().forEach(x -> System.out.println(x +"  | "+ bruteForcee.getTotalDistance(x)));
    }
    public void printHeading(String headingColumn1,String remainingHeadingColoumns){
       int cityNamesleagth = 0;
       for (int x = 0;x < initialRoute.size(); x++) cityNamesleagth += initialRoute.get(x).getNama().length();
       int arraylength = cityNamesleagth + initialRoute.size()*2;
       int partialength = (arraylength - headingColumn1.length()/2);
       for (int x=0; x < partialength; x++)System.out.print(" ");
       System.out.print(headingColumn1);
       for (int x=0; x < partialength; x++)System.out.print(" ");
       if ((arraylength % 2 ) == 0)System.out.print(" ");
       System.out.print(" | "+ remainingHeadingColoumns);
       cityNamesleagth += remainingHeadingColoumns.length()+3;
       for (int x=0; x < cityNamesleagth+initialRoute.size()*2; x++)System.out.print("-");
       System.out.println("");
    }
}
