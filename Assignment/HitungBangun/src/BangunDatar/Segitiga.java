/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Lenovo
 */
public class Segitiga implements HitungBidang{
    double a, b, c;
    public Segitiga (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double Luas(){
        return (a*(Math.pow(c, 2)-Math.pow(a, 2)))/2;
    }
    @Override
    public double Keliling(){
        return a+b+c;
    }
}
