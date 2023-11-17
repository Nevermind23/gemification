package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import da0.C19952f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.depositheader.DepositHeaderView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p90.C27272c8;

/* renamed from: ha0.g */
public final class C24930g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f64116d;

    /* renamed from: e */
    public final DepositHeaderView f64117e;

    /* renamed from: f */
    public final PageDescriptionView f64118f;

    /* renamed from: g */
    public final C27272c8 f64119g;

    private C24930g(ConstraintLayout constraintLayout, DepositHeaderView depositHeaderView, PageDescriptionView pageDescriptionView, C27272c8 c8Var) {
        this.f64116d = constraintLayout;
        this.f64117e = depositHeaderView;
        this.f64118f = pageDescriptionView;
        this.f64119g = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = da0.C19951e.f54510G0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha0.C24930g m79699a(android.view.View r4) {
        /*
            int r0 = da0.C19951e.deposit_header
            android.view.View r1 = p086g1.C6202b.m24689a(r4, r0)
            ge.bog.designsystem.components.depositheader.DepositHeaderView r1 = (p341ge.bog.designsystem.components.depositheader.DepositHeaderView) r1
            if (r1 == 0) goto L_0x0028
            int r0 = da0.C19951e.f54530k0
            android.view.View r2 = p086g1.C6202b.m24689a(r4, r0)
            ge.bog.designsystem.components.pagedescription.PageDescriptionView r2 = (p341ge.bog.designsystem.components.pagedescription.PageDescriptionView) r2
            if (r2 == 0) goto L_0x0028
            int r0 = da0.C19951e.f54510G0
            android.view.View r3 = p086g1.C6202b.m24689a(r4, r0)
            if (r3 == 0) goto L_0x0028
            p90.c8 r0 = p90.C27272c8.m84388a(r3)
            ha0.g r3 = new ha0.g
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r1, r2, r0)
            return r3
        L_0x0028:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ha0.C24930g.m79699a(android.view.View):ha0.g");
    }

    /* renamed from: d */
    public static C24930g m79700d(LayoutInflater layoutInflater) {
        return m79701e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24930g m79701e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.activity_deposit_advisor_recommendation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79699a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f64116d;
    }
}
