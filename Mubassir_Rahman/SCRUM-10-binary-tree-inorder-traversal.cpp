#include<bits/stdc++.h>
using namespace std;

//Node sturcture that contains data and pointer of left and right
struct Node{
int data;
struct Node *left,*right;
Node(int v){
    data=v;
    left=right=NULL;
}
};
//Fuction for tree inorder traversal recursively
void Print_inorder(struct Node* node)
{
  if(node==NULL)
  return;
  Print_inorder(node->left);
  cout<<node->data<<" ";
  Print_inorder(node->right);

}
int main()
{
    struct Node* root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(3);
    root->left->left = new Node(4);
    root->left->right = new Node(5);
    root->right->right = new Node(6);
 
    // Function call
    cout << "Inorder traversal of binary tree is: \n";
    Print_inorder(root);
 
    return 0;
}