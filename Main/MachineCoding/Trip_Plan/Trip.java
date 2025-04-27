package Main.MachineCoding.Trip_Plan;

import java.util.ArrayList;
import java.util.List;

class TripData {
    String Gender;
    String age;
    String expenses;
    int days;
    String Country;

    public TripData(String Gender, String age, String expenses, int days, String Country) {
        this.Gender = Gender;
        this.age = age;
        this.days = days;
        this.Country = Country;
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "Gender: " + Gender + ", Age: " + age + ", Expenses: " + expenses + 
               ", Days: " + days + ", Country: " + Country;
    }
    
}

public class Trip {
    String Gender;
    String age;
    String expenses;
    String location;
    int days;
    String Country;
    ArrayList<TripData> list = new ArrayList<>();
    List<TripData> triplist=initialize(list);

    public void Trip() {
        
    }
    
    public List<TripData> filterByDays(int maxDays){
        List<TripData> filterlist=new ArrayList<>();
        for(TripData trip:list){
            if(trip.days<=maxDays){
                filterlist.add(trip);
            }
        }
        return filterlist;
    }
    public List<TripData> filterByCountry(String Country){
        List<TripData> filterlist=new ArrayList<>();
        for(TripData trip:list){
           if(trip.Country.equals(Country)){
            filterlist.add(trip);
           }
        }
        return filterlist;
    }

    public List<TripData> filterByExpenses(String expense){
        List<TripData> filterlist=new ArrayList<>();
        for(TripData trip:list){
            int tripExpenses=Integer.parseInt(trip.expenses.replace("k", ""))*1000;
            int maxExpenses=Integer.parseInt(expense.replace("k", ""))*1000;
            if(tripExpenses<=maxExpenses){
                filterlist.add(trip);
            }

        }
        return filterlist;
    }

    public List<TripData> initialize(List<TripData> list) {
        TripData gtripData1 = new TripData("Male", "14+", "10k", 30, "Romania");
        TripData gtripData2 = new TripData("Male", "20+", "4k", 20, "India");
        TripData gtripData3 = new TripData("Male", "18+", "3k", 12, "Singapore");
        TripData gtripData4 = new TripData("Male", "18+", "1k", 12, "India");
        TripData gtripData5 = new TripData("Male", "25+", "15k", 15, "USA");
        TripData gtripData6 = new TripData("Male", "30+", "20k", 7, "Australia");

        TripData tripData1 = new TripData("Female", "18+", "11k", 10, "Romania");
        TripData tripData2 = new TripData("Female", "20+", "40k", 21, "India");
        TripData tripData3 = new TripData("Female", "18+", "31k", 17, "Singapore");
        TripData tripData4 = new TripData("Female", "21+", "13k", 18, "Malaysia");
        TripData tripData5 = new TripData("Female", "25+", "25k", 19, "France");
        TripData tripData6 = new TripData("Female", "30+", "50k", 23, "Japan");

        TripData gtripData7 = new TripData("Male", "16+", "8k", 14, "Thailand");
        TripData gtripData8 = new TripData("Male", "22+", "12k", 26, "Germany");
        TripData tripData7 = new TripData("Female", "22+", "18k", 29, "Italy");
        TripData tripData8 = new TripData("Female", "28+", "35k", 2, "Canada");

        list.add(gtripData1);
        list.add(gtripData2);
        list.add(gtripData3);
        list.add(gtripData4);
        list.add(gtripData5);
        list.add(gtripData6);
        list.add(gtripData7);
        list.add(gtripData8);

        list.add(tripData1);
        list.add(tripData2);
        list.add(tripData3);
        list.add(tripData4);
        list.add(tripData5);
        list.add(tripData6);
        list.add(tripData7);
        list.add(tripData8);

        return list;
    }
    public static void main(String[] args) {
        Trip obj=new Trip();
        System.out.println(obj.filterByExpenses("2k"));
    }
}