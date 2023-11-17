package p341ge.bog.sso_client.models;

import sso.type.RecoveryProcessFlow;

/* renamed from: ge.bog.sso_client.models.i */
public enum C35942i {
    TRANSACTIONS(true, false, true, false, true),
    CONTACTS(true, true, false, false, true),
    ONBOARDING(false, false, false, true, false),
    OLD_FLOW(true, false, false, false, true),
    TRUSTED(true, false, false, false, true),
    UNKNOWN(false, false, false, false, false);
    

    /* renamed from: d */
    private final boolean f86967d;

    /* renamed from: e */
    private final boolean f86968e;

    /* renamed from: f */
    private final boolean f86969f;

    /* renamed from: g */
    private final boolean f86970g;

    /* renamed from: h */
    private final boolean f86971h;

    /* renamed from: ge.bog.sso_client.models.i$a */
    public /* synthetic */ class C35943a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86972a = null;

        static {
            int[] iArr = new int[C35942i.values().length];
            iArr[C35942i.TRANSACTIONS.ordinal()] = 1;
            iArr[C35942i.CONTACTS.ordinal()] = 2;
            f86972a = iArr;
        }
    }

    private C35942i(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f86967d = z;
        this.f86968e = z2;
        this.f86969f = z3;
        this.f86970g = z4;
        this.f86971h = z5;
    }

    /* renamed from: b */
    public final boolean mo88510b() {
        return this.f86970g;
    }

    /* renamed from: c */
    public final boolean mo88511c() {
        return this.f86971h;
    }

    /* renamed from: e */
    public final boolean mo88512e() {
        return this.f86968e;
    }

    /* renamed from: f */
    public final boolean mo88513f() {
        return this.f86969f;
    }

    /* renamed from: g */
    public final boolean mo88514g() {
        return this.f86967d;
    }

    /* renamed from: h */
    public final RecoveryProcessFlow mo88515h() {
        int i = C35943a.f86972a[ordinal()];
        if (i == 1) {
            return RecoveryProcessFlow.TRANSACTIONS;
        }
        if (i != 2) {
            return RecoveryProcessFlow.UNKNOWN__;
        }
        return RecoveryProcessFlow.CONTACTS;
    }
}
