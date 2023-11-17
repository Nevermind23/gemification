package xy0;

import p341ge.bog.mobilebank.model.payment.UpcomingPayment;

/* renamed from: xy0.v */
public enum C39958v {
    AUTO("Avto"),
    CONSUMER("CONSUMER"),
    COMMERCIAL_LOAN("Commercial loan"),
    ENERGO_CREDIT("EnergoCredit"),
    EXPRESS("Express"),
    INSTALLMENT("INSTALLMENT"),
    MORTGAGE_LOAN("Mortgage loan"),
    f94921l(UpcomingPayment.PROD_CODE_TYPE_PAWN),
    STUDENT_LOAN("Student Loan"),
    TRAVEL_LOAN("Travel Loan"),
    INSURANCE("Insurance");
    

    /* renamed from: d */
    private final String f94926d;

    private C39958v(String str) {
        this.f94926d = str;
    }

    /* renamed from: b */
    public final String mo93783b() {
        return this.f94926d;
    }
}
