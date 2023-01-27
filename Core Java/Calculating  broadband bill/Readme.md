                                                          Program Information 
## Write a program for following Scenario: 
<li>Nikhil has an internet broadband connection in his home. He wants to calculate
his expected post-paid bill amount based on the usage. Help him by using your
Java programming skills to calculate the broadband bill.</li>
<li> His broadband pack costs 500 rupees per month with 1024 MB free </li>
<li> After which it costs an additional of 250 rupees for the next 1024 MB and 3 rupees per MB for all other additional usages. </li>
<h2>Note:</h2>
<li>Input must be a numeric value which represents the total data usage in MB per month </li>
<li>Output must be the total Bill Amount calculated in rupees.</li>
<li>The data usage must be greater than 0, otherwise print “<Data usage> is not a valid input”</li>
<li>From the total usage of 2500 MB, first 1024 MB is free with pack cost of 500 rupees. 
<li>For the remaining 1476 MB (2500-1024=1476), next 1024 MB costs of 250 rupees.</li>
<li> For more additional usage of 452 MB (1476-1024=452), costs for 1356 rupees (3x452=1356). </li>
<li>Therefore, the total bill amount will be 500+250+1356=2106 rupees.</li>
<h2>Sample Inputs:</h2>
<li>Sample Input 1: 2500</li>
<li>Sample Output 1: 2106</li>
<li>Sample Input 2: 1000</li>
<li>Sample Output 2:500</li>
<li>Sample Input 3:1500</li>
<li>Sample Output 3:750</li>
<li>Sample Input 4: -256</li>
<li>Sample Output 4: -256 is not a valid input</li>
