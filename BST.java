

public class BST extends BinaryTree 
{
    public BST()
    {
        super();
    }

    @Override 
    public void add(int value)
    {
        if(root == null)
        {
            root = new Node(value);
        }
        else
        {
            add(value, root);
        }
    }

    private void add(int value, Node y)
    {
        if (value == y.getElement())
        {
            return;
        }
        else if(value < y.getElement())
        {
            if(y.getLeft() == null)
            {
                y.setLeft(new Node(value));
            }
            else
            {
                add(value, y.getLeft());
            }
        }
        else
        {
            if(y.getRight() == null)
            {
                y.setRight(new Node(value));
            }
            else
            {
                add(value, y.getRight());
            }
        }
    }


    @Override
    public Node search(int value)
    {
        return search(value, root);
    } 

    private Node search(int value, Node y)
    {
        if (y == null) 
        {
            return null;
        }
        if(value == y.getElement())
        {
            return y;
        }
        else if (value < y.getElement())
        {
            return search(value, y.getLeft());
        }
        else
        {
            return search(value, y.getRight());
        }
    }
}