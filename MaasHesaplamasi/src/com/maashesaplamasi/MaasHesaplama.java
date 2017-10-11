package com.maashesaplamasi;

import java.util.Scanner;

/**
 * @author birdal
 *
 */
public class MaasHesaplama {
	static MaasHesaplama mh = new MaasHesaplama();
	static double gecicibrut;
	static double gecicinet;
	static double netmaas;
	int temp1, temp2;
	

	double NetMaasHesapla(double brutMaas) {
		gecicinet = brutMaas - ((brutMaas * 0.1) + (brutMaas * 0.3));
		return gecicinet;
	}

	double BrutMaasHesaplama() {
		if ((temp1 + temp2) == 2) {
			return gecicibrut;
		}
		if (gecicinet > netmaas) {
			temp1 = 1;
			gecicibrut = gecicibrut - 0.01;
			gecicinet = mh.NetMaasHesapla(gecicibrut);
			BrutMaasHesaplama();
		} else if (gecicinet < netmaas) {
			temp2 = 1;
			gecicibrut = gecicibrut + 0.01;
			gecicinet = mh.NetMaasHesapla(gecicibrut);
			BrutMaasHesaplama();
		}
		return gecicibrut;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("NetMaaþ Giriniz");
		netmaas = scan.nextDouble();
		
		gecicibrut = netmaas * 2;
		gecicinet = mh.NetMaasHesapla(gecicibrut);
		gecicibrut = mh.BrutMaasHesaplama();
		double gbrut = gecicibrut;
		System.out.println("Brüt :" + gbrut);
	}
}
