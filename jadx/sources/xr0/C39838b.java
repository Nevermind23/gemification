package xr0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37129d;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.model.payment.UpcomingPayment;

/* renamed from: xr0.b */
public enum C39838b {
    INSTALLMENT("Installment", new Image.Resource(C37129d.illustration_installment, (Boolean) null, 2, (DefaultConstructorMarker) null)),
    AUTO("AVTO", new Image.Resource(C37129d.illustration_auto_loan, (Boolean) null, 2, (DefaultConstructorMarker) null)),
    CONSUMER("CONSUMER", new Image.Resource(C37129d.illustration_consumer_loan, (Boolean) null, 2, (DefaultConstructorMarker) null)),
    COMMERCIAL("COMMERCIAL", new Image.Resource(C37129d.illustration_commercial_loan, (Boolean) null, 2, (DefaultConstructorMarker) null)),
    DEPOSIT_LOAN("Deposit Loan", new Image.Resource(C37129d.illustration_deposit_loan, (Boolean) null, 2, (DefaultConstructorMarker) null)),
    EXPRESS("Express", new Image.Resource(C37129d.illustration_express_loan, (Boolean) null, 2, (DefaultConstructorMarker) null)),
    INSURANCE("Insurance", new Image.Resource(C37129d.illustration_insurance, (Boolean) null, 2, (DefaultConstructorMarker) null)),
    MORTGAGE_LOAN("Mortgage loan", new Image.Resource(C37129d.illustration_mortgage_loan, (Boolean) null, 2, (DefaultConstructorMarker) null)),
    STUDENT_LOAN("Student Loan", new Image.Resource(C37129d.illustration_student_loan, (Boolean) null, 2, (DefaultConstructorMarker) null)),
    PAWN_SHOP(UpcomingPayment.PROD_CODE_TYPE_PAWN, new Image.Resource(C37129d.illustration_pawn_shop_loan, (Boolean) null, 2, (DefaultConstructorMarker) null));
    

    /* renamed from: f */
    public static final C39839a f94557f = null;

    /* renamed from: d */
    private final String f94569d;

    /* renamed from: e */
    private final Image f94570e;

    /* renamed from: xr0.b$a */
    public static final class C39839a {
        private C39839a() {
        }

        public /* synthetic */ C39839a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39838b mo93543a(String str) {
            C41536l.m120489i(str, "prodType");
            for (C39838b bVar : C39838b.values()) {
                if (C41536l.m120484d(bVar.mo93542c(), str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f94557f = new C39839a((DefaultConstructorMarker) null);
    }

    private C39838b(String str, Image image) {
        this.f94569d = str;
        this.f94570e = image;
    }

    /* renamed from: b */
    public final Image mo93541b() {
        return this.f94570e;
    }

    /* renamed from: c */
    public final String mo93542c() {
        return this.f94569d;
    }
}
