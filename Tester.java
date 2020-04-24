//import java.util.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
//import java.text.ParseException;

public class Tester{
  public static class Node{
    public String Province;
    public String Date;
    public Node(){
      Province="";
      Date="";
    }
  }
	public static void main(String[] args)throws Exception {
	    List<Node> list = new ArrayList<Node>();
      Node a = new Node();
      Node b = new Node();
      Node c = new Node();
      Node d = new Node();
      Node e = new Node();
      Node f = new Node();

      a.Date = "01.01.2020";
      b.Date = "02.01.2020";
      c.Date = "03.01.2020";
      d.Date = "04.01.2020";
      e.Date = "05.01.2020";
      f.Date = "01.02.2020";

      list.add(a);
      list.add(b);
      list.add(c);
      list.add(d);
      list.add(e);
      list.add(f);


      SimpleDateFormat DateFormat = new SimpleDateFormat("dd.MM.yyyy");
      //Date date = DateFormat.parse("02.03.2001");
      // System.out.println(date);
      // System.out.println(date.getTime());
      // long int_fecha = date.getTime();
      // System.out.println(int_fecha);

      for(int i=0;i<list.size();i++){
        System.out.println(DateFormat.parse(list.get(i).Date).getTime() );
      }
      //long pivot = getTime(DateFormat.parse(list.get(0).Date));
      //System.out.println(date1);
	}

}
