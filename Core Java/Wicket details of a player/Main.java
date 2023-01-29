import java.uti1.HashMap;
import java.uti1.Map; import 
java.uti1.Scanner; import
java.uti1.*;
public class Main (
public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 Map<String, Bowler> bowlers = new HashMap<>(); 
 while (true) { 
 System.out.println("Enter the player name: "); 
 String name = sc.nextLine(); 
 Bowler bowler = new Bowler(name); 
 System.out.println("Enter wickets - separated by \"|\" symbol"); 
 String[] wickets = sc.nextLine().split("\\|"); 
 for (String wicket : wickets) { 
 bowler.addWicket(new Wicket(wicket, bowler)); 
 } 
 bowlers.put(name, bowler); 
 System.out.println("Do you want to add another player (yes/no)?"); 
 if (sc.nextLine().equalsIgnoreCase("no")) { 
 break; 
 } 
 } 
 
 while (true) { 
 System.out.println("Search for player by name: "); 
 String name = sc.nextLine(); 
 if (bowlers.containsKey(name)) { 
 Bowler bowler = bowlers.get(name); 
 System.out.println("Wickets taken by " + bowler.getName() + ":"); 
 for (int i = 0; i < bowler.getWickets().size(); i++) { 
 System.out.println((bowler.getWickets().get(i).getPlayerName()); 
 } 
 } else { 
 System.out.println("Player not found"); 
 } 
 System.out.println("Do you want to search for another player (yes/no)?"); 
 if (sc.nextLine().equalsIgnoreCase("no")) { 
 break; 
 } 
 } 
 } 
} 
class Bowler { 
 private String name; 
 private List<Wicket> wickets; 
 public Bowler(String name) { 
 this.name = name; 
 this.wickets = new ArrayList<>(); 
 } 
 
 public String getName() { 
 return name; 
 } 
 
 public void setName(String name) { 
 this.name = name; 
 } 
 
 public List<Wicket> getWickets() { 
 return wickets; 
 } 
 
 public void addWicket(Wicket wicket) { 
 this.wickets.add(wicket); 
 } 
} 
class Wicket { 
 private String playerName; 
 private Bowler bowler; 
 public Wicket(String playerName, Bowler bowler) { 
 this.playerName = playerName; 
 this.bowler = bowler; 
 } 
 
 public String getPlayerName() { 
 return playerName; 
 } 
 
 public void setPlayerName(String playerName) { 
 this.playerName = playerName; 
 } 
 
 public Bowler getBowler() { 
 return bowler; 
 } 
 
 public void setBowler(Bowler bowler) { 
 this.bowler = bowler; 
 } 
}