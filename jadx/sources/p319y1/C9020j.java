package p319y1;

import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import p255t1.C8311c;
import p255t1.C8323n;
import p307x1.C8936b;
import p307x1.C8947m;
import p331z1.C9169b;

/* renamed from: y1.j */
public class C9020j implements C9011c {

    /* renamed from: a */
    private final String f25093a;

    /* renamed from: b */
    private final C9021a f25094b;

    /* renamed from: c */
    private final C8936b f25095c;

    /* renamed from: d */
    private final C8947m f25096d;

    /* renamed from: e */
    private final C8936b f25097e;

    /* renamed from: f */
    private final C8936b f25098f;

    /* renamed from: g */
    private final C8936b f25099g;

    /* renamed from: h */
    private final C8936b f25100h;

    /* renamed from: i */
    private final C8936b f25101i;

    /* renamed from: j */
    private final boolean f25102j;

    /* renamed from: k */
    private final boolean f25103k;

    /* renamed from: y1.j$a */
    public enum C9021a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: d */
        private final int f25107d;

        private C9021a(int i) {
            this.f25107d = i;
        }

        /* renamed from: b */
        public static C9021a m33394b(int i) {
            for (C9021a aVar : values()) {
                if (aVar.f25107d == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C9020j(String str, C9021a aVar, C8936b bVar, C8947m mVar, C8936b bVar2, C8936b bVar3, C8936b bVar4, C8936b bVar5, C8936b bVar6, boolean z, boolean z2) {
        this.f25093a = str;
        this.f25094b = aVar;
        this.f25095c = bVar;
        this.f25096d = mVar;
        this.f25097e = bVar2;
        this.f25098f = bVar3;
        this.f25099g = bVar4;
        this.f25100h = bVar5;
        this.f25101i = bVar6;
        this.f25102j = z;
        this.f25103k = z2;
    }

    /* renamed from: a */
    public C8311c mo24359a(C2315d0 d0Var, C2325h hVar, C9169b bVar) {
        return new C8323n(d0Var, bVar, this);
    }

    /* renamed from: b */
    public C8936b mo24455b() {
        return this.f25098f;
    }

    /* renamed from: c */
    public C8936b mo24456c() {
        return this.f25100h;
    }

    /* renamed from: d */
    public String mo24457d() {
        return this.f25093a;
    }

    /* renamed from: e */
    public C8936b mo24458e() {
        return this.f25099g;
    }

    /* renamed from: f */
    public C8936b mo24459f() {
        return this.f25101i;
    }

    /* renamed from: g */
    public C8936b mo24460g() {
        return this.f25095c;
    }

    /* renamed from: h */
    public C8947m mo24461h() {
        return this.f25096d;
    }

    /* renamed from: i */
    public C8936b mo24462i() {
        return this.f25097e;
    }

    /* renamed from: j */
    public C9021a mo24463j() {
        return this.f25094b;
    }

    /* renamed from: k */
    public boolean mo24464k() {
        return this.f25102j;
    }

    /* renamed from: l */
    public boolean mo24465l() {
        return this.f25103k;
    }
}
