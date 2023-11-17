package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.C0214c;
import com.medallia.digital.mobilesdk.C10880i3;
import com.medallia.digital.mobilesdk.C11164w3;

/* renamed from: com.medallia.digital.mobilesdk.h3 */
final class C10850h3 implements C11164w3.C11170f {

    /* renamed from: j */
    private static C10850h3 f31072j;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10904j3 f31073a;

    /* renamed from: b */
    private InviteData f31074b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0214c f31075c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public DialogInterface.OnClickListener f31076d;

    /* renamed from: e */
    private InviteData f31077e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C11184x f31078f;

    /* renamed from: g */
    private C10858h f31079g;

    /* renamed from: h */
    private MDAppearanceMode f31080h = MDAppearanceMode.light;

    /* renamed from: i */
    private C10984l5 f31081i;

    /* renamed from: com.medallia.digital.mobilesdk.h3$a */
    class C10851a extends C11033o4 {
        C10851a() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C10850h3.this.m39615g();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h3$b */
    class C10852b extends C11033o4 {
        C10852b() {
        }

        /* renamed from: a */
        public void mo27617a() {
            C10850h3.this.m39614f();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h3$c */
    class C10853c extends C11207y {
        C10853c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28403a() {
            C10850h3.this.m39608a(Boolean.TRUE);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo28406b(C10880i3 i3Var) {
            C10850h3.this.f31073a.mo28526a((C10880i3.C10882b) null);
            C11184x unused = C10850h3.this.f31078f = null;
            C10850h3.this.m39608a(Boolean.FALSE);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo28407c(C10880i3 i3Var) {
            if (C10850h3.this.f31076d != null) {
                C10850h3.this.f31076d.onClick((DialogInterface) null, 0);
            }
            C10850h3.this.f31073a.mo28526a((C10880i3.C10882b) null);
            C11184x unused = C10850h3.this.f31078f = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28404a(C10880i3 i3Var) {
            C10850h3.this.f31073a.mo28526a((C10880i3.C10882b) null);
            C11184x unused = C10850h3.this.f31078f = null;
            C10850h3.this.m39608a(Boolean.FALSE);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28405a(C11184x xVar) {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h3$d */
    class C10854d implements DialogInterface.OnClickListener {
        C10854d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C10850h3.this.f31076d != null) {
                C10850h3.this.f31076d.onClick(dialogInterface, i);
            }
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                C0214c unused = C10850h3.this.f31075c = null;
            }
            C10850h3.this.f31073a.mo28526a((C10880i3.C10882b) null);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h3$e */
    class C10855e implements DialogInterface.OnClickListener {
        C10855e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                C0214c unused = C10850h3.this.f31075c = null;
            }
            C10850h3.this.f31073a.mo28526a((C10880i3.C10882b) null);
            C10850h3.this.m39608a(Boolean.FALSE);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h3$f */
    class C10856f implements DialogInterface.OnClickListener {
        C10856f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                C0214c unused = C10850h3.this.f31075c = null;
            }
            C10850h3.this.f31073a.mo28526a((C10880i3.C10882b) null);
            C10850h3.this.m39608a(Boolean.FALSE);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h3$g */
    class C10857g implements DialogInterface.OnCancelListener {
        C10857g() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                C0214c unused = C10850h3.this.f31075c = null;
            }
            C10850h3.this.f31073a.mo28526a((C10880i3.C10882b) null);
            C10850h3.this.m39608a(Boolean.FALSE);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h3$h */
    protected interface C10858h {
        /* renamed from: a */
        void mo28412a(boolean z);
    }

    private C10850h3() {
        C10904j3 j3Var = new C10904j3();
        this.f31073a = j3Var;
        j3Var.mo28534b(true);
        C11164w3.m40939b().mo29111a((C11164w3.C11170f) this);
    }

    /* renamed from: d */
    protected static C10850h3 m39611d() {
        if (f31072j == null) {
            f31072j = new C10850h3();
        }
        return f31072j;
    }

    /* renamed from: e */
    private boolean m39613e() {
        return !C11164w3.m40939b().mo29121f() && !C11164w3.m40939b().mo29114a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") && !C11164w3.m40939b().mo29114a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m39614f() {
        this.f31073a.mo28531a(false);
        InviteData inviteData = this.f31077e;
        if (inviteData != null) {
            this.f31078f = this.f31073a.mo28524a(inviteData.getBannerData(), this.f31081i, (C11207y) new C10853c());
        }
        C11184x xVar = this.f31078f;
        if (xVar != null) {
            xVar.mo29168B();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m39615g() {
        this.f31073a.mo28531a(false);
        C0214c a = this.f31073a.mo28523a(this.f31074b, this.f31080h, (DialogInterface.OnClickListener) new C10854d(), (DialogInterface.OnClickListener) new C10855e(), (DialogInterface.OnClickListener) new C10856f(), (DialogInterface.OnCancelListener) new C10857g());
        this.f31075c = a;
        if (a != null) {
            m39608a(Boolean.TRUE);
            this.f31075c.show();
        }
    }

    /* renamed from: h */
    private void m39616h() {
        if (m39613e() && this.f31073a.mo28540k()) {
            C0214c cVar = this.f31075c;
            if (cVar != null) {
                cVar.dismiss();
                this.f31075c = null;
                try {
                    ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C10851a());
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            }
            C11184x xVar = this.f31078f;
            if (xVar != null) {
                xVar.mo29169b();
                this.f31078f = null;
                try {
                    ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).runOnUiThread(new C10852b());
                } catch (Exception e2) {
                    C10735b4.m39111c(e2.getMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public void mo28344b() {
        m39616h();
    }

    /* renamed from: i */
    public void mo28402i() {
        this.f31079g = null;
    }

    /* renamed from: c */
    public void mo28401c() {
        if (this.f31078f != null) {
            this.f31073a.mo28526a((C10880i3.C10882b) null);
            this.f31078f.mo29169b();
            this.f31078f = null;
        }
    }

    /* renamed from: a */
    public void mo28341a() {
        if (this.f31073a.mo28540k()) {
            this.f31073a.mo28535c();
        }
    }

    /* renamed from: a */
    public void mo28398a(InviteData inviteData, DialogInterface.OnClickListener onClickListener, MDAppearanceMode mDAppearanceMode) {
        this.f31074b = inviteData;
        this.f31076d = onClickListener;
        this.f31080h = mDAppearanceMode;
        m39615g();
    }

    /* renamed from: a */
    public void mo28399a(C10858h hVar) {
        this.f31079g = hVar;
    }

    /* renamed from: a */
    public void mo28400a(C11013n2 n2Var, DialogInterface.OnClickListener onClickListener, C10984l5 l5Var) {
        if (n2Var != null) {
            this.f31081i = l5Var;
            this.f31077e = n2Var.getInviteData();
            this.f31076d = onClickListener;
            m39614f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39608a(Boolean bool) {
        C10858h hVar = this.f31079g;
        if (hVar != null) {
            hVar.mo28412a(bool.booleanValue());
        }
    }
}
