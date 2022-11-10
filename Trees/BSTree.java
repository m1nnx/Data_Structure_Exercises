public class BSTree
{
   TreeNode root;

   // Construct an empty Tree
   public BSTree() 
   { root = null; }

   // Insert a new node in the binary search tree.
   // If the root node is null, create the root node here.
   // Otherwise, call the insert method of class TreeNode.
   public void insertNode( Studentt d )
   {
      if ( root == null )
         root = new TreeNode( d );
      else
         root.insert( d );
   }
	
	 // Preorder Traversal
   public void PreOrder()
   { 
       RecurPreOrder( root );
    }

   // Recursive method to perform preorder traversal
   private void RecurPreOrder( TreeNode node )
   {
      if ( node == null )
         return;

      System.out.print( node.data + " " );
      RecurPreOrder( node.left );
      RecurPreOrder( node.right );
   }
	
	 // Inorder Traversal
   public void InOrder()
   {
       RecurInOrder( root );
    }

   // Recursive method to perform inorder traversal
   private void RecurInOrder( TreeNode node )
   {
      if ( node == null )
         return;

      RecurInOrder( node.left );
      System.out.print( node.data + " " );
      RecurInOrder( node.right );
   }
	
	// Postorder Traversal
   public void PostOrder()
      {
          RecurPostOrder( root ); 
        }

   // Recursive method to perform postorder traversal
   private void RecurPostOrder( TreeNode node )
   {
      if ( node == null )
         return;

      RecurPostOrder( node.left );
      RecurPostOrder( node.right );
      System.out.print( node.data + " " );
   }
   
   public void descOrder()
   {
      RecurdescOrder(root);      
   }
   
   private void RecurdescOrder(TreeNode node)
   {
      if (node==null)
         return;
      else
         RecurdescOrder(node.right); 
         
      System.out.println(node.data);
      RecurdescOrder(node.left);
   }
   
   public void display()
   {  
      
      print(root);
     
   }
   
   private void print(TreeNode node)
   {  
      if(node==null)
         return;
      else
        System.out.print( node.data + " " );
      print( node.left );
      print( node.right );
   }
   
   public String countPart4(String name)
   {  
      
       return countP4(name);
   }
   
   private int countP4(TreeNode node,String name)
   {
      if(node==null)
         return 0;
      else if(node.data.getName().equalsIgnoreCase(name))
         return( 1 + countP4(node.left,name) + countP4(node.right,name));
      else
        return( countP4(node.left, name) + countP4(node.right,name));
      
   }
   
   public int countDL()
   {
      return countD(root);
   }
   
   public int countD(TreeNode node)
   {
      if(node==null)
         return 0;
      else if(node.data.getCgpa() >= 3.5)
         return 1 + countD(node.left) + countD(node.right);
      else
        return countD(node.left) + countD(node.right);
   }

   
   
}
