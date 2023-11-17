package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.biginput.BigInputView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p90.C27486z7;
import u70.C28607c;

/* renamed from: h80.c */
public final class C24894c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f63896d;

    /* renamed from: e */
    public final BigInputView f63897e;

    /* renamed from: f */
    public final TextView f63898f;

    /* renamed from: g */
    public final ChipGroup f63899g;

    /* renamed from: h */
    public final TextView f63900h;

    /* renamed from: i */
    public final CardView f63901i;

    /* renamed from: j */
    public final C27486z7 f63902j;

    /* renamed from: k */
    public final CardView f63903k;

    /* renamed from: l */
    public final Button f63904l;

    private C24894c(ConstraintLayout constraintLayout, BigInputView bigInputView, TextView textView, ChipGroup chipGroup, TextView textView2, CardView cardView, C27486z7 z7Var, CardView cardView2, Button button) {
        this.f63896d = constraintLayout;
        this.f63897e = bigInputView;
        this.f63898f = textView;
        this.f63899g = chipGroup;
        this.f63900h = textView2;
        this.f63901i = cardView;
        this.f63902j = z7Var;
        this.f63903k = cardView2;
        this.f63904l = button;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = u70.C28606b.f72567A0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h80.C24894c m79557a(android.view.View r12) {
        /*
            int r0 = u70.C28606b.f72596f
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r4 = r1
            ge.bog.designsystem.components.biginput.BigInputView r4 = (p341ge.bog.designsystem.components.biginput.BigInputView) r4
            if (r4 == 0) goto L_0x0063
            int r0 = u70.C28606b.amount_input_info
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0063
            int r0 = u70.C28606b.f72612x
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r6 = r1
            ge.bog.designsystem.components.chips.ChipGroup r6 = (p341ge.bog.designsystem.components.chips.ChipGroup) r6
            if (r6 == 0) goto L_0x0063
            int r0 = u70.C28606b.f72580M
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0063
            int r0 = u70.C28606b.f72608t0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r8 = r1
            androidx.cardview.widget.CardView r8 = (androidx.cardview.widget.CardView) r8
            if (r8 == 0) goto L_0x0063
            int r0 = u70.C28606b.f72567A0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            if (r1 == 0) goto L_0x0063
            p90.z7 r9 = p90.C27486z7.m85250a(r1)
            int r0 = u70.C28606b.f72569B0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r10 = r1
            androidx.cardview.widget.CardView r10 = (androidx.cardview.widget.CardView) r10
            if (r10 == 0) goto L_0x0063
            int r0 = u70.C28606b.f72571E0
            android.view.View r1 = p086g1.C6202b.m24689a(r12, r0)
            r11 = r1
            ge.bog.designsystem.components.buttons.Button r11 = (p341ge.bog.designsystem.components.buttons.Button) r11
            if (r11 == 0) goto L_0x0063
            h80.c r0 = new h80.c
            r3 = r12
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0063:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h80.C24894c.m79557a(android.view.View):h80.c");
    }

    /* renamed from: d */
    public static C24894c m79558d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.action_sheet_income_edit_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79557a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f63896d;
    }
}
