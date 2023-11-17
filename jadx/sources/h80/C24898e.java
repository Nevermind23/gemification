package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p90.C27486z7;
import u70.C28607c;

/* renamed from: h80.e */
public final class C24898e implements C6201a {

    /* renamed from: d */
    private final FrameLayout f63921d;

    /* renamed from: e */
    public final CardView f63922e;

    /* renamed from: f */
    public final RecyclerView f63923f;

    /* renamed from: g */
    public final C27486z7 f63924g;

    /* renamed from: h */
    public final CardView f63925h;

    private C24898e(FrameLayout frameLayout, CardView cardView, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView2) {
        this.f63921d = frameLayout;
        this.f63922e = cardView;
        this.f63923f = recyclerView;
        this.f63924g = z7Var;
        this.f63925h = cardView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = u70.C28606b.f72567A0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h80.C24898e m79573a(android.view.View r8) {
        /*
            int r0 = u70.C28606b.f72609u0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            androidx.cardview.widget.CardView r4 = (androidx.cardview.widget.CardView) r4
            if (r4 == 0) goto L_0x0037
            int r0 = u70.C28606b.f72613x0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            if (r5 == 0) goto L_0x0037
            int r0 = u70.C28606b.f72567A0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.z7 r6 = p90.C27486z7.m85250a(r1)
            int r0 = u70.C28606b.f72569B0
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0037
            h80.e r0 = new h80.e
            r3 = r8
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0037:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r8 = r1.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h80.C24898e.m79573a(android.view.View):h80.e");
    }

    /* renamed from: d */
    public static C24898e m79574d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.action_sheet_income_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79573a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f63921d;
    }
}
