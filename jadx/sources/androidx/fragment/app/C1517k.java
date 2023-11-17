package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C1008h;

/* renamed from: androidx.fragment.app.k */
public class C1517k {

    /* renamed from: a */
    private final C1529m f4429a;

    private C1517k(C1529m mVar) {
        this.f4429a = mVar;
    }

    /* renamed from: b */
    public static C1517k m5376b(C1529m mVar) {
        return new C1517k((C1529m) C1008h.m3531h(mVar, "callbacks == null"));
    }

    /* renamed from: a */
    public void mo4718a(Fragment fragment) {
        C1529m mVar = this.f4429a;
        mVar.f4466h.mo4424n(mVar, mVar, fragment);
    }

    /* renamed from: c */
    public void mo4719c() {
        this.f4429a.f4466h.mo4448z();
    }

    /* renamed from: d */
    public boolean mo4720d(MenuItem menuItem) {
        return this.f4429a.f4466h.mo4356C(menuItem);
    }

    /* renamed from: e */
    public void mo4721e() {
        this.f4429a.f4466h.mo4359D();
    }

    /* renamed from: f */
    public void mo4722f() {
        this.f4429a.f4466h.mo4365F();
    }

    /* renamed from: g */
    public void mo4723g() {
        this.f4429a.f4466h.mo4384O();
    }

    /* renamed from: h */
    public void mo4724h() {
        this.f4429a.f4466h.mo4391S();
    }

    /* renamed from: i */
    public void mo4725i() {
        this.f4429a.f4466h.mo4393T();
    }

    /* renamed from: j */
    public void mo4726j() {
        this.f4429a.f4466h.mo4395V();
    }

    /* renamed from: k */
    public boolean mo4727k() {
        return this.f4429a.f4466h.mo4402c0(true);
    }

    /* renamed from: l */
    public FragmentManager mo4728l() {
        return this.f4429a.f4466h;
    }

    /* renamed from: m */
    public void mo4729m() {
        this.f4429a.f4466h.mo4405d1();
    }

    /* renamed from: n */
    public View mo4730n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4429a.f4466h.mo4351A0().onCreateView(view, str, context, attributeSet);
    }
}
