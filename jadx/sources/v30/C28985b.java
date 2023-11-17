package v30;

import android.view.View;
import kotlin.jvm.internal.C41536l;
import o30.C26710a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: v30.b */
public final class C28985b extends C26710a {

    /* renamed from: k */
    private final View f73925k;

    /* renamed from: l */
    private final BogTextView f73926l;

    /* renamed from: m */
    private final BogTextView f73927m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28985b(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.inside_text_container);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.inside_text_container)");
        this.f73925k = findViewById;
        View findViewById2 = view.findViewById(C10322k.left_image_text);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.left_image_text)");
        this.f73926l = (BogTextView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.right_image_text);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.right_image_text)");
        this.f73927m = (BogTextView) findViewById3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65920j(s30.C28140b r6) {
        /*
            r5 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            super.mo65920j(r6)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r5.f73926l
            java.lang.String r1 = r6.mo67670m()
            r0.setText(r1)
            ge.bog.mobilebank.ui.views.widgets.BogTextView r0 = r5.f73927m
            java.lang.String r1 = r6.mo67671n()
            r0.setText(r1)
            java.lang.String r0 = r6.mo67670m()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = r2
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            if (r0 != 0) goto L_0x0042
            java.lang.String r6 = r6.mo65927f()
            if (r6 == 0) goto L_0x003d
            int r6 = r6.length()
            if (r6 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r6 = r2
            goto L_0x003e
        L_0x003d:
            r6 = r1
        L_0x003e:
            if (r6 == 0) goto L_0x0042
            r6 = r1
            goto L_0x0043
        L_0x0042:
            r6 = r2
        L_0x0043:
            android.view.View r0 = r5.f73925k
            r3 = 2
            r4 = 0
            g91.C32343x.m95483r1(r0, r6, r2, r3, r4)
            android.widget.ImageView r0 = r5.mo65919i()
            if (r0 == 0) goto L_0x0054
            r6 = r6 ^ r1
            g91.C32343x.m95483r1(r0, r6, r2, r3, r4)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v30.C28985b.mo65920j(s30.b):void");
    }
}
