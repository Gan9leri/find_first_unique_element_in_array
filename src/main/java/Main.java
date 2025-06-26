public class Main {
    public static void main(String[] args){
        int[] arr = {9,4,9,6,7,4,5};
        int flag = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j] && i != j){
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) flag = 0;
            else{
                element = arr[i];
                break;
            }
        }
        System.out.println("Первый неповторяющийся элемент в массие: " + element);
    }
}
