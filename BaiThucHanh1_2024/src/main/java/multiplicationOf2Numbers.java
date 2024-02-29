/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class multiplicationOf2Numbers {
    private int a,b;

    public multiplicationOf2Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int multiplication(){
        return this.a * this.b;
    }
    public static void main(String[] args) {
        multiplicationOf2Numbers multiplication = new multiplicationOf2Numbers(10, 20);
        System.out.println(multiplication.multiplication());
    }
}
