package p610sp;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import cf1.C40419j;
import g91.C32319m;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.categorypackages.presentation.application.shared.model.SoloApplicationFormData;
import p341ge.bog.mobilebank.categorypackages.presentation.packagelist.PackageListFragment;
import p356ao.C10111c;
import p356ao.C10118j;
import ue1.C43075l;

/* renamed from: sp.e */
public abstract class C17913e {
    /* renamed from: e */
    public static final void m61723e(SoloApplicationFormData soloApplicationFormData, String str, C43075l lVar, Fragment fragment) {
        long j;
        C41536l.m120489i(soloApplicationFormData, "<this>");
        C41536l.m120489i(lVar, "continueFunction");
        C41536l.m120489i(fragment, "hostFragment");
        if (m61730l(soloApplicationFormData)) {
            Long b = soloApplicationFormData.mo40914b();
            if (b != null) {
                j = b.longValue();
            } else {
                j = 0;
            }
            m61731m(fragment, j, str, new C17909a(lVar, soloApplicationFormData));
            return;
        }
        lVar.invoke(soloApplicationFormData);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m61724f(C43075l lVar, SoloApplicationFormData soloApplicationFormData, Button button) {
        C41536l.m120489i(lVar, "$continueFunction");
        C41536l.m120489i(soloApplicationFormData, "$this_checkPriorities");
        C41536l.m120489i(button, "it");
        lVar.invoke(soloApplicationFormData);
    }

    /* renamed from: g */
    public static final void m61725g(ViewPager2 viewPager2) {
        C41536l.m120489i(viewPager2, "<this>");
        float dimension = viewPager2.getContext().getResources().getDimension(C10111c.f27911c);
        Resources resources = viewPager2.getContext().getResources();
        int i = C10111c.f27909a;
        C17912d dVar = new C17912d(dimension + resources.getDimension(i));
        Context context = viewPager2.getContext();
        C41536l.m120488h(context, "context");
        PackageListFragment.C14762b bVar = new PackageListFragment.C14762b(context, i);
        viewPager2.setPageTransformer(dVar);
        viewPager2.mo6588a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m61726h(float f, View view, float f2) {
        C41536l.m120489i(view, "page");
        view.setTranslationX((-f) * f2);
    }

    /* renamed from: i */
    public static final String m61727i(long j, String str, String str2) {
        C41536l.m120489i(str, "textToReplace");
        if (str2 == null) {
            str2 = "dd.MM.YYYY";
        }
        String d = C32319m.m95297d(j, str2);
        C40419j jVar = new C40419j("%([^%]*)%");
        C41536l.m120488h(d, "dateText");
        return jVar.mo94490g(str, d);
    }

    /* renamed from: j */
    public static final void m61728j(Fragment fragment, boolean z) {
        Resources.Theme theme;
        C41536l.m120489i(fragment, "<this>");
        if (z) {
            Context context = fragment.getContext();
            if (context != null && (theme = context.getTheme()) != null) {
                theme.applyStyle(C10118j.PackagesDarkStyle, true);
                return;
            }
            return;
        }
        C32343x.m95438c1(fragment);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m61729k(androidx.fragment.app.Fragment r7, boolean r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x001c
            androidx.fragment.app.h r2 = r7.getActivity()
            if (r2 == 0) goto L_0x0017
            boolean r2 = g91.C32343x.m95476p0(r2)
            if (r2 != r0) goto L_0x0017
            r2 = r0
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            if (r2 != 0) goto L_0x001c
            r2 = r0
            goto L_0x001d
        L_0x001c:
            r2 = r1
        L_0x001d:
            androidx.fragment.app.h r7 = r7.getActivity()
            if (r7 == 0) goto L_0x005b
            boolean r3 = r7 instanceof p341ge.bog.mobilebank.p975ui.activities.C35388f2
            if (r3 == 0) goto L_0x005b
            r3 = r7
            ge.bog.mobilebank.ui.activities.f2 r3 = (p341ge.bog.mobilebank.p975ui.activities.C35388f2) r3
            ge.bog.designsystem.components.toolbar.ToolbarView r4 = r3.f85671t
            if (r4 == 0) goto L_0x0033
            r5 = 2
            r6 = 0
            p341ge.bog.designsystem.components.toolbar.ToolbarView.m50857i0(r4, r2, r1, r5, r6)
        L_0x0033:
            if (r8 != 0) goto L_0x003d
            boolean r8 = g91.C32343x.m95476p0(r7)
            if (r8 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            g91.C32343x.m95444e1(r7, r0)
            android.view.Window r8 = r3.getWindow()
            if (r2 == 0) goto L_0x0049
            int r0 = p356ao.C10110b.f27895b
            goto L_0x0054
        L_0x0049:
            boolean r0 = g91.C32343x.m95476p0(r7)
            if (r0 == 0) goto L_0x0052
            int r0 = p356ao.C10110b.f27897f
            goto L_0x0054
        L_0x0052:
            int r0 = p356ao.C10110b.f27908q
        L_0x0054:
            int r7 = androidx.core.content.C0767a.m2893c(r7, r0)
            r8.setStatusBarColor(r7)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p610sp.C17913e.m61729k(androidx.fragment.app.Fragment, boolean):void");
    }

    /* renamed from: l */
    public static final boolean m61730l(SoloApplicationFormData soloApplicationFormData) {
        C41536l.m120489i(soloApplicationFormData, "formData");
        Integer g = soloApplicationFormData.mo40920g();
        if (g == null || g.intValue() <= soloApplicationFormData.mo40934u()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static final void m61731m(Fragment fragment, long j, String str, C13310d.C13311a aVar) {
        C41536l.m120489i(fragment, "<this>");
        C41536l.m120489i(aVar, "listener");
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(C32343x.m95388F("text.package.downgrade.info.popup.header", new Object[0]));
        dVar.mo35639Q1(m61727i(j, C32343x.m95388F("text.package.downgrade.info.popup.description", new Object[0]), str));
        dVar.mo35646Z1(C32343x.m95388F("text.package.downgrade.info.popup.description.button", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("text.package.downgrade.info.popup.close.button", new Object[0]));
        dVar.mo35641T1(new C17910b(dVar));
        dVar.mo35645Y1(new C17911c(aVar, dVar));
        dVar.mo4576A1(fragment.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m61732n(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$builder");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m61733o(C13310d.C13311a aVar, C13310d dVar, Button button) {
        C41536l.m120489i(aVar, "$listener");
        C41536l.m120489i(dVar, "$builder");
        C41536l.m120489i(button, "it");
        aVar.mo33448a(button);
        dVar.mo4577k1();
    }
}
