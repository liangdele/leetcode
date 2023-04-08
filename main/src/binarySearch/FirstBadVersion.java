package binarySearch;

/**
 * 278. 第一个错误的版本
 */
public class FirstBadVersion {
    public static void main(String[] args) {

    }

    /**
     * 使用二分查找
     *
     * @param n
     * @return
     */
    public int firstBadVersion(int n) {
        return search(1,n);
    }

    public int search( int left, int right) {

        if(left<right){
            int mid=left+(right-left)/2;
            if(isBadVersion(mid)){
                return search(left,mid);
            }else{
                return search(mid+1,right);
            }
        }
        return left;
    }




    public static boolean isBadVersion(int n) {
        return false;
    }
}
