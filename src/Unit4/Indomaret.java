package Unit4;

public class Indomaret {
    private Item[] items = new Item[1000];
    private int index = 0;

    public void addItem (Item i){
        if(index < items.length){
            items[index] = i;
            index++;
        }
    }

    public Item search(String itemName){
        //option 1
        for(int i = 0; i < index; i++){
            if(items[i].getItemName().equals(itemName)){
                return items[i];
            }
        }

        //option 2
        for(int i= 0; i<items.length; i++){
            if(items[i]!= null && items[i].getItemName().equals(itemName)){
                return items[i];
            }
        }
        return null;
    }

    public void print(){
        System.out.println("Indomaret (All Items)");
        int totalItems = 0;
        double totalPrice = 0;
        for(int i = 0; i < items.length; i++){
            if(items[i] != null){
                System.out.println(items[i]);
                totalItems += items[i].getQuantity();
                totalPrice += items[i].getItemPrice()*
                        items[i].getQuantity();
            }
        }
        System.out.format("%-30s %-15s %-10s%n", "TOTAL",
                totalItems, String.format("%.2f" ,totalPrice));

    }

    public Item[] getItemsWithClassification(String classification){
        Item[] temp = new Item[1000];
        int indexTemp = 0;
        for(int i = 0; i < index; i++){
            if(items[i].getClasss().equals(classification)){
                temp[indexTemp] = items[i];
                indexTemp++;
            }
        }
        Item[] result = new Item[indexTemp];
        for(int i = 0; i<indexTemp; i++){
            result[i] = temp[i];
        }

        return result;
    }


    public Item getMostExpensiveItem(){
        double maxPrice = items[0].getItemPrice();
        int maxIndex = 0;
        for(int i = 1; i < index; i++){
            if(items[i].getItemPrice() > maxPrice){
                maxPrice = items[i].getItemPrice();
                maxIndex = i;
            }
        }
        return items[maxIndex];
    }

    public Item getCheapestItem(){
        double minPrice = items[0].getItemPrice();
        int minIndex = 0;
        for(int i = 1; i < index; i++){
            if(items[i].getItemPrice() < minPrice){
                minPrice = items[i].getItemPrice();
                minIndex = i;
            }
        }
        return items[minIndex];
    }

    public boolean checkIfNeedAdditionalStorage(){
        //option 1
        int countItems = 0;
        for(int i = 0; i < index; i++){
            countItems += items[i].getQuantity();
        }
        if(countItems > 1000){
            return true;
        }
        return false;

        //option 2
    }

    public void removeItem(String itemName){
        for(int i = 0; i< items.length; i++){
            if(items[i] != null && items[i].getItemName().equals(itemName)){
                items[i] = null;

            }
        }
    }






}
