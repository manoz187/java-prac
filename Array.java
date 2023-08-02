public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {

        if (items.length == count) {
            int[] newitems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newitems[i] = items[i];
            }

            items = newitems;
        }
        items[count] = item;
        count++;

    }


    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {

            items[i] = items[i + 1];

        }
        count--;

    }


    public int indexOf(int input){


        for (int i = 0 ; i < count;i++){
            if (items[i] == input){
                return i;
            }

        } return -1;

        }



    public void printfn() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}






