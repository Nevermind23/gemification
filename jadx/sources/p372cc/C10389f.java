package p372cc;

/* renamed from: cc.f */
final class C10389f {

    /* renamed from: a */
    private final C10382a f29592a;

    /* renamed from: b */
    private final C10390g[] f29593b;

    /* renamed from: c */
    private C10384c f29594c;

    /* renamed from: d */
    private final int f29595d;

    C10389f(C10382a aVar, C10384c cVar) {
        this.f29592a = aVar;
        int a = aVar.mo27003a();
        this.f29595d = a;
        this.f29594c = cVar;
        this.f29593b = new C10390g[(a + 2)];
    }

    /* renamed from: a */
    private void m37739a(C10390g gVar) {
        if (gVar != null) {
            ((C10391h) gVar).mo27046g(this.f29592a);
        }
    }

    /* renamed from: b */
    private static boolean m37740b(C10385d dVar, C10385d dVar2) {
        if (dVar2 == null || !dVar2.mo27025g() || dVar2.mo27019a() != dVar.mo27019a()) {
            return false;
        }
        dVar.mo27027i(dVar2.mo27021c());
        return true;
    }

    /* renamed from: c */
    private static int m37741c(int i, int i2, C10385d dVar) {
        if (dVar == null || dVar.mo27025g()) {
            return i2;
        }
        if (!dVar.mo27026h(i)) {
            return i2 + 1;
        }
        dVar.mo27027i(i);
        return 0;
    }

