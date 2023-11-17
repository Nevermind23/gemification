package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;
import p90.C27486z7;
import sn0.C17902f;

/* renamed from: xn0.d */
public final class C18846d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f52691d;

    /* renamed from: e */
    public final PageState f52692e;

    /* renamed from: f */
    public final Button f52693f;

    /* renamed from: g */
    public final ConstraintLayout f52694g;

    /* renamed from: h */
    public final TextView f52695h;

    /* renamed from: i */
    public final FrameLayout f52696i;

    /* renamed from: j */
    public final RecyclerView f52697j;

    /* renamed from: k */
    public final C27486z7 f52698k;

    /* renamed from: l */
    public final CardView f52699l;

    /* renamed from: m */
    public final View f52700m;

    /* renamed from: n */
    public final C27272c8 f52701n;

    /* renamed from: o */
    public final LayerView f52702o;

    private C18846d(ConstraintLayout constraintLayout, PageState pageState, Button button, ConstraintLayout constraintLayout2, TextView textView, FrameLayout frameLayout, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView, View view, C27272c8 c8Var, LayerView layerView) {
        this.f52691d = constraintLayout;
        this.f52692e = pageState;
        this.f52693f = button;
        this.f52694g = constraintLayout2;
        this.f52695h = textView;
        this.f52696i = frameLayout;
        this.f52697j = recyclerView;
        this.f52698k = z7Var;
        this.f52699l = cardView;
        this.f52700m = view;
        this.f52701n = c8Var;
        this.f52702o = layerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        r0 = sn0.C17901e.f50963d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r0 = sn0.C17901e.f50968g0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        r0 = sn0.C17901e.f50979n0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xn0.C18846d m63749a(android.view.View r15) {
        /*
            int r0 = sn0.C17901e.empty_filtered_data_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r4 = r1
            ge.bog.designsystem.components.pagestate.PageState r4 = (p341ge.bog.designsystem.components.pagestate.PageState) r4
            if (r4 == 0) goto L_0x0082
            int r0 = sn0.C17901e.f50988y
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r5 = r1
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x0082
            int r0 = sn0.C17901e.filter_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r6 = r1
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            if (r6 == 0) goto L_0x0082
            int r0 = sn0.C17901e.f50946A
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0082
            int r0 = sn0.C17901e.f50959Z
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x0082
            int r0 = sn0.C17901e.f50961b0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r9 = r1
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            if (r9 == 0) goto L_0x0082
            int r0 = sn0.C17901e.f50963d0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0082
            p90.z7 r10 = p90.C27486z7.m85250a(r1)
            int r0 = sn0.C17901e.f50964e0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r11 = r1
            androidx.cardview.widget.CardView r11 = (androidx.cardview.widget.CardView) r11
            if (r11 == 0) goto L_0x0082
            int r0 = sn0.C17901e.f50968g0
            android.view.View r12 = p086g1.C6202b.m24689a(r15, r0)
            if (r12 == 0) goto L_0x0082
            int r0 = sn0.C17901e.f50979n0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            if (r1 == 0) goto L_0x0082
            p90.c8 r13 = p90.C27272c8.m84388a(r1)
            int r0 = sn0.C17901e.f50980o0
            android.view.View r1 = p086g1.C6202b.m24689a(r15, r0)
            r14 = r1
            ge.bog.designsystem.components.layersandshadows.LayerView r14 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r14
            if (r14 == 0) goto L_0x0082
            xn0.d r0 = new xn0.d
            r3 = r15
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0082:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xn0.C18846d.m63749a(android.view.View):xn0.d");
    }

    /* renamed from: d */
    public static C18846d m63750d(LayoutInflater layoutInflater) {
        return m63751e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C18846d m63751e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.activity_lifestyle_offers_all_categories, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63749a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f52691d;
    }
}
