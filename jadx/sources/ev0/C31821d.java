package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31205e;
import p086g1.C6201a;
import p90.C27272c8;

/* renamed from: ev0.d */
public final class C31821d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78472d;

    /* renamed from: e */
    public final RecyclerView f78473e;

    /* renamed from: f */
    public final C27272c8 f78474f;

    private C31821d(LinearLayout linearLayout, RecyclerView recyclerView, C27272c8 c8Var) {
        this.f78472d = linearLayout;
        this.f78473e = recyclerView;
        this.f78474f = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = bv0.C31204d.f77530d0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ev0.C31821d m94070a(android.view.View r3) {
        /*
            int r0 = bv0.C31204d.f77510C
            android.view.View r1 = p086g1.C6202b.m24689a(r3, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L_0x001e
            int r0 = bv0.C31204d.f77530d0
            android.view.View r2 = p086g1.C6202b.m24689a(r3, r0)
            if (r2 == 0) goto L_0x001e
            p90.c8 r0 = p90.C27272c8.m84388a(r2)
            ev0.d r2 = new ev0.d
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
        throw new UnsupportedOperationException("Method not decompiled: ev0.C31821d.m94070a(android.view.View):ev0.d");
    }

    /* renamed from: d */
    public static C31821d m94071d(LayoutInflater layoutInflater) {
        return m94072e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C31821d m94072e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.activity_open_bank_product_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94070a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78472d;
    }
}
