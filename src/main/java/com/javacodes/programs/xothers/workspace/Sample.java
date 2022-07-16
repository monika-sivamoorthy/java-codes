package com.javacodes.programs.xothers.workspace;


public class Sample {


//    static int getMaxSquareSize(int a, int b){
//
//        int left  = 1;
//        int right = (a+b / 4);
//
//        while (left < right) {
//            if ( ( (a / maxPossible) + (b / maxPossible) ) > 3 ){
//                return maxPossible;
//            }
//            maxPossible-=1;
//        }
//        return 0;
//    }

//    static String getMissingDomino(String[] arr){
//
//        Set<String> all =  new HashSet<String>();
//        for (int i = 0 ; i < 7; i++){
//            for(int j = 0; j < 7; j++){
//                all.add(i+"-"+j);
//            }
//        }
//
//        for (String tile : arr){
//            all.remove(tile);
////            System.out.println((tile.charAt(2) + "-" + tile.charAt(0)) +" "+ tile);
//            all.remove((tile.charAt(2) + "-" + tile.charAt(0)));
//        }
//
//        if(all.isEmpty()){
//            return null;
//        }
//        return all.iterator().next();
//    }

//    void problemFive(){
//        int a = 15958;
//
//        char[] charArr =  (a + "").toCharArray();
//        System.out.println(Arrays.toString(charArr));
//
//        int remove = 0;
//
//        if (a > 0){
//            for(int i = 1; i<charArr.length; i++){
//                if (charArr[i] == '5') {
//                    remove = i;
//                    break;
//                }
//            }
//        } else if ( a < 0) {
//            for(int i = charArr.length-1 ; i >= 0 ; i--){
//                if (charArr[i] == '5') {
//                    remove = i;
//                    break;
//                }
//            }
//        } else {
//            remove = 0;
//        }
//
//
//
//        StringBuilder s = new StringBuilder();
//        for (int i = 0; i<charArr.length; i++ ){
//            if(i != remove)
//                s.append(charArr[i]);
//        }
//
//
//        System.out.println(Integer.parseInt(String.valueOf(s)));
//    }


    public static void main(String[] args) {


    }
}
