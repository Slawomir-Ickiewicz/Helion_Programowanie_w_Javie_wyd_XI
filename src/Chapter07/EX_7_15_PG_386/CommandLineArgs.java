package Chapter07.EX_7_15_PG_386;

public class CommandLineArgs {

    public static void main(String[] args) {


        int[] array;
        if (args.length != 0)
        {
            int arrayLength = Integer.parseInt(args[0]); // save args to variable or wa can use int directly in new int
            array = new int[arrayLength];
        }
        else
        {
            System.out.print("No command-line argument. \n");
            array = new int[10];
        }

        // declare variable array and initialize it with array object
        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);


    }

    }

