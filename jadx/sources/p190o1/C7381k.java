package p190o1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p190o1.C7379j;
import p267u0.C8438a0;
import p267u0.C8463e0;
import p267u0.C8478k;
import p267u0.C8503w;
import p293w0.C8722b;
import p318y0.C9008m;

/* renamed from: o1.k */
public final class C7381k implements C7379j {

    /* renamed from: a */
    private final C8503w f21604a;

    /* renamed from: b */
    private final C8478k f21605b;

    /* renamed from: c */
    private final C8463e0 f21606c;

    /* renamed from: d */
    private final C8463e0 f21607d;

    /* renamed from: o1.k$a */
    class C7382a extends C8478k {
        C7382a(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C7378i iVar) {
            String str = iVar.f21601a;
            if (str == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, str);
            }
            mVar.mo23628r(2, (long) iVar.mo21757a());
            mVar.mo23628r(3, (long) iVar.f21603c);
        }
    }

    /* renamed from: o1.k$b */
    class C7383b extends C8463e0 {
        C7383b(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* renamed from: o1.k$c */
    class C7384c extends C8463e0 {
        C7384c(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C7381k(C8503w wVar) {
        this.f21604a = wVar;
        this.f21605b = new C7382a(wVar);
        this.f21606c = new C7383b(wVar);
        this.f21607d = new C7384c(wVar);
    }

    /* renamed from: h */
    public static List m28108h() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo21761a(C7386m mVar) {
        C7379j.C7380a.m28107b(this, mVar);
    }

    /* renamed from: b */
    public void mo21762b(C7378i iVar) {
        this.f21604a.mo23806d();
        this.f21604a.mo23807e();
        try {
            this.f21605b.mo23748k(iVar);
            this.f21604a.mo23804F();
        } finally {
            this.f21604a.mo23809i();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p190o1.C7378i mo21763c(java.lang.String r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r1 = 2
            u0.a0 r0 = p267u0.C8438a0.m31651d(r0, r1)
            r2 = 1
            if (r6 != 0) goto L_0x000e
            r0.mo23624j1(r2)
            goto L_0x0011
        L_0x000e:
            r0.mo23623j(r2, r6)
        L_0x0011:
            long r6 = (long) r7
            r0.mo23628r(r1, r6)
            u0.w r6 = r5.f21604a
            r6.mo23806d()
            u0.w r6 = r5.f21604a
            r7 = 0
            r1 = 0
            android.database.Cursor r6 = p293w0.C8722b.m32486c(r6, r0, r7, r1)
            java.lang.String r7 = "work_spec_id"
            int r7 = p293w0.C8721a.m32483e(r6, r7)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = "generation"
            int r2 = p293w0.C8721a.m32483e(r6, r2)     // Catch:{ all -> 0x005a }
            java.lang.String r3 = "system_id"
            int r3 = p293w0.C8721a.m32483e(r6, r3)     // Catch:{ all -> 0x005a }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0053
            boolean r4 = r6.isNull(r7)     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            java.lang.String r1 = r6.getString(r7)     // Catch:{ all -> 0x005a }
        L_0x0045:
            int r7 = r6.getInt(r2)     // Catch:{ all -> 0x005a }
            int r2 = r6.getInt(r3)     // Catch:{ all -> 0x005a }
            o1.i r3 = new o1.i     // Catch:{ all -> 0x005a }
            r3.<init>(r1, r7, r2)     // Catch:{ all -> 0x005a }
            r1 = r3
        L_0x0053:
            r6.close()
            r0.mo23627n()
            return r1
        L_0x005a:
            r7 = move-exception
            r6.close()
            r0.mo23627n()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p190o1.C7381k.mo21763c(java.lang.String, int):o1.i");
    }

    /* renamed from: d */
    public List mo21764d() {
        String str;
        C8438a0 d = C8438a0.m31651d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f21604a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21604a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                if (c.isNull(0)) {
                    str = null;
                } else {
                    str = c.getString(0);
                }
                arrayList.add(str);
            }
            return arrayList;
        } finally {
            c.close();
            d.mo23627n();
        }
    }

    /* renamed from: e */
    public void mo21765e(String str, int i) {
        this.f21604a.mo23806d();
        C9008m b = this.f21606c.mo23725b();
        if (str == null) {
            b.mo23624j1(1);
        } else {
            b.mo23623j(1, str);
        }
        b.mo23628r(2, (long) i);
        this.f21604a.mo23807e();
        try {
            b.mo23676O();
            this.f21604a.mo23804F();
        } finally {
            this.f21604a.mo23809i();
            this.f21606c.mo23727h(b);
        }
    }

    /* renamed from: f */
    public void mo21766f(String str) {
        this.f21604a.mo23806d();
        C9008m b = this.f21607d.mo23725b();
        if (str == null) {
            b.mo23624j1(1);
        } else {
            b.mo23623j(1, str);
        }
        this.f21604a.mo23807e();
        try {
            b.mo23676O();
            this.f21604a.mo23804F();
        } finally {
            this.f21604a.mo23809i();
            this.f21607d.mo23727h(b);
        }
    }

    /* renamed from: g */
    public C7378i mo21767g(C7386m mVar) {
        return C7379j.C7380a.m28106a(this, mVar);
    }
}
