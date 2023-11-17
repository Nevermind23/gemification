package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p90.C27486z7;
import u70.C28607c;

/* renamed from: h80.k */
public final class C24904k implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f63998d;

    /* renamed from: e */
    public final ProgressBar f63999e;

    /* renamed from: f */
    public final FrameLayout f64000f;

    /* renamed from: g */
    public final RecyclerView f64001g;

    /* renamed from: h */
    public final C27486z7 f64002h;

    /* renamed from: i */
    public final CardView f64003i;

    /* renamed from: j */
    public final FrameLayout f64004j;

    private C24904k(ConstraintLayout constraintLayout, ProgressBar progressBar, FrameLayout frameLayout, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView, FrameLayout frameLayout2) {
        this.f63998d = constraintLayout;
        this.f63999e = progressBar;
        this.f64000f = frameLayout;
        this.f64001g = recyclerView;
        this.f64002h = z7Var;
        this.f64003i = cardView;
        this.f64004j = frameLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = u70.C28606b.f72567A0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h80.C24904k m79598a(android.view.View r10) {
        /*
            int r0 = u70.C28606b.f72604o
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r4 = r1
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            if (r4 == 0) goto L_0x004d
            int r0 = u70.C28606b.f72610v0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            if (r5 == 0) goto L_0x004d
            int r0 = u70.C28606b.f72613x0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x004d
            int r0 = u70.C28606b.f72567A0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            if (r1 == 0) goto L_0x004d
            p90.z7 r7 = p90.C27486z7.m85250a(r1)
            int r0 = u70.C28606b.f72569B0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r8 = r1
            androidx.cardview.widget.CardView r8 = (androidx.cardview.widget.CardView) r8
            if (r8 == 0) goto L_0x004d
            int r0 = u70.C28606b.f72588R0
            android.view.View r1 = p086g1.C6202b.m24689a(r10, r0)
            r9 = r1
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            if (r9 == 0) goto L_0x004d
            h80.k r0 = new h80.k
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004d:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h80.C24904k.m79598a(android.view.View):h80.k");
    }

    /* renamed from: d */
    public static C24904k m79599d(LayoutInflater layoutInflater) {
        return m79600e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C24904k m79600e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.activity_client_limit_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79598a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f63998d;
    }
}
