package test;

public class Solution {

    public void reOrderArray(int [] array) {
        if(array==null){
            return ;
        }
        for(int i=1;i<array.length;i++){
            for(int j=i;j>0;j--){
                if((array[j]&1)==1 && (array[j-1]&1)!=1){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }
    }
}