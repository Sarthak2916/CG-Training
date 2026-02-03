package feature_3_2_26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphAdjacencyList {

    public static void main(String[] args){
        int n=4,e=5;
        int direction =1;
        int [][] arr = {{0,1},{0,3},{1,3},{1,2},{2,3}};
        HashMap<Integer, List<Integer>> list = adjList(n,e,arr,direction);
        System.out.print(list);
    }
    public static HashMap<Integer, List<Integer>> adjList(int n, int e, int [][]arr,int direction){
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        for(int i=0;i<e;i++){
            int u=arr[i][0],v=arr[i][1];
            if(mp.containsKey(u)){
                mp.get(u).add(v);
                if(mp.containsKey(v) && direction==0) mp.get(v).add(u);
                else if(direction==0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(u);
                    mp.put(v,temp);
                }
            }else{
                List<Integer> temp = new ArrayList<>();
                temp.add(v);
                mp.put(u,temp);
                if(mp.containsKey(v) && direction==0) mp.get(v).add(u);
                else if(direction==0){
                    temp = new ArrayList<>();
                    temp.add(u);
                    mp.put(v,temp);
                }
            }
        }
        return mp;
    }
}
