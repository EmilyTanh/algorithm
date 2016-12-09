/**
 * 选择排序，将待排序数组数据进行比较，每次都找到这一次数据中最小的数据，然后将最小的数据放进另一个有序数组里
 * 然后之后每次找到的最小的数据都一次放进去，
 * 最后这个有序数组就是得到的结果
 * Created by admin on 2016/11/2.
 */
public class ChooseOrder {

    public static void main(String[] args){
        int a[] = new int[]{12,43,56,23,11,32,21,534,12,34,65,64,65,2,23,43,5,76,4,8,78,98,68};
//        int a[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//        int a[] = new int[]{20,19,18,17,16,15,14,13,135,11,10,9,8,7,6,5,4,3,2,1};

        for(int i=0;i<a.length;i++){
            int index = new ChooseOrder().findMin(i, a);
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    //找到每一次一组中最小的数据
    public int findMin(int i, int[] a){
        int min = a[i];
        int index = i;
        for(int j=i;j<a.length;j++){
            if(min > a[j]){
                min = a[j];
                index = j;
            }
        }
        return index;
    }
}
