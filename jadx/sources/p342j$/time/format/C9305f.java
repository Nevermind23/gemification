package p342j$.time.format;

/* renamed from: j$.time.format.f */
final class C9305f implements C9306g {

    /* renamed from: a */
    private final C9306g[] f25785a;

    /* renamed from: b */
    private final boolean f25786b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C9305f(java.util.List r2, boolean r3) {
        /*
            r1 = this;
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            j$.time.format.g[] r0 = new p342j$.time.format.C9306g[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            j$.time.format.g[] r2 = (p342j$.time.format.C9306g[]) r2
            r1.<init>((p342j$.time.format.C9306g[]) r2, (boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.time.format.C9305f.<init>(java.util.List, boolean):void");
    }

    C9305f(C9306g[] gVarArr, boolean z) {
        this.f25785a = gVarArr;
        this.f25786b = z;
    }

    /* renamed from: a */
    public final boolean mo25039a(C9321v vVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.f25786b;
        if (z) {
            vVar.mo25082g();
        }
        try {
            for (C9306g a : this.f25785a) {
                if (!a.mo25039a(vVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                vVar.mo25076a();
            }
            return true;
        } finally {
            if (z) {
                vVar.mo25076a();
            }
        }
    }

    /* renamed from: b */
    public final C9305f mo25041b() {
        return !this.f25786b ? this : new C9305f(this.f25785a, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C9306g[] gVarArr = this.f25785a;
        if (gVarArr != null) {
            boolean z = this.f25786b;
            sb.append(z ? "[" : "(");
            for (C9306g append : gVarArr) {
                sb.append(append);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
