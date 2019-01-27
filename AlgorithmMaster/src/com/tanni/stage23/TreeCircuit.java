//#1991
package com.tanni.stage23;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TreeCircuit {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int node = Integer.parseInt(in.readLine());
		Tree t = new Tree();
		char[] data;
		for(int i = 0; i<node; i++) {
			data = in.readLine().replaceAll(" ", "").toCharArray();
			t.add(data[0], data[1], data[2]);
		}
		t.preorder(t.root);
		System.out.println();
		t.inorder(t.root);
		System.out.println();
		t.postorder(t.root);
		in.close();
	}
}

class Node{
	char data;
	Node left, right;
	public Node(char data) {
		this.data = data;
	}
}

class Tree{
	Node root; //root 노드
	public void add(char data, char leftData, char rightData) {
		if(root==null) { //root 노드가 비어있는 경우
			if(data != '.') {
				root = new Node(data); //노드 생성 후 데이터 삽입
			}
			if(leftData != '.') {
				root.left = new Node(leftData);
			}
			if(rightData != '.') {
				root.right = new Node(rightData);
			}
		}
		else { //root가 비어있지 않은 경우 들어갈 위치 탐색
			search(root, data, leftData, rightData);
		}
	}
	public void search(Node root, char data, char leftData, char rightData) {
		if(root==null) { //재귀를 사용하므로 도착한 노드가 null이면 종료(삽입 위치를 찾지 못한 경우)
			return;
		}
		else if(root.data == data) { //위치를 찾은 경우
			if(leftData != '.') {
				root.left = new Node(leftData);
			}
			if(rightData != '.') {
				root.right = new Node(rightData);
			}
		}
		else { //위치를 아직 찾지 못했고, 탐색할 노드가 남아있는 경우
			search(root.left, data, leftData, rightData); //왼쪽 재귀 탐색
			search(root.right, data, leftData, rightData); //오른쪽 재귀 탐색
		}
	}
	//중앙>좌>우
	public void preorder(Node root) {
		System.out.print(root.data);
		if(root.left != null) {
			preorder(root.left);
		}
		if(root.right != null) {
			preorder(root.right);
		}
	}
	//좌>중앙>우
	public void inorder(Node root) {
		if(root.left != null) {
			inorder(root.left);
		}
		System.out.print(root.data);
		if(root.right != null) {
			inorder(root.right);
		}
	}
	//좌>우>중
	public void postorder(Node root) {
		if(root.left != null) {
			postorder(root.left);
		}
		if(root.right != null) {
			postorder(root.right);
		}
		System.out.print(root.data);
	}
}