package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import np0.C37440f;
import p086g1.C6201a;
import p90.C27272c8;

/* renamed from: sp0.h */
public final class C38489h implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92195d;

    /* renamed from: e */
    public final RecyclerView f92196e;

    /* renamed from: f */
    public final C27272c8 f92197f;

    private C38489h(LinearLayout linearLayout, RecyclerView recyclerView, C27272c8 c8Var) {
        this.f92195d = linearLayout;
        this.f92196e = recyclerView;
        this.f92197f = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = np0.C37439e.f89996Z0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sp0.C38489h m112969a(android.view.View r3) {
        /*
            int r0 = np0.C37439e.f89983F0
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = np0.C37439e.f89996Z0
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            sp0.h r2 = new sp0.h
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.<init>(r3, r1, r0)
            return r2
        L_0x001e:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sp0.C38489h.m112969a(android.view.View):sp0.h");
    }

    /* renamed from: d */
    public static C38489h m112970d(LayoutInflater layoutInflater) {
        return m112971e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C38489h m112971e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.activity_loan_subtypes, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112969a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92195d;
    }
}
