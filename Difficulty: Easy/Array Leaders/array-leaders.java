class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
            
      ArrayList<Integer> l=new ArrayList<>();
      for(int i=0;i<n;i++){
          boolean leader=true;
          for(int j=i+1;j<n;j++){
              if(arr[j]>arr[i]){
                  leader=false;
              }
          }
          if(leader==true){
               l.add(arr[i]);
          }
      }
   return l; }
}
