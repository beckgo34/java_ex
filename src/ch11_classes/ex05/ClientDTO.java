package ch11_classes.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientDTO {
    private Long id;
    private String clientName;// 고객이름
    private String accountNumber;// 계좌번호
    private String clienPass;// 계좌비빌번호
    private long balance;// 잔고
    private String clientCreatedAy;// 가입일자



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClienPass() {
        return clienPass;
    }

    public void setClienPass(String clienPass) {
        this.clienPass = clienPass;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getClientCreatedAy() {
        return clientCreatedAy;
    }

    public void setClientCreatedAy(String clientCreatedAy) {
        this.clientCreatedAy = clientCreatedAy;
    }

    public ClientDTO() {
    }

    private static Long idVlaue = 1L;
    public ClientDTO(String clientName, String accountNumber, String clienPass) {
        this.id = idVlaue++;
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.clienPass = clienPass;
        this.balance = balance;
        this.clientCreatedAy = LocalDateTime.now().format((DateTimeFormatter.ofPattern("yyyy-MM-dd- hh:mm:ss")));
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", clienPass='" + clienPass + '\'' +
                ", balance=" + balance +
                ", clientCreatedAy='" + clientCreatedAy + '\'' +
                '}';
    }
}
