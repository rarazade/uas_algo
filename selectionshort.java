/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rxzade
 */
public class selectionshort {
    public static void main(String[] args) {
int data[] = {9, 2, 5, 12, 4, 8, 15, 10, 9, 7};
int i, j, temp, posMin, jml=data.length;
boolean tukar;
//Cetak data sebelum sorting
System.out.print("Data sebelum sorting : ");
for (i=0; i<jml; i++)
System.out.print(data[i] + " ");
//proses sorting
for (i=0; i<jml-1; i++){
posMin = i;
tukar = false;
for (j=i+1; j<jml; j++)
if (data[j] < data[posMin]){ //jika ada yg lebih min

posMin = j; tukar = true;
}
if (tukar) {
temp = data[i];
data[i] = data[posMin];
data[posMin] = temp;
} }
//Cetak hasil sorting
System.out.print("\nData hasil sorting : ");
for (i=0; i<jml; i++)
System.out.print(data[i] + " ");
System.out.println("");
}
}
