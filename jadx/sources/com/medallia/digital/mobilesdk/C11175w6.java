package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.C10859h4;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.w6 */
class C11175w6 extends C11044p0<String> {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C11148v4 f32110g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C11099t4 f32111h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C11173w4 f32112i;

    C11175w6(C11173w4 w4Var, C11099t4 t4Var, C10812f6 f6Var, C11063q0 q0Var, C10796e6<String> e6Var) {
        super(f6Var, q0Var, e6Var);
        this.f32112i = w4Var;
        this.f32111h = t4Var;
        mo28876a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10859h4 mo28253a(C11244z5 z5Var) {
        return new C11161w1(C10859h4.C10860a.LL_SUBMIT_MEDIA_FEEDBACK_FAILED);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29156c(C10796e6<String> e6Var) {
        C10735b4.m39109b("LivingLens uploadMediaCapture was called");
        new C10782d8(this.f31740a, new C11063q0(), new C11180c(e6Var), this.f32110g, this.f32112i).mo28878c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10859h4 mo28255d() {
        if (TextUtils.isEmpty(this.f31741b.mo28933e())) {
            C10859h4.C10860a aVar = C10859h4.C10860a.SUBMIT_MEDIA_FEEDBACK_EMPTY_ENDPOINT;
            C10735b4.m39111c(aVar.toString());
            return new C11161w1(aVar);
        } else if (this.f32112i != null) {
            return null;
        } else {
            C10859h4.C10860a aVar2 = C10859h4.C10860a.LL_EMPTY_MEDIA_DATA_OBJECT;
            C10735b4.m39111c(aVar2.toString());
            return new C11161w1(aVar2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo29157e() {
        if (this.f32112i != null) {
            boolean a = C10876i1.m39698a().mo28465a((C10785e0) this.f32112i);
            C10735b4.m39109b("LivingLens Media Feedback Delete from DB? " + a + " " + this.f32112i.mo29138d());
            boolean delete = new File(this.f32112i.mo29139e()).delete();
            StringBuilder sb = new StringBuilder();
            sb.append("LivingLens Media File deleted? ");
            sb.append(delete);
            C10735b4.m39109b(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo29158f() {
        if (this.f32112i == null) {
            return false;
        }
        C10735b4.m39109b("LivingLens Media Feedback Saved in DB: " + this.f32112i.mo29138d());
        return C10876i1.m39698a().mo28472c((C10785e0) this.f32112i);
    }

    /* renamed from: com.medallia.digital.mobilesdk.w6$a */
    class C11176a implements C10796e6<String> {

        /* renamed from: a */
        final /* synthetic */ boolean f32113a;

        /* renamed from: com.medallia.digital.mobilesdk.w6$a$a */
        class C11177a implements C10796e6<String> {
            C11177a() {
            }

            /* renamed from: a */
            public void mo27796a(C10859h4 h4Var) {
                C11175w6.this.f31743d.mo27796a(h4Var);
            }

            /* renamed from: com.medallia.digital.mobilesdk.w6$a$a$a */
            class C11178a implements C10796e6<String> {
                C11178a() {
                }

                /* renamed from: a */
                public void mo27796a(C10859h4 h4Var) {
                    C11175w6.this.f31743d.mo27796a(h4Var);
                }

                /* renamed from: a */
                public void mo27797a(String str) {
                    C11175w6.this.mo29157e();
                    AnalyticsBridge.getInstance().reportMediaCaptureSubmitEvent(C11175w6.this.f32112i, AnalyticsBridge.C10665c.success, (MDExternalError) null, C11175w6.this.f32111h.mo29005b());
                    C11175w6.this.f31743d.mo27797a(str);
                }
            }

            /* renamed from: a */
            public void mo27797a(String str) {
                C11175w6.this.mo29155b((C10796e6<String>) new C11178a());
            }
        }

        C11176a(boolean z) {
            this.f32113a = z;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C11175w6.this.f31743d.mo27796a(h4Var);
            C11175w6 w6Var = C11175w6.this;
            w6Var.m40989a(w6Var.f32112i, this.f32113a);
        }

        /* renamed from: a */
        public void mo27797a(String str) {
            try {
                C11148v4 unused = C11175w6.this.f32110g = new C11148v4(new JSONObject(str));
                C11175w6.this.mo29156c(new C11177a());
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.w6$b */
    class C11179b implements C10796e6<String> {

        /* renamed from: a */
        final /* synthetic */ C10796e6 f32117a;

        C11179b(C10796e6 e6Var) {
            this.f32117a = e6Var;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            this.f32117a.mo27796a(h4Var);
        }

        /* renamed from: a */
        public void mo27797a(String str) {
            this.f32117a.mo27797a(str);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.w6$c */
    class C11180c implements C10796e6<String> {

        /* renamed from: a */
        final /* synthetic */ C10796e6 f32119a;

        C11180c(C10796e6 e6Var) {
            this.f32119a = e6Var;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            this.f32119a.mo27796a(h4Var);
        }

        /* renamed from: a */
        public void mo27797a(String str) {
            this.f32119a.mo27797a(str);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.w6$d */
    class C11181d implements C10796e6<String> {

        /* renamed from: a */
        final /* synthetic */ C10796e6 f32121a;

        C11181d(C10796e6 e6Var) {
            this.f32121a = e6Var;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            this.f32121a.mo27796a(h4Var);
        }

        /* renamed from: a */
        public void mo27797a(String str) {
            this.f32121a.mo27797a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28254b() {
        C10859h4 d = mo28255d();
        if (d != null) {
            C10796e6<T> e6Var = this.f31743d;
            if (e6Var != null) {
                e6Var.mo27796a(d);
                return;
            }
            return;
        }
        boolean f = mo29158f();
        if (C10988l8.m40232b()) {
            mo29154a((C10796e6<String>) new C11176a(f));
        } else {
            this.f31743d.mo27796a((C10859h4) new C11161w1(C10859h4.C10860a.LL_NO_CONNECTION_AVAILABLE));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29155b(C10796e6<String> e6Var) {
        C10735b4.m39109b("LivingLens processMedia was called");
        new C11077r5(this.f31740a, new C11063q0(), this.f32112i, this.f32111h, this.f32110g, new C11181d(e6Var)).mo28878c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29154a(C10796e6<String> e6Var) {
        C10735b4.m39109b("LivingLens getMediaPresignedUrl URL was called");
        new C11219y2(this.f31740a, new C11063q0(this.f31741b.mo28933e(), (HashMap<String, String>) null, this.f31741b.mo28931c(), (JSONObject) null), new C11179b(e6Var)).mo28878c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40989a(C11173w4 w4Var, boolean z) {
        AnalyticsBridge analyticsBridge;
        AnalyticsBridge.C10665c cVar;
        if (z) {
            analyticsBridge = AnalyticsBridge.getInstance();
            cVar = AnalyticsBridge.C10665c.pending;
        } else {
            analyticsBridge = AnalyticsBridge.getInstance();
            cVar = AnalyticsBridge.C10665c.failure;
        }
        analyticsBridge.reportMediaCaptureSubmitEvent(w4Var, cVar, (MDExternalError) null, this.f32111h.mo29005b());
    }
}
