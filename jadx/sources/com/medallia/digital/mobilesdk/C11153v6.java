package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.C10812f6;
import com.medallia.digital.mobilesdk.C10859h4;
import com.medallia.digital.mobilesdk.C11244z5;

/* renamed from: com.medallia.digital.mobilesdk.v6 */
class C11153v6 extends C11044p0<Void> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10826g2 f32060g;

    /* renamed from: h */
    private String f32061h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f32062i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f32063j;

    /* renamed from: com.medallia.digital.mobilesdk.v6$a */
    class C11154a implements C10812f6.C10813a {
        C11154a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo28086a(com.medallia.digital.mobilesdk.C10739b6 r7) {
            /*
                r6 = this;
                java.lang.String r0 = "uuid"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Submit Feedback - success "
                r1.append(r2)
                java.lang.String r2 = r7.mo28125b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.medallia.digital.mobilesdk.C10735b4.m39113e(r1)
                com.medallia.digital.mobilesdk.v6 r1 = com.medallia.digital.mobilesdk.C11153v6.this
                r1.mo29095e()
                java.lang.String r1 = r7.mo28125b()
                if (r1 == 0) goto L_0x0047
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003f }
                java.lang.String r7 = r7.mo28125b()     // Catch:{ JSONException -> 0x003f }
                r1.<init>(r7)     // Catch:{ JSONException -> 0x003f }
                boolean r7 = r1.has(r0)     // Catch:{ JSONException -> 0x003f }
                if (r7 == 0) goto L_0x0047
                boolean r7 = r1.isNull(r0)     // Catch:{ JSONException -> 0x003f }
                if (r7 != 0) goto L_0x0047
                java.lang.String r7 = r1.getString(r0)     // Catch:{ JSONException -> 0x003f }
                goto L_0x0049
            L_0x003f:
                r7 = move-exception
                java.lang.String r7 = r7.getMessage()
                com.medallia.digital.mobilesdk.C10735b4.m39111c(r7)
            L_0x0047:
                java.lang.String r7 = ""
            L_0x0049:
                r5 = r7
                com.medallia.digital.mobilesdk.v6 r7 = com.medallia.digital.mobilesdk.C11153v6.this
                boolean r7 = r7.f32062i
                if (r7 != 0) goto L_0x0065
                com.medallia.digital.mobilesdk.AnalyticsBridge r0 = com.medallia.digital.mobilesdk.AnalyticsBridge.getInstance()
                com.medallia.digital.mobilesdk.v6 r7 = com.medallia.digital.mobilesdk.C11153v6.this
                com.medallia.digital.mobilesdk.g2 r1 = r7.f32060g
                long r2 = java.lang.System.currentTimeMillis()
                com.medallia.digital.mobilesdk.AnalyticsBridge$c r4 = com.medallia.digital.mobilesdk.AnalyticsBridge.C10665c.success
                r0.reportSubmitFeedbackEvent(r1, r2, r4, r5)
            L_0x0065:
                com.medallia.digital.mobilesdk.v6 r7 = com.medallia.digital.mobilesdk.C11153v6.this
                com.medallia.digital.mobilesdk.e6<T> r7 = r7.f31743d
                if (r7 == 0) goto L_0x006f
                r0 = 0
                r7.mo27797a(r0)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11153v6.C11154a.mo28086a(com.medallia.digital.mobilesdk.b6):void");
        }

        /* renamed from: a */
        public void mo28087a(C11244z5 z5Var) {
            if (!C11153v6.this.f32062i) {
                C11153v6 v6Var = C11153v6.this;
                v6Var.m40890a(v6Var.f32060g, C11153v6.this.f32063j);
                C11153v6.this.mo28877b(z5Var);
            }
        }
    }

    C11153v6(C10812f6 f6Var, C11063q0 q0Var, C10826g2 g2Var, C10796e6<Void> e6Var) {
        super(f6Var, q0Var, e6Var);
        this.f32060g = g2Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4 mo28253a(C11244z5 z5Var) {
        C11161w1 w1Var = C11244z5.C11245a.NO_CONNECTION.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.AUTH_NETWORK_ERROR) : C11244z5.C11245a.TIMEOUT.equals(z5Var.mo29258a()) ? new C11161w1(C10859h4.C10860a.FEEDBACK_TIMEOUT) : new C11161w1(C10859h4.C10860a.SUBMIT_FEEDBACK_ERROR);
        C10735b4.m39111c(w1Var.getMessage());
        return w1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10859h4 mo28255d() {
        if (C10718a3.m39038c().mo28069a() == null) {
            C10859h4.C10860a aVar = C10859h4.C10860a.ACCESS_TOKEN_EMPTY;
            C10735b4.m39111c(aVar.toString());
            return new C11161w1(aVar);
        } else if (TextUtils.isEmpty(this.f31741b.mo28933e())) {
            C10859h4.C10860a aVar2 = C10859h4.C10860a.SUBMIT_FEEDBACK_EMPTY_ENDPOINT;
            C10735b4.m39111c(aVar2.toString());
            return new C11161w1(aVar2);
        } else {
            C10826g2 g2Var = this.f32060g;
            if (g2Var != null && !TextUtils.isEmpty(g2Var.mo28331a())) {
                return null;
            }
            C10859h4.C10860a aVar3 = C10859h4.C10860a.EMPTY_FEEDBACK;
            C10735b4.m39111c(aVar3.toString());
            return new C11161w1(aVar3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo29095e() {
        if (this.f32060g != null) {
            C10876i1.m39698a().mo28465a((C10785e0) this.f32060g);
            C10735b4.m39109b("Feedback deleted");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo29096f() {
        if (this.f32060g == null) {
            return false;
        }
        return C10876i1.m39698a().mo28472c((C10785e0) this.f32060g);
    }

    C11153v6(C10812f6 f6Var, C11063q0 q0Var, C10826g2 g2Var, Boolean bool, String str, C10796e6<Void> e6Var) {
        super(f6Var, q0Var, e6Var);
        this.f32060g = g2Var;
        this.f32062i = bool.booleanValue();
        this.f32061h = str;
        if (bool.booleanValue()) {
            mo28876a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40890a(C10826g2 g2Var, boolean z) {
        if (z) {
            AnalyticsBridge.getInstance().reportSubmitFeedbackEvent(g2Var, 0, AnalyticsBridge.C10665c.pending, (String) null);
            return;
        }
        AnalyticsBridge.getInstance().reportSubmitFeedbackEvent(g2Var, 0, AnalyticsBridge.C10665c.failure, (String) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28254b() {
        /*
            r8 = this;
            java.lang.String r0 = "uuid"
            com.medallia.digital.mobilesdk.h4 r1 = r8.mo28255d()
            if (r1 == 0) goto L_0x0010
            com.medallia.digital.mobilesdk.e6<T> r0 = r8.f31743d
            if (r0 == 0) goto L_0x000f
            r0.mo27796a((com.medallia.digital.mobilesdk.C10859h4) r1)
        L_0x000f:
            return
        L_0x0010:
            boolean r1 = r8.f32062i
            if (r1 != 0) goto L_0x001a
            boolean r1 = r8.mo29096f()
            r8.f32063j = r1
        L_0x001a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003d }
            com.medallia.digital.mobilesdk.g2 r2 = r8.f32060g     // Catch:{ JSONException -> 0x003d }
            java.lang.String r2 = r2.mo28331a()     // Catch:{ JSONException -> 0x003d }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x003d }
            boolean r2 = r1.has(r0)     // Catch:{ JSONException -> 0x003b }
            if (r2 == 0) goto L_0x0046
            boolean r2 = r1.isNull(r0)     // Catch:{ JSONException -> 0x003b }
            if (r2 != 0) goto L_0x0046
            java.lang.String r2 = "clientCorrelationId"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x003b }
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x003b }
            goto L_0x0046
        L_0x003b:
            r0 = move-exception
            goto L_0x003f
        L_0x003d:
            r0 = move-exception
            r1 = 0
        L_0x003f:
            java.lang.String r0 = r0.getMessage()
            com.medallia.digital.mobilesdk.C10735b4.m39111c(r0)
        L_0x0046:
            r6 = r1
            boolean r0 = r8.f32062i
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r8.f32061h
            java.util.HashMap r0 = r8.mo28874a((java.lang.String) r0)
            goto L_0x0058
        L_0x0052:
            com.medallia.digital.mobilesdk.m4$c r0 = com.medallia.digital.mobilesdk.C10998m4.C11001c.ACCESS_TOKEN
            java.util.HashMap r0 = r8.mo28873a((com.medallia.digital.mobilesdk.C10998m4.C11001c) r0)
        L_0x0058:
            r5 = r0
            com.medallia.digital.mobilesdk.f6 r2 = r8.f31740a
            com.medallia.digital.mobilesdk.q0 r0 = r8.f31741b
            java.lang.String r3 = r0.mo28933e()
            com.medallia.digital.mobilesdk.v6$a r7 = new com.medallia.digital.mobilesdk.v6$a
            r7.<init>()
            r4 = 0
            r2.mo28314b(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11153v6.mo28254b():void");
    }
}
