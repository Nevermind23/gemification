package p380ck;

/* renamed from: ck.h */
public abstract class C10464h {

    /* renamed from: ck.h$a */
    public enum C10465a {
        FACEBOOK,
        FIREBASE,
        FACEBOOKANDFIREBASE
    }

    /* renamed from: ck.h$b */
    public enum C10466b {
        MORE,
        PRODUCT
    }

    /* renamed from: ck.h$c */
    public enum C10467c {
        NEW,
        EXISTING
    }

    /* renamed from: a */
    public static String m38032a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 18:
                return "products";
            case 8:
            case 9:
            case 10:
            case 15:
            case 16:
            case 17:
                return "more_loyalty_programs";
            default:
                return "";
        }
    }

    /* renamed from: b */
    public static String m38033b(int i) {
        switch (i) {
            case 1:
                return "accounts";
            case 2:
                return "credit_cards";
            case 3:
                return "loans";
            case 4:
                return "deposits";
            case 5:
                return "bonds_and_shares";
            case 8:
                return "mr";
            case 9:
                return "cas";
            case 10:
                return "cashback";
            case 15:
                return "scool";
            case 16:
                return "plus";
            case 17:
                return "prllot";
            case 18:
                return "pension";
            default:
                return "";
        }
    }
}
