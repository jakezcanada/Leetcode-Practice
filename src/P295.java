import java.util.ArrayList;
import java.util.List;

public class P295 {
    class MedianFinder {
        List<Integer> arr;

        public MedianFinder() {
            this.arr = new ArrayList<Integer>();
        }

        public void addNum(int num) {
            if(this.arr.size() == 0){
                this.arr.add(num);
                return;
            }
            for(int i = 0; i < this.arr.size(); i++) {
                if(this.arr.get(i) > num){
                    arr.add(i, num);
                    return;
                }
            }
            arr.add(num);
        }

        public double findMedian() {
            if(arr.size()%2==0) {
                return (double) (this.arr.get((int)(arr.size()/2)-1) + this.arr.get((int)(arr.size()/2))) / 2.0;
            }
            return this.arr.get((int)(arr.size()/2));
        }
    }
    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */
    public static void main(String[] args) {

    }
}
