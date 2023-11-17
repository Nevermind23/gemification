package p319y1;

import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import p255t1.C8311c;
import p255t1.C8331u;
import p307x1.C8936b;
import p331z1.C9169b;

/* renamed from: y1.s */
public class C9033s implements C9011c {

    /* renamed from: a */
    private final String f25156a;

    /* renamed from: b */
    private final C9034a f25157b;

    /* renamed from: c */
    private final C8936b f25158c;

    /* renamed from: d */
    private final C8936b f25159d;

    /* renamed from: e */
    private final C8936b f25160e;

    /* renamed from: f */
    private final boolean f25161f;

    /* renamed from: y1.s$a */
    public enum C9034a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: b */
        public static C9034a m33453b(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public C9033s(String str, C9034a aVar, C8936b bVar, C8936b bVar2, C8936b bVar3, boolean z) {
        this.f25156a = str;
        this.f25157b = aVar;
        this.f25158c = bVar;
        this.f25159d = bVar2;
        this.f25160e = bVar3;
        this.f25161f = z;
    }

    /* renamed from: a */
    public C8311c mo24359a(C2315d0 d0Var, C2325h hVar, C9169b bVar) {
        return new C8331u(bVar, this);
    }

    /* renamed from: b */
    public C8936b mo24512b() {
        return this.f25159d;
    }

    /* renamed from: c */
    public String mo24513c() {
        return this.f25156a;
    }

    /* renamed from: d */
    public C8936b mo24514d() {
        return this.f25160e;
    }

    /* renamed from: e */
    public C8936b mo24515e() {
        return this.f25158c;
    }

    /* renamed from: f */
    public C9034a mo24516f() {
        return this.f25157b;
    }

    /* renamed from: g */
    public boolean mo24517g() {
        return this.f25161f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f25158c + ", end: " + this.f25159d + ", offset: " + this.f25160e + "}";
    }
}
