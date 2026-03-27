package Arrays;

import java.util.Scanner;

/*  Search Name in Array.
    use java 25 and more to execute this programs.
    Linear Search Method.
    Time Complexity is O(n).
*/
public class NameSearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] names = getNames(sc);
        System.out.print("Enter Name you want to Search : ");
        String name = sc.nextLine();
        int nameIndex = searchName(names,name);
        printResult(names,nameIndex);
    }

    public static String[] getNames(Scanner sc){
        String[] names;
        int num;
        System.out.print("How Many Names you want to Enter : ");
        num = sc.nextInt();
        sc.nextLine();
        names = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.printf("Enter Name %d: ", i+1);
            names[i] = sc.nextLine();
        }

        return  names;
    }

    public static int searchName(String[] names, String name){
        if (name == null) {
            return -1;
        }
        String target = name.trim();
        for (int i = 0; i < names.length; i++) {
            if(names[i].trim().equalsIgnoreCase(target)){
                return i;
            }
        }
        return -1;
    }

    public static void printResult(String[] names, int nameIndex){
        if(nameIndex != -1){
            System.out.printf("\n%s is found at list %d.",names[nameIndex],nameIndex+1);
        }else{
            System.out.println("\nYour Name is not Found in List.");
        }
    }
}
