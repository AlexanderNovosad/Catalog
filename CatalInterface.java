import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptEngineManager;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;




public interface CatalInterface{
	public static void main(String[] args) {

		SimpleFrame1 frame = new SimpleFrame1();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
class SimpleFrame1 extends JFrame{
	private static final long serialVersionUID = 1L;
	public static final int DEFAULT_WIDTH = 900;
	public static final int DEFAULT_HEIGHT = 700;
	JTable table;
	JScrollPane scrollPane;


	public SimpleFrame1(){    
		try {
			Catalog.readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Catalog.PreSortArray();
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	
		JPanel panel = new JPanel();  
		panel.setLayout(new FlowLayout());
		JTextField textField1 = new JTextField("пошук", 50);
		textField1.setHorizontalAlignment(JTextField.LEFT);
		panel.add(textField1);

		Box box2 = Box.createVerticalBox();
		String[] columnNames = {"Модель","Характеристики","Ціна"};
		table = new JTable(Catalog.ElementsForTable(), columnNames);
		scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(scrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		box2.add(scrollPane);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		JTextField textField2 = new JTextField("", 50);
		textField2.setHorizontalAlignment(JTextField.LEFT);
		panel2.add(textField2);
		JButton button4 = new JButton("Добавити");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String tex = textField2.getText();
				textField2.setText(tex);
				try {
					Catalog.zapisVFile("C:\\catal.txt", tex);
				} catch (FileNotFoundException event) {
					event.printStackTrace();
				}

			}
		});           
		panel2.add(button4);
		box2.add(panel2);

		Box mainBox = Box.createVerticalBox();
		Box box1 = Box.createHorizontalBox();
		JCheckBox check1 = new JCheckBox("Asus");
		box1.add(check1);
		check1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("Asus"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check2 = new JCheckBox("Lenovo");
		box1.add(check2);
		check2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("Lenovo"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check3 = new JCheckBox("Acer");
		box1.add(check3);
		check3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("Acer"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check4 = new JCheckBox("Apple");
		box1.add(check4);
		check4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("Apple"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check5 = new JCheckBox("HP");
		box1.add(check5);
		check5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("HP"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check6 = new JCheckBox("Dell");
		box1.add(check6);
		check6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("Dell"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check7 = new JCheckBox("Intel");
		box1.add(check7);
		check7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("Intel"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check8 = new JCheckBox("AMD Quad-Core");
		box1.add(check8);
		check8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("AMD Quad-Core"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check9 = new JCheckBox("AMD Radeon");
		box1.add(check9);
		check9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("AMD Radeon"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check10 = new JCheckBox("nVidia");
		box1.add(check10);
		check10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.SearchElement("nVidia"), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		JCheckBox check11 = new JCheckBox("Ні",true);
		box1.add(check11);
		check11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.ElementsForTable(), columnNames);
				scrollPane = new JScrollPane(table);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});
		box1.setBorder(new TitledBorder("Фільтри"));
		
		JButton button1 = new JButton("Пошук");      
		panel.add(button1); 
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				String g=textField1.getText();
				textField1.setText(g);
				table = new JTable(Catalog.SearchElement(g), columnNames);
				scrollPane = new JScrollPane(table);
				check11.setSelected(true);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		}); 
		JButton button2 = new JButton("По зменшенню");      
		panel.add(button2); 
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.sortSpisok2(), columnNames);
				scrollPane = new JScrollPane(table);
				check11.setSelected(true);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});            
		JButton button3 = new JButton("По збільшенню");      
		panel.add(button3); 
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.sortSpisok1(), columnNames);
				scrollPane = new JScrollPane(table);
				check11.setSelected(true);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		}); 
		JButton button5 = new JButton("За порядком додавання");
		panel.add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				box2.remove(scrollPane);
				box2.remove(panel2);
				table = new JTable(Catalog.ElementsForTable2(), columnNames);
				scrollPane = new JScrollPane(table);
				check11.setSelected(true);
				box2.add(scrollPane);
				box2.add(panel2);
				pack();
			}
		});

		ButtonGroup group = new ButtonGroup();
		group.add(check1);
		group.add(check2);
		group.add(check3);
		group.add(check4);
		group.add(check5);
		group.add(check6);
		group.add(check7);
		group.add(check8);
		group.add(check9);
		group.add(check10);
		group.add(check11);
		mainBox.add(panel);
		mainBox.add(box1);
		mainBox.add(box2);
		setContentPane(mainBox);
		box2.setBorder(new TitledBorder("Товари"));

		JPanel panel3 = new JPanel();
		this.add(panel3);
		JLabel label1 = new JLabel(Catalog.extraFunction1());
		JLabel label2 = new JLabel(Catalog.extraFunction2());
		panel3.add(label1);
		panel3.add(label2);
		pack();
	}

}
