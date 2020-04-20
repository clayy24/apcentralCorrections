
/**
 * Write a description of class WrongAnswers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class WrongAnswers
{
    public static void main()
    {
        ArrayList list1 = new ArrayList();
        list1.add("1");
        list1.add("3");
        list1.add("3");
        list1.add("1");
        
        ArrayList list2 = new ArrayList();
        list2.add("5");
        list2.add("5");
        list2.add("3");
        list2.add("1");
        
        if(q10(list1, list2))
        {
            System.out.println("TRUEE");
        }
        else
        {
            System.out.println("FALSEE");
        }
        
    }
    public static void q2()
    {
        ArrayList<Integer> numbers = new ArrayList(); // works
        //ArrayList<Integer> numbers = new ArrayList<Integer>; doesn't work
        ArrayList<Integer> numbers1 = new ArrayList<Integer>(); //works
    }
    
    public static boolean q10(ArrayList<Integer> firstList,ArrayList<Integer> secondList)
    {
        for (int j = 0; j < firstList.size() / 2; j++)

        {
            //System.out.println(secondList.size());
            if (firstList.get(j) != secondList.get(secondList.size() - 1 - j))

            {

                return false;

            }

        }

        return true;
    }
    
    public static void q14()
    {
        int result = -1;
        int arr[] = {1, 2, 3, 4};
        int target = 3;

        for (int j = 0; j < arr.length; j++)

        {

            if (arr[j] == target)

            {

                result = j;  //returns of index of first occurance of target or -1 otherwise
                //result = arr[j] returns target if it appears and -1 otherwise
            }

        }
        System.out.println(result);
    }
}
