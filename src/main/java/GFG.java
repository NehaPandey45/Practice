class GFG {

    private static int myMethod(int[] arr){

        int n = arr.length;
        int minSum = Integer.MAX_VALUE;

        for(int i=0; i<=n-2; i++) {
            int baseElement = arr[i];
            for (int j = 2; j <= n - 2; j++) {
                int sum;
                sum = baseElement + arr[j];
                if (sum < minSum) {
                    minSum = sum;
                }
            }
        }

        return minSum;
    }

    public static void main(String args[]){
        int[] array = {2,4,6,3,7};

        int minSum = myMethod(array);
        System.out.println(minSum);
    }
}

