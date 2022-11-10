import java.util.*;

public class BSTApp
{
    public static void main(String [] args)
    {
        //(a) Create a TREE named studentTree
        BSTree studentTree = new BSTree();
        //input 5 students into the list
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<2; i++)
        {
            System.out.print("Enter the ID of the student: ");
            int sIdStd = sc.nextInt();
            System.out.print("Enter the name of the student: ");
            String nameStd = sc.next();
            System.out.print("Enter the part of the student: ");
            int sPart = sc.nextInt();
            System.out.print("Enter the CGPA of the student: ");
            double sCgpa = sc.nextDouble();

            Studentt stud = new Studentt(sIdStd, nameStd, sPart, sCgpa);

            //(b) Insert your objects into the studentTree
            studentTree.insertNode(stud);
        }

        //(c) Traverse the tree & display the output for pre-order, in-order and post-order traversal.
        System.out.println("\nPre-order traversal:");
        studentTree.PreOrder();
        System.out.println("\nIn-order traversal:");
        studentTree.InOrder();
        System.out.println("\nPost-order traversal:");
        studentTree.PostOrder();
        //(d) Display ALL the objects stored in the studentTree in Descending Order
        System.out.println("\nDescending order;");
        studentTree.descOrder();
        //(e) Display ALL the object stored in the studentTree
        System.out.println("\nDisplay all students:");
        studentTree.display();
        //(f) Display the number of students from Part 4
        System.out.println("\nNumber of part 4student:");
        studentTree.countPart4("AHMAD");
        //(g) Display the number of students who got dean list
        System.out.println("\nNumber of dean list :"+studentTree.countDL());
    } // end main
} // end class