/**
 * 冒泡排序
 * Created by admin on 2016/11/2.
 */
public class BubbleOrder {

    public static void main(String[] args){
//        int a[] = new int[]{12,43,56,23,11,32,21,534,12,34,65,64,65,2,23,43,5,76,4,8,78,98,68};
//        int a[] = new int[]{20,19,18,17,16,15,14,13,135,11,10,9,8,7,6,5,4,3,2,1};
        int a[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        new BubbleOrder().bOrder(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    //冒泡排序
    public void bOrder(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