    /* renamed from: d */
    private int m37742d() {
        int f = m37744f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f29595d + 1; i++) {
            C10385d[] d = this.f29593b[i].mo27042d();
            for (int i2 = 0; i2 < d.length; i2++) {
                C10385d dVar = d[i2];
                if (dVar != null && !dVar.mo27025g()) {
                    m37743e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    private void m37743e(int i, int i2, C10385d[] dVarArr) {
        C10385d[] dVarArr2;
        C10385d dVar = dVarArr[i2];
        C10385d[] d = this.f29593b[i - 1].mo27042d();
        C10390g gVar = this.f29593b[i + 1];
        if (gVar != null) {
            dVarArr2 = gVar.mo27042d();
        } else {
            dVarArr2 = d;
        }
        C10385d[] dVarArr3 = new C10385d[14];
        dVarArr3[2] = d[i2];
        dVarArr3[3] = dVarArr2[i2];
        int i3 = 0;
        if (i2 > 0) {
            int i4 = i2 - 1;
            dVarArr3[0] = dVarArr[i4];
            dVarArr3[4] = d[i4];
            dVarArr3[5] = dVarArr2[i4];
        }
        if (i2 > 1) {
            int i5 = i2 - 2;
            dVarArr3[8] = dVarArr[i5];
            dVarArr3[10] = d[i5];
            dVarArr3[11] = dVarArr2[i5];
        }
        if (i2 < dVarArr.length - 1) {
            int i6 = i2 + 1;
            dVarArr3[1] = dVarArr[i6];
            dVarArr3[6] = d[i6];
            dVarArr3[7] = dVarArr2[i6];
        }
        if (i2 < dVarArr.length - 2) {
            int i7 = i2 + 2;
            dVarArr3[9] = dVarArr[i7];
            dVarArr3[12] = d[i7];
            dVarArr3[13] = dVarArr2[i7];
        }
        while (i3 < 14 && !m37740b(dVar, dVarArr3[i3])) {
            i3++;
        }
    }

    /* renamed from: f */
    private int m37744f() {
        m37745g();
        return m37746h() + m37747i();
    }

    /* renamed from: g */
    private void m37745g() {
        C10390g[] gVarArr = this.f29593b;
        C10390g gVar = gVarArr[0];
        if (gVar != null && gVarArr[this.f29595d + 1] != null) {
            C10385d[] d = gVar.mo27042d();
            C10385d[] d2 = this.f29593b[this.f29595d + 1].mo27042d();
            for (int i = 0; i < d.length; i++) {
                C10385d dVar = d[i];
                if (!(dVar == null || d2[i] == null || dVar.mo27021c() != d2[i].mo27021c())) {
                    for (int i2 = 1; i2 <= this.f29595d; i2++) {
                        C10385d dVar2 = this.f29593b[i2].mo27042d()[i];
                        if (dVar2 != null) {
                            dVar2.mo27027i(d[i].mo27021c());
                            if (!dVar2.mo27025g()) {
                                this.f29593b[i2].mo27042d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m37746h() {
        C10390g gVar = this.f29593b[0];
        if (gVar == null) {
            return 0;
        }
        C10385d[] d = gVar.mo27042d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            C10385d dVar = d[i2];
            if (dVar != null) {
                int c = dVar.mo27021c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f29595d + 1 && i3 < 2; i4++) {
                    C10385d dVar2 = this.f29593b[i4].mo27042d()[i2];
                    if (dVar2 != null) {
                        i3 = m37741c(c, i3, dVar2);
                        if (!dVar2.mo27025g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m37747i() {
        C10390g[] gVarArr = this.f29593b;
        int i = this.f29595d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        C10385d[] d = gVarArr[i + 1].mo27042d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            C10385d dVar = d[i3];
            if (dVar != null) {
                int c = dVar.mo27021c();
                int i4 = 0;
                for (int i5 = this.f29595d + 1; i5 > 0 && i4 < 2; i5--) {
                    C10385d dVar2 = this.f29593b[i5].mo27042d()[i3];
                    if (dVar2 != null) {
                        i4 = m37741c(c, i4, dVar2);
                        if (!dVar2.mo27025g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo27030j() {
        return this.f29595d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo27031k() {
        return this.f29592a.mo27004b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo27032l() {
        return this.f29592a.mo27005c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C10384c mo27033m() {
        return this.f29594c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C10390g mo27034n(int i) {
        return this.f29593b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C10390g[] mo27035o() {
        m37739a(this.f29593b[0]);
        m37739a(this.f29593b[this.f29595d + 1]);
        int i = 928;
        while (true) {
            int d = m37742d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f29593b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo27036p(C10384c cVar) {
        this.f29594c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo27037q(int i, C10390g gVar) {
        this.f29593b[i] = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            cc.g[] r0 = r10.f29593b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f29595d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = r1
        L_0x0013:
            cc.d[] r5 = r2.mo27042d()     // Catch:{ all -> 0x007a }
            int r5 = r5.length     // Catch:{ all -> 0x007a }
            if (r4 >= r5) goto L_0x0072
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007a }
            r6[r1] = r7     // Catch:{ all -> 0x007a }
            r0.format(r5, r6)     // Catch:{ all -> 0x007a }
            r5 = r1
        L_0x0028:
            int r6 = r10.f29595d     // Catch:{ all -> 0x007a }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x0068
            cc.g[] r6 = r10.f29593b     // Catch:{ all -> 0x007a }
            r6 = r6[r5]     // Catch:{ all -> 0x007a }
            java.lang.String r8 = "    |   "
            if (r6 != 0) goto L_0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r8, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0065
        L_0x003c:
            cc.d[] r6 = r6.mo27042d()     // Catch:{ all -> 0x007a }
            r6 = r6[r4]     // Catch:{ all -> 0x007a }
            if (r6 != 0) goto L_0x004a
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r8, r6)     // Catch:{ all -> 0x007a }
            goto L_0x0065
        L_0x004a:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007a }
            int r9 = r6.mo27021c()     // Catch:{ all -> 0x007a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007a }
            r7[r1] = r9     // Catch:{ all -> 0x007a }
            int r6 = r6.mo27023e()     // Catch:{ all -> 0x007a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007a }
            r7[r3] = r6     // Catch:{ all -> 0x007a }
            r0.format(r8, r7)     // Catch:{ all -> 0x007a }
        L_0x0065:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0068:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007a }
            r0.format(r5, r6)     // Catch:{ all -> 0x007a }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0072:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x007a }
            r0.close()
            return r1
        L_0x007a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007c }
        L_0x007c:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0085:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p372cc.C10389f.toString():java.lang.String");
    }
}
