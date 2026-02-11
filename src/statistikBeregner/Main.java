package statistikBeregner;

public class Main {
    void main() {

        int[] nums = {45, 67, 23, 89, 34, 56, 78};
        System.out.println("Gennemsnit: " + calculateAverage(nums));
        System.out.println("Max: " + findMax(nums));
        System.out.println("Min: " + findMin(nums));
        System.out.println("Over gennemsnit: " + countAboveAverage(nums));

        System.out.println();

    }


    double calculateAverage(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return (double) total / numbers.length;
    }


    int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) { //for(int i = 1; i < numbers.length; i++)
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    int findMin(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;

    }

    double countAboveAverage(int[] numbers) {
        double overAvg = calculateAverage(numbers);
        for (int num : numbers) { //for(int i = 1; i < numbers.length; i++)
            if (num > overAvg) {
                overAvg = num;
            }
        }
        return overAvg;
    }

}






