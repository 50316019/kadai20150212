package dbconsole;



import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FrameSystemView extends Frame implements ActionListener ,WindowListener {
	private Button b1 = new Button("�~�J�����n�ʏ��ʕ\��");
	private Button b2 = new Button("�O���t");
	TextArea ta = new TextArea("",20,35);
	
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
		
		addWindowListener(this);
		
		setTitle("DataBase");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		add(b1);
		add(ta);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	 if(e.getSource()==b1){
		 int score, name;
			String id;
			ResultSet rs;
			MySQL mysql = new MySQL();
			rs = mysql.selectAll();
			try {
				while(rs.next()){
				        id = rs.getString("Todouhuken");
				        name = rs.getInt("percentage");
				        score = rs.getInt("Year");
				        ta.append("�s���{���F" + id);
				        ta.append("\n");
				        ta.append("�~�J�����n�ʏ��ʁF" + name);
				        ta.append("\n");
				        ta.append("�N�F" + score);
				        ta.append("\n");
				    }
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 }else{
		    Graph_View graph = new Graph_View();
			graph.setBounds(5,5,665,445);
			graph.setVisible(true);
	 }
	}
	
    @Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
