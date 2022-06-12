import java.util.Arrays;

public class Shell {
        public static void sort(int arrayToSort[]) {
            int n = arrayToSort.length;

            for (int tab = n / 2; tab > 0; tab /= 2) {
                for (int i = tab; i < n; i++) {
                    int key = arrayToSort[i];
                    int j = i;
                    while (j >= tab && arrayToSort[j - tab] > key) {
                        arrayToSort[j] = arrayToSort[j - tab];
                        j -= tab;
                    }
                    arrayToSort[j] = key;
                }
            }
        }

        public static void main(String args[])
        {
            Shell object = new Shell();
            int elements[] = {3, 9, 69, 96, 3, 5, 6};

            System.out.println("Przed sortowaniem:");
            System.out.println(Arrays.toString(elements));
            long start = System.nanoTime();
            object.sort(elements);
            long stop = System.nanoTime();
            System.out.println("Po sortowaniu:");
            System.out.println(Arrays.toString(elements));
            System.out.println("Czas wykonania: "+(stop-start));
        }
    }

