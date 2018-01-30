package arraylist;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
public class MainInside {
    
    public static void main(String[] args) {
        boolean running = true;
        String msg = "";
        StudentFirstNames a2 = new StudentFirstNames();
       //UIManager.put("OptionPane.background", new ColorUIResource(2, 144, 231));
        //UIManager.put("Panel.background", new ColorUIResource(2, 144, 231));
        while (running == true) {
            Object[] possibilities = { "Add student", "Delete a student", "List students", "Replace a student",
                    "Exit" };
            String showFirst = "Add student";
            String s = (String) JOptionPane.showInputDialog(null, "Please make your selection.", "Start Here",
                    JOptionPane.PLAIN_MESSAGE, null, possibilities, showFirst);
            if (s.equalsIgnoreCase("Add student")) {
                a2.Ask();
            } else if (s.equalsIgnoreCase("Delete a student")) {
                a2.removeName();
            } else if (s.equalsIgnoreCase("List students")) {
                a2.StudentList();
            } else if (s.equalsIgnoreCase("Replace a student")) {
                a2.ReplaceName();
            } else {
                System.exit(0);
            }
            msg = "Do you want go again?";
            String goAgain = JOptionPane.showInputDialog(null, msg).toLowerCase();
            if (goAgain.equals("y") || (goAgain.equals("yes"))) {
                running = true;
            } else if (goAgain.equals("n") || (goAgain.equals("no"))) {
                running = false;
                msg = "Have a good day!";
                JOptionPane.showMessageDialog(null, msg);
            } else {
                msg = "Please try again";
                JOptionPane.showMessageDialog(null, msg);
            }
        }
    }
    /*
     * private static void GradingRequrements() { System.out.println(
     * "1. ALL JOP and jar'd\n" +
     * "2. First is a menu asking for desired option, looped" +
     * "3. menu: Show Names, Add name, Remove name, Replace name, exit"
     *
     * );
     */
}
