class Doctor { 
private String name; 
private int experience; 
private String specialization; 
 
public Doctor(String name, int experience, String specialization) { 
this.name = name; 
this.experience = experience; 
this.specialization = specialization; 
} 
 
public String getName() { 
return name; 
} 
 
public void setName(String name) { 
this.name = name; 
} 
 
public int getExperience() { 
return experience; 
} 
 
public void setExperience(int experience) { 
this.experience = experience; 
} 
 
public String getSpecialization() { 
return specialization; 
} 
 
public void setSpecialization(String specialization) { 
this.specialization = specialization; 
} 
 
public void treatPatient() { 
System.out.println("Doctor " + name + " is treating a patient."); 
} 
} 
 
class Ortho extends Doctor { 
public Ortho(String name, int experience) { 
super(name, experience, "Orthopedics"); 
} 
} 
 
class Pediatric extends Doctor { 
public Pediatric(String name, int experience) { 
super(name, experience, "Pediatrics"); 
} 
} 
 
public class Maindoc { 
public static void main(String[] args) { 
Ortho orthoDoctor = new Ortho("Dr. Smith", 10); 
System.out.println("Name: " + orthoDoctor.getName()); 
System.out.println("Experience: " + orthoDoctor.getExperience()); 
System.out.println("Specialization: " + orthoDoctor.getSpecialization()); 
orthoDoctor.treatPatient(); 
Pediatric pediatricDoctor = new Pediatric("Dr. Patel", 5); 
System.out.println("Name: " + pediatricDoctor.getName()); 
System.out.println("Experience: " + pediatricDoctor.getExperience()); 
System.out.println("Specialization: " + pediatricDoctor.getSpecialization()); 
pediatricDoctor.treatPatient(); 
} 
}
