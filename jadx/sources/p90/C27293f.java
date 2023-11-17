package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10324m;

/* renamed from: p90.f */
public final class C27293f implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68661d;

    /* renamed from: e */
    public final FrameLayout f68662e;

    /* renamed from: f */
    public final Guideline f68663f;

    /* renamed from: g */
    public final Guideline f68664g;

    /* renamed from: h */
    public final Guideline f68665h;

    /* renamed from: i */
    public final AppCompatTextView f68666i;

    /* renamed from: j */
    public final Button f68667j;

    /* renamed from: k */
    public final RecyclerView f68668k;

    /* renamed from: l */
    public final C27486z7 f68669l;

    /* renamed from: m */
    public final FrameLayout f68670m;

    private C27293f(ConstraintLayout constraintLayout, FrameLayout frameLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, AppCompatTextView appCompatTextView, Button button, RecyclerView recyclerView, C27486z7 z7Var, FrameLayout frameLayout2) {
        this.f68661d = constraintLayout;
        this.f68662e = frameLayout;
        this.f68663f = guideline;
        this.f68664g = guideline2;
        this.f68665h = guideline3;
        this.f68666i = appCompatTextView;
        this.f68667j = button;
        this.f68668k = recyclerView;
        this.f68669l = z7Var;
        this.f68670m = frameLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = p366bk.C10322k.f28774Ns;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27293f m84472a(android.view.View r13) {
        /*
            int r0 = p366bk.C10322k.f28784Qe
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r4 = r1
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            if (r4 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.gdBot
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r5 = r1
            androidx.constraintlayout.widget.Guideline r5 = (androidx.constraintlayout.widget.Guideline) r5
            if (r5 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.gdEnd
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r6 = r1
            androidx.constraintlayout.widget.Guideline r6 = (androidx.constraintlayout.widget.Guideline) r6
            if (r6 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.gdStart
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r7 = r1
            androidx.constraintlayout.widget.Guideline r7 = (androidx.constraintlayout.widget.Guideline) r7
            if (r7 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.mcc_merchant_header_text
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r8 = r1
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.mcc_save_button
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r9 = r1
            ge.bog.designsystem.components.buttons.Button r9 = (p341ge.bog.designsystem.components.buttons.Button) r9
            if (r9 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.mcc_state_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            if (r10 == 0) goto L_0x006e
            int r0 = p366bk.C10322k.f28774Ns
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            if (r1 == 0) goto L_0x006e
            p90.z7 r11 = p90.C27486z7.m85250a(r1)
            int r0 = p366bk.C10322k.retryButtonContainer
            android.view.View r1 = p086g1.C6202b.m24689a(r13, r0)
            r12 = r1
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            if (r12 == 0) goto L_0x006e
            p90.f r0 = new p90.f
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x006e:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27293f.m84472a(android.view.View):p90.f");
    }

    /* renamed from: d */
    public static C27293f m84473d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.action_sheet_manage_mcc, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84472a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68661d;
    }
}
