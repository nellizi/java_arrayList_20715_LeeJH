package com.ll.exam;

public class ArrayList {
    public int size = 0;
    public int [] datum = new int[2];
    public int size() {

        return size;
    }

    public void add(int data) {
        sizeUpIfFull();

        datum[size] = data;
        size++;
    }

    private void sizeUpIfFull() {
        if(sizeFull()){
            int[] ndatum = new int[datum.length * 2];
            for(int i=0; i<datum.length; i++){
                ndatum[i]=datum[i];
            }
            datum = ndatum;
        }
    }

    public boolean sizeFull(){
        return size==datum.length;
    }

    public int get(int index) {
        return datum[index];
    }

    public void removeAt(int index) {
        for(int i = index; i<size; i++){
            datum[i] = datum[i+1];
        }
        size--;
    }

    public int getArrayLength() {
        return datum.length;
    }
}
