package q01;

/* renamed from: q01.a */
public enum C38098a {
    CARD_BLOCKED((String) null, "qr.atm.withdrawal.page.card.blocked"),
    INSUFFICIENT_FUNDS("qr.atm.withdrawal.page.withdrawal.amount.exceeds.availabe", "qr.atm.withdrawal.page.withdrawal.amount.exceeds.availabe.info"),
    INSUFFICIENT_FUNDS_SINGLE_CARD("qr.atm.withdrawal.page.withdrawal.amount.exceeds.availabe2", "qr.atm.withdrawal.page.withdrawal.amount.exceeds.availabe2.info"),
    NO_CARDS((String) null, "qr.atm.withdrawal.page.no.cards.found");
    

    /* renamed from: d */
    private final String f91507d;

    /* renamed from: e */
    private final String f91508e;

    private C38098a(String str, String str2) {
        this.f91507d = str;
        this.f91508e = str2;
    }

    /* renamed from: b */
    public final String mo91520b() {
        return this.f91508e;
    }

    /* renamed from: c */
    public final String mo91521c() {
        return this.f91507d;
    }
}
