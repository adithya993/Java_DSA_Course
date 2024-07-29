package adi.practice.kunalkushwaha.sorting;

import adi.practice.kunalkushwaha.heaps.HeapsExample;

import java.util.ArrayList;

public class HeapSort<T extends Comparable<T>> extends HeapsExample {

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while(!list.isEmpty()){
            data.add((T) this.remove());
        }
        return data;
    }

    public static void main(String[] args) throws Exception{
        HeapSort<Integer> hp = new HeapSort<>();
        hp.insert(34);
        hp.insert(45);
        hp.insert(22);
        hp.insert(89);
        hp.insert(76);

        System.out.println(hp.remove());

        System.out.println(hp.heapSort());
    }
}
