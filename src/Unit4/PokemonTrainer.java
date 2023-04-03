package Unit4;

public class PokemonTrainer {
    private Pokemon[] poks;
    private int index = 0; //not necessarily a problem

    public PokemonTrainer(int max){
        poks = new Pokemon[max];
    }

    public void add(Pokemon p){
        boolean added = false;
        for(int i=0; i<poks.length; i++ ){  //1 mark
            if(poks[i] == null && added == false){  //1 mark
                poks[i] = p; //1 mark
                added = true;
                i=poks.length;
            }
        }
        if(added==false){  // 1 mark
            System.out.println("The pokemons' list is full");
        }
    }

    public Pokemon search(String name){
        for(int i =0; i<poks.length; i++){ //1 mark
            // 1 for checking not null or using counter
            //1 mark for checking name
            if(poks[i]!=null && poks[i].getName().equals(name)){
                return poks[i];
            }
        }
        return null; //1 mark
    }

    //5 marks + 2 tester
    public void list(String sp){
        //print non null with species sp
        //calculate total health of those pokemons
        int totalHealthCount = 0; // 1 mark
        System.out.format("%-15s %-15s %-15s %-15s",
                "Name", "Health", "Speed", "Species" + "\n");
        for(int i=0; i<poks.length;i++){ //1 mark
            if(poks[i]!=null){ //1 mark
                if(poks[i].getSpecies().equals(sp)){ //1 mark
                    System.out.println(poks[i]); //1 mark
                    totalHealthCount+=poks[i].getHealth();
                }
            }
        }
        System.out.format("%-15s %-15s" , "Total Health " , totalHealthCount);

    }

    //5 marks +  2 tester
    public Pokemon[] getFastestPokemons (int speed){
        //list of pokemons faster than speed
        Pokemon[] temp = new Pokemon[poks.length];
        int idx = 0;
        for(Pokemon p : poks){ //1 mark
            if(p != null && p.getSpeed() > speed){ //1 mark
                temp[idx] = p; //1 mark
                idx++;
            }
        }
        Pokemon[] fastest = new Pokemon[idx]; //1 mark
        for(int i = 0; i < idx; i++){
            fastest[i] = temp[i];
        }
        return fastest; //1 mark
    }

    /* - returns the Pokemon with the most health
    *  4 marks + 2 tester*/
    public Pokemon getHealthiestPokemon(){
        int maxHealth = 0;
        Pokemon healthiest = null;
        //1 mark
        for(int i = 0; i< poks.length; i++){
            //1 mark
            if(poks[i]!=null && poks[i].getHealth()>maxHealth){
                // 1 mark (max algorithm)
                maxHealth = poks[i].getHealth();
                healthiest = poks[i];
            }
        }
        //return correct type
        return healthiest;
    }

    /* - returns true if total health of all
    Pokemons is > 1000 else returns false
    5 marks + 1 tester
     */
    public boolean checkIfReadyForBattle(){
        boolean result = false;
        int totalHealth = 0; //1 mark
        //1 mark
        for(int i = 0; i<poks.length; i++){
            //1 mark
            if(poks[i]!= null){
                totalHealth += poks[i].getHealth();
            }
        }

        if(totalHealth > 1000){ // 1 mark
            result = true;
        }

        return result; // 1 mark
    }

    /* - removes Pokemon with name in the array
     and turns the location into a null value
     4 marks + 1 tester
     */

    public void removePokemon(String name) {
        for(int i = 0; i< poks.length; i++){ //1 mark
            if(poks[i]!=null && //1 mark
                    poks[i].getName().equals(name)){ //1 mark
                poks[i] = null; //1 mark
                System.out.println("Pokemon successfully removed");
            }
        }

    }





}
