package Unit5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RepairSchedule {
    ArrayList<CarRepair> repairs = new ArrayList<>();
    private int numMechanics;

    public boolean addRepair(int m, int b){

        for(int i = 0; i < repairs.size(); i++){
            if(repairs.get(i).getMechanicNum() == m ||
                    repairs.get(i).getBayNum() == b){
                return false;
            }
        }
        repairs.add(new CarRepair(m,b));
        return true;
    }

    public void printSchedule(){
        System.out.println(repairs);
    }

    public ArrayList<Integer> availableMechanic(){
        ArrayList<Integer> available = new ArrayList<>();
        //loop through the list of mechanics (1-numMechanics)
        for(int i = 1; i <= numMechanics; i++){
            boolean found = false; //indicates that the mechanic i has not been found on repairs
            for(int j = 0; j < repairs.size(); j++){
                if(repairs.get(j).getMechanicNum() == i){
                    found = true;
                }
            }
            if(found == false){
                available.add(i);
            }
        }
        return available;
    }

    /*- Removes the repair scheduled in bay b after a
         repair is complete*/
    public void CarOut(int b) {
        for (int i = 0; i < repairs.size(); i++) {
            if (repairs.get(i).getBayNum() == b) {
                repairs.remove(i);
            }
        }
    }









    public ArrayList<Integer> availableMechanicOne(){
        ArrayList<Integer> available = new ArrayList<Integer>();
        for(int i = 1; i <= numMechanics; i++){
            available.add(i);
        }
        for(int i = 0; i < repairs.size(); i++){
            boolean contains = false;
            int index = 0;
            for(int j = 0; j < available.size(); j++){
                if(repairs.get(i).getMechanicNum() == available.get(j)){
                    contains = true;
                    index = j;
                }
            }
            if(contains == false){
                available.remove(index);
            }
        }
        return available;
    }


}
