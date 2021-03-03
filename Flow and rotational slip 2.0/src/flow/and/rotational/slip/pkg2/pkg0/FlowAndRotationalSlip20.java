
package flow.and.rotational.slip.pkg2.pkg0;

import java.util.Scanner;

public class FlowAndRotationalSlip20 {

    public static void main(String[] args) {
              
   Scanner input = new Scanner(System.in);
  boolean mainLoop = true;
        int option = 0;

        do {
            option = showMenu(input);

            switch (option) {

                case 1:
                    calculateFlowRate(input);
                    break;

                case 2:
                    calculateRotationalDisplacement(input);
                    break;

                case 3:
                    calculateRunoffRainwater(input);
                    break;

                case 4:
                    TransformHoursToMinutes(input);
                    break;

                case 5:
                    transformSecondsToMinutes(input);
                    break;

                case 6:
                    transformKilometersToMeters(input);
                    break;

                case 0:
                    showExit();
                    break;
                    
                default:
                    doError();
                    break;

            }

        } while (option != 0);
    }
    
    private static int showMenu(Scanner input) {
        int option;
        System.out.println("Hello, choose an option");
        System.out.println("1.-Calculate the flow rate by speed and time");
        System.out.println("2.-Calculate the rotational displacement of a "
                + "landslide using : Width of the break surface, length of"
                + " the break surface and depth of the break surface by "
                + "perpendicularity to the original topography "
                + "of the terrain.");
        System.out.println("3.- Calculate runoff of rainwater");
        System.out.println("4.- Transform from hours --> minutes ");
        System.out.println("5.- Transform from seconds --> minutes ");
        System.out.println("6.- Transform from kilometers --> meters ");
        System.out.println("0.- Exit");
        System.out.println("Enter your menu option-->");
        option = (int) input.nextFloat();
        return option;
  