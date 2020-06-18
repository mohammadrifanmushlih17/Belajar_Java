package com.mushlihtech;

public class Main {

    public static void main(String[] args) {
	    /*operator bitwise adalah operator yang digunakan pada bit. macam - macam operator Bitwise
	    1. operator shift left / geser ke kiri (<<)
	    2. operator shift right / geser ke kanan(>>)
	    3. operator yang ada di operator logika, yaitu or (|) dengan satu symbol
	    4. operator and (&)
	    5. operator xor (^)
	    6. operator not / negasi (~)
	     */
		System.out.println("@CopyRight By MushlihTech Foundation\n" +
							"ini adalah aplikasi operasi Bitwise\n");
		System.out.println("=============================");

	    byte x, y;

	    String bits1, bits2;

	    x = 3;
	    bits1 = String.format("%8s",Integer.toBinaryString(x)).replace(' ','0');
		System.out.printf("%s = %s",x ,bits1);

		y = 7;
		bits2 = String.format("%8s",Integer.toBinaryString(y)).replace(' ','0');
		System.out.printf("\n%s = %s\n",y ,bits2);

		//deklarasi
		byte a, b;

		String a_bits, b_bits;

		//operator SHIFT LEFT (<<)
		System.out.println("====== SHIFT LEFT (<<(2)) ======");
		a = 4;
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s  = %s",a ,a_bits);

		b = (byte)(a << 2);
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("\n%s = %s\n",b ,b_bits );

		//operator SHIFT RIGHT (>>)
		System.out.println("====== SHIFT RIGHT (>>(3)) ======");
		a = 9;
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %s\n",a ,a_bits);

		b = (byte) (a >> 3);
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %s\n",b ,b_bits);

		//operator OR (|)
		System.out.println("====== OR (|) ======");
		byte c;
		String c_bits;

		a = 17;
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %s\n",a ,a_bits);

		b = 12;
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %s\n",b ,b_bits);

		c = (byte)(a | b);
		c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
		System.out.println("---------------------------OR(|)");
		System.out.printf("%s = %s\n",c ,c_bits);

		//operator AND (&)
		System.out.println("====== AND (&)======");
		a = 10;
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %s\n",a ,a_bits);

		b = 9;
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s  = %s\n",b ,b_bits);

		c = (byte)(a & b);
		c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
		System.out.println("---------------------------AND(&)");
		System.out.printf("%s  = %s\n",c ,c_bits);

		//operator XOR(^)
		System.out.println("====== XOR (^) ======");
		a = 8;
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s  = %s\n",a ,a_bits);

		b = 5;
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s  = %s\n",b ,b_bits);

		c = (byte)(a ^ b);
		c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
		System.out.println("---------------------------XOR(^)");
		System.out.printf("%s = %s\n",c ,c_bits);

		//operator NOT / negasi(~)
		System.out.println("====== NOT (~) ======");
		byte d;

		String d_bits;

		a = 12;
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s  = %s\n",a ,a_bits);

		c = (byte)(~a);
		c_bits = String.format("%8s",Integer.toBinaryString(c)).substring(24).replace(' ','0');
		System.out.println("---------------------------NOT(~)");
		System.out.printf("%s = %s\n",c ,c_bits);
		System.out.println("<------------------------------->");

		b = 6;
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s  = %s\n",b ,b_bits);

		d = (byte)(~b);
		d_bits = String.format("%8s",Integer.toBinaryString(d)).substring(24).replace(' ','0');
		System.out.println("---------------------------NOT(~)");
		System.out.printf("%s = %s\n",d ,d_bits);

    }
}
