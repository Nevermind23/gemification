package rg1;

import java.nio.ByteBuffer;
import pg1.C42200c;
import ug1.C43103b;

/* renamed from: rg1.g */
public abstract class C42379g implements C42378f {

    /* renamed from: a */
    private boolean f99628a = true;

    /* renamed from: b */
    private C42200c f99629b;

    /* renamed from: c */
    private ByteBuffer f99630c = C43103b.m123689a();

    /* renamed from: d */
    private boolean f99631d = false;

    /* renamed from: e */
    private boolean f99632e = false;

    /* renamed from: f */
    private boolean f99633f = false;

    /* renamed from: g */
    private boolean f99634g = false;

    /* renamed from: rg1.g$a */
    static /* synthetic */ class C42380a {

        /* renamed from: a */
        static final /* synthetic */ int[] f99635a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                pg1.c[] r0 = pg1.C42200c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f99635a = r0
                pg1.c r1 = pg1.C42200c.PING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f99635a     // Catch:{ NoSuchFieldError -> 0x001d }
                pg1.c r1 = pg1.C42200c.PONG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f99635a     // Catch:{ NoSuchFieldError -> 0x0028 }
                pg1.c r1 = pg1.C42200c.TEXT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f99635a     // Catch:{ NoSuchFieldError -> 0x0033 }
                pg1.c r1 = pg1.C42200c.BINARY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f99635a     // Catch:{ NoSuchFieldError -> 0x003e }
                pg1.c r1 = pg1.C42200c.CLOSING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f99635a     // Catch:{ NoSuchFieldError -> 0x0049 }
                pg1.c r1 = pg1.C42200c.CONTINUOUS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rg1.C42379g.C42380a.<clinit>():void");
        }
    }

    public C42379g(C42200c cVar) {
        this.f99629b = cVar;
    }

    /* renamed from: g */
    public static C42379g m122915g(C42200c cVar) {
        if (cVar != null) {
            switch (C42380a.f99635a[cVar.ordinal()]) {
                case 1:
                    return new C42381h();
                case 2:
                    return new C42382i();
                case 3:
                    return new C42383j();
                case 4:
                    return new C42373a();
                case 5:
                    return new C42374b();
                case 6:
                    return new C42375c();
                default:
                    throw new IllegalArgumentException("Supplied opcode is invalid");
            }
        } else {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
    }

    /* renamed from: a */
    public boolean mo97833a() {
        return this.f99632e;
    }

    /* renamed from: b */
    public boolean mo97834b() {
        return this.f99633f;
    }

    /* renamed from: c */
    public C42200c mo97835c() {
        return this.f99629b;
    }

    /* renamed from: d */
    public boolean mo97836d() {
        return this.f99634g;
    }

    /* renamed from: e */
    public boolean mo97837e() {
        return this.f99628a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C42379g gVar = (C42379g) obj;
        if (this.f99628a != gVar.f99628a || this.f99631d != gVar.f99631d || this.f99632e != gVar.f99632e || this.f99633f != gVar.f99633f || this.f99634g != gVar.f99634g || this.f99629b != gVar.f99629b) {
            return false;
        }
        ByteBuffer byteBuffer = this.f99630c;
        ByteBuffer byteBuffer2 = gVar.f99630c;
        if (byteBuffer != null) {
            return byteBuffer.equals(byteBuffer2);
        }
        if (byteBuffer2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public ByteBuffer mo97824f() {
        return this.f99630c;
    }

    /* renamed from: h */
    public abstract void mo97825h();

    public int hashCode() {
        int i;
        int hashCode = (((this.f99628a ? 1 : 0) * true) + this.f99629b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.f99630c;
        if (byteBuffer != null) {
            i = byteBuffer.hashCode();
        } else {
            i = 0;
        }
        return ((((((((hashCode + i) * 31) + (this.f99631d ? 1 : 0)) * 31) + (this.f99632e ? 1 : 0)) * 31) + (this.f99633f ? 1 : 0)) * 31) + (this.f99634g ? 1 : 0);
    }

    /* renamed from: i */
    public void mo97838i(boolean z) {
        this.f99628a = z;
    }

    /* renamed from: j */
    public void mo97827j(ByteBuffer byteBuffer) {
        this.f99630c = byteBuffer;
    }

    /* renamed from: k */
    public void mo97839k(boolean z) {
        this.f99632e = z;
    }

    /* renamed from: l */
    public void mo97840l(boolean z) {
        this.f99633f = z;
    }

    /* renamed from: m */
    public void mo97841m(boolean z) {
        this.f99634g = z;
    }

    /* renamed from: n */
    public void mo97842n(boolean z) {
        this.f99631d = z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ opcode:");
        sb.append(mo97835c());
        sb.append(", fin:");
        sb.append(mo97837e());
        sb.append(", rsv1:");
        sb.append(mo97833a());
        sb.append(", rsv2:");
        sb.append(mo97834b());
        sb.append(", rsv3:");
        sb.append(mo97836d());
        sb.append(", payload length:[pos:");
        sb.append(this.f99630c.position());
        sb.append(", len:");
        sb.append(this.f99630c.remaining());
        sb.append("], payload:");
        if (this.f99630c.remaining() > 1000) {
            str = "(too big to display)";
        } else {
            str = new String(this.f99630c.array());
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
