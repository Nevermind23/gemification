package p372cc;

import com.github.mikephil.charting.utils.Utils;
import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import p200ob.C7508b;

/* renamed from: cc.c */
final class C10384c {

    /* renamed from: a */
    private final C7508b f29567a;

    /* renamed from: b */
    private final C5766o f29568b;

    /* renamed from: c */
    private final C5766o f29569c;

    /* renamed from: d */
    private final C5766o f29570d;

    /* renamed from: e */
    private final C5766o f29571e;

    /* renamed from: f */
    private final int f29572f;

    /* renamed from: g */
    private final int f29573g;

    /* renamed from: h */
    private final int f29574h;

    /* renamed from: i */
    private final int f29575i;

    C10384c(C7508b bVar, C5766o oVar, C5766o oVar2, C5766o oVar3, C5766o oVar4) {
        boolean z = false;
        boolean z2 = oVar == null || oVar2 == null;
        z = (oVar3 == null || oVar4 == null) ? true : z;
        if (!z2 || !z) {
            if (z2) {
                oVar = new C5766o(Utils.FLOAT_EPSILON, oVar3.mo18902d());
                oVar2 = new C5766o(Utils.FLOAT_EPSILON, oVar4.mo18902d());
            } else if (z) {
                oVar3 = new C5766o((float) (bVar.mo21982l() - 1), oVar.mo18902d());
                oVar4 = new C5766o((float) (bVar.mo21982l() - 1), oVar2.mo18902d());
            }
            this.f29567a = bVar;
            this.f29568b = oVar;
            this.f29569c = oVar2;
            this.f29570d = oVar3;
            this.f29571e = oVar4;
            this.f29572f = (int) Math.min(oVar.mo18901c(), oVar2.mo18901c());
            this.f29573g = (int) Math.max(oVar3.mo18901c(), oVar4.mo18901c());
            this.f29574h = (int) Math.min(oVar.mo18902d(), oVar3.mo18902d());
            this.f29575i = (int) Math.max(oVar2.mo18902d(), oVar4.mo18902d());
            return;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: j */
    static C10384c m37712j(C10384c cVar, C10384c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new C10384c(cVar.f29567a, cVar.f29568b, cVar.f29569c, cVar2.f29570d, cVar2.f29571e);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p372cc.C10384c mo27010a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            com.google.zxing.o r0 = r12.f29568b
            com.google.zxing.o r1 = r12.f29569c
            com.google.zxing.o r2 = r12.f29570d
            com.google.zxing.o r3 = r12.f29571e
            if (r13 <= 0) goto L_0x0029
            if (r15 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r2
        L_0x000f:
            float r5 = r4.mo18902d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L_0x0018
            r5 = 0
        L_0x0018:
            com.google.zxing.o r13 = new com.google.zxing.o
            float r4 = r4.mo18901c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L_0x0026
            r8 = r13
            goto L_0x002a
        L_0x0026:
            r10 = r13
            r8 = r0
            goto L_0x002b
        L_0x0029:
            r8 = r0
        L_0x002a:
            r10 = r2
        L_0x002b:
            if (r14 <= 0) goto L_0x005b
            if (r15 == 0) goto L_0x0032
            com.google.zxing.o r13 = r12.f29569c
            goto L_0x0034
        L_0x0032:
            com.google.zxing.o r13 = r12.f29571e
        L_0x0034:
            float r0 = r13.mo18902d()
            int r0 = (int) r0
            int r0 = r0 + r14
            ob.b r14 = r12.f29567a
            int r14 = r14.mo21978h()
            if (r0 < r14) goto L_0x004a
            ob.b r14 = r12.f29567a
            int r14 = r14.mo21978h()
            int r0 = r14 + -1
        L_0x004a:
            com.google.zxing.o r14 = new com.google.zxing.o
            float r13 = r13.mo18901c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L_0x0058
            r9 = r14
            goto L_0x005c
        L_0x0058:
            r11 = r14
            r9 = r1
            goto L_0x005d
        L_0x005b:
            r9 = r1
        L_0x005c:
            r11 = r3
        L_0x005d:
            cc.c r13 = new cc.c
            ob.b r7 = r12.f29567a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p372cc.C10384c.mo27010a(int, int, boolean):cc.c");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5766o mo27011b() {
        return this.f29569c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5766o mo27012c() {
        return this.f29571e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo27013d() {
        return this.f29573g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo27014e() {
        return this.f29575i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo27015f() {
        return this.f29572f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo27016g() {
        return this.f29574h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5766o mo27017h() {
        return this.f29568b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C5766o mo27018i() {
        return this.f29570d;
    }

    C10384c(C10384c cVar) {
        this.f29567a = cVar.f29567a;
        this.f29568b = cVar.f29568b;
        this.f29569c = cVar.f29569c;
        this.f29570d = cVar.f29570d;
        this.f29571e = cVar.f29571e;
        this.f29572f = cVar.f29572f;
        this.f29573g = cVar.f29573g;
        this.f29574h = cVar.f29574h;
        this.f29575i = cVar.f29575i;
    }
}
