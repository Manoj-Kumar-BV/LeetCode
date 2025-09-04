class Solution {
    public int findClosest(int x, int y, int z) {
        // if(x < z && y <z){
        //     int leftx = z-x;
        //     int lefty = z-y;
        //     if(leftx < lefty){
        //         return 1;
        //     }else if(leftx > lefty){
        //         return 2;
        //     }else if(leftx == lefty){
        //         return 0;
        //     }
        // }
        // if(x<z && y>z){
        //     int leftx = z-x;
        //     int righty = y-z;
        //     if(leftx < righty){
        //         return 1;
        //     }else if(leftx > righty){
        //         return 2;
        //     }else if(leftx == righty){
        //         return 0;
        //     }
        // }
        // if(x>z && y<z){
        //     int rightx = x-z;
        //     int lefty = z-y;

        //     if(rightx < lefty){
        //         return 1;
        //     }else if(rightx > lefty){
        //         return 2;
        //     }else if(rightx == lefty){
        //         return 0;
        //     }
        // }
        // if(x >z && y > z){
        //     int rightx = x-z;
        //     int righty = y-z;

        //     if(rightx < righty){
        //         return 1;
        //     }else if(rightx > righty){
        //         return 2;
        //     }else if(rightx == righty){
        //         return 0;
        //     }
        // }
        // return 0;
        
        int distx = Math.abs(x-z);
        int disty = Math.abs(y-z);

        if(distx < disty){
            return 1;
        }else if(distx > disty){
            return 2;
        }else{
            return 0;
        }
    }
}