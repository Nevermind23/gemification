package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.MutableContextWrapper;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.m8 */
final class C11007m8 {

    /* renamed from: e */
    private static C11007m8 f31609e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MedalliaWebView.C10705f f31610a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final HashMap<MedalliaWebView.C10705f, MedalliaWebView> f31611b = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ConfigurationContract f31612c;

    /* renamed from: d */
    private long f31613d;

    /* renamed from: com.medallia.digital.mobilesdk.m8$a */
    class C11008a extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ MedalliaWebView.C10705f f31614a;

        /* renamed from: b */
        final /* synthetic */ C11013n2 f31615b;

        /* renamed from: c */
        final /* synthetic */ MedalliaWebView.C10704e f31616c;

        C11008a(MedalliaWebView.C10705f fVar, C11013n2 n2Var, MedalliaWebView.C10704e eVar) {
            this.f31614a = fVar;
            this.f31615b = n2Var;
            this.f31616c = eVar;
        }

        /* renamed from: a */
        public void mo27617a() {
            MedalliaWebView medalliaWebView = (MedalliaWebView) C11007m8.this.f31611b.get(this.f31614a);
            if (medalliaWebView == null || this.f31614a != MedalliaWebView.C10705f.preload || medalliaWebView.getFormData() == null || !medalliaWebView.getFormData().equals(this.f31615b)) {
                if (medalliaWebView != null) {
                    C11007m8.this.mo28768a(this.f31614a);
                }
                if (C11164w3.m40939b().mo29120e()) {
                    C11007m8 m8Var = C11007m8.this;
                    m8Var.mo28768a(m8Var.f31610a);
                }
                MedalliaWebView a = C11007m8.this.m40307a(this.f31614a, this.f31615b);
                a.setConfiguration(C11007m8.this.f31612c);
                C11007m8.this.f31611b.put(this.f31614a, a);
                a.load(this.f31616c);
            }
        }
    }

    private C11007m8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ConfigurationContract mo28766a() {
        return this.f31612c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MedalliaWebView m40307a(MedalliaWebView.C10705f fVar, C11013n2 n2Var) {
        this.f31610a = fVar;
        MutableContextWrapper d = C10884i4.m39721c().mo28484d();
        long j = 1 + this.f31613d;
        this.f31613d = j;
        MedalliaWebView medalliaWebView = new MedalliaWebView(d, fVar, n2Var, j);
        medalliaWebView.loadUrl("about:blank");
        return medalliaWebView;
    }

    /* renamed from: b */
    protected static C11007m8 m40311b() {
        if (f31609e == null) {
            f31609e = new C11007m8();
        }
        return f31609e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public MedalliaWebView mo28774c(MedalliaWebView.C10705f fVar) {
        return this.f31611b.get(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28773b(MedalliaWebView.C10705f fVar) {
        MedalliaWebView c;
        if (fVar != null && (c = mo28774c(fVar)) != null) {
            mo28771a(c, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public HashMap<MedalliaWebView.C10705f, MedalliaWebView> mo28775c() {
        return this.f31611b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28767a(ConfigurationContract configurationContract) {
        this.f31612c = configurationContract;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28768a(MedalliaWebView.C10705f fVar) {
        if (fVar != MedalliaWebView.C10705f.preload) {
            mo28770a(this.f31611b.get(fVar));
        }
    }

    /* renamed from: a */
    public void mo28769a(MedalliaWebView.C10705f fVar, C11013n2 n2Var, C11085s2 s2Var, C11099t4 t4Var, boolean z, boolean z2, int i, int i2, boolean z3) {
        MedalliaWebView.C10705f fVar2 = fVar;
        MedalliaWebView medalliaWebView = r2;
        MedalliaWebView medalliaWebView2 = new MedalliaWebView(C10884i4.m39721c().mo28484d(), true, s2Var, MedalliaWebView.C10705f.showForm, n2Var, 0, t4Var, z, z2, i, i2, z3);
        medalliaWebView.loadUrl("about:blank");
        medalliaWebView.load((MedalliaWebView.C10704e) null);
        medalliaWebView.setType(fVar2);
        MedalliaWebView medalliaWebView3 = medalliaWebView;
        this.f31610a = fVar2;
        this.f31611b.put(fVar2, medalliaWebView3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28770a(MedalliaWebView medalliaWebView) {
        mo28771a(medalliaWebView, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28771a(MedalliaWebView medalliaWebView, boolean z) {
        MedalliaWebView medalliaWebView2;
        if (medalliaWebView != null && !z && !medalliaWebView.isPreload() && (medalliaWebView2 = this.f31611b.get(medalliaWebView.getWebViewType())) != null && medalliaWebView2.getWebViewId() == medalliaWebView.getWebViewId()) {
            medalliaWebView2.clearAndDestroy();
            this.f31611b.remove(medalliaWebView.getWebViewType());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28772a(C11013n2 n2Var, MedalliaWebView.C10704e eVar, MedalliaWebView.C10705f fVar) {
        try {
            ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C11008a(fVar, n2Var, eVar));
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }
}
