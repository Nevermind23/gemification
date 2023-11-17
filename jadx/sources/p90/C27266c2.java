package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarChooser;
import p366bk.C10324m;

/* renamed from: p90.c2 */
public final class C27266c2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68461d;

    /* renamed from: e */
    public final CalendarChooser f68462e;

    /* renamed from: f */
    public final LinearLayout f68463f;

    /* renamed from: g */
    public final RecyclerView f68464g;

    /* renamed from: h */
    public final C27272c8 f68465h;

    private C27266c2(LinearLayout linearLayout, CalendarChooser calendarChooser, LinearLayout linearLayout2, RecyclerView recyclerView, C27272c8 c8Var) {
        this.f68461d = linearLayout;
        this.f68462e = calendarChooser;
        this.f68463f = linearLayout2;
        this.f68464g = recyclerView;
        this.f68465h = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27266c2 m84363a(android.view.View r8) {
        /*
            int r0 = p366bk.C10322k.calendar_chooser
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r4 = r1
            ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarChooser r4 = (p341ge.bog.mobilebank.cleanarch.presentation.common.filter.items.CalendarChooser) r4
            if (r4 == 0) goto L_0x0037
            int r0 = p366bk.C10322k.f28798Um
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x0037
            int r0 = p366bk.C10322k.statements_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            r6 = r1
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r6 == 0) goto L_0x0037
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r8, r0)
            if (r1 == 0) goto L_0x0037
            p90.c8 r7 = p90.C27272c8.m84388a(r1)
            p90.c2 r0 = new p90.c2
            r3 = r8
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: p90.C27266c2.m84363a(android.view.View):p90.c2");
    }

    /* renamed from: d */
    public static C27266c2 m84364d(LayoutInflater layoutInflater) {
        return m84365e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27266c2 m84365e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_statement, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84363a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68461d;
    }
}
