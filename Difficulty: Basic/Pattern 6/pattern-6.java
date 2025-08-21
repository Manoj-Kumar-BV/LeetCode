class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1; i<n+1; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}