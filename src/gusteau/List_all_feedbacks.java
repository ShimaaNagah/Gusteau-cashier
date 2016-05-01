package gusteau;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class List_all_feedbacks extends JFrame
{

	private JPanel contentPane;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					List_all_feedbacks frame = new List_all_feedbacks();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public List_all_feedbacks()
	{
		ImageIcon stars_icon = new ImageIcon("F:\\F-C-I\\FCI_MyWork\\Gusteau\\src\\gusteau\\stars.png");
		ImageIcon delete_icon = new ImageIcon("F:\\F-C-I\\FCI_MyWork\\Gusteau\\src\\gusteau\\icon_delete.png");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200 , 100 , 800 , 600);

		contentPane = new JPanel();
		// contentPane.setBorder(new EmptyBorder(5 , 5 , 5 , 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0 , 0 , 785 , 560);
		contentPane.add(panel);
		panel.setLayout(null);

		/********************************************************************/

		JPanel left_panel = new JPanel();
		left_panel.setBorder(new LineBorder(new Color(0 , 0 , 0) , 3));
		left_panel.setBackground(Color.WHITE);
		left_panel.setBounds(2 , 110 , 150 , 448);
		panel.add(left_panel);
		left_panel.setLayout(new GridLayout(0 , 1 , 0 , 0));

		JButton manageMenu_button = new JButton("Manage Menu");
		manageMenu_button.setFont(new Font("Arial" , Font.BOLD , 12));
		left_panel.add(manageMenu_button);

		JButton manageTables_button = new JButton("Manage tables");
		manageTables_button.setFont(new Font("Arial" , Font.BOLD , 12));
		left_panel.add(manageTables_button);

		JButton manageAccounts_button = new JButton("Manage accounts");
		manageAccounts_button.setFont(new Font("Arial" , Font.BOLD , 12));
		left_panel.add(manageAccounts_button);

		JButton reports_button = new JButton("Reports");
		reports_button.setFont(new Font("Arial" , Font.BOLD , 12));
		left_panel.add(reports_button);

		/********************************************************************/

		JPanel top_panel = new JPanel();
		top_panel.setBackground(SystemColor.inactiveCaptionBorder);
		top_panel.setBorder(new LineBorder(new Color(0 , 0 , 0) , 3));
		top_panel.setBounds(2 , 2 , 780 , 105);
		top_panel.setLayout(null);
		panel.add(top_panel);

		JButton admin_button = new JButton("Admin");
		admin_button.setFont(new Font("Arial" , Font.BOLD , 11));
		admin_button.setBounds(314 , 36 , 90 , 25);

		JButton cashier_Button = new JButton("Cashier");
		cashier_Button.setFont(new Font("Arial" , Font.BOLD , 11));
		cashier_Button.setBounds(403 , 36 , 90 , 25);

		JLabel logo_label = new JLabel("Logo");
		logo_label.setHorizontalAlignment(SwingConstants.CENTER);
		logo_label.setFont(new Font("Arial" , Font.BOLD , 25));
		logo_label.setBounds(10 , 10 , 101 , 84);

		top_panel.add(admin_button);
		top_panel.add(cashier_Button);
		top_panel.add(logo_label);

		/********************************************************************/

		JPanel right_panel = new JPanel();
		right_panel.setBackground(SystemColor.inactiveCaptionBorder);
		right_panel.setBorder(new LineBorder(new Color(0 , 0 , 0) , 3));
		right_panel.setBounds(154 , 110 , 628 , 448);
		panel.add(right_panel);
		right_panel.setLayout(null);

		JPanel topRight_panel = new JPanel();
		topRight_panel.setBackground(SystemColor.inactiveCaptionBorder);
		topRight_panel.setBounds(3 , 5 , 620 , 52);
		right_panel.add(topRight_panel);
		topRight_panel.setLayout(null);

		JButton categories_button = new JButton("Feedbacks");
		categories_button.setFont(new Font("Arial" , Font.BOLD , 12));
		categories_button.setBounds(245 , 15 , 112 , 25);
		topRight_panel.add(categories_button);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(3 , 68 , 620 , 376);
		right_panel.add(scrollPane);

		JPanel borderlaoutpanel = new JPanel();
		scrollPane.setViewportView(borderlaoutpanel);
		borderlaoutpanel.setLayout(new BorderLayout(0 , 0));

		JPanel columnpanel = new JPanel();
		borderlaoutpanel.add(columnpanel , BorderLayout.NORTH);
		columnpanel.setLayout(new GridLayout(0 , 1 , 0 , 1));
		columnpanel.setBackground(Color.gray);

		for (int i = 0 ; i < 20 ; i++)
		{
			JPanel rowPanel = new JPanel();
			rowPanel.setPreferredSize(new Dimension(300 , 60));
			columnpanel.add(rowPanel);
			rowPanel.setLayout(null);

			JLabel date_label = new JLabel("Date " + (i + 1));
			date_label.setBounds(10 , 15 , 50 , 30);
			rowPanel.add(date_label);

			JLabel comment_label = new JLabel("Comment " + (i + 1));
			comment_label.setBounds(150 , 15 , 80 , 30);
			rowPanel.add(comment_label);

			JLabel stars_label = new JLabel(stars_icon);
			stars_label.setBounds(400 , 15 , 80 , 24);
			rowPanel.add(stars_label);

			JButton delete_button = new JButton("" , delete_icon);
			delete_button.setBounds(550 , 15 , 24 , 24);
			rowPanel.add(delete_button);

			if (i % 2 == 0)
				rowPanel.setBackground(SystemColor.inactiveCaptionBorder);
		}

	}
}
