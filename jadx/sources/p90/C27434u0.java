package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p366bk.C10324m;

/* renamed from: p90.u0 */
public final class C27434u0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69891d;

    /* renamed from: e */
    public final C27346k2 f69892e;

    /* renamed from: f */
    public final FrameLayout f69893f;

    /* renamed from: g */
    public final LinearLayout f69894g;

    /* renamed from: h */
    public final PageDescriptionView f69895h;

    /* renamed from: i */
    public final FrameLayout f69896i;

    /* renamed from: j */
    public final FrameLayout f69897j;

    /* renamed from: k */
    public final Button f69898k;

    /* renamed from: l */
    public final StateView f69899l;

    /* renamed from: m */
    public final C27272c8 f69900m;

    /* renamed from: n */
    public final RecyclerView f69901n;

    /* renamed from: o */
    public final EmptyWidget f69902o;

    /* renamed from: p */
    public final Input f69903p;

    /* renamed from: q */
    public final AppCompatTextView f69904q;

    private C27434u0(LinearLayout linearLayout, C27346k2 k2Var, FrameLayout frameLayout, LinearLayout linearLayout2, PageDescriptionView pageDescriptionView, FrameLayout frameLayout2, FrameLayout frameLayout3, Button button, StateView stateView, C27272c8 c8Var, RecyclerView recyclerView, EmptyWidget emptyWidget, Input input, AppCompatTextView appCompatTextView) {
        this.f69891d = linearLayout;
        this.f69892e = k2Var;
        this.f69893f = frameLayout;
        this.f69894g = linearLayout2;
        this.f69895h = pageDescriptionView;
        this.f69896i = frameLayout2;
        this.f69897j = frameLayout3;
        this.f69898k = button;
        this.f69899l = stateView;
        this.f69900m = c8Var;
        this.f69901n = recyclerView;
        this.f69902o = emptyWidget;
        this.f69903p = input;
        this.f69904q = appCompatTextView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r1 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27434u0 m85042a(android.view.View r18) {
        /*
            r0 = r18
            int r1 = p366bk.C10322k.bannerView
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x009f
            p90.k2 r5 = p90.C27346k2.m84693a(r2)
            int r1 = p366bk.C10322k.f28887r9
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            if (r6 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.f28776Oc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.f28791Tc
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r8 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r8
            if (r8 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.f28790Sj
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            if (r9 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.f28719Dq
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            if (r10 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.f28764Kr
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.buttons.Button r11 = (p341ge.bog.designsystem.components.buttons.Button) r11
            if (r11 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.f28746Hv
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r12 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r12
            if (r12 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.f28730Ex
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x009f
            p90.c8 r13 = p90.C27272c8.m84388a(r2)
            int r1 = p366bk.C10322k.transfer_list
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14
            if (r14 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.transfer_list_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.emptywidget.EmptyWidget r15 = (p341ge.bog.designsystem.components.emptywidget.EmptyWidget) r15
            if (r15 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.transfer_number
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            ge.bog.designsystem.components.input.Input r16 = (p341ge.bog.designsystem.components.input.Input) r16
            if (r16 == 0) goto L_0x009f
            int r1 = p366bk.C10322k.transfer_number_title
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            androidx.appcompat.widget.AppCompatTextView r17 = (androidx.appcompat.widget.AppCompatTextView) r17
            if (r17 == 0) goto L_0x009f
            p90.u0 r1 = new p90.u0
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x009f:
            android.content.res.Resources r0 = r18.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27434u0.m85042a(android.view.View):p90.u0");
    }

    /* renamed from: d */
    public static C27434u0 m85043d(LayoutInflater layoutInflater) {
        return m85044e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27434u0 m85044e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_money_transfer_provider_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85042a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69891d;
    }
}
