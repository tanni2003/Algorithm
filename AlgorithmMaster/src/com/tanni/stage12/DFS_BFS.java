//#1260
package com.tanni.stage12;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class DFS_BFS {
	static int num;
	static boolean[] visited;
	static int[][] graph;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		visited = new boolean[num+1];
		int ver = sc.nextInt();
		graph = new int[num+1][num+1];
		int start = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i<=ver; i++) {
			int dot1 = sc.nextInt();
			int dot2 = sc.nextInt();
			sc.nextLine();
			graph[dot1][dot2] = graph[dot2][dot1] = 1;
		}
		
		dfs(start);
		
		System.out.println();
		
		for(int i = 0; i<=num;i++) {
			visited[i] = false;
		}
		
		bfs(start);

	}
	public static void dfs(int i){
        visited[i] = true;
        System.out.print(i+" ");
          
        for(int j=1; j<=num; j++){
            if(graph[i][j]==1&& visited[j]==false){
                dfs(j);
            }
        }
    }

	public static void bfs(int i) {
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[i] = true;
		System.out.print(i + " ");
		queue.offer(i);
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(int j = 1; j<=num; j++) {
				if(visited[j]==false && graph[temp][j]==1) {
					queue.offer(j);
					visited[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
}
