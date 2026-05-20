public class student {
 int num = 21;// this called attribute| instance varaibles


 void dislay(){// method  is functions| behaviour of methond.
    // write here body of the function
    System.out.println("number of student is:" + num);

 }
/*all above is members of class of student to acces only can us object of student. */
 public static void main(String[] args){
    /* this only way can acces because of static */
    student obj = new student();
    System.out.println(obj.num);
    obj.dislay();
    

 }

    
}