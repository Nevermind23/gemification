package p341ge.bog.mobilebank.eventbus.events;

/* renamed from: ge.bog.mobilebank.eventbus.events.SwipeItemClickEvent */
public class SwipeItemClickEvent {
    public static final int ADD_AMOUNT = 8;
    public static final int ADD_MONEY = 7;
    public static final int CARD_3D_SECURITY = 13;
    public static final int CARD_BLOCK = 12;
    public static final int CARD_INSURANCE = 14;
    public static final int CARD_RENEWAL = 24;
    public static final int CARD_UNBLOCK = 25;
    public static final int CAS = 9;
    public static final int CAS_DEACTIVATE = 17;
    public static final int DEPOSIT_GOAL_ADD = 24;
    public static final int DEPOSIT_GOAL_EDIT = 25;
    public static final int DEPOSIT_VIOLATION = 23;
    public static final int EDIT = 1;
    public static final int EXCHANGE_TO_PLUS_POINTS = 31;
    public static final int EXPRESS_EXCHANGE_POINTS = 16;
    public static final int FAVORTIE = 11;
    public static final int FILL_LIMIT = 15;
    public static final int HIDE_ACC = 10;
    public static final int HIDE_PENSION = 26;
    public static final int INSTALLMENT_REVERSAL = 28;
    public static final int INSTALLMENT_REVERSAL_STATUS = 29;
    public static final int LOAN_PAYMENT = 21;
    public static final int LOAN_PREPAYMENT = 22;
    public static final int OVAL_CONTAINER = 3;
    public static final int PAWN_LOAN_PAYMENT = 32;
    public static final int PAYMENT = 4;
    public static final int PLUS_EXCHANGE_POINTS = 18;
    public static final int PLUS_INVITE = 20;
    public static final int REQUISITE = 30;
    public static final int SHARE = 2;
    public static final int SHOW_DIGITAL_DETAILS = 27;
    public static final int STATEMENT = 6;
    public static final int TRANSFER = 5;
    public static final int TRANSFER_PLUS_POINTS = 19;
    private int additionalData;
    private int index;
    private int position;
    private long productKey;
    private int type;

    public SwipeItemClickEvent(int i, long j) {
        this.index = i;
        this.productKey = j;
    }

    public int getAdditionalData() {
        return this.additionalData;
    }

    public int getIndex() {
        return this.index;
    }

    public int getPosition() {
        return this.position;
    }

    public long getProductKey() {
        return this.productKey;
    }

    public int getType() {
        return this.type;
    }

    public void setAdditionalData(int i) {
        this.additionalData = i;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public SwipeItemClickEvent(int i) {
        this(i, -1);
    }
}
