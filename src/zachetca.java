import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class zachetca{
    private Integer ocen;

   private HashMap<String,Integer> states=new HashMap<String,Integer>();
    private void setOcen(Integer value) {
        ocen=value;




    }
    Integer getOcen(){

        return ocen;
    }



    private HashMap<String, Integer> getzach(String predmet , Integer ocenka){


        //states.put(predmet,ocenka);
        for (var item:states.entrySet()
        ) {
            System.out.printf("lesson: %d Ocenka: s %s \n",item.getKey(),item.getValue());
            //item.getKey();
            // item.getValue();

        }
        return states;


    }
    private HashMap<String, Integer> getzach(){
        return states;
    }

}
