package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.buttons.Button;
import p90.C27486z7;
import u70.C28607c;

/* renamed from: h80.g */
public final class C24900g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f63933d;

    /* renamed from: e */
    public final LinearLayout f63934e;

    /* renamed from: f */
    public final View f63935f;

    /* renamed from: g */
    public final Button f63936g;

    /* renamed from: h */
    public final CardView f63937h;

    /* renamed from: i */
    public final RecyclerView f63938i;

    /* renamed from: j */
    public final C27486z7 f63939j;

    /* renamed from: k */
    public final CardView f63940k;

    private C24900g(ConstraintLayout constraintLayout, LinearLayout linearLayout, View view, Button button, CardView cardView, RecyclerView recyclerView, C27486z7 z7Var, CardView cardView2) {
        this.f63933d = constraintLayout;
        this.f63934e = linearLayout;
        this.f63935f = view;
        this.f63936g = button;
        this.f63937h = cardView;
        this.f63938i = recyclerView;
        this.f63939j = z7Var;
        this.f63940k = cardView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r0 = u70.C28606b.f72567A0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = u70.C28606b.f72602n;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h80.C24900g m79581a(android.view.View r11) {
        /*
            int r0 = u70.C28606b.checkbox_container
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0055
            int r0 = u70.C28606b.f72602n
            android.view.View r5 = p086g1.C6202b.m24689a(r11, r0)
            if (r5 == 0) goto L_0x0055
            int r0 = u70.C28606b.f72606r
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            ge.bog.designsystem.components.buttons.Button r6 = (p341ge.bog.designsystem.components.buttons.Button) r6
            if (r6 == 0) goto L_0x0055
            int r0 = u70.C28606b.f72609u0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r7 = r1
            androidx.cardview.widget.CardView r7 = (androidx.cardview.widget.CardView) r7
            if (r7 == 0) goto L_0x0055
            int r0 = u70.C28606b.f72613x0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r8 = r1
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            if (r8 == 0) goto L_0x0055
            int r0 = u70.C28606b.f72567A0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x0055
            p90.z7 r9 = p90.C27486z7.m85250a(r1)
            int r0 = u70.C28606b.f72569B0
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r10 = r1
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            if (r10 == 0) goto L_0x0055
            h80.g r0 = new h80.g
            r3 = r11
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0055:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h80.C24900g.m79581a(android.view.View):h80.g");
    }

    /* renamed from: d */
    public static C24900g m79582d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.actionsheet_cla_contract, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79581a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f63933d;
    }
}
