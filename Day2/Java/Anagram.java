import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        Anagram anagram = new Anagram();    
        boolean result = anagram.isAnagram(str1, str2);
        System.out.println(result);
        sc.close();
    }

    public boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
