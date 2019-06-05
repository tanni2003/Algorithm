//#11725
package com.tanni.stage23;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class ParentDfs {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int i, j;
		
		//연결정보
		ArrayList<Integer>[] list = new ArrayList[n+1];
		//초기화
		for(i = 0; i<=n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		//연결
		for(i = 0; i<n-1; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		int[] parents = new int[n+1];
		//dfs
		dfs(list, parents, n, 1, 0);
		for(j = 2; j<n+1; j++) {
			System.out.println(parents[j]);
		}
		
		
	}
	private static void dfs(ArrayList<Integer>[] list, int[] parents, int n, int start, int parent) {
		parents[start] = parent;
		for(int item: list[start]) {
			if(item != parent) dfs(list, parents, n, item, start);
		}
	}
}
