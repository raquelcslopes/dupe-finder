import java.util.*;

public class DupeFinder {
    List<Fruit> fruits;

    public DupeFinder(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public int checkDupes() {
        int listSize = fruits.size();
        int counter = 0;

        Set<Fruit> hashlist = new HashSet<>(fruits);
        int hashSize = hashlist.size();

        if (listSize == hashSize) {
            return 0;
        }
        return listSize - hashSize;
    }

    public List<Fruit> getDupes() {
            Set<Fruit> set = new HashSet<>(fruits);
            List<Fruit> dupes = new ArrayList<>();


            Iterator<Fruit> iterator = set.iterator();
            while(iterator.hasNext()){
                Fruit element = iterator.next();
                if( Collections.frequency(fruits,element)>1){
                    for (int i = 0; i < Collections.frequency(fruits,element)-1; i++) {
                        dupes.add(element);

                    }
                }
            }
            return dupes;

        }

    public List<Fruit> sortDupe(){
        List<Fruit> dupes = getDupes();

        Collections.sort(dupes);

        return dupes;

    }
}
