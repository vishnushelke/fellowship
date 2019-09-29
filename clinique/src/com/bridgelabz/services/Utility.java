package com.bridgelabz.services;

import java.util.*;
import java.io.*;

public class Utility {

	
	public static String reader(String path) throws IOException
	{
		File f=new File(path);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
	
		return s;
	}
	
	public static void writer(String path,String s) throws IOException
	{
		
		BufferedWriter bw=new BufferedWriter(new FileWriter(path));
		bw.write(s);
		
	}
	
	public static int intScan()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	
		return n;
	}
	public static long longScan()
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
	
		return n;
	}
	public static String stringScan()
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		
		return n;
	}
	public static double doubleScan()
	{
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		
		return n;
	}
	
	public static int DayOfWeek(int d,int m,int y)
	{
		int o=0;
		int y0=y-(14-m)/12;
		int x=y0+(y0/4)-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=((d+x+31*m0/12)%7);
		
		switch(d0)
		{
		case 0:o=0;break;
		case 1:o=1;break;
		case 2:o=2;break;
		case 3:o=3;break;
		case 4:o=4;break;
		case 5:o=5;break;
		case 6:o=6;break;
		}
		return o;
	}
	
	public static void Distance(double x, double y) {
		double a = Math.pow(x, 2);
		double b = Math.pow(y, 2);

		System.out.println(Math.sqrt(a + b));

	}

	public static void Doubleopt(double a, double b, double c) {
		double d = a + b * c;
		double e = a * b + c;
		double f = c + a / b;
		double g = a % b + c;

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

	public static double Harmonic(int n) {
		double H = 0.0;
		for (double i = 1; i <= n; i++) {
			H = H + (1 / i);
		}
		return H;
	}

	public static double SineOfAngle(int angle) {
		double r = Math.toRadians(angle);
		double sine = Math.sin(r);
		return sine;
	}

	public static double CosineOfAngle(int angle) {
		double r = Math.toRadians(angle);
		double cosine = Math.cos(r);
		return cosine;
	}

	public static void Binary(int n) {
		int x = 0;
		int arr[] = new int[32];

		while ((Math.pow(2, x)) < n) {
			x++;
		}
		for (int i = 0; i < x; i++) {
			arr[i] = n % 2;
			n = n / 2;

		}

		for (int i = 31 - x; i >= x; i--) {
			arr[i] = 0;
		}
		for (int i = 31; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	public static double Futurevalue(int c, int r, int t) {
		double futureValue = c * Math.pow(1 + r, t);
		System.out.println(futureValue);
		return futureValue;
	}

	public static double PresentValue(int c, int r, int t) {
		double prevalue = c / Math.pow(1 + r, t);
		System.out.println(prevalue);
		return prevalue;
	}

	public static double sqrt(double n) {
		double t = n;
		double epsilon = 1e-15;
		while (Math.abs(t - n / t) > epsilon * t)
			t = (t + n / t) / 2;
		System.out.println(t);
		return t;
	}

	public static long start() {
		long starttime = System.nanoTime();
		return starttime;
	}

	public static void end(long starttime) {
		long endtime = System.nanoTime();
		long timeElapsed = endtime - starttime;
		System.out.println("Running Time of Program is =" + timeElapsed + " NanoSeconds");
	}

	public static void swap(char[] arr, int i, int j) {
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

	public static String[] WordSort(String a[]) {
		int n = a.length;

		String temp = "";

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		return a;
	}

	public static void reverse(char[] arr, int i, int j) {
		// do till two end-points intersect
		while (i < j) {
			swap(arr, i++, j--);
		}
	}


	

	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact = fact * i;
		System.out.println(fact);
		return fact;
	}

	public static void MaxAndMin(int a[]) {
		int max = Integer.MIN_VALUE;
		int n = a.length;

		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

	public static void CheckCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3,
			double x4, double y4) {
		boolean b = false;
		double s1 = (y2 - y1) / (x2 - x1);
		double s2 = (y3 - y2) / (x3 - x2);
		double s3 = (y3 - y1) / (x3 - x1);
		if (s1 == s2 && s2 == s3 && s1 == s3) {
			b = true;
		} else
			b = false;
		System.out.println(b);
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		if (str1.length() != str2.length() || str1.equals(str2)) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isPalindrome(int num) {
		int r, sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void binaryNumberSearch(int[] a,int search)
	{
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int li=0;
		int hi=n-1;
		int mi=(li+hi)/2;
		while(li<=hi)
		{
			if(search==a[mi])
			{
				System.out.println("Number is at position "+mi);
				break;
			}
			else if(search<a[mi])
			{
				hi=mi-1;
			}	
			else
			{
				li=mi+1;
			}
			mi=(hi+li)/2;
		}
		
	}
	public static void binaryWordSearch(String[] a,String search) 
	{
		int n=a.length;
		String temp="";
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		int li=0,hi=n-1,mi=(li+hi)/2,x=0;
	
		while(li<=hi)
		{
			if(search.equals(a[mi]))
			{
				System.out.println("Word found at index value "+mi);
				x=1;
				break;
			}
			
			else if(search.compareTo(a[mi])>0)
				li=mi+1;
			else hi=mi-1;
			mi=(li+hi)/2;
		}
		if(x==0)
			System.out.println("Word not found");
		
	}
	
	public static int[] insertionNumberSort(int[] a)
	{
		int n=a.length;
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			temp=a[i];
			int j=0;
			j=i;
			while((j>0) && (a[j-1]>temp))
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		return a;
		
	}
	
	public static String[] insertionWordSort(String[] a)
	{
		int n=a.length;
		String temp="";
		
		for(int i=0;i<n;i++)
		{
			temp=a[i];
			int j=0;
			j=i;
			while((j>0) && (a[j-1].compareTo(temp)>0))
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
		}
		return a;
	}
	
	public static int[] bubbleNumberSort(int[] a)
	{
		int n=a.length;
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a;
	}
	
	public static String[] bubbleWordSort(String[] a)
	{
		int n=a.length;
		String temp="";
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		return a;
	}

	public static String[] shuffleCardsDeck(String[] arr) {
		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = arr[f1];
				arr[f1] = arr[f2];
				arr[f2] = temp;
			}
		}
		return arr;

	}

	public static String replaceString(String changeIn,String target,String replacement) {
		// TODO Auto-generated method stub
		String answer=changeIn.replace(target, replacement);
		
		return answer;
	}

}
