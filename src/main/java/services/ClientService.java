package services;

import dao.clientDao.ClientDaoImpl;
import entities.Client;

import java.util.Scanner;

public class ClientService {

    public Client addNewClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter password: ");
        String clientPassword = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        Client client = new Client(firstName, lastName, clientPassword, email, phoneNumber);
        ClientDaoImpl clientDaoImpl = new ClientDaoImpl();
        clientDaoImpl.addNewClient(client);
        System.out.println("New profile has been created");

        return client;

    }

    public Client logIn() {
        Client clientFromDB = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        ClientDaoImpl clientDaoImpl = new ClientDaoImpl();

        System.out.println("Enter password: ");
        String clientPassword = scanner.nextLine();

        if (clientPassword.equals(clientFromDB.getClientPassword())) {
            System.out.println("Welcome");
            return clientFromDB;
        } else {
            System.out.println("Wrong password");
        }
        return null;
    }
}

