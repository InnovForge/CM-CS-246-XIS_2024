/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DucThang
 */
public class minusOf2Numbers {
    private int a,b;

    public minusOf2Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int minus(){
        return this.a - this.b;
    }
    public static void main(String[] args) {
        minusOf2Numbers minus = new minusOf2Numbers(10, 20);
        System.out.println(minus.minus());
    }
}
