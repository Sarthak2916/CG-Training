package feature_31_1_26;

import java.util.Arrays;

public class MergeSort {

    static void combine(int l, int mid, int h, int a[]){
        int i=l,j=mid+1;
        int[] t= new int[h-l+1];
        int x=0;
        while(i<=mid && j<=h){
            if(a[i]<=a[j]) t[x++]=a[i++];
            else t[x++]=a[j++];
        }

        while(i<=mid)
            t[x++]=a[i++];
        while(j<=h)
            t[x++]=a[j++];
        for(int z=0;z<t.length;){
            a[l++]=t[z++];
        }
    }
    static void merge(int l, int h, int a[]){
        if(l<h){
            int mid=l+(h-l)/2;
            merge(l,mid,a);
            merge(mid+1,h,a);
            combine(l,mid,h,a);
        }
    }
    public static void main(String[] args) {

        int a[]={4,3,2,5,7,8,1};
        merge(0,a.length-1,a);
        System.out.println(Arrays.toString(a));

    }
}
