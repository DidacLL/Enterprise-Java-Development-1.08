public class IntArrayList implements IntList{
    private int[] list;
    private int counter;
//IntArrayList should store numbers in an array with a length of 10 by default.
// When the add method is called, you must first determine if the array is full. If it is, create a new array that is 50% larger,
//  move all elements over to the new array and add the new element. (for example, an array of length 10 would be increased to 15)
    public IntArrayList() {
        list= new int[10];
        counter=0;
    }

    @Override
    public void add(int val) {
        if(counter>=list.length)increaseList();
        this.list[counter]=val;
        counter++;

    }

    private void increaseList() {
        int[] auxList= new int[(list.length/2)*3];
        for (int i=0;i< list.length;i++) auxList[i]=this.list[i];
        this.list=auxList;
    }

    @Override
    public int get(int id) {
        return list[id];
    }
}
