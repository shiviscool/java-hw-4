/*
 * HW: public class G {
	int a[] = {1,5,3,2,4};

	public static void main(String[] args) {
		G g = new G();

		int j = g.a[0];

		for(int i = 0; i < g.a.length+1; i++) {
			if(i > j) {
				System.out.println(i);
			}
			j = i;
		}
	}
} // HW D.java public class D {
    public static void main(String[] args) {
        int a[] = {0,15,52,4,7,1};
        int b[] = {0,124,4323,3456};

        int c[] = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length,b.length);

        for(int i : c) {
            System.out.println(i);
        }
    }
}, Find prime numbers in a array, Find prime numbers between 1-input
 */

// In other words
// HW: PrimeNumbersInArr
