import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;



class Notebooks {
	String model;
	int cost;
	String charact;
}
public class Catalog implements CatalInterface{
	static Notebooks names[] = new Notebooks[100];
	static int n = 0;
	public static void readFile() throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("C:\\catal.txt"));
		String s = null;
		while ((s=in.readLine())!=null){
			String t[] = s.split(":");
			names[n] = new Notebooks();
			names[n].model = t[1];
			names[n].charact = t[2];
			names[n].cost = Integer.parseInt(t[3]);
			n++;
		}
		in.close();
	}

	static String[][] ElementsForTable(){
		String b [][] = new String [30][3];
		for (int i=0; i<n; i++){
			b [i][0]=names[i].model;
			b [i][1]=names[i].charact;
			b [i][2]=names[i].cost+" грн.";
		}
		return b;
	}
	
	static void zapisVFile(String filename, String text) throws FileNotFoundException{
		PrintStream printStream = new PrintStream(new FileOutputStream(filename, true), true);
		printStream.println(text);
		printStream.close();
	}
	
	static String model2[] = new String[50];
	static String charact2[] = new String[50];
	static int cost2[] = new int[50];
	static void PreSortArray(){
		for (int i=0;i<n;i++){
			model2[i] =names[i].model;
			charact2[i]=names[i].charact;
			cost2[i]=names[i].cost;
		}
	}
	
	static String[][] ElementsForTable2(){
		String b [][] = new String [30][3];
		for (int i=0; i<n; i++){
			b [i][0]=model2[i];
			b [i][1]=charact2[i];
			b [i][2]=cost2[i]+" грн.";
		}
		return b;
	}
	
	static String [][] sortSpisok1(){
		String b [][] = new String [30][3];
		for (int i=0;i<n-1;i++){
			boolean change = false;
			for (int j=0;j<n-1;j++)
				if (names[j].cost>names[j+1].cost){
					int temp = names[j].cost;
					String g = names[j].model;
					String q = names[j].charact;
					names[j].cost = names[j+1].cost;
					names[j].model = names[j+1].model;
					names[j].charact = names[j+1].charact;
					names[j+1].cost = temp;
					names[j+1].model = g;
					names[j+1].charact = q;
					change = true;
				}
			if (!change)
			break;
		}

		for (int i=0;i<n;i++){
			b [i][0]=names[i].model;
			b [i][1]=names[i].charact;
			b [i][2]=names[i].cost+" грн.";
		}
		return b;
	}
	
	static String[][] sortSpisok2(){
		String b [][] = new String [30][3];
		for (int i=0;i<n-1;i++){
			boolean change = false;
			for (int j=0;j<n-1;j++)
				if (names[j].cost<names[j+1].cost){
					int temp = names[j].cost;
					String g = names[j].model;
					String q = names[j].charact;
					names[j].cost = names[j+1].cost;
					names[j].model = names[j+1].model;
					names[j].charact = names[j+1].charact;
					names[j+1].cost = temp;
					names[j+1].model = g;
					names[j+1].charact = q;
					change = true;
				}
			if (!change)
			break;
		}

		for (int i=0;i<n;i++){
			b [i][0]=names[i].model;
			b [i][1]=names[i].charact;
			b [i][2]=names[i].cost+" грн.";
		}
		return b;
	}
	
	static String[][] SearchElement(String element){
		String b [][] = new String [30][3];
		for (int i=0; i<n; i++){
			if (names[i].model.contains(element)||names[i].charact.contains(element)){
				b [i][0]=names[i].model;
				b [i][1]=names[i].charact;
				b [i][2]=names[i].cost+" грн.";
			}
		}
		return b;
			
	}
	
	static String extraFunction1(){
		int sum=0;
		for (int i=0; i<n+1; i++){
			sum=i;
		}
		String q = "Всього в наявності: " + sum + " ноутбуки.     ";
		return q;
	}
	
	static String extraFunction2(){
		int sum=0;
		for (int i=0; i<n; i++){
			sum=sum + names[i].cost;
		}
		String w = "Вартість всього товару:  "+ sum + " грн.";
		return w;
	}
	
}





   