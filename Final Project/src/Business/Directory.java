package Business;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * a generate class for managing item list
 *
 * @author Joseph Yuanhao Li
 * @date 4/28/21 00:55
 */
public class Directory<T> implements Iterable<T>{
    private List<T> list;

    public Directory(){
        list = new ArrayList<>();
    }

    public List<T> getList() {
        if(list == null) list = new ArrayList<>();
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void sort(Comparator comparator){
        list.sort(comparator);
    }

    public void add(T t){
        list.add(t);
    }

    public T get(int index){
        if(index >= list.size() ) throw  new IllegalArgumentException("Directory - index beyond bound");
        return list.get(index);
    }

    public boolean remove(int index){
        if(index >= list.size() ) throw  new IllegalArgumentException("Directory - index beyond bound");
        return remove(list.get(index));
    }

    public boolean remove(T t){
        return list.remove(t);
    }

    public Directory(List<T> list){
        this.list = list;
    }


    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
