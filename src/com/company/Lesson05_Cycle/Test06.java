package com.company.Lesson05_Cycle;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/
public class Test06 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println();
            int j = 1;
            while (j <= 10) {
                System.out.print("S  ");
                j++;
            }
            i++;
        }
    }
}
