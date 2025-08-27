/**
 *	FirstAssignment.java
 *	Display a brief description of your summer vacation on the screen.
 *
 *	To compile Linux:	javac -cp .:mvAcm.jar FirstAssignment.java
 *	To execute Linux:	java -cp .:mvAcm.jar FirstAssignment
 *
 *	To compile MS Powershell:	javac -cp ".;mvAcm.jar" FirstAssignment.java
 *	To execute MS Powershell:	java -cp ".;mvAcm.jar" FirstAssignment
 *
 *	@author	Yishan Lin
 *	@since	8/22/2025
 */
import java.awt.Font;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class FirstAssignment extends GraphicsProgram {
    
    public void run() {
    	//	The font to be used
    	Font f = new Font("Serif", Font.BOLD, 18);
    	
    	//	Line 1
    	GLabel s1 = new GLabel("What I did on my summer vacation ...", 10, 20);
    	s1.setFont(f);
    	add(s1);
    	    	
    	//	Continue adding lines until you have 12 to 15 lines
    	
    	//	Line 2
    	GLabel s2 = new GLabel("I had such an eye-opening summer vacation, and surely it is one I will not forget."
			+ " Heres where ", 10, 40);
		s2.setFont(f);
		add(s2);
		
    	//	Line 3
    	GLabel s3 = new GLabel("it all began. The week after the end of school, I started the summer as a summer camp"
			+ " leader", 10, 60);
		s3.setFont(f);
		add(s3);
		
    	//	Line 4
    	GLabel s4 = new GLabel("for a local art school, and it was a great experience for me to practice my leadership"
			+ " skills", 10, 80);
		s4.setFont(f);
		add(s4);
		
    	//	Line 5
    	GLabel s5 = new GLabel("for two weeks. Then the fun part came. I had an amazing opportunity to go on a two week"
			+ " tour", 10, 100);
		s5.setFont(f);
		add(s5);
		
    	//	Line 6
    	GLabel s6 = new GLabel("with San Jose Youth Symphony, going with my orchestra friends to beautiful venues across", 10, 120);
		s6.setFont(f);
		add(s6);
		
    	//	Line 7
    	GLabel s7 = new GLabel("Poland and Czechia. It was unforgettable playing in front of THOUSANDS of audience, and", 10, 140);
		s7.setFont(f);
		add(s7);
		
    	//	Line 8
    	GLabel s8 = new GLabel("absorbing the unique culture of Europe. Then a day after arriving back, I had a valuable", 10, 160);
		s8.setFont(f);
		add(s8);
		
    	//	Line 9
    	GLabel s9 = new GLabel("opportunity to attend a unique game design summer program at UCI, where I explored my", 10, 180);
		s9.setFont(f);
		add(s9);
		
    	//	Line 10
    	GLabel s10 = new GLabel("passion for game design, while getting to make new friends with students with similar interests", 10, 200);
		s10.setFont(f);
		add(s10);
		
    	//	Line 11
    	GLabel s11 = new GLabel("as me all across the state and beyond. Returning back from SoCal, I attended my orchestra's", 10, 220);
		s11.setFont(f);
		add(s11);
		
    	//	Line 12
    	GLabel s12 = new GLabel("week long camp, where I was given the priviledge to lead my section, Violin 2, as an assistant", 10, 240);
		s12.setFont(f);
		add(s12);
		
    	//	Line 13
    	GLabel s13 = new GLabel("principal. With the remaining week, I got to work on my personal coding projects and also", 10, 260);
		s13.setFont(f);
		add(s13);
		
    	//	Line 14
    	GLabel s14 = new GLabel("finalized ideas for a club I will found this year at MV with my friends, MAC (Music Art Code),", 10, 280);
		s14.setFont(f);
		add(s14);
		
    	//	Line 15
    	GLabel s15 = new GLabel("that explores the intersection between art and tech through meaningful projects. Now back, I", 10, 300);
		s15.setFont(f);
		add(s15);
		
		//	Line 16
    	GLabel s16 = new GLabel("am looking forward to such an exciting sophomore year, and I wonder where it will take me!", 10, 320);
		s16.setFont(f);
		add(s16);
    }
    
}
