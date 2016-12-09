/**
 * 希尔排序
 * 根据待排序数组分为若干个子序列进行排序
 * 各个子序列的增量相同
 * Created by admin on 2016/11/2.
 */
public class ShellOrder {

    public static void main(String[] args){
        int a[] = new int[]{12,43,56,23,11,32,21,534,12,34,65,64,65,2,23,43,5,76,4,8,78,98,68};
//        int a[] = new int[]{1,2,3,4,5,6,7,8,9,12,14,55,10};
//        int a[] = new int[]{20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,21};
//        int a[] = new int[]{21,43,11,32,14,54,65,-20,55,34,534,132,5,456,5,76,-22};
        int i = a.length/2;
        while(i>=1){
            a = new ShellOrder().sOrder(a,i);
            i = i/2;
        }
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }

    public int[] sOrder(int[] a, int incre){

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j=j+incre){
                if(j>=a.length-incre){
                    break;
                }
                if(a[j] > a[j+incre]){
                    int mark = a[j+incre];
                    a[j+incre] = a[j];
                    a[j] = mark;
                }
            }
        }
        return a;
    }
}
