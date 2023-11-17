package p90;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import p086g1.C6201a;

/* renamed from: p90.r0 */
public final class C27407r0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69637d;

    /* renamed from: e */
    public final TextView f69638e;

    /* renamed from: f */
    public final LinearLayout f69639f;

    /* renamed from: g */
    public final MaterialButton f69640g;

    /* renamed from: h */
    public final ConstraintLayout f69641h;

    /* renamed from: i */
    public final C27364m2 f69642i;

    /* renamed from: j */
    public final RecyclerView f69643j;

    /* renamed from: k */
    public final C27272c8 f69644k;

    private C27407r0(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, C27364m2 m2Var, RecyclerView recyclerView, C27272c8 c8Var) {
        this.f69637d = constraintLayout;
        this.f69638e = textView;
        this.f69639f = linearLayout;
        this.f69640g = materialButton;
        this.f69641h = constraintLayout2;
        this.f69642i = m2Var;
        this.f69643j = recyclerView;
        this.f69644k = c8Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        r0 = p366bk.C10322k.f28730Ex;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p90.C27407r0 m84931a(android.view.View r11) {
        /*
            int r0 = p366bk.C10322k.button_description_text
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r4 = r1
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x004f
            int r0 = p366bk.C10322k.button_layout
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L_0x004f
            int r0 = p366bk.C10322k.complete_request_button
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r6 = r1
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            if (r6 == 0) goto L_0x004f
            r7 = r11
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            int r0 = p366bk.C10322k.f28719Dq
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x004f
            p90.m2 r8 = p90.C27364m2.m84766a(r1)
            int r0 = p366bk.C10322k.request_receivers_recycler
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            r9 = r1
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            if (r9 == 0) goto L_0x004f
            int r0 = p366bk.C10322k.f28730Ex
            android.view.View r1 = p086g1.C6202b.m24689a(r11, r0)
            if (r1 == 0) goto L_0x004f
            p90.c8 r10 = p90.C27272c8.m84388a(r1)
            p90.r0 r11 = new p90.r0
            r2 = r11
            r3 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L_0x004f:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p90.C27407r0.m84931a(android.view.View):p90.r0");
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69637d;
    }
}
