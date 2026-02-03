package feature_3_2_26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphDFS {

    public static void main(String[] args){
        int n=11,e=14;
        int direction =0;
//        int [][] arr = {{0,1},{0,3},{1,3},{1,2},{2,3}};
        int[][] arr = {{9,7},{5,4},{4,2},{2,1},{1,4},{3,0},{10,3},{10,0},{8,10},{8,6},{6,7},{9,8},{7,8},{3,7}};
        HashMap<Integer, List<Integer>> list = adjList(n,e,arr,direction);
//        System.out.print(list);
        boolean[] vis = new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!vis[i])  dfs(i,list,vis);

        }
        System.out.print("\n"+count);
    }
    public static void dfs(int src,HashMap<Integer, List<Integer>> list ,boolean[] vis){
        vis[src] = true;
        System.out.print(src+" ");
        if(list.get(src)==null);
        else {
            for (int t : list.get(src)) {
                if (!vis[t]) {
                    dfs(t, list, vis);
                }
            }
        }
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
