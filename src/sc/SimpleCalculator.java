package sc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.*;
/*
 * Created by github.com/camotoad
 * GXY
 * */

public class SimpleCalculator extends Application implements EventHandler<ActionEvent>{

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, ba, bs, bd, bm, be, ce, c, dec;
	TextField display;


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage1) throws Exception{
		stage1.setTitle("Simple Calculator");

		b1 = new Button();
		b1.setText("1");
		b1.setOnAction(this);
		b1.setMinHeight(40);
		b1.setMinWidth(40);

		b2 = new Button();
		b2.setText("2");
		b2.setOnAction(this);
		b2.setMinHeight(40);
		b2.setMinWidth(40);

		b3 = new Button();
		b3.setText("3");
		b3.setOnAction(this);
		b3.setMinHeight(40);
		b3.setMinWidth(40);

		b4 = new Button();
		b4.setText("4");
		b4.setOnAction(this);
		b4.setMinHeight(40);
		b4.setMinWidth(40);

		b5 = new Button();
		b5.setText("5");
		b5.setOnAction(this);
		b5.setMinHeight(40);
		b5.setMinWidth(40);

		b6 = new Button();
		b6.setText("6");
		b6.setOnAction(this);
		b6.setMinHeight(40);
		b6.setMinWidth(40);

		b7 = new Button();
		b7.setText("7");
		b7.setOnAction(this);
		b7.setMinHeight(40);
		b7.setMinWidth(40);

		b8 = new Button();
		b8.setText("8");
		b8.setOnAction(this);
		b8.setMinHeight(40);
		b8.setMinWidth(40);

		b9 = new Button();
		b9.setText("9");
		b9.setOnAction(this);
		b9.setMinHeight(40);
		b9.setMinWidth(40);

		b0 = new Button();
		b0.setText("0");
		b0.setOnAction(this);
		b0.setMinHeight(40);
		b0.setMinWidth(40);

		dec = new Button();
		dec.setText(".");
		dec.setOnAction(this);
		dec.setMinHeight(40);
		dec.setMinWidth(40);

		ba = new Button();
		ba.setText("+");
		ba.setOnAction(this);
		ba.setMinHeight(40);
		ba.setMinWidth(60);

		bs = new Button();
		bs.setText("-");
		bs.setOnAction(this);
		bs.setMinHeight(40);
		bs.setMinWidth(60);

		bd = new Button();
		bd.setText("/");
		bd.setOnAction(this);
		bd.setMinHeight(40);
		bd.setMinWidth(60);

		bm = new Button();
		bm.setText("*");
		bm.setOnAction(this);
		bm.setMinHeight(40);
		bm.setMinWidth(60);

		c = new Button();
		c.setText("C");
		c.setOnAction(this);
		c.setMinHeight(40);
		c.setMinWidth(60);

		ce = new Button();
		ce.setText("CE");
		ce.setOnAction(this);
		ce.setMinHeight(40);
		ce.setMinWidth(60);

		be = new Button();
		be.setText("=");
		be.setOnAction(this);
		be.setMinHeight(40);
		be.setMinWidth(200);

		display = new TextField();
		display.setMinWidth(300);
		display.setMinHeight(40);
		display.setDisable(true);

		VBox vb = new VBox();
		HBox layout1 = new HBox();
		layout1.setPadding(new Insets(10,10,10,10));

		Region r = new Region();
		HBox layout2 = new HBox();
		layout2.setPadding(new Insets(10,10,10,10));
		layout2.setHgrow(r, Priority.ALWAYS);
		layout2.getChildren().addAll(b7,b8,b9,r,ce,c);
		layout2.setSpacing(10);

		Region r2 = new Region();
		HBox layout3 = new HBox();
		layout3.setPadding(new Insets(10,10,10,10));
		layout3.setHgrow(r2, Priority.ALWAYS);
		layout3.getChildren().addAll(b4,b5,b6 ,r2, ba, bs);
		layout3.setSpacing(10);

		Region r3 = new Region();
		HBox layout4 = new HBox();
		layout4.setPadding(new Insets(10,10,10,10));
		layout4.setHgrow(r3, Priority.ALWAYS);
		layout4.getChildren().addAll(b1,b2,b3, r3, bm, bd);
		layout4.setSpacing(10);

		HBox layout5 = new HBox();
		layout5.setPadding(new Insets(10,10,10,10));
		layout5.getChildren().addAll(b0, dec, be);
		layout5.setSpacing(10);

		layout1.getChildren().addAll(display);
		vb.getChildren().addAll(layout1, layout2, layout3, layout4, layout5);
		Scene scene = new Scene(vb,320,300);
		stage1.setScene(scene);
		stage1.show();

	}

	double var1=0;
	double var2=0;
	String op = null;
	String var = null;
	boolean pass = false;

	@Override
	public void handle(ActionEvent event){

		try {
			if(event.getSource()==b1)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+1);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"1");
				}
			}
			if(event.getSource()==b2)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+2);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"2");
				}
			}
			if(event.getSource()==b3)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+3);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"3");
				}
			}
			if(event.getSource()==b4)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+4);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"4");
				}
			}
			if(event.getSource()==b5)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+5);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"5");
				}
			}
			if(event.getSource()==b6)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+6);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"6");
				}
			}
			if(event.getSource()==b7)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+7);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"7");
				}
			}
			if(event.getSource()==b8)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+8);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"8");
				}
			}
			if(event.getSource()==b9)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+9);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"9");
				}
			}
			if(event.getSource()==b0)
			{
				if (display.getText() == "Error")
					display.setText("");
				if (pass == true)
				{
					display.setText(""+0);
					pass = false;
				}
				else
				{
					var = display.getText();
					display.setText(var+"0");
				}
			}
			if (event.getSource()==ce)
			{
				if (op == null)
				{
					var1 = 0;
				}
				else
				{
					var2 = 0;
				}
				display.setText("");
			}
			if (event.getSource()==c)
			{
				var1 = 0;
				var2 = 0;
				op = null;
				pass = false;
				display.setText("");
			}
			if (event.getSource() == ba)
			{
				if (op == null)
				{
					var1 = Double.valueOf(display.getText());
					display.setText("");
					op = "add";
				}
				else if (pass == false)
				{
					var2 = Double.valueOf(display.getText());
					double ans = var1+var2;
					var1 = ans;
					display.setText(""+ans);
					pass = true;
				}
				else{
					var2 = Double.valueOf(display.getText());
					display.setText("");
					pass = true;
				}

			}
			if (event.getSource() == bs)
			{
				if (op == null)
				{
					var1 = Double.valueOf(display.getText());
					display.setText("");
					op = "sub";
				}
				else if (pass == false)
				{
					var2 = Double.valueOf(display.getText());
					double ans = var1-var2;
					var1 = ans;
					display.setText(""+ans);
					pass = true;
				}
				else{
					var2 = Double.valueOf(display.getText());
					display.setText("");
					pass = true;
				}
			}
			if (event.getSource() == bd)
			{
				if (op == null)
				{
					var1 = Double.valueOf(display.getText());
					display.setText("");
					op = "div";
				}
				else if (pass == false)
				{
					var2 = Double.valueOf(display.getText());
					double ans = var1/var2;
					var1 = ans;
					display.setText(""+ans);
					pass = true;
				}
				else{
					var2 = Double.valueOf(display.getText());
					display.setText("");
					pass = true;
				}
			}
			if (event.getSource() == bm)
			{
				if (op == null)
				{
					var1 = Double.valueOf(display.getText());
					display.setText("");
					op = "mul";
				}
				else if (pass == false)
				{
					var2 = Double.valueOf(display.getText());
					double ans = var1*var2;
					var1 = ans;
					display.setText(""+ans);
					pass = true;
				}
				else{
					var2 = Double.valueOf(display.getText());
					display.setText("");
					pass = true;
				}
			}
			if (event.getSource()==dec)
			{
				if(display.getText().contains("."))
				{

				}
				else{
				var = display.getText();
				display.setText(var+".");
				}
			}
			if (event.getSource() == be)
			{
				var2 = Double.valueOf(display.getText());
				if(op != null){
				double ans = 0;
					switch(op)
					{
					case "add":
						ans = var1 + var2;
						break;
					case "sub":
						ans = var1 - var2;
						break;
					case "mul":
						ans = var1*var2;
						break;
					case "div":
						ans = var1/var2;
						break;
					default:
						System.out.println("default block");
						break;
					}
				display.setText(""+ans);
				}
				else{

				}
				var1 = 0;
				var2 = 0;
				op = null;
			}
		} catch (Exception e)
		{
			display.setText("Error");
			var1 = 0;
			var2 = 0;
			op = null;
		}
	}

}
