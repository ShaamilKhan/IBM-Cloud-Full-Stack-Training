import java.util.*;

public class collection {
    public static void main(String[] args){
        List <Integer> list = new ArrayList<>();  
        list.add(1);
        list.add(3);
        list.add(46);
        list.add(-3);
        list.add(78);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
}
