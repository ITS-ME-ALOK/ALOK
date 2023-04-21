import java.util.Scanner;
class binary_search
{
    public static void main(String argm[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter the elements of array");
        for(int i=0; i<size; i++)
            number[i] = sc.nextInt();
        int n, low = 0, up=number.length-1, mid = 0;
        System.out.println("Enter the number you want to search : ");
        n = sc.nextInt();
        while (low <= up)
        {
            mid = (low+up)/2;
            if(number[mid]==n)
            {
                System.out.println("Element found at " + mid );
                break;
            }
            else if (number[mid]<n)
            {
                low = mid+1;
            }
            else if(number[mid]>n)
            {
                up = mid-1;
            }
        }
        if(low>up)
            System.out.println("Element not found.");
    }
}