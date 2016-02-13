package lesson17;
import java.awt.Color;

import javax.swing.JButton;

	class Button extends JButton{
		private Color color;
		boolean isClicked;
		
		
		Button(String text, Color color){
			super(text);			
			this.setBackground(color);
			this.color=this.getBackground();
		}
		
		public static Button getClickedButton(Button b){
			if (b.isClicked){
				return b;
			}
			return null;
			}
		
		
		static String yourNumber(){
			String yourNumber="666";
			if("BLUE".equals(HWTest.PanelButtons.clickedButtonName)){
				if ("      5     10     27     33      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="27";
				}
				if ("      18     3     6     8      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="3";
				}
				if ("      2     15     11     19      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="19";
				}
				if ("      35     0     22     1      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="35";
				}
			}
			
			if("GREEN".equals(HWTest.PanelButtons.clickedButtonName)){
				if ("      5     10     27     33      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="5";
				}
				if ("      18     3     6     8      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="8";
				}
				if ("      2     15     11     19      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="15";
				}
				if ("      35     0     22     1      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="22";
				}
			}
			
			if("PINK".equals(HWTest.PanelButtons.clickedButtonName)){
				if ("      5     10     27     33      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="10";
				}
				if ("      18     3     6     8      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="18";
				}
				if ("      2     15     11     19      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="11";
				}
				if ("      35     0     22     1      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="1";
				}
			}
			
			if("YELLOW".equals(HWTest.PanelButtons.clickedButtonName)){
				if ("      5     10     27     33      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="33";
				}
				if ("      18     3     6     8      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="6";
				}
				if ("      2     15     11     19      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="2";
				}
				if ("      35     0     22     1      ".equals(buttonsPanelListener.buttonPanelName)){
					 yourNumber="0";
				}
			}
			
//			if(HWTest.PanelSouth.button.isClicked){
//			 if (HWTest.PanelButtons.buttonPan1.isClicked){
//				 yourNumber="27";
//			 }
//			 if (HWTest.PanelButtons.buttonPan2.isClicked){
//				 yourNumber="3";
//			 }
//			 if (HWTest.PanelButtons.buttonPan3.isClicked){
//				 yourNumber="19";
//			 }
//			 if (HWTest.PanelButtons.buttonPan4.isClicked){
//				 yourNumber="35";
//			 }
//			}
//			if(HWTest.PanelSouth.button1.isClicked){
//				 if (HWTest.PanelButtons.buttonPan1.isClicked){
//					 yourNumber="5";
//				 }
//				 if (HWTest.PanelButtons.buttonPan2.isClicked){
//					 yourNumber="8";
//				 }
//				 if (HWTest.PanelButtons.buttonPan3.isClicked){
//					 yourNumber="15";
//				 }
//				 if (HWTest.PanelButtons.buttonPan4.isClicked){
//					 yourNumber="22";
//				 }
//				}
//			if(HWTest.PanelSouth.button2.isClicked){
//				 if (HWTest.PanelButtons.buttonPan1.isClicked){
//					 yourNumber="10";
//				 }
//				 if (HWTest.PanelButtons.buttonPan2.isClicked){
//					 yourNumber="18";
//				 }
//				 if (HWTest.PanelButtons.buttonPan3.isClicked){
//					 yourNumber="11";
//				 }
//				 if (HWTest.PanelButtons.buttonPan4.isClicked){
//					 yourNumber="1";
//				 }
//				}
//			
//			if(HWTest.PanelSouth.button3.isClicked){
//				 if (HWTest.PanelButtons.buttonPan1.isClicked){
//					 yourNumber="33";
//				 }
//				 if (HWTest.PanelButtons.buttonPan2.isClicked){
//					 yourNumber="6";
//				 }
//				 if (HWTest.PanelButtons.buttonPan3.isClicked){
//					 yourNumber="2";
//				 }
//				 if (HWTest.PanelButtons.buttonPan4.isClicked){
//					 yourNumber="0";
//				 }
//				}
			
				
			
			return yourNumber;		
			
		}	
		

		
		public Color getColor() {
			return color;
		}
		public void setColor(Color color) {
			this.color = color;
		}
	}