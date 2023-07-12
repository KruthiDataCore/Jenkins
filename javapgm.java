public class pattern{    
    public static void main(String []args){    
   int matrix[][]=new int[5][5];    
   int i,j,k,l;    
   int direction=1;    
   for(i=0;i<5;i++){    
       for(j=0;j<5;j++){    
          matrix[i][j]=0;     
       }    
   }    
          
   for(i=1,j=0,k=0;i<=16;i++){    
       matrix[j][k]=i;    
           
       switch(direction){    
           case 1:if(k+1<5){    
                       if(matrix[j][k+1]==0){    
                           k++;    
                           continue;    
                       }    
                       else{    
                               
                           j++;    
                           direction=2;    
                           continue;    
                       }    
                   }    
                      
                  else{    
                       j++;    
                       direction=2;    
                       continue;    
                   }    
               
