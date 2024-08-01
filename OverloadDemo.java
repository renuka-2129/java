class Overload {
        void test() {
         System.out.println("....No parameter....");
         }
         void test(int a) {
         System.out.println("....One integer parameter..."+a);
         }
          void test(int a,int b) {
          System.out.println(".....Two integer parameter..." +a+","+b);
         }
          void test(double a) {
          System.out.println(".....One double parameter..." +a);
          } 
        }
          class OverloadDemo {
            public static void main(String args[]) {
            Overload ob = new Overload();
            ob.test();
            ob.test(10);
            ob.test(10,20);
            ob.test(2,3);
          }  
      }
