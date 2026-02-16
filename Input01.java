import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        
        String userString = JOptionPane.showInputDialog("Input something: ");
        System.out.println(userString);
        
        
        //Parse the input as an int.
        //Print its value +1
        
        int userInt = Integer.parseInt(userString);
        System.out.println(++userInt);
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Input integer: ")));

        
    }
}
