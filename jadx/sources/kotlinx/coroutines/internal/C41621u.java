package kotlinx.coroutines.internal;

import ef1.C40839n;
import ef1.C40844o0;
import ef1.C40883y1;
import kotlin.KotlinNothingValueException;
import me1.C41752f;

/* renamed from: kotlinx.coroutines.internal.u */
final class C41621u extends C40883y1 implements C40844o0 {

    /* renamed from: f */
    private final Throwable f97831f;

    /* renamed from: g */
    private final String f97832g;

    public C41621u(Throwable th, String str) {
        this.f97831f = th;
        this.f97832g = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m120760h0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f97831f
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f97832g
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f97831f
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            kotlinx.coroutines.internal.C41620t.m120758d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C41621u.m120760h0():java.lang.Void");
    }

    /* renamed from: Q */
    public C40883y1 mo95277Q() {
        return this;
    }

    /* renamed from: f0 */
    public Void mo95148h(C41752f fVar, Runnable runnable) {
        m120760h0();
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public boolean mo95149i(C41752f fVar) {
        m120760h0();
        throw new KotlinNothingValueException();
    }

    /* renamed from: m0 */
    public Void mo95161e(long j, C40839n nVar) {
        m120760h0();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f97831f != null) {
            str = ", cause=" + this.f97831f;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
