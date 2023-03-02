package Unit4;

public class PokemonTrainer {
    private Pokemon[] poks;
    private int index = 0;

    public PokemonTrainer(int max){
        poks = new Pokemon[max];
    }

    public void add(Pokemon p){
        boolean added = false;
        for(int i=0; i<poks.length; i++ ){
            if(poks[i] == null && added == false){
                poks[i] = p;
                added = true;
                i=poks.length;
            }
        }
        if(added==false){
            System.out.println("The pokemons' list is full");
        }
    }

    public Pokemon[] getFastestPokemons (int speed){
        //list of pokemons faster than speed
        Pokemon[] temp = new Pokemon[poks.length];
        int idx = 0;
        for(Pokemon p : poks){
            if(p != null && p.getSpeed() > speed){
                temp[idx] = p;
                idx++;
            }
        }
        Pokemon[] fastest = new Pokemon[idx];
        for(int i = 0; i < idx; i++){
            fastest[i] = temp[i];
        }
        return fastest;
    }


    public void list(String sp){
        //print non null with species sp
        //calculate total health of those pokemons
        int totalHealthCount = 0;
        System.out.format("%-15s %-15s %-15s %-15s",
                "Name", "Health", "Speed", "Species" + "\n");
        for(int i=0; i<poks.length;i++){
            if(poks[i]!=null){
                if(poks[i].getSpecies().equals(sp)){
                    System.out.println(poks[i]);
                    totalHealthCount+=poks[i].getHealth();
                }
            }
        }
        System.out.format("%-15s %-15s" , "Total Health " , totalHealthCount);

    }

    public Pokemon search(String name){
        for(int i =0; i<poks.length; i++){
            if(poks[i]!=null && poks[i].getName().equals(name)){
                return poks[i];
            }
        }
        return null;
    }
}
