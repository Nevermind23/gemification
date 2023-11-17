package p324y6;

import com.google.android.gms.fido.fido2.api.common.C4032a;

/* renamed from: y6.b */
public enum C9065b implements C4032a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);
    

    /* renamed from: d */
    private final int f25262d;

    private C9065b(int i) {
        this.f25262d = i;
    }

    /* renamed from: a */
    public int mo12587a() {
        return this.f25262d;
    }
}
