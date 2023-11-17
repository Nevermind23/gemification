package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.a */
class C0594a implements C0596c {
    C0594a() {
    }

    /* renamed from: p */
    private C0597d m2281p(C0595b bVar) {
        return (C0597d) bVar.mo2524c();
    }

    /* renamed from: a */
    public void mo2528a(C0595b bVar, float f) {
        m2281p(bVar).mo2551h(f);
    }

    /* renamed from: b */
    public float mo2529b(C0595b bVar) {
        return m2281p(bVar).mo2545d();
    }

    /* renamed from: c */
    public void mo2530c(C0595b bVar, float f) {
        bVar.mo2527f().setElevation(f);
    }

    /* renamed from: d */
    public float mo2531d(C0595b bVar) {
        return m2281p(bVar).mo2544c();
    }

    /* renamed from: e */
    public ColorStateList mo2532e(C0595b bVar) {
        return m2281p(bVar).mo2543b();
    }

    /* renamed from: f */
    public float mo2533f(C0595b bVar) {
        return mo2529b(bVar) * 2.0f;
    }

    /* renamed from: g */
    public void mo2534g(C0595b bVar) {
        mo2542o(bVar, mo2531d(bVar));
    }

    /* renamed from: h */
    public void mo2535h(C0595b bVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        bVar.mo2522a(new C0597d(colorStateList, f));
        View f4 = bVar.mo2527f();
        f4.setClipToOutline(true);
        f4.setElevation(f2);
        mo2542o(bVar, f3);
    }

    /* renamed from: i */
    public float mo2536i(C0595b bVar) {
        return bVar.mo2527f().getElevation();
    }

    /* renamed from: j */
    public void mo2537j(C0595b bVar) {
        mo2542o(bVar, mo2531d(bVar));
    }

    /* renamed from: k */
    public void mo2538k(C0595b bVar) {
        if (!bVar.mo2523b()) {
            bVar.mo2525d(0, 0, 0, 0);
            return;
        }
        float d = mo2531d(bVar);
        float b = mo2529b(bVar);
        int ceil = (int) Math.ceil((double) C0598e.m2327a(d, b, bVar.mo2526e()));
        int ceil2 = (int) Math.ceil((double) C0598e.m2328b(d, b, bVar.mo2526e()));
        bVar.mo2525d(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: l */
    public void mo2539l() {
    }

    /* renamed from: m */
    public float mo2540m(C0595b bVar) {
        return mo2529b(bVar) * 2.0f;
    }

    /* renamed from: n */
    public void mo2541n(C0595b bVar, ColorStateList colorStateList) {
        m2281p(bVar).mo2547f(colorStateList);
    }

    /* renamed from: o */
    public void mo2542o(C0595b bVar, float f) {
        m2281p(bVar).mo2548g(f, bVar.mo2523b(), bVar.mo2526e());
        mo2538k(bVar);
    }
}
