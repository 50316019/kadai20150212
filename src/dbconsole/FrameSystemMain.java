package dbconsole;
	import java.sql.ResultSet;
	import java.sql.SQLException;
public class FrameSystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameSystemController controller = new FrameSystemController();
		FrameSystemView frame = new FrameSystemView(controller);
		frame.setBounds(5,5,655,455);
		frame.setVisible(true);

	

				
			}

	}

