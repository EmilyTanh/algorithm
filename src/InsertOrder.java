/**
 * 插入排序，将待排序的数据分为两个部分，有序部分和无序部分
 * 有序部分最开始直接取待排序的第一个数据作为有序的第一个数据
 * 然后无序部分中的数据一次和有序部分的最后一个数据开始进行对比
 * Created by admin on 2016/11/2.
 */
public class InsertOrder {
    public static void main(String[] args){
//        int a[] = new int[]{12,43,56,23,11,32,21,534,12,34,65,64,65,2,23,43,5,76,4,8,78,98,68};
        int a[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int b[] = new int[a.length];//有序数组
        int c[] = new int[a.length-1];//无序数组

        new InsertOrder().iOrder(a,b,c);
        for(int i = 0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }

    public void iOrder(int a[], int b[], int c[]){
        b[0] = a[0];
        for (int j=0;j<a.length-1;j++){//将待排序数据中除了第一个全部复制到无序数组中
            c[j] = a[j+1];
        }
        for(int k=0;k<=c.length-1;k++){
            for(int l=k;l>=0;){
                if(b[l] > c[k] && l >= 0){//当无序数组中的数据比有序数组中的最后一个数据小，
                    int temp = b[l];//则将有序数组中比较的数变成无序数组中的数据，
                    b[l] = c[k];//有序数组中的被比较的数据往后移一位
                    b[l+1] = temp;
                    l--;
                }else{//当无序数组中的数据大于等于有序数组中的最后一个数据
                    b[l+1] = c[k];//就直接将这个数据放在有序数组中的最后一个位置
                    break;
                }
            }

        }
    }
}
