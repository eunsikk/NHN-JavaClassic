public class loop{    
    public static void main(String[] args){
        long[] array = {1,2,6,9,8,6,4,3};

        for(long i : array) { // for(x : y)면 y를 하나씩 x에 넘겨줌
            System.out.println(i + " ");
        }
    }
}