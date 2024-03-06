package adi.practice.kunalkushwaha.math;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 40;
        int precision = 3;
        System.out.println(squareRoot(num,precision));
    }

    public static double squareRoot(int num, int precision){
        int start = 0;
        int end = num;
        while(start<end){
            int middle = start + (end - start)/2;

            if(middle*middle == num){
                return middle;
            } else if(middle*middle > num){
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        double precisionFactor = Math.pow(10,precision);
        double root = end;
        for(int i = 0; i < precisionFactor; ++i){
            root = end + (double) i / precisionFactor;
            if(root*root == num){
                return root;
            }else if(root*root > num){
                root -= (double) 1 / precisionFactor;
                break;
            }
        }
        return root;
    }
}
