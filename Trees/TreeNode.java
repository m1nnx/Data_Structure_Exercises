public class TreeNode
{
    TreeNode left;
    TreeNode right;
    Studentt data;
    
  //normal constructor to initialize data to d and make this a leaf node
    public TreeNode(Studentt d)
    {
        left=right=null;
        data = d;
    }
	 
	// Insert a TreeNode into a Tree that contains nodes. Ignore duplicate values.
   public void insert( Studentt d )
   {
      if ( d.getId() < data.getId() )
      {
         if ( left == null )
            left = new TreeNode( d );
         else
            left.insert( d );
      }
		
      else 
        if ( d.getId() > data.getId() ) 
        {
           if ( right == null )
               right = new TreeNode( d );
           else
               right.insert( d );
        }
    }
}
