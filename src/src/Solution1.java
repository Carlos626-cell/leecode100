class Solutin1{
    int [] towSum(int [] sums,int target){
        for(int i=0;i<sums.length;i++){
            for(int j=i+1;j<sums.length;j++){
                if(sums[i]+sums[j]==target){
                    return new int[]{i,j};
                }
            }
        }return new int[0];
    }
}
