/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bluez
 * //thang ccmkmkfkf
 */
// Hai Minh da~ zo
public class SumOf2Numbers {
    private int a,b;

    public SumOf2Numbers() {
    }
    public SumOf2Numbers(int a,int b)
    {
        this.a = a;this.b = b;
    }
    public int sum()
    {
        return this.a + this.b;
    }
    public static void main(String[] args) {
        SumOf2Numbers sum = new SumOf2Numbers(10, 10);
        System.out.println(sum.sum());
    }
    
}
