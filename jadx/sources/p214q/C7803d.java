package p214q;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p175n.C7173c;
import p175n.C7183i;
import p227r.C8016i;
import p227r.C8024o;

/* renamed from: q.d */
public class C7803d {

    /* renamed from: a */
    private HashSet f22555a = null;

    /* renamed from: b */
    private int f22556b;

    /* renamed from: c */
    private boolean f22557c;

    /* renamed from: d */
    public final C7806e f22558d;

    /* renamed from: e */
    public final C7805b f22559e;

    /* renamed from: f */
    public C7803d f22560f;

    /* renamed from: g */
    public int f22561g = 0;

    /* renamed from: h */
    int f22562h = Integer.MIN_VALUE;

    /* renamed from: i */
    C7183i f22563i;

    /* renamed from: q.d$a */
    static /* synthetic */ class C7804a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22564a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                q.d$b[] r0 = p214q.C7803d.C7805b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22564a = r0
                q.d$b r1 = p214q.C7803d.C7805b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22564a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.d$b r1 = p214q.C7803d.C7805b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22564a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.d$b r1 = p214q.C7803d.C7805b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22564a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.d$b r1 = p214q.C7803d.C7805b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22564a     // Catch:{ NoSuchFieldError -> 0x003e }
                q.d$b r1 = p214q.C7803d.C7805b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22564a     // Catch:{ NoSuchFieldError -> 0x0049 }
                q.d$b r1 = p214q.C7803d.C7805b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f22564a     // Catch:{ NoSuchFieldError -> 0x0054 }
                q.d$b r1 = p214q.C7803d.C7805b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f22564a     // Catch:{ NoSuchFieldError -> 0x0060 }
                q.d$b r1 = p214q.C7803d.C7805b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f22564a     // Catch:{ NoSuchFieldError -> 0x006c }
                q.d$b r1 = p214q.C7803d.C7805b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p214q.C7803d.C7804a.<clinit>():void");
        }
    }

    /* renamed from: q.d$b */
    public enum C7805b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C7803d(C7806e eVar, C7805b bVar) {
        this.f22558d = eVar;
        this.f22559e = bVar;
    }

    /* renamed from: a */
    public boolean mo22569a(C7803d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            mo22584p();
            return true;
        } else if (!z && !mo22583o(dVar)) {
            return false;
        } else {
            this.f22560f = dVar;
            if (dVar.f22555a == null) {
                dVar.f22555a = new HashSet();
            }
            HashSet hashSet = this.f22560f.f22555a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f22561g = i;
            this.f22562h = i2;
            return true;
        }
    }

    /* renamed from: b */
    public void mo22570b(int i, ArrayList arrayList, C8024o oVar) {
        HashSet hashSet = this.f22555a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C8016i.m30448a(((C7803d) it.next()).f22558d, i, arrayList, oVar);
            }
        }
    }

    /* renamed from: c */
    public HashSet mo22571c() {
        return this.f22555a;
    }

    /* renamed from: d */
    public int mo22572d() {
        if (!this.f22557c) {
            return 0;
        }
        return this.f22556b;
    }

    /* renamed from: e */
    public int mo22573e() {
        C7803d dVar;
        if (this.f22558d.mo22625T() == 8) {
            return 0;
        }
        if (this.f22562h == Integer.MIN_VALUE || (dVar = this.f22560f) == null || dVar.f22558d.mo22625T() != 8) {
            return this.f22561g;
        }
        return this.f22562h;
    }

    /* renamed from: f */
    public final C7803d mo22574f() {
        switch (C7804a.f22564a[this.f22559e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f22558d.f22602Q;
            case 3:
                return this.f22558d.f22600O;
            case 4:
                return this.f22558d.f22603R;
            case 5:
                return this.f22558d.f22601P;
            default:
                throw new AssertionError(this.f22559e.name());
        }
    }

    /* renamed from: g */
    public C7806e mo22575g() {
        return this.f22558d;
    }

    /* renamed from: h */
    public C7183i mo22576h() {
        return this.f22563i;
    }

    /* renamed from: i */
    public C7803d mo22577i() {
        return this.f22560f;
    }

    /* renamed from: j */
    public C7805b mo22578j() {
        return this.f22559e;
    }

    /* renamed from: k */
    public boolean mo22579k() {
        HashSet hashSet = this.f22555a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C7803d) it.next()).mo22574f().mo22582n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo22580l() {
        HashSet hashSet = this.f22555a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo22581m() {
        return this.f22557c;
    }

    /* renamed from: n */
    public boolean mo22582n() {
        return this.f22560f != null;
    }

    /* renamed from: o */
    public boolean mo22583o(C7803d dVar) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (dVar == null) {
            return false;
        }
        C7805b j = dVar.mo22578j();
        C7805b bVar = this.f22559e;
        if (j != bVar) {
            switch (C7804a.f22564a[bVar.ordinal()]) {
                case 1:
                    if (j == C7805b.BASELINE || j == C7805b.CENTER_X || j == C7805b.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (j == C7805b.LEFT || j == C7805b.RIGHT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(dVar.mo22575g() instanceof C7810g)) {
                        return z;
                    }
                    if (z || j == C7805b.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                case 4:
                case 5:
                    if (j == C7805b.TOP || j == C7805b.BOTTOM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(dVar.mo22575g() instanceof C7810g)) {
                        return z2;
                    }
                    if (z2 || j == C7805b.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                case 6:
                    if (j == C7805b.LEFT || j == C7805b.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f22559e.name());
            }
        } else if (bVar != C7805b.BASELINE || (dVar.mo22575g().mo22633X() && mo22575g().mo22633X())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: p */
    public void mo22584p() {
        HashSet hashSet;
        C7803d dVar = this.f22560f;
        if (!(dVar == null || (hashSet = dVar.f22555a) == null)) {
            hashSet.remove(this);
            if (this.f22560f.f22555a.size() == 0) {
                this.f22560f.f22555a = null;
            }
        }
        this.f22555a = null;
        this.f22560f = null;
        this.f22561g = 0;
        this.f22562h = Integer.MIN_VALUE;
        this.f22557c = false;
        this.f22556b = 0;
    }

    /* renamed from: q */
    public void mo22585q() {
        this.f22557c = false;
        this.f22556b = 0;
    }

    /* renamed from: r */
    public void mo22586r(C7173c cVar) {
        C7183i iVar = this.f22563i;
        if (iVar == null) {
            this.f22563i = new C7183i(C7183i.C7184a.UNRESTRICTED, (String) null);
        } else {
            iVar.mo21510f();
        }
    }

    /* renamed from: s */
    public void mo22587s(int i) {
        this.f22556b = i;
        this.f22557c = true;
    }

    public String toString() {
        return this.f22558d.mo22676r() + ":" + this.f22559e.toString();
    }
}
