package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonDescriptionView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p90.C27272c8;

/* renamed from: ev0.b */
public final class C31817b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78447d;

    /* renamed from: e */
    public final LinearLayout f78448e;

    /* renamed from: f */
    public final LinearLayout f78449f;

    /* renamed from: g */
    public final PageDescriptionView f78450g;

    /* renamed from: h */
    public final FixedButtonDescriptionView f78451h;

    /* renamed from: i */
    public final RecyclerView f78452i;

    /* renamed from: j */
    public final Button f78453j;

    /* renamed from: k */
    public final StateView f78454k;

    /* renamed from: l */
    public final C27272c8 f78455l;

    private C31817b(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, PageDescriptionView pageDescriptionView, FixedButtonDescriptionView fixedButtonDescriptionView, RecyclerView recyclerView, Button button, StateView stateView, C27272c8 c8Var) {
        this.f78447d = linearLayout;
        this.f78448e = linearLayout2;
        this.f78449f = linearLayout3;
        this.f78450g = pageDescriptionView;
        this.f78451h = fixedButtonDescriptionView;
        this.f78452i = recyclerView;
        this.f78453j = button;
        this.f78454k = stateView;
        this.f78455l = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = bv0.C31204d.f77530d0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ev0.C31817b m94052a(android.view.View r12) {
        /*
            int r0 = bv0.C31204d.f77535r
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0063
            int r0 = bv0.C31204d.f77536s
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0063
            int r0 = bv0.C31204d.f77537u
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r6 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r6
            if (r6 == 0) goto L_0x0063
            int r0 = bv0.C31204d.f77538v
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            ge.bog.designsystem.components.fixedbutton.FixedButtonDescriptionView r7 = (p341ge.bog.designsystem.components.fixedbutton.FixedButtonDescriptionView) r7
            if (r7 == 0) goto L_0x0063
            int r0 = bv0.C31204d.f77518S
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            if (r8 == 0) goto L_0x0063
            int r0 = bv0.C31204d.f77519T
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r9 = r1
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x0063
            int r0 = bv0.C31204d.f77526b0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r10 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r10
            if (r10 == 0) goto L_0x0063
            int r0 = bv0.C31204d.f77530d0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0063
            p90.c8 r11 = p90.C27272c8.m84388a(r1)
            ev0.b r0 = new ev0.b
            r3 = r12
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0063:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ev0.C31817b.m94052a(android.view.View):ev0.b");
    }

    /* renamed from: d */
    public static C31817b m94053d(LayoutInflater layoutInflater) {
        return m94054e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C31817b m94054e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.activity_open_bank_accounts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94052a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78447d;
    }
}
