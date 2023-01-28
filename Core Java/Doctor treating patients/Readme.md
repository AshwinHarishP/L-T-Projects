                                                        An overview of the program
<h1>Description</h1>
<h2>Java coding for below Scenario: </h2>
<h3>Project for doctor treating patients</h3>
<h4>Write a program to follow the mentioned functionalities: -</h4>
 <b>A.Create Parent class doctor which has following attributes: -</b>
<ol>
  <li>Name</li>
  <li>Experience</li>
  <li>Specialization</li>
 </ol>
<b>B.Doctors treat patients, but it’s a generic statement.Also,patients go to specific doctors based on the ailment.</b>
<ol>
  <li>An Ortho is-a Doctor and inherit the attributes and methods from Doctor class.</li>
  <li>Doctor class does not even know that it is being extended by other class.In fact it does not even know the existence of Ortho/Pediatric class. There is no reason for it to know.
  <li>An Ortho can only inherit attributes and method from one class.Both Ortho and Pediatric are extending from Doctor class and share the is-a relationship with Doctor, but there is no relationship between them. Orthois not a Pediatric and vice versa.</li>
