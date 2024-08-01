class Comment {
 public static void main(String args[]) {
   System.out.print("no.of class:" + args.length);
   for(int i=0;i<args.length;i++)
   {
   System.out.print(args[i].toLowerCase() + "-" + args[i].length());
   }
}
}
