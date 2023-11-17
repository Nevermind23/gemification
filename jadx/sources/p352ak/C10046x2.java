package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.changebadge.ChangeBadgeView;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17783h;

/* renamed from: ak.x2 */
public final class C10046x2 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27727d;

    /* renamed from: e */
    public final TextView f27728e;

    /* renamed from: f */
    public final Group f27729f;

    /* renamed from: g */
    public final LayerView f27730g;

    /* renamed from: h */
    public final TextView f27731h;

    /* renamed from: i */
    public final TextView f27732i;

    /* renamed from: j */
    public final TextView f27733j;

    /* renamed from: k */
    public final CurrencyBadgeView f27734k;

    /* renamed from: l */
    public final TextView f27735l;

    /* renamed from: m */
    public final Barrier f27736m;

    /* renamed from: n */
    public final TextView f27737n;

    /* renamed from: o */
    public final ChangeBadgeView f27738o;

    /* renamed from: p */
    public final TextView f27739p;

    /* renamed from: q */
    public final TextView f27740q;

    /* renamed from: r */
    public final TextView f27741r;

    /* renamed from: s */
    public final TextView f27742s;

    /* renamed from: t */
    public final View f27743t;

    /* renamed from: u */
    public final Barrier f27744u;

    private C10046x2(ConstraintLayout constraintLayout, TextView textView, Group group, LayerView layerView, TextView textView2, TextView textView3, TextView textView4, CurrencyBadgeView currencyBadgeView, TextView textView5, Barrier barrier, TextView textView6, ChangeBadgeView changeBadgeView, TextView textView7, TextView textView8, TextView textView9, TextView textView10, View view, Barrier barrier2) {
        this.f27727d = constraintLayout;
        this.f27728e = textView;
        this.f27729f = group;
        this.f27730g = layerView;
        this.f27731h = textView2;
        this.f27732i = textView3;
        this.f27733j = textView4;
        this.f27734k = currencyBadgeView;
        this.f27735l = textView5;
        this.f27736m = barrier;
        this.f27737n = textView6;
        this.f27738o = changeBadgeView;
        this.f27739p = textView7;
        this.f27740q = textView8;
        this.f27741r = textView9;
        this.f27742s = textView10;
        this.f27743t = view;
        this.f27744u = barrier2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        r1 = p601sg.C17782g.f49693I7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p352ak.C10046x2 m36847a(android.view.View r22) {
        /*
            r0 = r22
            int r1 = p601sg.C17782g.additionalRate
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.additionalRateGroup
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r6 = r2
            androidx.constraintlayout.widget.Group r6 = (androidx.constraintlayout.widget.Group) r6
            if (r6 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.additionalRateLayer
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r7 = r2
            ge.bog.designsystem.components.layersandshadows.LayerView r7 = (p341ge.bog.designsystem.components.layersandshadows.LayerView) r7
            if (r7 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.additionalRateTitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r8 = r2
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.buyRate
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r9 = r2
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.buyRateSubtitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r10 = r2
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.currencyBadgeView
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r11 = r2
            ge.bog.designsystem.components.currencybadge.CurrencyBadgeView r11 = (p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView) r11
            if (r11 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.currencyTitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r12 = r2
            android.widget.TextView r12 = (android.widget.TextView) r12
            if (r12 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.headerBarrier
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r13 = r2
            androidx.constraintlayout.widget.Barrier r13 = (androidx.constraintlayout.widget.Barrier) r13
            if (r13 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.officialRate
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r14 = r2
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.rateChangeBadge
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r15 = r2
            ge.bog.designsystem.components.changebadge.ChangeBadgeView r15 = (p341ge.bog.designsystem.components.changebadge.ChangeBadgeView) r15
            if (r15 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.rateHeader
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r16 = r2
            android.widget.TextView r16 = (android.widget.TextView) r16
            if (r16 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.sellBuyHeader
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r17 = r2
            android.widget.TextView r17 = (android.widget.TextView) r17
            if (r17 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.sellRate
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r18 = r2
            android.widget.TextView r18 = (android.widget.TextView) r18
            if (r18 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.sellRateSubtitle
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r19 = r2
            android.widget.TextView r19 = (android.widget.TextView) r19
            if (r19 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.f49693I7
            android.view.View r20 = p086g1.C6202b.m24689a(r0, r1)
            if (r20 == 0) goto L_0x00c9
            int r1 = p601sg.C17782g.separatorBarrier
            android.view.View r2 = p086g1.C6202b.m24689a(r0, r1)
            r21 = r2
            androidx.constraintlayout.widget.Barrier r21 = (androidx.constraintlayout.widget.Barrier) r21
            if (r21 == 0) goto L_0x00c9
            ak.x2 r1 = new ak.x2
            r3 = r1
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r1
        L_0x00c9:
            android.content.res.Resources r0 = r22.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p352ak.C10046x2.m36847a(android.view.View):ak.x2");
    }

    /* renamed from: d */
    public static C10046x2 m36848d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_currency_card_extended, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36847a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27727d;
    }
}
