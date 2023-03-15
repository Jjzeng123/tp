package seedu.duke.ui;

import java.util.Scanner;

/**
 * Contains the UI helpers for the current Duke session.
 */
public class DukeUI {

    private static final String LOGO =
            " ____        _        \n"
                    + "|  _ \\ _   _| | _____ \n"
                    + "| | | | | | | |/ / _ \\\n"
                    + "| |_| | |_| |   <  __/\n"
                    + "|____/ \\__,_|_|\\_\\___|\n";

    private static final String DIVIDER = "___________________________________________________________________________";

    private Scanner scanner;

    public DukeUI(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Returns a string representing the next command the user enters.
     * @return the next command string.
     */
    public String getNextCommandString() {
        return this.scanner.nextLine();
    }

    /**
     * Prints the welcome message.
     */
    public void printIntroduction() {
        System.out.println(this.LOGO);
    }

    /**
     * Prints the provided message.
     * @param message the message to print.
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Prints help messages for the "help" command.
     */

    public void printHelpMessages() {
        printHelpMessageHeader();
        printListIngredientsHelp();
        printAddCommandHelp();
        printRemoveCommandHelp();
        printRecipePossibleHelp();
        printRecipeAllHelp();
        printByeCommandHelp();
    }

    private static void printHelpMessageHeader() {
        System.out.println("COMMAND SUMMARY:");
        System.out.println(DIVIDER);
    }

    private static void printByeCommandHelp() {
        System.out.println("Command: bye");
        System.out.println("Exits the program");
        System.out.println(DIVIDER);
    }

    private static void printRecipeAllHelp() {
        System.out.println("Command: recipe all");
        System.out.println("Lists out all the recipes currently stored in the recipe inventory.");
        System.out.println(DIVIDER);
    }

    private static void printRecipePossibleHelp() {
        System.out.println("Command: recipe possible");
        System.out.println("Lists out all the recipes that can be made by the ingredients that are currently " +
                "in the ingredient inventory.");
        System.out.println(DIVIDER);
    }

    private static void printRemoveCommandHelp() {
        System.out.println("Command: remove <ingredient> /qty <quantity>");
        System.out.println("Remove an ingredient of specified quantity from your ingredient inventory.");
        System.out.println(DIVIDER);
    }

    private static void printAddCommandHelp() {
        System.out.println("Command: add <ingredient> /qty <quantity>");
        System.out.println("Add an ingredient of specified quantity to your ingredient inventory.");
        System.out.println(DIVIDER);
    }

    private static void printListIngredientsHelp() {
        System.out.println("Command: ingredients list");
        System.out.println("Lists out current ingredients and their respective quantities stored in the fridge.");
        System.out.println(DIVIDER);
    }
}
