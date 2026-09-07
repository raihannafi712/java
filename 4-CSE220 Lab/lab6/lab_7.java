public class lab_7 {

 public class lab8{
    public static void task2a(int[][] m){
      int i=0;
      int j=0;
      int v=0;
      int ans=0;


 public class lab8{
    public static void task2a(int[][] m){
      int i=0;
      int j=0;
      int v=0;
      int ans=0;
      int s=0;
      int k=m.length;
        for(i=0;i<k;i++){
            s=0;
            for(j=0;j<k;j++){
                s=s+m[i][j];}
            if(s>ans){
                ans=s;
                v=i;}}
        System.out.println("Vertex :"+v+"\nWeight sum: "+ans);}
     public static void task2b(int[][]a){
        int i=0;
        int j=0;
        int v=0;
        int ans=0;
        int s=0;
        int k=a.length; 
        for(i=0;i<k;i++){
            s=0;
            for(j=0;j<6;j=j+2){
                s=s+a[i][j+1];}
            if(s>ans){
                ans=s;
                v=i;}}
        System.out.println("Vertex :"+v+"\nWeight sum: "+ans);}
   public static void task3a(int[][]d){
        int i=0;
        int j=0;
        int ms=0;
        int vs=0;
        int md=0;
        int vd=0;
        int s=0;
        int deg=0;
        int k=d.length;  
        for(i=0;i<k;i++){
            deg=0;
            s=0;
            for(j=0;j<k;j++){
                if(d[i][j]>0){
                    s=s+d[i][j];
                    deg++;}}
            if(s>ms){
                ms=s;
               vs=i;}
            if(deg>md){
                md=deg;
                vd=i;}}
         System.out.println("Vertex :"+vd+"\nmax outgoing degree: "+md);
         System.out.println("Vertex :"+vs+"\nmax outgoing weight sum: "+ms);}
    public static void task3b(int[][]n,int[][]w,int[]c){
      int i=0;
      int j=0;
      int ms=0;
      int vs=0;
      int md=0;
      int vd=0;
      int s=0;
      int deg=0;
      int k=n.length;
      for(i=0;i<k;i++){
        s=0;
        deg=c[i];
        for(j=0;j<deg;j++){
            s=s+w[i][j];}
        if(s>ms){
            ms=s;
            vs=i;}
        if(deg>md){
            md=deg;
            vd=i;}}
      System.out.println("Vertex :"+vd+"\nmax outgoing degree: "+md);
      System.out.println("Vertex :"+vs+"\nmax outgoing weight sum: "+ms);}
    public static void main(String[] args){
        int[][] m=new int[4][4];
        m[0][1]=4;m[1][0]=4;m[0][2]=3;m[2][0]=3;m[0][3]=6;m[3][0]=6;m[1][2]=5;m[2][1]=5;m[1][3]=7;m[3][1]=7;m[2][3]=2;m[3][2]=2;
        System.out.println("task2a");
        task2a(m);
         int[][]list={
            {1, 4, 2, 3, 3, 6},{0, 4, 2, 5, 3, 7},{0, 3, 1, 5, 3, 2},{0, 6, 1, 7, 2, 2}}; 
        System.out.println("task2b");
        task2b(list);
        int[][] d=new int[5][5]; 
        d[0][1]=3;d[0][2]=2;d[1][3]=4;d[2][0]=1;d[2][4]=5;d[3][1]=2;d[3][2]=6;d[4][3]=3;      
        System.out.println("task3a");
        task3a(d);
       int[][] l=new int[5][2];int[][] w=new int[5][2];int[] c=new int[5];
    l[0][0]=1;w[0][0]=3;c[0]++;l[0][1]=2;w[0][1]=2;c[0]++;l[1][0]=3;w[1][0]=4;c[1]++;l[2][0]=0;w[2][0]=1;c[2]++;l[2][1]=4;w[2][1]=5;c[2]++;l[3][0]=1;w[3][0]=2;c[3]++;l[3][1]=2;w[3][1]=6;c[3]++;l[4][0]=3;w[4][0]=3;c[4]++;    
    System.out.println("task3b");
    task3b(l,w,c);}}

}
