import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class emp {
  
        private Integer id;
  
        private String name;
  
        public emp(Integer id, String name)
    {
  
                this.id = id;
        this.name = name;
    }
  
        public Integer getId()
    {
        return id;
    }
  
        public String getName()
    {
        return name;
    }
}
  
public class employe {
  
        public static void main(String[] args) {
        	List<emp> lt = new ArrayList<emp>();
        	lt.add(new emp(1, "nani"));
            lt.add(new emp(2, "madhan"));
            lt.add(new emp(3, "hemanth"));
            lt.add(new emp(4, "poojith"));
            lt.add(new emp(5, "vhr"));
            lt.add(new emp(6, "xyz"));
            lt.add(new emp(7, "employe"));
            lt.add(new emp(8, "noone"));
            lt.add(new emp(9, "one"));
            lt.add(new emp(10, "dinsh"));
            Map<Integer, String> map = new HashMap<>();
            for (emp e : lt) {
                map.put(e.getId(),e.getName());
            }
      
                        System.out.println("Map  : " + map);
          }
    }