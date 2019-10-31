package Interface;

public class SecondRandArr implements Creator {
    private int arr[] = new arr[3];

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public SecondRandArr() {
    }

    public SecondRandArr(int[] arr) {
        this.arr = arr;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "SecondRandArr{" +
                "arr=" + java.util.Arrays.toString(arr) +
                '}';
    }

    @java.lang.Override
    public int creator() {
        return 0;
    }
}
