package ec0;

import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import rb0.C27983b;
import rb0.C27984c;

/* renamed from: ec0.b */
public enum C20210b {
    PIGGY_BANK(C34646b.m101748b("deposits.piggybank.banner.description", new Object[0]), C34646b.m101748b("deposits.piggybank.banner.button", new Object[0]), C27984c.f71242r, C27983b.color_support_third_tr_400),
    AUTOMATIC_TRANSFER(C34646b.m101748b("deposits.sto.banner.description", new Object[0]), C34646b.m101748b("deposits.sto.banner.button", new Object[0]), C27984c.f71245u, C27983b.color_pfm_shopping_main_500);
    

    /* renamed from: d */
    private final StringSource f54900d;

    /* renamed from: e */
    private final StringSource f54901e;

    /* renamed from: f */
    private final int f54902f;

    /* renamed from: g */
    private final int f54903g;

    private C20210b(StringSource stringSource, StringSource stringSource2, int i, int i2) {
        this.f54900d = stringSource;
        this.f54901e = stringSource2;
        this.f54902f = i;
        this.f54903g = i2;
    }

    /* renamed from: b */
    public final StringSource mo48621b() {
        return this.f54900d;
    }

    /* renamed from: c */
    public final StringSource mo48622c() {
        return this.f54901e;
    }

    /* renamed from: e */
    public final int mo48623e() {
        return this.f54902f;
    }

    /* renamed from: f */
    public final int mo48624f() {
        return this.f54903g;
    }
}
