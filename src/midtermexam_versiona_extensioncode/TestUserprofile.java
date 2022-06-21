/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author liangzeng
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your user name ");
        String name = input.nextLine();
        String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
        for (String genre : genres) {
            System.out.println(genre);
        }
        System.out.println("Please select the genre below that you prefered " );
        String genre = input.nextLine();
        
        UserProfile userProfile = new UserProfile(name, genre);
        System.out.println("Your user file has been created.");
    }
            
    
}
