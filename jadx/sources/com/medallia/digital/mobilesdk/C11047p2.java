package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10778d6;
import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C11013n2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.medallia.digital.mobilesdk.p2 */
class C11047p2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11013n2 f31747a;

    /* renamed from: b */
    private final C11074r2 f31748b;

    /* renamed from: c */
    protected boolean f31749c;

    /* renamed from: d */
    protected ArrayList<ResourceContract> f31750d = new ArrayList<>();

    /* renamed from: e */
    private long f31751e;

    /* renamed from: com.medallia.digital.mobilesdk.p2$a */
    class C11048a implements C10796e6<C10797e7> {
        C11048a() {
        }

        /* renamed from: a */
        public void mo27797a(C10797e7 e7Var) {
            C11047p2 p2Var = C11047p2.this;
            p2Var.f31749c = false;
            p2Var.f31747a.mo28797c(e7Var.mo28263a());
            C11047p2 p2Var2 = C11047p2.this;
            p2Var2.m40497a(p2Var2.f31747a);
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C11047p2 p2Var = C11047p2.this;
            p2Var.f31749c = false;
            p2Var.m40497a(p2Var.f31747a);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.p2$b */
    class C11049b implements C10796e6<File> {

        /* renamed from: a */
        final /* synthetic */ String f31753a;

        /* renamed from: b */
        final /* synthetic */ C10796e6 f31754b;

        C11049b(String str, C10796e6 e6Var) {
            this.f31753a = str;
            this.f31754b = e6Var;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10735b4.m39109b(this.f31753a + " download failed");
            C11047p2.this.f31747a.mo28788a(C11013n2.C11014a.FAILED);
            this.f31754b.mo27796a(h4Var);
        }

        /* renamed from: a */
        public void mo27797a(File file) {
            if (file != null) {
                C10735b4.m39109b(this.f31753a + " downloaded download complete");
                C10797e7 e7Var = new C10797e7(file.getAbsolutePath(), this.f31753a);
                C10876i1.m39698a().mo28468b((C10785e0) e7Var);
                this.f31754b.mo27797a(e7Var);
                return;
            }
            C10735b4.m39109b(this.f31753a + " download failed");
            C11047p2.this.f31747a.mo28788a(C11013n2.C11014a.FAILED);
            this.f31754b.mo27796a((C10859h4) null);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.p2$c */
    class C11050c implements C10778d6.C10780b {
        C11050c() {
        }

        /* renamed from: a */
        public void mo28247a(ResourceContract resourceContract) {
            C11047p2.this.f31750d.remove(resourceContract);
            int i = 0;
            while (true) {
                if (i >= C11047p2.this.f31747a.mo28804f().size()) {
                    break;
                } else if (C11047p2.this.f31747a.mo28804f().get(i).getRemoteUrl().equals(resourceContract.getRemoteUrl())) {
                    C11047p2.this.f31747a.mo28804f().set(i, resourceContract);
                    break;
                } else {
                    i++;
                }
            }
            C11047p2 p2Var = C11047p2.this;
            p2Var.m40497a(p2Var.f31747a);
        }

        /* renamed from: b */
        public void mo28248b(ResourceContract resourceContract) {
            C11047p2.this.f31750d.remove(resourceContract);
            C11047p2.this.f31747a.mo28788a(C11013n2.C11014a.FAILED);
            C11047p2 p2Var = C11047p2.this;
            p2Var.m40497a(p2Var.f31747a);
        }
    }

    protected C11047p2(C11013n2 n2Var, C11074r2 r2Var) {
        this.f31747a = n2Var;
        this.f31748b = r2Var;
    }

    /* renamed from: d */
    private void m40499d() {
        this.f31751e = System.currentTimeMillis();
        C10735b4.m39109b("execute form: " + this.f31747a.getFormId());
        if (this.f31747a.mo28796c() == C11013n2.C11014a.AVAILABLE) {
            C11074r2 r2Var = this.f31748b;
            if (r2Var != null) {
                r2Var.mo28955a(this.f31747a);
                return;
            }
            return;
        }
        this.f31747a.mo28788a(C11013n2.C11014a.IN_PROGRESS);
        boolean z = true;
        C10797e7 e7Var = (C10797e7) C10876i1.m39698a().mo28467b(C10785e0.C10786a.Template, this.f31747a.mo28817h());
        boolean z2 = e7Var == null || !this.f31747a.mo28817h().equals(e7Var.mo28265b()) || !this.f31747a.mo28805g().equals(e7Var.mo28263a()) || !this.f31747a.mo28825n();
        if (TextUtils.isEmpty(this.f31747a.mo28817h()) || !z2) {
            z = false;
        }
        this.f31749c = z;
        if (mo28885b() || z2) {
            mo28883a((C10796e6<C10797e7>) new C11048a());
        } else {
            m40497a(this.f31747a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11013n2 mo28881a(SDKConfigurationFormContract sDKConfigurationFormContract) {
        if (sDKConfigurationFormContract == null) {
            return null;
        }
        return (C11013n2) C10876i1.m39698a().mo28467b(C10785e0.C10786a.FormData, sDKConfigurationFormContract.getFormId());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo28885b() {
        if (this.f31747a.mo28804f() == null || this.f31747a.mo28804f().isEmpty()) {
            return false;
        }
        for (ResourceContract next : this.f31747a.mo28804f()) {
            next.setFormId(this.f31747a.getFormId());
            this.f31750d.add(next);
        }
        if (this.f31750d.size() != 0) {
            mo28884a((List<ResourceContract>) this.f31750d);
        }
        C10735b4.m39109b("Resources downloading finished for form: " + this.f31747a.getFormId());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo28886c() {
        return this.f31749c || this.f31750d.size() > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28882a() {
        m40499d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28883a(C10796e6<C10797e7> e6Var) {
        String templateDebugRemoteUrl = this.f31747a.mo28825n() ? this.f31747a.getTemplateDebugRemoteUrl() : this.f31747a.mo28817h();
        if (this.f31747a.mo28825n()) {
            C10876i1.m39698a().mo28464a(C10785e0.C10786a.Template, this.f31747a.mo28817h());
        } else {
            C10876i1.m39698a().mo28464a(C10785e0.C10786a.Template, this.f31747a.getTemplateDebugRemoteUrl());
        }
        C10797e7 e7Var = (C10797e7) C10876i1.m39698a().mo28467b(C10785e0.C10786a.Template, templateDebugRemoteUrl);
        if (e7Var != null) {
            e6Var.mo27797a(e7Var);
        } else {
            C10998m4.m40266h().mo28742a(templateDebugRemoteUrl, this.f31747a.mo28805g(), new C11049b(templateDebugRemoteUrl, e6Var));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m40497a(C11013n2 n2Var) {
        if (!mo28886c()) {
            if (n2Var.mo28796c() != C11013n2.C11014a.FAILED) {
                n2Var.mo28788a(C11013n2.C11014a.AVAILABLE);
            }
            C10876i1.m39698a().mo28472c((C10785e0) n2Var);
            C11074r2 r2Var = this.f31748b;
            if (r2Var != null) {
                r2Var.mo28955a(n2Var);
            }
            C10735b4.m39109b("Form: " + n2Var.getFormId() + " was preloaded");
            AnalyticsBridge.getInstance().reportPreloadMechanismEvent(this.f31751e, System.currentTimeMillis(), n2Var.getFormId(), n2Var.mo28796c());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28884a(List<ResourceContract> list) {
        new C10778d6(list, new C11050c());
    }
}
