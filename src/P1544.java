public class P1544 {
    public String makeGood(String s) {
        String temp = s;
        int count = 0;
        for(int i = 0; i <= s.length(); i++){
            char[] arr = temp.toCharArray();
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] == arr[j+1]+32 || arr[j] == arr[j+1]-32){
                    count++;
                    temp = temp.substring(0,j) + temp.substring(j+2,arr.length);
                    break;
                }
            }
            if(count == 0){
                break;
            }

            count = 0;
        }
        return temp;
    }
    public static void main(String[] args) {

    }
}
