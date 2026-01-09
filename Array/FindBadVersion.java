
class VersionControl{
    private int bad = 4; //Ye batata hai kaunsa version se product kharab hona start hua
    boolean isBadVersion(int version){
        return version>=bad;
    }
}

public class FindBadVersion extends VersionControl {


    public  int firstBadVersion(int n) {  //Ye batata hai total kitne versions exist karte hain
        int left = 1;
        int right = n;
        while(left< right){
            int mid = left+(right-left)/2;
            if(isBadVersion(mid)){
                right = mid; // if mid 'bad' hai toh left jaao
            }
            else{
                left = mid+1; // else rigth jaao 
            }
        }

        return left; // first Bad Return;
    }
        public static void main(String[] args) {
            FindBadVersion obj = new FindBadVersion();
            // VersionControl obj2 = new VersionControl();
             
           System.out.println( obj.firstBadVersion(6));
        }
}
