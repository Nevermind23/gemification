package p372cc;

/* renamed from: cc.g */
class C10390g {

    /* renamed from: a */
    private final C10384c f29596a;

    /* renamed from: b */
    private final C10385d[] f29597b;

    C10390g(C10384c cVar) {
        this.f29596a = new C10384c(cVar);
        this.f29597b = new C10385d[((cVar.mo27014e() - cVar.mo27016g()) + 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C10384c mo27039a() {
        return this.f29596a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C10385d mo27040b(int i) {
        return this.f29597b[mo27043e(i)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C10385d mo27041c(int i) {
        C10385d dVar;
        C10385d dVar2;
        C10385d b = mo27040b(i);
        if (b != null) {
            return b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int e = mo27043e(i) - i2;
            if (e >= 0 && (dVar2 = this.f29597b[e]) != null) {
                return dVar2;
            }
            int e2 = mo27043e(i) + i2;
            C10385d[] dVarArr = this.f29597b;
            if (e2 < dVarArr.length && (dVar = dVarArr[e2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C10385d[] mo27042d() {
        return this.f29597b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo27043e(int i) {
        return i - this.f29596a.mo27016g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo27044f(int i, C10385d dVar) {
        this.f29597b[mo27043e(i)] = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            cc.d[] r1 = r11.f29597b     // Catch:{ all -> 0x0054 }
            int r2 = r1.length     // Catch:{ all -> 0x0054 }
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x000b:
            if (r4 >= r2) goto L_0x004c
            r6 = r1[r4]     // Catch:{ all -> 0x0054 }
            r7 = 1
            if (r6 != 0) goto L_0x0023
            java.lang.String r6 = "%3d:    |   %n"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0054 }
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r7[r3] = r5     // Catch:{ all -> 0x0054 }
            r0.format(r6, r7)     // Catch:{ all -> 0x0054 }
            r5 = r8
            goto L_0x0049
        L_0x0023:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0054 }
            int r10 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r3] = r5     // Catch:{ all -> 0x0054 }
            int r5 = r6.mo27021c()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r9[r7] = r5     // Catch:{ all -> 0x0054 }
            int r5 = r6.mo27023e()     // Catch:{ all -> 0x0054 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0054 }
            r6 = 2
            r9[r6] = r5     // Catch:{ all -> 0x0054 }
            r0.format(r8, r9)     // Catch:{ all -> 0x0054 }
            r5 = r10
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x004c:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x0054 }
            r0.close()
            return r1
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x005f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p372cc.C10390g.toString():java.lang.String");
    }
}
