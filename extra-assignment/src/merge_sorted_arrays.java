import java.util.*;

public class Source {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // size of first array
        int n = s.nextInt();
        // size of second array
        int m = s.nextInt();
        // first sorted array
        int arr1[] = new int[n];
        // second sorted array
        int arr2[] = new int[m];
        int i, j, k;

        // taking arrays as input
        for (i = 0; i < n; i++)
            arr1[i] = s.nextInt();
        for (i = 0; i < m; i++)
            arr2[i] = s.nextInt();

        // merged array
        int merge[] = new int[n+m];

        // start from last element since both arrays are in ascending order
        i = n-1; j = m-1; k = 0;
        
        while(i >= 0 && j >= 0){
            if(arr1[i] > arr2[j])
                merge[k++] = arr1[i--];
            else
                merge[k++] = arr2[j--];
        }

        // iterate over remaining elements
        while(i >= 0)
            merge[k++] = arr1[i--];
        while(j >= 0)
            merge[k++] = arr2[j--];

        // print array output
        for(i = 0; i < merge.length; i++)
            System.out.println(merge[i]);
        
        s.close();
    }
}
