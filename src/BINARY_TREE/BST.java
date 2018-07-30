package BINARY_TREE;

/* Class BST */
class BST 
{
    private BSTNode root;
 
    /* Constructor */
    public BST() 
    {
        root = null;
    }
 
    /* Function to check if tree is empty */
    public boolean isEmpty() 
    {
        return root == null;
    }
 
    /* Functions to insert data */
    public  void  insert(int data) 
    {
        root = insert(root, data);
    }
 
    /* Function to insert data recursively */
    private BSTNode insert(BSTNode node, int data) 
    {
        if (node == null)
            node = new BSTNode(data);
        else 
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
 
   public static BSTNode deleteNode(BSTNode root, int value) {
		if (root == null)
			return null;
		if (root.data > value) {
			root.left = deleteNode(root.left, value);
		} else if (root.data < value) {
			root.right = deleteNode(root.right, value);
 
		} else {
			// if nodeToBeDeleted have both children
			if (root.left != null && root.right != null) {
				BSTNode temp = root;
				// Finding minimum element from right
				BSTNode minNodeForRight = minimumElement(temp.right);
				// Replacing current node with minimum node from right subtree
				root.data = minNodeForRight.data;
				// Deleting minimum node from right now
				deleteNode(root.right, minNodeForRight.data);
 
			}
			// if nodeToBeDeleted has only left child
			else if (root.left != null) {
				root = root.left;
			}
			// if nodeToBeDeleted has only right child
			else if (root.right != null) {
				root = root.right;
			}
			// if nodeToBeDeleted do not have child (Leaf node)
			else
				root = null;
		}
		return root;
	}
 
  // Get minimum element in binary search tree
	public static BSTNode minimumElement(BSTNode root) {
		if (root.left == null)
			return root;
		else {
			return minimumElement(root.left);
		}
	}
 
    /* Functions to count number of nodes */
    public int countNodes() 
    {
        return countNodes(root);
    }
 
    /* Function to count number of nodes recursively */
    private int countNodes(BSTNode r) 
    {
        if (r == null)
            return 0;
        else 
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
 
    /* Functions to search for an element */
    public boolean search(int val) 
    {
        return search(root, val);
    }
 
    /* Function to search for an element recursively */
    private boolean search(BSTNode r, int val) 
    {
        boolean found = false;
        while ((r != null) && !found) 
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else 
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
 
    /* Function for inorder traversal */
    public void inorder() 
    {
        inorder(root);
    }
 
    private void inorder(BSTNode r) 
    {
        if (r != null) 
        {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }
 
    /* Function for preorder traversal */
    public void preorder() 
    {
        preorder(root);
    }
 
    private void preorder(BSTNode r) 
    {
        if (r != null) 
        {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }
 
    /* Function for postorder traversal */
    public void postorder() 
    {
        postorder(root);
    }
 
    private void postorder(BSTNode r) 
    {
        if (r != null) 
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }

 // Recursive Solution
	//To get level of node in a binary tree
	public static int getLevelOfNode(BSTNode root,int key,int level)
	{
		if(root==null)
			return 0;
		if(root.data==key)
			return level;
 
		int result=getLevelOfNode(root.left,key,level+1) ;
		if(result!=0)
		{ 
			// If found in left subtree , return 
			return result;
		}
		result= getLevelOfNode(root.right,key,level+1);
 
		return result;
	}
	
	public static BSTNode lowestCommonAncestor(BSTNode root, BSTNode a, BSTNode b) {
		if(root == null)
			return null;
		if(root.data == a.data || root.data == b.data )
			return root;
 
		BSTNode left=lowestCommonAncestor(root.left,a,b);
		BSTNode right=lowestCommonAncestor(root.right,a,b);
 
		// If we get left and right not null , it is lca for a and b
		if(left!=null && right!=null)
			return root;
		if(left== null)
			return right;
		else
			return left;
 
	}
	
	public static void main(String[] args)
	{
		// Creating a binary tree
		BSTNode rootNode=createBinaryTree();
		System.out.println("BSTNode tree:"+ rootNode);
		System.out.println("Lowest common ancestor for node 5 and 30:");
		BSTNode node5=new BSTNode(5);
		BSTNode node30=new BSTNode(30);
		System.out.println(lowestCommonAncestor(rootNode,node5,node30).data);
		
		//insert 
		BST bst= new BST();
	    BSTNode node33=new BSTNode(33);
	   // bst.insert(node33, 33) ;
	    System.out.println( "search : ->  "+bst.search(30));
	}
	
	
	public static BSTNode createBinaryTree()
	{
 
		BSTNode rootNode =new BSTNode(40);
		BSTNode node20=new BSTNode(20);
		BSTNode node10=new BSTNode(10);
		BSTNode node30=new BSTNode(30);
		BSTNode node60=new BSTNode(60);
		BSTNode node50=new BSTNode(50);
		BSTNode node70=new BSTNode(70);
		BSTNode node5=new BSTNode(5);
		BSTNode node45=new BSTNode(45);
		BSTNode node55=new BSTNode(55);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		node10.left=node5;
		node50.right=node55;
		return rootNode;
	}
}
 