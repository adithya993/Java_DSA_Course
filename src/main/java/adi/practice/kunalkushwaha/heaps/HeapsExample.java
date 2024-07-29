package adi.practice.kunalkushwaha.heaps;

//Example of Min Heap - Top most element is the smallest
// This is a version of Priority Queue using Heaps

import java.util.ArrayList;
public class HeapsExample<T extends Comparable<T>> {
    public ArrayList<T> list;
    public HeapsExample(){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        return (index - 1)/2;
    }

    private int left(int index){
        return (index * 2) + 1;
    }

    private int right(int index){
        return (index * 2) + 2;
    }

    public void insert(T value){
        list.add(value);
        //doing upheap, going from bottom to up
        upheap(list.size() - 1);
    }
    private void upheap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
        }
        upheap(p);
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Heap is Empty");
        }

        T temp = list.get(0);

        T last = list.remove(list.size() - 1);

        if(!list.isEmpty()){
            list.set(0, last);
        }

        //doing downheap, going from up to bottom
        downheap(0);

        return temp;
    }

    private void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }

        if(min != index){
            swap(index, min);
            downheap(min);
        }
    }
}
