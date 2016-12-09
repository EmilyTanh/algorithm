/**
 * Created by NapsterLong on 2016/10/31.
 */
public class QuickSort {

    public static void main(String[] args) {
//        Integer integers[]={3,6,3,5,6,7,1,10,2,7,1,9};
//        Integer resultI[]=quickSort(integers,0,integers.length-1);

//        Float floats[]={1.2f,3.5f,8.3f,2.5f,4.9f,3f,6f,1f,};
//        Float resultF[]=quickSort(floats,0,floats.length-1);

        Double doubles[]={1.23,4.45,3.56,2d,4d,10d,};
        Double resultD[]=quickSort(doubles,0,doubles.length-1);
        for(Double i:resultD){
            System.out.println(i);
        }

    }

    public static <T extends Number> T[] quickSort(T[] array,int min ,int max){
        //选取数组中第一个值为枢轴
        T pivot=array[min];
        //扫描指针，begin为从前往后，end为从后往前
        int begin=min,end=max;
        //下一次从哪一侧扫描
        boolean isLeft=false;

        while(begin!=end){
            if(isLeft){
                if(array[begin].doubleValue()>pivot.doubleValue()){
                    array[end]=array[begin];
                    isLeft=false;
                    end--;
                }else{
                    isLeft=true;
                    begin++;
                }
            }else{
                if(array[end].doubleValue()<pivot.doubleValue()){
                    array[begin]=array[end];
                    isLeft=true;
                    begin++;
                }else{
                    isLeft=false;
                    end--;
                }
            }
        }
        array[begin]=pivot;

        //递归出口 当左侧和右侧都不需要排序时，退出递归
        if((begin==min||begin==min+1)&&(begin==max||begin==max-1)){
            return array;
        }else{
            if(begin==min||begin==min+1){
                quickSort(array,begin+1,max);
            }else if(begin==max||begin==max-1){
                quickSort(array,min,begin-1);
            }else{
                quickSort(array,min,begin-1);
                quickSort(array,begin+1,max);
            }
        }
        return array;
    }
}
