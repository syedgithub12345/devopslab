package Sorting;

public class Selection_sort {
    public static void Selection(int num[]){      
        int a=num.length;
        
        for(int i=0;i<a-1;i++){
            int com=i;
            for(int j=i+1;j<a;j++){
                if(num[j]<com){
                    com=j;
                }
                int temp=num[com];
                num[com]=num[i];
                num[i]=temp;
            }
        }    
    }
    public static void print(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String args[]){
        int num[]={5,4,2,3,1};
        Selection(num);
        print(num);
    }
}

