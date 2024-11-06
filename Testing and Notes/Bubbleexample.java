public class Bubbleexample
{
    public static void main(String[]args)
    {
        int arrLength = 16;
        int [] myArray = new int[arrLength];
        for(int i = 0; i<arrLength; i++)
        {
            myArray[i] = (int)(Math.random() * arrlength);
        }
        printArray(myArray);
    }
}