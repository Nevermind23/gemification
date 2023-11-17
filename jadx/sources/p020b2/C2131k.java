package p020b2;

import com.airbnb.lottie.C2325h;
import p033c2.C2224c;
import p307x1.C8935a;
import p307x1.C8936b;

/* renamed from: b2.k */
public class C2131k {

    /* renamed from: f */
    private static final C2224c.C2225a f6291f = C2224c.C2225a.m8482a("ef");

    /* renamed from: g */
    private static final C2224c.C2225a f6292g = C2224c.C2225a.m8482a("nm", "v");

    /* renamed from: a */
    private C8935a f6293a;

    /* renamed from: b */
    private C8936b f6294b;

    /* renamed from: c */
    private C8936b f6295c;

    /* renamed from: d */
    private C8936b f6296d;

    /* renamed from: e */
    private C8936b f6297e;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8212a(p033c2.C2224c r6, com.airbnb.lottie.C2325h r7) {
        /*
            r5 = this;
            r6.mo7153n()
            java.lang.String r0 = ""
        L_0x0005:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0090
            c2.c$a r1 = f6292g
            int r1 = r6.mo7160x(r1)
            if (r1 == 0) goto L_0x008a
            r2 = 1
            if (r1 == r2) goto L_0x001d
            r6.mo7161y()
            r6.mo7148N()
            goto L_0x0005
        L_0x001d:
            r0.hashCode()
            int r1 = r0.hashCode()
            r3 = 0
            r4 = -1
            switch(r1) {
                case 353103893: goto L_0x0055;
                case 397447147: goto L_0x004c;
                case 1041377119: goto L_0x0041;
                case 1379387491: goto L_0x0036;
                case 1383710113: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r2 = r4
            goto L_0x005f
        L_0x002b:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r2 = 4
            goto L_0x005f
        L_0x0036:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r2 = 3
            goto L_0x005f
        L_0x0041:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            r2 = 2
            goto L_0x005f
        L_0x004c:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x005f
            goto L_0x0029
        L_0x0055:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x005e
            goto L_0x0029
        L_0x005e:
            r2 = r3
        L_0x005f:
            switch(r2) {
                case 0: goto L_0x0082;
                case 1: goto L_0x007b;
                case 2: goto L_0x0074;
                case 3: goto L_0x006d;
                case 4: goto L_0x0066;
                default: goto L_0x0062;
            }
        L_0x0062:
            r6.mo7148N()
            goto L_0x0005
        L_0x0066:
            x1.b r1 = p020b2.C2117d.m8183e(r6, r7)
            r5.f6297e = r1
            goto L_0x0005
        L_0x006d:
            x1.a r1 = p020b2.C2117d.m8181c(r6, r7)
            r5.f6293a = r1
            goto L_0x0005
        L_0x0074:
            x1.b r1 = p020b2.C2117d.m8184f(r6, r7, r3)
            r5.f6295c = r1
            goto L_0x0005
        L_0x007b:
            x1.b r1 = p020b2.C2117d.m8184f(r6, r7, r3)
            r5.f6294b = r1
            goto L_0x0005
        L_0x0082:
            x1.b r1 = p020b2.C2117d.m8183e(r6, r7)
            r5.f6296d = r1
            goto L_0x0005
        L_0x008a:
            java.lang.String r0 = r6.mo7147I0()
            goto L_0x0005
        L_0x0090:
            r6.mo7155q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p020b2.C2131k.m8212a(c2.c, com.airbnb.lottie.h):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2129j mo7020b(C2224c cVar, C2325h hVar) {
        C8936b bVar;
        C8936b bVar2;
        C8936b bVar3;
        C8936b bVar4;
        while (cVar.hasNext()) {
            if (cVar.mo7160x(f6291f) != 0) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                cVar.mo7152k();
                while (cVar.hasNext()) {
                    m8212a(cVar, hVar);
                }
                cVar.mo7154o();
            }
        }
        C8935a aVar = this.f6293a;
        if (aVar == null || (bVar = this.f6294b) == null || (bVar2 = this.f6295c) == null || (bVar3 = this.f6296d) == null || (bVar4 = this.f6297e) == null) {
            return null;
        }
        return new C2129j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
