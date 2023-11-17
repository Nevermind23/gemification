package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p90.C27272c8;

/* renamed from: ue0.i0 */
public final class C28731i0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73290d;

    /* renamed from: e */
    public final Button f73291e;

    /* renamed from: f */
    public final LinearLayout f73292f;

    /* renamed from: g */
    public final PageState f73293g;

    /* renamed from: h */
    public final TextView f73294h;

    /* renamed from: i */
    public final AppCompatImageView f73295i;

    /* renamed from: j */
    public final LayerView f73296j;

    /* renamed from: k */
    public final TextView f73297k;

    /* renamed from: l */
    public final TextView f73298l;

    /* renamed from: m */
    public final Group f73299m;

    /* renamed from: n */
    public final TextView f73300n;

    /* renamed from: o */
    public final PageState f73301o;

    /* renamed from: p */
    public final ScrollView f73302p;

    /* renamed from: q */
    public final C27272c8 f73303q;

    private C28731i0(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, PageState pageState, TextView textView, AppCompatImageView appCompatImageView, LayerView layerView, TextView textView2, TextView textView3, Group group, TextView textView4, PageState pageState2, ScrollView scrollView, C27272c8 c8Var) {
        this.f73290d = constraintLayout;
        this.f73291e = button;
        this.f73292f = linearLayout;
        this.f73293g = pageState;
        this.f73294h = textView;
        this.f73295i = appCompatImageView;
        this.f73296j = layerView;
        this.f73297k = textView2;
        this.f73298l = textView3;
        this.f73299m = group;
        this.f73300n = textView4;
        this.f73301o = pageState2;
        this.f73302p = scrollView;
        this.f73303q = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        r1 = ie0.C25187g.f64733z4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ue0.C28731i0 m88046a(android.view.View r18) {
        /*
            r0 = r18
            int r1 = ie0.C25187g.cancel_operation_button
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            ge.bog.designsystem.components.buttons.Button r5 = (p341ge.bog.designsystem.components.buttons.Button) r5
            if (r5 == 0) goto L_0x009d
            int r1 = ie0.C25187g.f64684U0
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            if (r6 == 0) goto L_0x009d
            int r1 = ie0.C25187g.f64698h1
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.pagestate.PageState r7 = (p341ge.bog.designsystem.components.pagestate.PageState) r7
            if (r7 == 0) goto L_0x009d
            int r1 = ie0.C25187g.header_ticker
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x009d
            int r1 = ie0.C25187g.header_ticker_image
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            if (r9 == 0) goto L_0x009d
            int r1 = ie0.C25187g.header_ticker_layer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r10 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r10
            if (r10 == 0) goto L_0x009d
            int r1 = ie0.C25187g.header_transaction_amount
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x009d
            int r1 = ie0.C25187g.header_transaction_date
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x009d
            int r1 = ie0.C25187g.header_transaction_info_group
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.constraintlayout.widget.Group r13 = (androidx.constraintlayout.widget.Group) r13
            if (r13 == 0) goto L_0x009d
            int r1 = ie0.C25187g.header_transaction_name
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x009d
            int r1 = ie0.C25187g.f64676J2
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.pagestate.PageState r15 = (p341ge.bog.designsystem.components.pagestate.PageState) r15
            if (r15 == 0) goto L_0x009d
            int r1 = ie0.C25187g.f64724v3
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.ScrollView r16 = (android.widget.ScrollView) r16
            if (r16 == 0) goto L_0x009d
            int r1 = ie0.C25187g.f64733z4
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            if (r2 == 0) goto L_0x009d
            p90.c8 r17 = p90.C27272c8.m84388a(r2)
            ue0.i0 r1 = new ue0.i0
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x009d:
            android.content.res.Resources r0 = r18.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ue0.C28731i0.m88046a(android.view.View):ue0.i0");
    }

    /* renamed from: d */
    public static C28731i0 m88047d(LayoutInflater layoutInflater) {
        return m88048e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28731i0 m88048e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.activity_gt_transaction_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88046a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73290d;
    }
}
