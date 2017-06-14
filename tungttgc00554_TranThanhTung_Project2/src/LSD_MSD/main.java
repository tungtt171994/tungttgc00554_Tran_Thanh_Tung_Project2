package LSD_MSD;

public class main {
//Write an algorithm which will arrange the following numbers in ascending order: “158”, “124”, “238”, “707”, “608”, “250”, “888” (using LSD or MSD approaches). Justify your algorithm with detailed guidance. Please also draw the trace for your algorithm applied in this case. Implement your algorithm in this part. LO 3.2. 
	public static void main(String[] args) {
		String[] arrString = new String[]{
	            "158",
	            "124",
	            "238",
	            "707",
	            "608",
	            "250",
	            "888"
	        };
	        sort(arrString,3);
	        
	        for (int i = 0; i < arrString.length; i++) {
	            System.out.println(arrString[i]);
	        }
	}
	
	public static void sort(String[] a, int W)
    {
      // Sort a[] on leading W characters.
      int N = a.length;
      int R = 256;
      String[] aux = new String[N];
      for (int d = W-1; d >= 0; d--)
      { // Sort by key-indexed counting on dth char.
         int[] count = new int[R+1];     // Compute frequency counts.
         for (int i = 0; i < N; i++)
             count[a[i].charAt(d) + 1]++;
         for (int r = 0; r < R; r++)     // Transform counts to indices.
            count[r+1] += count[r];
         for (int i = 0; i < N; i++)     // Distribute.
            aux[count[a[i].charAt(d)]++] = a[i];
         for (int i = 0; i < N; i++)     // Copy back.
            a[i] = aux[i];
        }
    }
	
}
