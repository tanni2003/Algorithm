//#11725
package com.tanni.stage23;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class ParentBfs {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		//인접리스트
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int[] parents = new int[n+1];
		for(int i = 0; i<=n; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		//연결설정
		int a, b;
		for(int i = 1; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		//bfs
		int start = 1;
		bfs(start, list, parents, n);
		for(int i = 2; i<=n; i++) {
			System.out.println(parents[i]);
		}
	}
	private static void bfs(int start, ArrayList<ArrayList<Integer>> list, int[] parents, int n) {
		LinkedList<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		parents[start] = 1;
		while(!q.isEmpty()) {
			int parent = q.poll();
			for(int item: list.get(parent)) {
				if(parents[item] == 0) {
					parents[item] = parent;
					q.offer(item);
				}
			}
		}
	}
}
