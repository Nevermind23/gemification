package p341ge.bog.mobilebank.eventbus.events;

import hd0.C24978b;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.PlusReferralRegistrationEvent */
public class PlusReferralRegistrationEvent extends RootEvent {
    private C24978b creditCard;
    private C24978b deposit;
    private String firstName;
    private String idNumber;
    private C24978b ipo;
    private String lastName;
    private C24978b loan;
    private String phoneNumber;
    private C24978b solo;
    private C24978b soloClub;

    public C24978b getCreditCard() {
        return this.creditCard;
    }

    public C24978b getDeposit() {
        return this.deposit;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public C24978b getIpo() {
        return this.ipo;
    }

    public String getLastName() {
        return this.lastName;
    }

    public C24978b getLoan() {
        return this.loan;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public C24978b getSolo() {
        return this.solo;
    }

    public C24978b getSoloClub() {
        return this.soloClub;
    }

    public void setCreditCard(C24978b bVar) {
        this.creditCard = bVar;
    }

    public void setDeposit(C24978b bVar) {
        this.deposit = bVar;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setIdNumber(String str) {
        this.idNumber = str;
    }

    public void setIpo(C24978b bVar) {
        this.ipo = bVar;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setLoan(C24978b bVar) {
        this.loan = bVar;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setSolo(C24978b bVar) {
        this.solo = bVar;
    }

    public void setSoloClub(C24978b bVar) {
        this.soloClub = bVar;
    }
}
