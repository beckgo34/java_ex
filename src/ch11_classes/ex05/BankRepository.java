package ch11_classes.ex05;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {
    private static List<ClientDTO> clientDTOList = new ArrayList<>();
    private static List<AccountDTO> accountDTOList = new ArrayList<>();

//    public ClientDTO check(String accountNumber, String clientPass) {
//        ClientDTO clientDTO = null;
//        for (int i = 0; i < clientDTOList.size(); i++) {
//            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber()) && clientPass.equals(clientDTOList.get(i).getClienPass())) {
//            }
//        }
//        return clientDTO;
//    }

    public boolean sava(ClientDTO clientDTO) {
        return clientDTOList.add(clientDTO);
    }


    public ClientDTO findBalance(String accountNumber) {
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                return clientDTOList.get(i);
            }
        }
        return null;
    }

    public ClientDTO deposit(String accountNumber, long deposit) {
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                 deposit += deposit++;
                clientDTOList.get(i).setBalance(deposit);
                for (int j = 0; j < accountDTOList.size(); j++) {
                    accountDTOList.get(i).setDeposit(deposit);
                }
                return clientDTOList.get(i);
            }
        }
        return null;
    }

    public boolean withdraw(String accountNumber, String clientPass, long withdraw) {
        boolean result = false;
        for (int i = 0; i < clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber()) && clientPass.equals(clientDTOList.get(i).getClienPass())) {
                if (withdraw < clientDTOList.get(i).getBalance()) {
                        long balance = clientDTOList.get(i).getBalance() - withdraw;
                        clientDTOList.get(i).setBalance(balance);
                }
            }
            result = true;
        }
        return result;
    }

    public boolean allList() {
        boolean result = false;
        for (int i = 0; i < accountDTOList.size(); i++) {
            System.out.println(accountDTOList.get(i));
        }
        return result;
    }
}
