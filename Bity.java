package org.example;

public class Bity {


    static void vytiskni(byte b){

        String s1 = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
        System.out.println(s1);
    }

    static byte nastavBit(byte aktualniHodnota, int odNulaDoSedmi){
        return (byte) (aktualniHodnota | (1 << odNulaDoSedmi));
    }

    public static void main(String[] args) {
        byte x = 0;
        vytiskni(x);
        x=nastavBit(x,2);
        vytiskni(x);
        x=nastavBit(x,7);
        vytiskni(x);
        //vytiskni((byte)9);
    }
}