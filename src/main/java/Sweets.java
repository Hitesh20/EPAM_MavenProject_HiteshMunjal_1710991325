
import Cakes.Carrot;
import Cakes.RedVelvet;
import Cakes.Vanilla;
import Candies.Candies;
import Candies.Caramel;
import Candies.MilkyBar;
import Candies.Nerds;

import java.util.*;

public class Sweets {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        ArrayList<Chocolate> chocolates= new ArrayList<Chocolate>();
        ArrayList<Double> weights= new ArrayList<Double>();
        HashMap<String,Double> weightMap = new HashMap<String, Double>();
        HashMap<String,Double> priceMap = new HashMap<String, Double>();
        do {

            System.out.println("Select Sweets below.");
            System.out.println("Options: - \n 1. Chocolates \n 2. Cakes \n 3. Candies");
            System.out.println("Or press 0 to exit and see the total weight and chocolates that are sorted by price");
            n=sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("CHOCOLATES");

                        System.out.println("Here are the options- \n 1. Cadbury Chocolate \n 2. Snickers Chocolate \n 3. Toblerone chocolate \n" +
                                " Press 'c' for cadbury, 's' for snickers and 't' for toblerone");
                        char ch1 = sc.next().charAt(0);
                        Chocolate chocolate;
                        if(ch1=='c')
                        {
                            chocolate=new Cadbury();
                            if(chocolate instanceof Cadbury) {
                                Cadbury cadbury = (Cadbury) chocolate;
                                chocolates.add(cadbury);
                                weights.add(cadbury.getWeight());
                                weightMap.put("Cadbury Chocolate",cadbury.getWeight());
                                priceMap.put("Cadbury Chocolate", cadbury.getPrice());

                            }

                        }
                        else if(ch1=='s')
                        {
                            chocolate = new Snickers();
                            if(chocolate instanceof Snickers) {
                                Snickers snickers = (Snickers) chocolate;
                                chocolates.add(snickers);
                                weights.add(snickers.getWeight());
                                weightMap.put("Snickers Chocolate", snickers.getWeight());
                                priceMap.put("Snocker Chocolate", snickers.getPrice());
                            }
                        }
                        else if(ch1=='t')
                        {
                            chocolate = new Toblerone();
                            if(chocolate instanceof Toblerone) {
                                Toblerone toblerone = (Toblerone) chocolate;
                                chocolates.add(toblerone);
                                weights.add(toblerone.getWeight());
                                weightMap.put("Toblerone Chocolate", toblerone.getWeight());
                                priceMap.put("Toblerone Chocolate", toblerone.getPrice());
                            }
                        }
                    break;
                case 2:
                    System.out.println("CAKES");
                    System.out.println("Enter the type of cakes you would like to have? \n OPTIONS -: \n 1. Carrot \n 2. RedVelvet" +
                            " \n 3. Vanilla. \n" +
                            "Press c for carrot,r for red velvet and v for vanilla");
                    char ch2 = sc.next().charAt(0);
                    if(ch2=='c') {
                        System.out.println("Carrot cake added to gift");
                        Carrot carrot = new Carrot();
                        weights.add(carrot.getWeight());
                        weightMap.put("Carrot Cake", carrot.getWeight());
                        priceMap.put("Carrot Cake", carrot.getPrice());
                    }
                    else if(ch2=='r') {
                        System.out.println("Red Velvet Cake added to gift");
                        RedVelvet redVelvet = new RedVelvet();
                        weights.add(redVelvet.getWeight());
                        weightMap.put("Red Velvet Cake", redVelvet.getWeight());
                        priceMap.put("Red Velvet Cake", redVelvet.getPrice());
                    }
                    else if(ch2=='v') {
                        System.out.println("Vanilla Cake added to gift");
                        Vanilla vanilla = new Vanilla();
                        weights.add(vanilla.getWeight());
                        weightMap.put("Vanilla Cake",vanilla.getWeight());
                        priceMap.put("Vanilla Cake", vanilla.getPrice());
                    }
                    else
                        System.out.println("invalid choice");
                    break;

                case 3:
                    System.out.println("CANDIES");
                    System.out.println("\n Enter the type of Candies you would like to have? \n OPTIONS -: \n 1) Caramel \n 2) MilkyBar \n 3)Nerds.\n" +
                            "Press c for Caramel , m for MilkyBar and n for Nerds");
                    char ch3 = sc.next().charAt(0);
                    Candies candies;
                    if(ch3=='c') {
                        System.out.println("Caramel are added to your gift");
                        candies = new Caramel();
                        weights.add(candies.getWeight());
                        weightMap.put("Caramel Candies",candies.getWeight());
                        priceMap.put("Caramel Candies", candies.getPrice());
                    }
                    else if(ch3=='m') {
                        System.out.println("MilkyBar are added to your gift");
                        candies = new MilkyBar();
                        weights.add(candies.getWeight());
                        weightMap.put("MilkyBar Candies",candies.getWeight());
                        priceMap.put("MilkyBar Candies", candies.getPrice());
                    }
                    else if(ch3=='n') {
                        System.out.println("Nerds are added to your gift");
                        candies = new Nerds();
                        weights.add(candies.getWeight());
                        weightMap.put("Nerds Candies",candies.getWeight());
                        priceMap.put("Nerds Candies", candies.getPrice());
                    }
                    else
                        System.out.println("invalid choice");
                    break;
                case 0:
                    Collections.sort(chocolates , new Sortbyprice());
                    System.out.println("\nAll the Chocolates Sorted by price -> ");
                    for (int i=0; i<chocolates.size(); i++)
                        System.out.println(chocolates.get(i).getPrice());

                    Iterator itr = weightMap.entrySet().iterator();
                    while (itr.hasNext()) {
                        Map.Entry<String, Double> val = (Map.Entry<String, Double>) itr.next();
                        String mapKey=  val.getKey();
                        System.out.println("Sweet Name:- " + mapKey + ", Weights:- " + weightMap.get(mapKey));
                    }


                    System.out.println("Enter the initial price range");
                    int init = sc.nextInt();
                    System.out.println("Enter the highest price range");
                    int highest = sc.nextInt();

                    Iterator itr2 = priceMap.entrySet().iterator();
                    while (itr2.hasNext()) {
                        Map.Entry<String, Double> val = (Map.Entry<String, Double>) itr2.next();
                        Double price = val.getValue();
                        if(price>=init && price <=highest)
                            System.out.println("Sweet Name:- " + val.getKey() );
                        else
                            continue;
                    }



                    System.out.println("And the total weight of all the sweets");
                    double sum = 0;
                    for (int i=0; i<weights.size(); i++) {
                        sum+=weights.get(i);
                    }
                    System.out.println(sum);
                    System.out.println("Thanks for buying sweets....");

                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }while(n!=0);
    }
    }

