package com.pantherhackers.bootcamp.login;

public class LoginCredentials {

    private String cardNumber;
    private String pin;

    public LoginCredentials(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public static class Builder {
        private String cardNumber;
        private String pin;

        public void setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public void setPin(String pin) {
            this.pin = pin;
        }

        public LoginCredentials build(){
            return new LoginCredentials(cardNumber, pin);
        }
    }
}
