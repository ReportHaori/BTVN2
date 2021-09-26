import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Program {

	public static void main(String[] args) {
		Frame mFrame = new Frame("Tinh Tong");
		mFrame.setSize(400, 400);
		mFrame.setLocationRelativeTo(null);
		mFrame.setLayout(null);
		mFrame.setResizable(false);

		Label LblX = new Label("X = ");
		Label LblY = new Label("Y = ");
		Label lblSum = new Label("X + Y = ");

		TextField txtX = new TextField();
		TextField txtY = new TextField();
		TextField txtSum = new TextField();

		txtSum.setEditable(false);

		Button btnAdd = new Button("X + Y");

		mFrame.add(LblX);
		mFrame.add(txtX);
		mFrame.add(LblY);
		mFrame.add(txtY);
		mFrame.add(btnAdd);
		mFrame.add(lblSum);
		mFrame.add(txtSum);

		LblX.setLocation(50, 80);
		LblX.setSize(20, 20);
		txtX.setLocation(80, 80);
		txtX.setSize(160, 20);

		LblY.setLocation(50, 140);
		LblY.setSize(20, 20);
		txtY.setLocation(80, 140);
		txtY.setSize(160, 20);

		btnAdd.setLocation(125, 220);
		btnAdd.setSize(50, 30);

		lblSum.setLocation(40, 300);
		lblSum.setSize(50, 20);
		txtSum.setLocation(90, 300);
		txtSum.setSize(160, 20);

		ActionListener AnNut = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String StrX = txtX.getText();
				String StrY = txtY.getText();

				double x, y, sum;

				try {
					x = Double.parseDouble(StrX);
				} catch (Exception ex) {
					x = 0;
					txtX.setText(String.valueOf(a));
				}

				try {
					y = Double.parseDouble(StrY);
				} catch (Exception ex) {
					y = 0;
					txtY.setText(String.valueOf(b));
				}

				sum = x + y;
				txtSum.setText(String.valueOf(sum));
			}

		};

		btnAdd.addActionListener(AnNut);

		mFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		mFrame.setVisible(true);
	}

}
