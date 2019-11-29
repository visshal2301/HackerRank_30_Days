package day22BST;

import java.util.Scanner;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
      //Write your code here
     /* int height=0;
      int lHeight=0;
      int rHeight=0;
      if(root==null)
      return height;
      Node lroot=root;
    while(lroot.left!= null){
        lHeight=lHeight+1;
        lroot=lroot.left;
    }
       Node rroot=root;   
      while(rroot.right!= null){
          rHeight=rHeight+1;
          rroot=rroot.right;  
      }*/
            
  // return  height= Math.max(lHeight,rHeight);
    return root == null ? -1 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }	
}
