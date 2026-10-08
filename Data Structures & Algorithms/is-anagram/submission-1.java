public class Solution {
    public boolean isAnagram(String s, String t) {

        /*
        if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        for(char a : sSort){
            System.out.print(a + " ");
        }

        System.out.println();

        for(char a : tSort){
            System.out.print(a + " ");
        }

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        System.out.println();


        for(char a : sSort){
            System.out.print(a + " ");
        }

        System.out.println();

        for(char a : tSort){
            System.out.print(a + " ");
        }

        return Arrays.equals(sSort, tSort); 
        */

                if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        for(char a : sSort){
            System.out.print(a + " ");
        }

        System.out.println();

        for(char a : tSort){
            System.out.print(a + " ");
        }

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        System.out.println();


        for(char a : sSort){
            System.out.print(a + " ");
        }

        System.out.println();

        for(char a : tSort){
            System.out.print(a + " ");
        }

        return Arrays.equals(sSort, tSort); 


    }
}