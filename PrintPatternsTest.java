package PrintVariousPatterns;

public class PrintPatternsTest {
    public static void main(String args[]) //driver function
    { 
        int n = 4;
        int m = 9;
        PrintPatterns.rightTriangle(n,m);
        m = 10;
        PrintPatterns.reverseRightTriangle(n,m);
        n = 7; 
        m = 11;
        PrintPatterns.pyramidPattern(n,m); 
       
        n = 7; 
        m = 12;
        PrintPatterns.reversePyramidPattern(n,m);
    } 
}
    


