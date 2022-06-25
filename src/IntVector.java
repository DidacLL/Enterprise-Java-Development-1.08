public class IntVector implements IntList{
    private int[] list;
    private int counter;

    public IntVector() {
        list= new int[20];
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
