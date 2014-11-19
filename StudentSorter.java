import java.util.ArrayList;
/**
 * CS 3716
 * StudentSorter.java
 * Purpose: Sorts an ArrayList of Students using Selection Sort algorithm
 *
 * @author Kateryna Nazarenko
 * MUN ID: 201214533
 * 
 */
public class StudentSorter
{
   private ArrayList<Student> studentList;

   /**
    *  Constructs a selection sorter.
    * @param arr the ArrayList to sort
    */
   public StudentSorter(ArrayList<Student> arr)
   {
      studentList = arr;
   }

   /**
     * Sorts the array managed by this selection sorter.
     */
   public void sort()
   {  
      for (int i = 0; i < studentList.size() - 1; i++)
      {  
         int minPos = minimumPosition(i);
         swap(minPos, i);
      }
   }

   /**
     *Finds the smallest element in a tail range of the array.
     *@param from the first position to compare
     *@return the position of the smallest element in the
     *
   */
   private int minimumPosition(int from)
   {  
      int minPos = from;
      for (int i = from + 1; i < studentList.size(); i++){
         if (studentList.get(i).getScore() < studentList.get(minPos).getScore()){ 
             minPos = i;
         }
      }
      return minPos;
   }

   /**
     * Swaps two entries of the ArrayList.
     * @param i the first position to swap
     * @param j the second position to swap
   */
   private void swap(int i, int j)
   {
      Student temp = studentList.get(i);
      studentList.set(i,studentList.get(j));
      studentList.set(j,temp);
   }
}
