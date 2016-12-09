/**
 * 快速排序
 */
public class QuickOrder {

    public static void main(String[] args) {
        int a[] = {12, 5, 167, 23, 8, 87, 1, 43, 5, 65, 17, 33, 65, 8, 54, 87};
        new QuickOrder().sort(a, 0, a.length-1);

        System.out.print(a.toString());
    }

    public int qOrder(int a[],int l,int r){
        int i = l;
        int j = r;
        int temp = a[i];
        while(i < j){
            if(temp < a[j] && i < j){//当基数与最右边的数据比较，当没有找到比基数小的，就索引减一
                j--;
            }else{//当基数与最右边的数据比较，当找到比基数小的，就将这个数放在基数原有的位置，然后空出那个右边的位置
                a[i] = a[j];
                i++;

                while (temp > a[i] && i < j){//现在与基数比较的是左边的数据，若没有找到比基数大的，就索引加一
                    i++;
                }
                if(temp <= a[i] && i < j){//现在与基数比较的是左边的数据，若找到比基数大的，就将这个数据放在之前空出来的右边的位置
                    a[j] = a[i];
                    j--;
                }
            }
            if (i == j){//每一次比较的出口，当两边的索引相等时，直接将这个位置的值变为当前基数值
                a[i] = temp;
                break;
            }
        }
       return i;
    }

    public void sort(int a[],int l,int r){
        int i = 0;
        if(l < r){
            i = qOrder(a, l, r);//每次找到中间那个基数的索引
            sort(a,l,i-1);//继续排序这个索引值左边的数据
            sort(a,i+1,r);//索引值右边的数据
        }
    }
}
