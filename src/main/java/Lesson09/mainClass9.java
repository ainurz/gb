package Lesson09;

public class mainClass9 {
    public static void main(String[] args) {
        String[][] arrFirst = new String[4][4];
        String[][] arrNot4 = new String[6][6];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrFirst[i][j] = ""+i;
               }
         }
        arrFirst[2][2] = "ape";
 
        proverkaArr(arrFirst);
        
        
        proverkaArr(arrNot4);




    }

    public static void proverkaArr(String[][] arrS) {
        int arrRow = arrS.length;
        int arrColumn = arrS[0].length;
        int strInteger;
        if (arrRow != 4 || arrColumn != 4) {
            MyArraySizeException except = new MyArraySizeException("Ошибка массив  не 4х4!");
            return;
        } else {
            System.out.println("Размер массива 4х4.");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                   strInteger = Integer.parseInt(arrS[i][j]);

                 } catch (ClassCastException e) {
                    Lesson09.MyArrayDataException except = new Lesson09.MyArrayDataException(i, 1);

                } catch (NumberFormatException e) {
                    Lesson09.MyArrayDataException except = new Lesson09.MyArrayDataException(i, 1);
                } catch (ArrayIndexOutOfBoundsException e) {
                    Lesson09.MyArrayDataException except = new Lesson09.MyArrayDataException(i, 1);
                    //e.printStackTrace();
                }//try


            }

        }
    }
}
