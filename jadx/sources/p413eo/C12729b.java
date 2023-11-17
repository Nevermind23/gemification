package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p356ao.C10115g;

/* renamed from: eo.b */
public final class C12729b implements C6201a {

    /* renamed from: d */
    private final StateView f37666d;

    /* renamed from: e */
    public final Button f37667e;

    /* renamed from: f */
    public final LinearLayout f37668f;

    /* renamed from: g */
    public final BogTextView f37669g;

    /* renamed from: h */
    public final View f37670h;

    /* renamed from: i */
    public final FrameLayout f37671i;

    /* renamed from: j */
    public final StateView f37672j;

    /* renamed from: k */
    public final RecyclerView f37673k;

    private C12729b(StateView stateView, Button button, LinearLayout linearLayout, BogTextView bogTextView, View view, FrameLayout frameLayout, StateView stateView2, RecyclerView recyclerView) {
        this.f37666d = stateView;
        this.f37667e = button;
        this.f37668f = linearLayout;
        this.f37669g = bogTextView;
        this.f37670h = view;
        this.f37671i = frameLayout;
        this.f37672j = stateView2;
        this.f37673k = recyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = p356ao.C10114f.f27944Y;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p413eo.C12729b m48309a(android.view.View r11) {
        /*
            int r0 = p356ao.C10114f.confirm_btn
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            ge.bog.designsystem.components.buttons.Button r4 = (p341ge.bog.designsystem.components.buttons.Button) r4
            if (r4 == 0) goto L_0x004a
            int r0 = p356ao.C10114f.f27934P
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x004a
            int r0 = p356ao.C10114f.f27938S
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            ge.bog.mobilebank.ui.views.widgets.BogTextView r6 = (p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView) r6
            if (r6 == 0) goto L_0x004a
            int r0 = p356ao.C10114f.f27944Y
            android.view.View r7 = p086g1.C6202b.m24689a(r11, r0)
            if (r7 == 0) goto L_0x004a
            int r0 = p356ao.C10114f.f27943X0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            if (r8 == 0) goto L_0x004a
            r9 = r11
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r9 = (p341ge.bog.mobilebank.cleanarch.presentation.common.StateView) r9
            int r0 = p356ao.C10114f.terms_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            if (r10 == 0) goto L_0x004a
            eo.b r11 = new eo.b
            r2 = r11
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L_0x004a:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413eo.C12729b.m48309a(android.view.View):eo.b");
    }

    /* renamed from: d */
    public static C12729b m48310d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.action_sheet_application_terms, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48309a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f37666d;
    }
}
