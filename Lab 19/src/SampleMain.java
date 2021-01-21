/**
 * Aim: Modifying a Java GUI. Create a new project in Eclipse called Lab19.
 * Import the classes SampleGUI, SampleGUIMain and FileMenuHandler from
 * Z:\Lab19, and look at and run the code.
 * 
 * Notice that SampleGUI has a helper method called createEditMenu. Fill in this
 * method so that it creates another Menu with the name "Edit", and that has
 * JMenuItems called "Find" and "Replace." (Use a lot of cut and paste from
 * createFileMenu.)
 * 
 * Create another class called EditMenuHandler and associate this handler with
 * the menu items "Find" and "Replace." This can easily be done by creating the
 * class EditMenuHandler in Eclipse, and cutting and pasting the code from
 * FileMenuHandler into it, and doing the appropriate renaming.
 * 
 * Run the program SampleGuiMain and observe that clicking on the Edit menu
 * choices also causes an appropriate messageDialog to appear.
 * 
 * look up JFileChooser tutorial
 * 
 * @author girlswhocode
 * @since 11/02/20
 *
 */
public class SampleMain {
    static SampleGUI sampleGUI; // Static because we want one unique GUI object

    public static void main(String[] args) {
        sampleGUI = new SampleGUI("My Sample GUI", 500, 300);
    }
}
