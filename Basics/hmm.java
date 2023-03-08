import java.util.*;
class hmm{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n,m,x,y,i,j;
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        for(i = 0; i<m ; i++){
            for(j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        }
        for(i = 0; i<m;i++)
        {
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}