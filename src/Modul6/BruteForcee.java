package Modul6;

import java.util.ArrayList;
import java.util.Collections;

public class BruteForcee {
    static int permutationNumb = 1;
    ArrayList<Route> shoetestRouter = new ArrayList<Route>();
    public ArrayList<Route> permuteCities(int x,Route currentRoute,Route shortestRoute){
        currentRoute.getCities().stream().filter(y -> currentRoute.getCities().indexOf(y) >= x).forEach(y -> {
            int indexofY = currentRoute.getCities().indexOf(y);
            Collections.swap(currentRoute.getCities(),indexofY,x);
            permuteCities(x+1,currentRoute,shortestRoute);
            Collections.swap(currentRoute.getCities(),x,indexofY);
        });
        if (x == currentRoute.getCities().size()-1){
            if (Driver.VERBOSE_FLAG) System.out.print(currentRoute+"   |        "+ getTotalDistance(currentRoute));
            if (calculateTotalDistance(currentRoute) <= calculateTotalDistance(shortestRoute)){
                shortestRoute.getCities().clear();
                shortestRoute.getCities().addAll(currentRoute.getCities());
                addToShortestRoutes(new Route(shortestRoute));
            }
            if (Driver.VERBOSE_FLAG) System.out.println("            |      "+ getTotalDistance(shortestRoute)+"          | "+ permutationNumb++);
        }
        return shoetestRouter;
    }
    public int calculateTotalDistance(Route route){
        int citiesSize = route.getCities().size();
        return (int) (route.getCities().stream().mapToDouble(x -> {
            int cityIndex = route.getCities().indexOf(x);
            double returnValue= 0;
            if(cityIndex < citiesSize - 1 ) returnValue = x.measureDistance(route.getCities().get(cityIndex + 1));
            return returnValue;
        }).sum() + route.getCities().get(0).measureDistance(route.getCities().get(citiesSize - 1)));
    }
    public String getTotalDistance(Route route){
        String retrunValue = Integer.toString(calculateTotalDistance(route));
        if (retrunValue.length()== 4)retrunValue = " "+ retrunValue;
        else if (retrunValue.length()== 3) retrunValue="  "+ retrunValue;
        return retrunValue;
    }
    public void  addToShortestRoutes(Route route){
        shoetestRouter.removeIf(x -> calculateTotalDistance(x) > calculateTotalDistance(route));
        shoetestRouter.add(route);
    }
}
