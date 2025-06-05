public class MyArrayList {
    private int data[];
    private int size;
    private int capacity;
    
    public MyArrayList(){
        capacity=10;
        data= new int[capacity];
        size=0;
    }
    public void add(int value){
        if(size==capacity){
            resize();
        }
        data[size++]=value;
    }
    public int get(int idx){
        if(idx<0 || idx>=size) throw new IndexOutOfBoundsException();
        return data[idx];
    }
    public void remove(int idx){
        if(idx<0 || idx>=size) throw new IndexOutOfBoundsException();
        for(int i=idx;i<size;i++){
            data[i]=data[i+1];
        }
        size--;
    }
    public int size(){
        return size;
    }
    public void resize(){
        capacity*=2;
        int newData[]=new int[capacity];
        for(int i=0;i<size;i++){
            newData[i]=data[i];
        }
        data=newData;
    }
    public static void main(String[] args) {
        MyArrayList list= new MyArrayList();
        list.add(5);
        list.add(10);
        list.add(15);
    }
}
