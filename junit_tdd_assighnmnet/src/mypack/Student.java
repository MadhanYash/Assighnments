package mypack;

import java.util.EventObject;

public class Student() private Object id;
private Object name;
{  
	
	  this.id=id;
	  this.name=name;
	  
}	  
  
  public EventObject clone()
  {
	  return (EventObject) super.clone();
  }
  public static boolean cheacklone(Student s1,Student s2) {
	  if(s1.id==s2.id&&s1.name==s2.name)
		  return true;
	  else
		  return false;
  }}


