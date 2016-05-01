package gusteau;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Edit_menu_items extends JFrame
{
	private JPanel contentPane;
	private JTextField name_textField;
	private JTextField price_textField;
	JButton browse_button = new JButton("Browse");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					Edit_menu_items frame = new Edit_menu_items();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Edit_menu_items()
	{
		setTitle("Update item");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100 , 100 , 360 , 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5 , 5 , 5 , 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel name_label = new JLabel("Name");
		name_label.setFont(new Font("Arial" , Font.BOLD , 16));
		name_label.setBounds(25 , 30 , 95 , 15);
		contentPane.add(name_label);

		JLabel category_label = new JLabel("Category");
		category_label.setFont(new Font("Arial" , Font.BOLD , 16));
		category_label.setBounds(25 , 80 , 95 , 15);
		contentPane.add(category_label);

		JLabel description_label = new JLabel("Description");
		description_label.setFont(new Font("Arial" , Font.BOLD , 16));
		description_label.setBounds(25 , 130 , 95 , 15);
		contentPane.add(description_label);

		JLabel price_label = new JLabel("Price");
		price_label.setFont(new Font("Arial" , Font.BOLD , 16));
		price_label.setBounds(25 , 245 , 95 , 15);
		contentPane.add(price_label);

		JLabel image_label = new JLabel("Image");
		image_label.setFont(new Font("Arial" , Font.BOLD , 16));
		image_label.setBounds(25 , 295 , 95 , 15);
		contentPane.add(image_label);

		name_textField = new JTextField();
		name_textField.setBounds(150 , 30 , 160 , 20);
		contentPane.add(name_textField);
		name_textField.setColumns(10);

		JComboBox category_comboBox = new JComboBox();
		category_comboBox.setModel(new DefaultComboBoxModel(new String[] {"1" , "2" , "3" , "4"}));
		category_comboBox.setBounds(150 , 80 , 160 , 20);
		contentPane.add(category_comboBox);

		JTextArea description_textArea = new JTextArea();
		description_textArea.setBounds(150 , 130 , 160 , 80);
		contentPane.add(description_textArea);

		price_textField = new JTextField();
		price_textField.setColumns(10);
		price_textField.setBounds(150 , 245 , 160 , 20);
		contentPane.add(price_textField);

		browse_button.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0)
			{

				JFileChooser file = new JFileChooser();
				int result = file.showSaveDialog(null);
				File selectedFile = file.getSelectedFile();
				String path = selectedFile.getAbsolutePath();
				browse_button.setText(path);
			}

		});
		browse_button.setBounds(150 , 295 , 90 , 23);
		contentPane.add(browse_button);

		JButton cancel_button = new JButton("Cancel");
		cancel_button.setBounds(90 , 360 , 80 , 25);
		contentPane.add(cancel_button);

		JButton update_button = new JButton("Update");
		update_button.setBounds(190 , 360 , 80 , 25);
		contentPane.add(update_button);
	}

}
