import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
/**
 * This class represents a Used Car Lot
 *
 * @author Michael Tsisin
 */
public class UsedCarLot {
    /** The Cars in the Used car lot */
    private ArrayList<Car> inventory;

    /**
      * Instantiates a UsedCarLot object and
      * initializes the inventory to an empty ArrayList
      */
    public UsedCarLot(){
        inventory = new ArrayList<Car>();
    }
    /**
      * Returns the inventory of the used car lot
      *
      * @return The inventory
      */
    public ArrayList<Car> getInventory(){
        return inventory;
    }
    /**
      * Adds a Car to the end of the inventory
      *
      * @param carToAdd the Car to add
      */
    public void addCar(Car carToAdd){
        inventory.add(carToAdd);
    }
    /**
      * Swaps the Car at idx1 with the Car at idx2 in inventory and returns true;
      * however, if either idx1 or idx2 exceed the bounds of the inventory or is negative,
      * no changes are made to the inventory and false is returned.
      *
      * @param x The index of the first Car to swap
      * @param y The index of the second Car to swap
      * @return True if the swap was successful, false if the swap was not successful
      */
    public boolean swap(int x, int y){
        if(x < inventory.size() && y < inventory.size() && x  >= 0 && y >=0){
            Car car1 = inventory.get(x);
            Car car2 = inventory.get(y);
            inventory.set(y,car1);
            inventory.set(x,car2);
            return true;
        }
        else {
            return false;
        }
    }
    /* Adds a Car to the inventory list at the index specified
            by indexToAdd; this method increases the size of inventory by 1
            PRECONDITION: 0 <= indexToAdd < inventory.size()
            DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
            like you did the other addCar method; also note that this method is void
        */
    /**
     * Adds a Car to the inventory list at the index specified
      * by indexToAdd; this method increases the size of inventory by 1
      * <p>
      * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
      *
      * @param indexToAdd The index in the inventory to add the new Car
      * @param carToAdd The Car to add
      */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd,carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */
    /**
      * "Sells" the Car located at indexOfCarToSell which
      * removes it from the inventory list and shifting the remaining
      * Cars in the inventory list to the left to fill in the gap;
      * the method returns the Car that is being "sold" (removed from lot)
      * and reduces the size of inventory by 1
      * <p>
      * PRECONDITION: indexOfCarToSell &lt; inventory.size()
      *
      * @param indexOfCarToSell The index of the Car to sell
      * @return the Car that is "sold"
      */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */
    /**
      * "Sells" the Car located at indexOfCarToSell,
      * but instead of removing it and shifting the inventory
      * list to the left, REPLACE the Car at indexOfCarToSell
      * with NULL, thus creating an "empty parking spot" on the lot;
      * this method returns the Car that is being "sold" (replaced with null),
      * but does NOT reduce the size of the inventory
      * <p>
      * PRECONDITION: indexOfCarToSell &lt; inventory.size()
      *
      * @param indexOfCarToSell The index of the Car to sell
      * @return the Car that is "sold"
      */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car lol = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return lol;

    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    /**
      * Moves Car located at index indexOfCarToMove to index destinationIndex;
      * if destinationIndex > indexOfCarToMove, moves the Car to the right in
      * inventory; if destinationIndex &lt; indexOfCarToMove, moves the
      * Car to the left in the inventory. All other cars in the inventory
      * are shifted accordingly.


      * <p>
      * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
      * destinationIndex &lt; inventory.size()
      *
      * @param indexOfCarToMove The index of the Car to move
      * @param destinationIndex The index where the Car should be moved
      */
    public void moveCar(int indexOfCarToMove, int destinationIndex)

    {
        Car lol = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, lol);
    }


}
