package p324y6;

import com.google.android.gms.fido.fido2.api.common.C4032a;

/* renamed from: y6.a */
public enum C9064a implements C4032a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ES384(-35),
    ES512(-36);
    

    /* renamed from: d */
    private final int f25252d;

    private C9064a(int i) {
        this.f25252d = i;
    }

    /* renamed from: a */
    public int mo12587a() {
        return this.f25252d;
    }
}
