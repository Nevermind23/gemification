package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import com.github.mikephil.charting.utils.Utils;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10895j0;
import com.medallia.digital.mobilesdk.C11164w3;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.a6 */
class C10722a6 implements C11164w3.C11172h {

    /* renamed from: q */
    private static final int f30634q = 401;

    /* renamed from: r */
    private static final int f30635r = 403;

    /* renamed from: s */
    private static final double f30636s = 2.0d;

    /* renamed from: a */
    private C10812f6.C10813a f30637a;

    /* renamed from: b */
    private C10895j0.C10899d f30638b;

    /* renamed from: c */
    private String f30639c;

    /* renamed from: d */
    private int f30640d;

    /* renamed from: e */
    private int f30641e;

    /* renamed from: f */
    private ExecutorService f30642f;

    /* renamed from: g */
    private HashMap<String, String> f30643g;

    /* renamed from: h */
    private JSONObject f30644h;

    /* renamed from: i */
    private C10812f6.C10814b f30645i;

    /* renamed from: j */
    private C10895j0 f30646j;

    /* renamed from: k */
    private int f30647k;

    /* renamed from: l */
    private long f30648l;

    /* renamed from: m */
    private long f30649m;

    /* renamed from: n */
    private Handler f30650n;

    /* renamed from: o */
    private String f30651o;

    /* renamed from: p */
    private final C11033o4 f30652p;

    /* renamed from: com.medallia.digital.mobilesdk.a6$a */
    class C10723a extends C11033o4 {
        C10723a() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C10722a6.this.m39053a();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.a6$b */
    class C10724b implements C10812f6.C10813a {
        C10724b() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10722a6.this.mo28079a(b6Var);
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C10722a6.this.mo28080a(z5Var);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.a6$c */
    class C10725c implements C10812f6.C10813a {
        C10725c() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10722a6.this.mo28079a(b6Var);
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C10722a6.this.mo28080a(z5Var);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.a6$d */
    class C10726d implements C10812f6.C10813a {
        C10726d() {
        }

        /* renamed from: a */
        public void mo28086a(C10739b6 b6Var) {
            C10722a6.this.mo28079a(b6Var);
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            C10722a6.this.mo28080a(z5Var);
        }
    }

