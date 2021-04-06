package PrintVariousPatterns;

public class PrintPatterns {
/*
n=5 all the time
i=0, j=5..1 _
i=0, j=4..1 _ _
i=0, j=3..1 _ _ _
i=0, j=2..1 _ _ _ _
i=0, j=1..1 end of for
i=0, k=0..0 _ _ _ _ * _
i= 1, j = 4...1 _
i=1, j=3..1 _ _
i=1, j=2..1 _ _ _
i=1, j=1..1 end of for
i=1, k=0..1 * _
i=1, k=1..1 * _ * _
   _ _ _ * _ * _
*/
public static void rightTriangle(int n, int m) 
{  
    for (int i=0; i<n; i++) //outer loop for number of rows(n)
    { 
        for (int k=0; k<=i; k++ ) //inner loop for number of columns
        { 
            System.out.print("* "); //print star
        } 

        System.out.println(); //ending line after each row
    } 
    for (int t=0; t<m; t++){
        System.out.print(". ");
    }
    System.out.println();
} 

public static void reverseRightTriangle(int n, int m) 
{  
    for (int t=0; t<m; t++){
        System.out.print(". ");
    }
    System.out.println();
    for (int i=n; i>0; i--) //outer loop for number of rows(n)
    { 
        for (int k=i; k>0; k--) //inner loop for number of columns
        { 
            System.out.print("* "); //print star
        } 
        System.out.println(); //ending line after each row
    } 

} 

    public static void pyramidPattern(int n, int m) 
    {  
        for (int i=0; i<n; i+=2) //outer loop for number of rows(n)
        { 
            for (int j= m-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int k=0; k<=i; k++ ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 
        for (int t=0; t<m; t++){
            System.out.print(". ");
        }
        System.out.println();
    } 
    public static void reversePyramidPattern(int n, int m) 
    {  
        for (int t=0; t<m; t++){
            System.out.print(". ");
        }
        System.out.println();
        
        for (int i=0; i<n; i+=2) //outer loop for number of rows(n)
        { 
            for (int j=0; j<m-n-1+i; j++) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int k=n-i; k>=1; k-- ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 

    } 
} 
