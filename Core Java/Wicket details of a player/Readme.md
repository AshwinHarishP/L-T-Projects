                                                          An overview of the program
<h2>Description</h2>
Java program to register all the player details [Bowler] and provide a
quick view of number of wickets taken by the player based on the name of the
player. Use HashMap to store all the wickets, Key will be the name of the player and
value contains the player object. Multiple wickets for a player are provided using a
delimiter pipe "|".
<h2>Requirments</h2>
<li>Create a main class "Main.java"</li>
<li>Create Bowler class with below attributes:-</li>
<ol>
  <li>name - String</li>
  <li>Add appropriate getter and setter methods for Bowler class</li>
  <li>Create constructor for Bowler class with argument name</li>
</ol>
<li>Create Wicket class with below attributes:-</li>
<ol>
  <li>playerName - String</li>
  <li>Bowler - Bowler object</li>
  <li>Add appropriate getter and setter methods for Wicket class</li>
  <li>Create constructor for Wicket class with arguments description and Bowler object</li>
<li>Provide search option to search based on the name of the bowler and display all the wickets taken by him.</li>
</ol>
<h2>Input and Output Format:</h2>
<h3>Sample Input/Output :</h3>
<b>Enter the player name:<br/></b> 
Ashwin<br/>
<b>Enter wickets - separated by "|" symbol<br/></b>
Virat Kohli|Shane Watson|Ajinkya Rahane<br/>
<b>Do you want to add another player (yes/no)?<br/></b>
yes<br/>
<b>Enter the player name<br/></b>
Bravo<br/>
<b>Enter wickets - separated by "|" symbol<br/></b>
Robin Uthapa<br/>
<b>Do you want to add another player (yes/no)?<br/></b>
no<br/>
<b>Enter the player name to search<br/></b>
Morkel<br/>
<b>No player found with the name Morkel<br/></b>
<b>Do you want to search another player (yes/no)?<br/></b>
yes<br/>
<b>Enter the player name to search<br/></b>
Ashwin<br/>
<b>Player Name : Ashwin<br/></b>
<b>Wickets :<br/></b>
<b>Virat Kohli<br/></b>
<b>Shane Watson<br/></b>
<b>Ajinkya Rahane<br/></b>
<b>Do you want to search another player (yes/no)?<br/></b>
No<br/>