    C10722a6() {
        this.f30647k = 0;
        this.f30650n = new Handler(Looper.getMainLooper());
        this.f30652p = new C10723a();
        C11164w3.m40939b().mo29113a((C11164w3.C11172h) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39053a() {
        C10735b4.m39109b("Retrying: " + this.f30647k + C11110u2.f31950c + this.f30640d + " (" + this.f30646j.mo28515i() + ")");
        try {
            this.f30642f.submit(this.f30646j);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: c */
    private boolean m39055c() {
        return System.currentTimeMillis() - this.f30648l < this.f30649m;
    }

    /* renamed from: d */
    private boolean m39056d() {
        return m39055c() && this.f30647k > 0;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [com.medallia.digital.mobilesdk.j0] */
    /* JADX WARNING: type inference failed for: r3v3, types: [com.medallia.digital.mobilesdk.n0] */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.medallia.digital.mobilesdk.t6] */
    /* JADX WARNING: type inference failed for: r3v5, types: [com.medallia.digital.mobilesdk.t6] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28083b() {
        /*
            r18 = this;
            r0 = r18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Rest call started = "
            r1.append(r2)
            java.lang.String r2 = r0.f30639c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.medallia.digital.mobilesdk.C10735b4.m39109b(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r0.f30648l = r1
            com.medallia.digital.mobilesdk.f6$b r1 = r0.f30645i
            com.medallia.digital.mobilesdk.f6$b r2 = com.medallia.digital.mobilesdk.C10812f6.C10814b.String
            if (r1 != r2) goto L_0x0056
            java.lang.String r8 = r0.f30651o
            com.medallia.digital.mobilesdk.t6 r1 = new com.medallia.digital.mobilesdk.t6
            if (r8 == 0) goto L_0x003e
            com.medallia.digital.mobilesdk.j0$d r4 = r0.f30638b
            java.lang.String r5 = r0.f30639c
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r0.f30643g
            org.json.JSONObject r7 = r0.f30644h
            int r9 = r0.f30641e
            com.medallia.digital.mobilesdk.a6$b r10 = new com.medallia.digital.mobilesdk.a6$b
            r10.<init>()
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x006d
        L_0x003e:
            com.medallia.digital.mobilesdk.j0$d r12 = r0.f30638b
            java.lang.String r13 = r0.f30639c
            java.util.HashMap<java.lang.String, java.lang.String> r14 = r0.f30643g
            org.json.JSONObject r15 = r0.f30644h
            int r2 = r0.f30641e
            com.medallia.digital.mobilesdk.a6$c r3 = new com.medallia.digital.mobilesdk.a6$c
            r3.<init>()
            r11 = r1
            r16 = r2
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x006d
        L_0x0056:
            com.medallia.digital.mobilesdk.f6$b r2 = com.medallia.digital.mobilesdk.C10812f6.C10814b.BYTES
            if (r1 != r2) goto L_0x006f
            com.medallia.digital.mobilesdk.n0 r1 = new com.medallia.digital.mobilesdk.n0
            com.medallia.digital.mobilesdk.j0$d r4 = r0.f30638b
            java.lang.String r5 = r0.f30639c
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r0.f30643g
            int r7 = r0.f30641e
            com.medallia.digital.mobilesdk.a6$d r8 = new com.medallia.digital.mobilesdk.a6$d
            r8.<init>()
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x006d:
            r0.f30646j = r1
        L_0x006f:
            java.util.concurrent.ExecutorService r1 = r0.f30642f
            com.medallia.digital.mobilesdk.j0 r2 = r0.f30646j
            r1.submit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10722a6.mo28083b():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo28084e() {
        if (!C11164w3.m40939b().mo29121f()) {
            long pow = ((long) Math.pow(f30636s, (double) this.f30647k)) * 1000;
            mo28085f();
            if (this.f30650n == null) {
                this.f30650n = new Handler(Looper.getMainLooper());
            }
            this.f30650n.postDelayed(this.f30652p, pow);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo28085f() {
        this.f30650n.removeCallbacks(this.f30652p);
        this.f30650n.removeCallbacksAndMessages((Object) null);
    }

    public void onBackground() {
        mo28085f();
    }

    public void onForeground() {
        if (m39056d()) {
            mo28084e();
        } else if (!m39055c()) {
            C10735b4.m39109b("Request = " + this.f30646j.mo28515i() + " was paused because of refresh session");
        }
    }

    C10722a6(ExecutorService executorService, C10812f6.C10814b bVar, C10895j0.C10899d dVar, String str, HashMap<String, String> hashMap, JSONObject jSONObject, int i, int i2, C10812f6.C10813a aVar, long j) {
        this();
        mo28081a(executorService, bVar, dVar, str, hashMap, jSONObject, i, i2, aVar, j);
        mo28083b();
    }

    C10722a6(ExecutorService executorService, C10812f6.C10814b bVar, C10895j0.C10899d dVar, String str, HashMap<String, String> hashMap, JSONObject jSONObject, String str2, int i, int i2, C10812f6.C10813a aVar, long j) {
        this();
        mo28082a(executorService, bVar, dVar, str, hashMap, jSONObject, str2, i, i2, aVar, j);
        mo28083b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28079a(C10739b6 b6Var) {
        Double d;
        int i;
        if (this.f30638b == C10895j0.C10899d.GET) {
            d = Double.valueOf(Utils.DOUBLE_EPSILON);
            if (b6Var != null) {
                if (b6Var.mo28125b() != null && b6Var.mo28125b().getBytes() != null) {
                    i = b6Var.mo28125b().getBytes().length;
                } else if (b6Var.mo28124a() != null) {
                    i = b6Var.mo28124a().length;
                }
                d = Double.valueOf(((double) i) / 1024.0d);
            }
        } else {
            d = null;
        }
        AnalyticsBridge.getInstance().reportRestClientEvent(this.f30648l, System.currentTimeMillis(), this.f30639c, b6Var != null ? b6Var.mo28126c() : -1, this.f30647k, d);
        C11164w3.m40939b().mo29117b((C11164w3.C11172h) this);
        C10735b4.m39109b("Rest call success = " + this.f30639c);
        C10812f6.C10813a aVar = this.f30637a;
        if (aVar != null) {
            aVar.mo28086a(b6Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28080a(C11244z5 z5Var) {
        if (z5Var.mo29259b() == 401 || z5Var.mo29259b() == 403) {
            C11164w3.m40939b().mo29117b((C11164w3.C11172h) this);
            C10735b4.m39109b("Rest call error = " + this.f30639c);
            C10812f6.C10813a aVar = this.f30637a;
            if (aVar != null) {
                aVar.mo28087a(z5Var);
                return;
            }
            return;
        }
        int i = this.f30647k;
        if (i == this.f30640d) {
            C11164w3.m40939b().mo29117b((C11164w3.C11172h) this);
            C10812f6.C10813a aVar2 = this.f30637a;
            if (aVar2 != null) {
                aVar2.mo28087a(z5Var);
            }
            AnalyticsBridge.getInstance().reportRestClientEvent(this.f30648l, System.currentTimeMillis(), this.f30639c, z5Var.mo29259b(), this.f30647k, this.f30638b == C10895j0.C10899d.GET ? Double.valueOf(Utils.DOUBLE_EPSILON) : null);
            return;
        }
        this.f30647k = i + 1;
        mo28084e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28081a(ExecutorService executorService, C10812f6.C10814b bVar, C10895j0.C10899d dVar, String str, HashMap<String, String> hashMap, JSONObject jSONObject, int i, int i2, C10812f6.C10813a aVar, long j) {
        mo28082a(executorService, bVar, dVar, str, hashMap, jSONObject, (String) null, i, i2, aVar, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28082a(ExecutorService executorService, C10812f6.C10814b bVar, C10895j0.C10899d dVar, String str, HashMap<String, String> hashMap, JSONObject jSONObject, String str2, int i, int i2, C10812f6.C10813a aVar, long j) {
        this.f30645i = bVar;
        this.f30638b = dVar;
        this.f30639c = str;
        this.f30643g = hashMap;
        this.f30644h = jSONObject;
        this.f30640d = i;
        this.f30641e = i2;
        this.f30637a = aVar;
        this.f30642f = executorService;
        this.f30649m = j;
        this.f30651o = str2;
    }
}
