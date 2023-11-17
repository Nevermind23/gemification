package p319y1;

import android.graphics.Paint;
import com.airbnb.lottie.C2315d0;
import com.airbnb.lottie.C2325h;
import java.util.List;
import p255t1.C8311c;
import p255t1.C8330t;
import p307x1.C8935a;
import p307x1.C8936b;
import p307x1.C8938d;
import p331z1.C9169b;

/* renamed from: y1.r */
public class C9029r implements C9011c {

    /* renamed from: a */
    private final String f25136a;

    /* renamed from: b */
    private final C8936b f25137b;

    /* renamed from: c */
    private final List f25138c;

    /* renamed from: d */
    private final C8935a f25139d;

    /* renamed from: e */
    private final C8938d f25140e;

    /* renamed from: f */
    private final C8936b f25141f;

    /* renamed from: g */
    private final C9031b f25142g;

    /* renamed from: h */
    private final C9032c f25143h;

    /* renamed from: i */
    private final float f25144i;

    /* renamed from: j */
    private final boolean f25145j;

    /* renamed from: y1.r$a */
    static /* synthetic */ class C9030a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25146a;

        /* renamed from: b */
        static final /* synthetic */ int[] f25147b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                y1.r$c[] r0 = p319y1.C9029r.C9032c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25147b = r0
                r1 = 1
                y1.r$c r2 = p319y1.C9029r.C9032c.BEVEL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25147b     // Catch:{ NoSuchFieldError -> 0x001d }
                y1.r$c r3 = p319y1.C9029r.C9032c.MITER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f25147b     // Catch:{ NoSuchFieldError -> 0x0028 }
                y1.r$c r4 = p319y1.C9029r.C9032c.ROUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                y1.r$b[] r3 = p319y1.C9029r.C9031b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f25146a = r3
                y1.r$b r4 = p319y1.C9029r.C9031b.BUTT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f25146a     // Catch:{ NoSuchFieldError -> 0x0043 }
                y1.r$b r3 = p319y1.C9029r.C9031b.ROUND     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f25146a     // Catch:{ NoSuchFieldError -> 0x004d }
                y1.r$b r1 = p319y1.C9029r.C9031b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p319y1.C9029r.C9030a.<clinit>():void");
        }
    }

    /* renamed from: y1.r$b */
    public enum C9031b {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: b */
        public Paint.Cap mo24510b() {
            int i = C9030a.f25146a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    /* renamed from: y1.r$c */
    public enum C9032c {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: b */
        public Paint.Join mo24511b() {
            int i = C9030a.f25147b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public C9029r(String str, C8936b bVar, List list, C8935a aVar, C8938d dVar, C8936b bVar2, C9031b bVar3, C9032c cVar, float f, boolean z) {
        this.f25136a = str;
        this.f25137b = bVar;
        this.f25138c = list;
        this.f25139d = aVar;
        this.f25140e = dVar;
        this.f25141f = bVar2;
        this.f25142g = bVar3;
        this.f25143h = cVar;
        this.f25144i = f;
        this.f25145j = z;
    }

    /* renamed from: a */
    public C8311c mo24359a(C2315d0 d0Var, C2325h hVar, C9169b bVar) {
        return new C8330t(d0Var, bVar, this);
    }

    /* renamed from: b */
    public C9031b mo24500b() {
        return this.f25142g;
    }

    /* renamed from: c */
    public C8935a mo24501c() {
        return this.f25139d;
    }

    /* renamed from: d */
    public C8936b mo24502d() {
        return this.f25137b;
    }

    /* renamed from: e */
    public C9032c mo24503e() {
        return this.f25143h;
    }

    /* renamed from: f */
    public List mo24504f() {
        return this.f25138c;
    }

    /* renamed from: g */
    public float mo24505g() {
        return this.f25144i;
    }

    /* renamed from: h */
    public String mo24506h() {
        return this.f25136a;
    }

    /* renamed from: i */
    public C8938d mo24507i() {
        return this.f25140e;
    }

    /* renamed from: j */
    public C8936b mo24508j() {
        return this.f25141f;
    }

    /* renamed from: k */
    public boolean mo24509k() {
        return this.f25145j;
    }
}
