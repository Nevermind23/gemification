package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11089s6;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.l */
class C10941l {

    /* renamed from: j */
    private static final String f31427j = "events";

    /* renamed from: k */
    private static final String f31428k = "userJourney";

    /* renamed from: a */
    private final long f31429a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10796e6<C10989m> f31430b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10796e6<C10989m> f31431c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final long f31432d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Boolean f31433e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Boolean f31434f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f31435g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f31436h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f31437i;

    /* renamed from: com.medallia.digital.mobilesdk.l$a */
    class C10942a implements C10796e6<C10989m> {
        C10942a() {
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10941l.this.f31431c.mo27796a(h4Var);
        }

        /* renamed from: a */
        public void mo27797a(C10989m mVar) {
            C10941l.m40025c(C10941l.this);
            mVar.mo28716b(C10941l.this.f31435g);
            C10735b4.m39113e("Analytics V2 submitted successfully " + C10941l.this.f31435g + C11110u2.f31950c + C10998m4.m40266h().mo28749e());
            if (C10941l.this.f31435g >= C10941l.this.f31436h || mVar.mo28715b() != C10941l.this.f31437i) {
                mVar.mo28714a(true);
                C10941l.this.f31431c.mo27797a(mVar);
                return;
            }
            C10941l.this.f31431c.mo27797a(mVar);
            C10941l lVar = C10941l.this;
            lVar.m40022a(lVar.f31433e, C10941l.this.f31434f, C10941l.this.f31432d, Long.valueOf(mVar.mo28711a()), (C10796e6<C10989m>) C10941l.this.f31430b, C10941l.this.f31435g);
        }
    }

    C10941l(long j, long j2, C10796e6<C10989m> e6Var) {
        this.f31433e = null;
        this.f31434f = null;
        this.f31435g = 0;
        this.f31429a = j;
        this.f31431c = e6Var;
        this.f31432d = j2;
        m40020a();
    }

    /* renamed from: c */
    static /* synthetic */ int m40025c(C10941l lVar) {
        int i = lVar.f31435g;
        lVar.f31435g = i + 1;
        return i;
    }

    /* renamed from: com.medallia.digital.mobilesdk.l$b */
    class C10943b implements C10796e6<Void> {

        /* renamed from: a */
        final /* synthetic */ C10796e6 f31439a;

        /* renamed from: b */
        final /* synthetic */ C10989m f31440b;

        C10943b(C10796e6 e6Var, C10989m mVar) {
            this.f31439a = e6Var;
            this.f31440b = mVar;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10735b4.m39111c(h4Var.getMessage());
            this.f31439a.mo27796a(h4Var);
        }

        /* renamed from: a */
        public void mo27797a(Void voidR) {
            C10735b4.m39113e("Analytics v2 sent successfully");
            this.f31439a.mo27797a(this.f31440b);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.l$c */
    class C10944c implements C10796e6<Void> {
        C10944c() {
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10735b4.m39111c(h4Var.getMessage());
        }

        /* renamed from: a */
        public void mo27797a(Void voidR) {
            C10735b4.m39113e("Analytics sent successfully");
        }
    }

    C10941l(long j, Boolean bool, Boolean bool2, long j2, C10796e6<C10989m> e6Var) {
        this.f31435g = 0;
        this.f31429a = j;
        this.f31433e = bool;
        this.f31434f = bool2;
        this.f31431c = e6Var;
        this.f31432d = j2;
        m40020a();
    }

    /* renamed from: a */
    private void m40020a() {
        this.f31436h = C10998m4.m40266h().mo28750f();
        this.f31437i = C10998m4.m40266h().mo28749e();
        m40024b();
    }

    /* renamed from: b */
    private void m40024b() {
        this.f31430b = new C10942a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28642c() {
        m40022a(this.f31433e, this.f31434f, this.f31432d, (Long) null, this.f31430b, this.f31435g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo28643d() {
        JSONObject a = C10870h8.m39667g().mo28450h() > this.f31429a ? C10870h8.m39667g().mo28434a(true) : C10870h8.m39667g().mo28434a(false);
        String a2 = C11089s6.m40668b().mo28975a(C11089s6.C11090a.MISSING_EVENTS, (String) null);
        if (a2 != null) {
            try {
                JSONArray jSONArray = a.getJSONArray(f31428k);
                JSONArray jSONArray2 = new JSONArray(a2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    jSONArray2.put(jSONArray.get(i));
                }
                a.put(f31428k, jSONArray2);
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        if (a != null) {
            try {
                if (!a.has(f31428k) || !(a.get(f31428k) instanceof JSONArray) || a.getJSONArray(f31428k).length() != 0) {
                    C10998m4.m40266h().mo28736a((C10796e6<Void>) new C10944c(), a);
                    return;
                }
            } catch (JSONException e2) {
                C10735b4.m39111c(e2.getMessage());
                return;
            }
        }
        C10735b4.m39113e("Can't submit Analytics - Json is null or empty");
    }

    C10941l(long j, Boolean bool, Boolean bool2, long j2, C10796e6<C10989m> e6Var, int i, int i2) {
        this.f31435g = 0;
        this.f31429a = j;
        this.f31433e = bool;
        this.f31434f = bool2;
        this.f31431c = e6Var;
        this.f31432d = j2;
        this.f31436h = i;
        this.f31437i = i2;
        m40024b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28640a(long j, Long l, Boolean bool, Boolean bool2, C10796e6<C10989m> e6Var, int i) {
        if ((bool != null && bool.booleanValue()) || (bool == null && C10998m4.m40266h().mo28748d() != null && C10998m4.m40266h().mo28748d().mo28503e())) {
            mo28641a(e6Var, j, l, C10998m4.m40266h().mo28749e());
            if (i != 0) {
                return;
            }
            if ((bool2 == null || !bool2.booleanValue()) && (bool2 != null || !C10998m4.m40266h().mo28748d().mo28505g())) {
                return;
            }
        }
        mo28643d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28641a(C10796e6<C10989m> e6Var, long j, Long l, int i) {
        ArrayList<C10874i> a = C10870h8.m39667g().mo28431a(j, l, i);
        JSONObject b = C10870h8.m39667g().mo28442b(a);
        String a2 = C11089s6.m40668b().mo28975a(C11089s6.C11090a.MISSING_EVENTS_V2, (String) null);
        if (a2 != null) {
            try {
                JSONArray jSONArray = b.getJSONArray(f31427j);
                JSONArray jSONArray2 = new JSONArray(a2);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    jSONArray2.put(jSONArray.get(i2));
                }
                b.put(f31427j, jSONArray2);
            } catch (JSONException e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
        if (b != null) {
            try {
                if (!b.has(f31427j) || !(b.get(f31427j) instanceof JSONArray) || b.getJSONArray(f31427j).length() != 0) {
                    C10989m mVar = new C10989m();
                    mVar.mo28713a(a.get(a.size() - 1).mo28459f());
                    mVar.mo28717b(a.get(0).mo28459f());
                    mVar.mo28712a(a.size());
                    C10998m4.m40266h().mo28746b(new C10943b(e6Var, mVar), b);
                    return;
                }
            } catch (JSONException e2) {
                C10735b4.m39111c(e2.getMessage());
                return;
            }
        }
        C10735b4.m39113e("Can't submit Analytics V2 - Json is null or empty");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40022a(Boolean bool, Boolean bool2, long j, Long l, C10796e6<C10989m> e6Var, int i) {
        mo28640a(j, l, bool, bool2, e6Var, i);
    }
}
