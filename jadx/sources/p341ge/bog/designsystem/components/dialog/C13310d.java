package p341ge.bog.designsystem.components.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0214c;
import androidx.constraintlayout.widget.C0630d;
import androidx.fragment.app.C1483c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.rateview.RateStarView;
import p352ak.C9895d3;
import p436gj.C15280a;
import p601sg.C17782g;
import p642vh.C18358g;

/* renamed from: ge.bog.designsystem.components.dialog.d */
public class C13310d extends C1483c {

    /* renamed from: A */
    private String f39388A;

    /* renamed from: B */
    private C13312b f39389B = C13312b.TITLE_SINGLE_BUTTON;

    /* renamed from: C */
    private String f39390C;

    /* renamed from: D */
    private String f39391D;

    /* renamed from: E */
    private String f39392E;

    /* renamed from: F */
    private Integer f39393F;

    /* renamed from: G */
    private Integer f39394G;

    /* renamed from: H */
    private boolean f39395H;

    /* renamed from: I */
    private Image f39396I;

    /* renamed from: J */
    private Color f39397J;

    /* renamed from: K */
    private PageDescriptionView.C13421b f39398K = PageDescriptionView.C13421b.ICON;

    /* renamed from: t */
    private C9895d3 f39399t;

    /* renamed from: u */
    private C13311a f39400u;

    /* renamed from: v */
    private C13311a f39401v;

    /* renamed from: w */
    private C13311a f39402w;

    /* renamed from: x */
    private C13311a f39403x;

    /* renamed from: y */
    private C15280a f39404y;

    /* renamed from: z */
    private String f39405z;

    /* renamed from: ge.bog.designsystem.components.dialog.d$a */
    public interface C13311a {
        /* renamed from: a */
        void mo33448a(Button button);
    }

    /* renamed from: ge.bog.designsystem.components.dialog.d$b */
    public enum C13312b {
        TITLE_SINGLE_BUTTON(8, 0, 8, 8, false, false, 48, (boolean) null),
        TITLE_CLOSE_SINGLE_BUTTON(0, 8, 8, 8, false, false, 48, (boolean) null),
        TITLE_ICON_SINGLE_BUTTON(8, 0, 0, 8, false, false, 48, (boolean) null),
        ONLY_ICON_SINGLE_BUTTON(8, 8, 0, 8, false, false, 48, (boolean) null),
        RATE_SINGLE_BUTTON(8, 0, 8, 8, true, true),
        LIGHT_SINGLE_BUTTON(8, 0, 8, 8, true, false, 32, (boolean) null),
        TITLE_TWO_BUTTON(8, 0, 8, 0, false, false, 48, (boolean) null),
        TITLE_CLOSE_TWO_BUTTON(0, 8, 8, 0, false, false, 48, (boolean) null),
        TITLE_ICON_TWO_BUTTON(8, 0, 0, 0, false, false, 48, (boolean) null),
        ONLY_ICON_TWO_BUTTON(8, 8, 0, 0, false, false, 48, (boolean) null),
        VERTICAL_TWO_BUTTON(8, 0, 8, 0, false, false, 48, (boolean) null);
        

        /* renamed from: d */
        private final int f39418d;

        /* renamed from: e */
        private final int f39419e;

        /* renamed from: f */
        private final int f39420f;

        /* renamed from: g */
        private final int f39421g;

        /* renamed from: h */
        private final boolean f39422h;

        /* renamed from: i */
        private final boolean f39423i;

        private C13312b(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            this.f39418d = i;
            this.f39419e = i2;
            this.f39420f = i3;
            this.f39421g = i4;
            this.f39422h = z;
            this.f39423i = z2;
        }

        /* renamed from: b */
        public final boolean mo35649b() {
            return this.f39423i;
        }

        /* renamed from: c */
        public final int mo35650c() {
            return this.f39420f;
        }

        /* renamed from: e */
        public final int mo35651e() {
            return this.f39418d;
        }

        /* renamed from: f */
        public final int mo35652f() {
            return this.f39419e;
        }

        /* renamed from: g */
        public final int mo35653g() {
            return this.f39421g;
        }

        /* renamed from: h */
        public final boolean mo35654h() {
            return this.f39422h;
        }
    }

    /* renamed from: E1 */
    private final void m50093E1(C13312b bVar) {
        C0630d dVar = new C0630d();
        C9895d3 d3Var = this.f39399t;
        C9895d3 d3Var2 = null;
        if (d3Var == null) {
            C41536l.m120506z("binding");
            d3Var = null;
        }
        dVar.mo2942h(d3Var.f26888f);
        boolean z = this.f39395H;
        if (bVar.mo35653g() != 0) {
            m50102W1(dVar);
        } else if (bVar == C13312b.VERTICAL_TWO_BUTTON) {
            m50105e2(dVar);
        } else {
            m50099K1(dVar, z);
        }
        C9895d3 d3Var3 = this.f39399t;
        if (d3Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            d3Var2 = d3Var3;
        }
        dVar.mo2937c(d3Var2.f26888f);
    }

    /* renamed from: F1 */
    private final void m50094F1(C13312b bVar) {
        int i;
        if (bVar.mo35649b()) {
            m50095G1();
        }
        C9895d3 d3Var = this.f39399t;
        if (d3Var == null) {
            C41536l.m120506z("binding");
            d3Var = null;
        }
        int i2 = 8;
        if (bVar.mo35650c() == 0) {
            i = 8;
        } else {
            i = 0;
        }
        d3Var.f26896n.setVisibility(i);
        d3Var.f26887e.setVisibility(i);
        d3Var.f26895m.mo3946b().setVisibility(bVar.mo35651e());
        d3Var.f26890h.setVisibility(bVar.mo35651e());
        View view = d3Var.f26889g;
        if (bVar.mo35654h()) {
            i2 = 0;
        }
        view.setVisibility(i2);
        m50093E1(bVar);
    }

    /* renamed from: G1 */
    private final void m50095G1() {
        C9895d3 d3Var = this.f39399t;
        if (d3Var == null) {
            C41536l.m120506z("binding");
            d3Var = null;
        }
        RateStarView rateStarView = d3Var.f26894l;
        rateStarView.setVisibility(0);
        rateStarView.setRatingChosenListener(new C13307a(rateStarView, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m50096H1(RateStarView rateStarView, C13310d dVar, int i) {
        C41536l.m120489i(rateStarView, "$this_with");
        C41536l.m120489i(dVar, "this$0");
        rateStarView.setChangeRateEnabled(false);
        C15280a aVar = dVar.f39404y;
        if (aVar != null) {
            aVar.mo35632a(i);
        }
    }

    /* renamed from: I1 */
    private final void m50097I1(Button button, String str, C13311a aVar) {
        button.setButtonText(str);
        button.setOnClickListener(new C13309c(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m50098J1(C13311a aVar, View view) {
        if (aVar != null) {
            C41536l.m120487g(view, "null cannot be cast to non-null type ge.bog.designsystem.components.buttons.Button");
            aVar.mo33448a((Button) view);
        }
    }

    /* renamed from: K1 */
    private final void m50099K1(C0630d dVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = C17782g.f49706M6;
        int i8 = 0;
        if (z) {
            i = 0;
        } else {
            i = C17782g.f49739W5;
        }
        int i9 = 6;
        if (z) {
            i2 = 6;
        } else {
            i2 = 7;
        }
        dVar.mo2943i(i7, 6, i, i2);
        if (z) {
            i3 = C17782g.f49739W5;
        } else {
            i3 = 0;
        }
        if (z) {
            i4 = 6;
        } else {
            i4 = 7;
        }
        dVar.mo2943i(i7, 7, i3, i4);
        int i12 = C17782g.f49739W5;
        if (z) {
            i5 = i7;
        } else {
            i5 = 0;
        }
        if (z) {
            i6 = 7;
        } else {
            i6 = 6;
        }
        dVar.mo2943i(i12, 6, i5, i6);
        if (!z) {
            i8 = i7;
        }
        if (z) {
            i9 = 7;
        }
        dVar.mo2943i(i12, 7, i8, i9);
        dVar.mo2943i(i12, 3, i7, 3);
        dVar.mo2943i(i12, 4, i7, 4);
    }

    /* renamed from: L1 */
    private final void m50100L1() {
        if (this.f39389B.mo35650c() == 0) {
            C9895d3 d3Var = this.f39399t;
            C9895d3 d3Var2 = null;
            if (d3Var == null) {
                C41536l.m120506z("binding");
                d3Var = null;
            }
            d3Var.f26892j.setDrawableType(this.f39398K);
            Image image = this.f39396I;
            if (image != null) {
                C9895d3 d3Var3 = this.f39399t;
                if (d3Var3 == null) {
                    C41536l.m120506z("binding");
                    d3Var3 = null;
                }
                d3Var3.f26892j.setImage(image);
            }
            Color color = this.f39397J;
            if (color != null) {
                C9895d3 d3Var4 = this.f39399t;
                if (d3Var4 == null) {
                    C41536l.m120506z("binding");
                } else {
                    d3Var2 = d3Var4;
                }
                PageDescriptionView pageDescriptionView = d3Var2.f26892j;
                Context requireContext = requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                pageDescriptionView.setDrawableTintColor(color.mo35260a(requireContext));
            }
        }
    }

    /* renamed from: R1 */
    private final void m50101R1() {
        Button button;
        C9895d3 d3Var = this.f39399t;
        if (d3Var == null) {
            C41536l.m120506z("binding");
            d3Var = null;
        }
        if (this.f39389B.mo35653g() == 0) {
            Button button2 = d3Var.f26891i;
            C41536l.m120488h(button2, "negativeButton");
            m50097I1(button2, this.f39391D, this.f39402w);
            Button button3 = d3Var.f26893k;
            C41536l.m120488h(button3, "positiveButton");
            m50097I1(button3, this.f39392E, this.f39401v);
            return;
        }
        if (this.f39389B.mo35654h()) {
            button = d3Var.f26891i;
        } else {
            button = d3Var.f26893k;
        }
        C41536l.m120488h(button, "if (state.isOkButtonLigh…utton else positiveButton");
        m50097I1(button, this.f39390C, this.f39400u);
    }

    /* renamed from: W1 */
    private final void m50102W1(C0630d dVar) {
        int i;
        C9895d3 d3Var = null;
        if (this.f39389B.mo35654h()) {
            C9895d3 d3Var2 = this.f39399t;
            if (d3Var2 == null) {
                C41536l.m120506z("binding");
            } else {
                d3Var = d3Var2;
            }
            d3Var.f26893k.setVisibility(8);
            i = C17782g.f49739W5;
        } else {
            C9895d3 d3Var3 = this.f39399t;
            if (d3Var3 == null) {
                C41536l.m120506z("binding");
            } else {
                d3Var = d3Var3;
            }
            d3Var.f26891i.setVisibility(8);
            i = C17782g.f49706M6;
        }
        dVar.mo2943i(i, 6, 0, 6);
        dVar.mo2943i(i, 7, 0, 7);
    }

    /* renamed from: b2 */
    private final void m50103b2() {
        C9895d3 d3Var = null;
        if (this.f39389B.mo35651e() == 0) {
            C9895d3 d3Var2 = this.f39399t;
            if (d3Var2 == null) {
                C41536l.m120506z("binding");
                d3Var2 = null;
            }
            d3Var2.f26895m.f27762f.setText(this.f39405z);
            C9895d3 d3Var3 = this.f39399t;
            if (d3Var3 == null) {
                C41536l.m120506z("binding");
            } else {
                d3Var = d3Var3;
            }
            d3Var.f26895m.f27761e.setOnClickListener(new C13308b(this));
        } else if (this.f39389B.mo35652f() == 0) {
            C9895d3 d3Var4 = this.f39399t;
            if (d3Var4 == null) {
                C41536l.m120506z("binding");
            } else {
                d3Var = d3Var4;
            }
            d3Var.f26892j.setTitle(this.f39405z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m50104d2(C13310d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C13311a aVar = dVar.f39403x;
        if (aVar != null) {
            C41536l.m120487g(view, "null cannot be cast to non-null type ge.bog.designsystem.components.buttons.Button");
            aVar.mo33448a((Button) view);
        }
        dVar.mo4577k1();
    }

    /* renamed from: e2 */
    private final void m50105e2(C0630d dVar) {
        int i = C17782g.f49706M6;
        dVar.mo2950y(i, 4, 0);
        dVar.mo2943i(i, 6, 0, 6);
        dVar.mo2943i(i, 7, 0, 7);
        dVar.mo2943i(i, 3, 0, 3);
        int i2 = C17782g.f49739W5;
        dVar.mo2943i(i, 4, i2, 3);
        dVar.mo2943i(i2, 6, 0, 6);
        dVar.mo2943i(i2, 7, 0, 7);
        dVar.mo2943i(i2, 3, i, 4);
        dVar.mo2943i(i2, 4, 0, 4);
    }

    /* renamed from: M1 */
    public final void mo35635M1(Image image) {
        this.f39396I = image;
    }

    /* renamed from: N1 */
    public final void mo35636N1(PageDescriptionView.C13421b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.f39398K = bVar;
    }

    /* renamed from: O1 */
    public final void mo35637O1(Integer num) {
        if (num != null) {
            num.intValue();
            this.f39396I = new Image.Resource(num.intValue(), (Boolean) null, 2, (DefaultConstructorMarker) null);
        }
        this.f39393F = num;
    }

    /* renamed from: P1 */
    public final void mo35638P1(Integer num) {
        if (num != null) {
            num.intValue();
            this.f39397J = C18358g.m62729c(num.intValue());
        }
        this.f39394G = num;
    }

    /* renamed from: Q1 */
    public final void mo35639Q1(String str) {
        this.f39388A = str;
    }

    /* renamed from: S1 */
    public final void mo35640S1(C13311a aVar) {
        this.f39403x = aVar;
    }

    /* renamed from: T1 */
    public final void mo35641T1(C13311a aVar) {
        this.f39402w = aVar;
    }

    /* renamed from: U1 */
    public final void mo35642U1(String str) {
        this.f39391D = str;
    }

    /* renamed from: V1 */
    public final void mo35643V1(C13311a aVar) {
        this.f39400u = aVar;
    }

    /* renamed from: X1 */
    public final void mo35644X1(String str) {
        this.f39390C = str;
    }

    /* renamed from: Y1 */
    public final void mo35645Y1(C13311a aVar) {
        this.f39401v = aVar;
    }

    /* renamed from: Z1 */
    public final void mo35646Z1(String str) {
        this.f39392E = str;
    }

    /* renamed from: a2 */
    public final void mo35647a2(C13312b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.f39389B = bVar;
    }

    /* renamed from: c2 */
    public final void mo35648c2(String str) {
        this.f39405z = str;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C41536l.m120489i(layoutInflater, "inflater");
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        C9895d3 d3Var = this.f39399t;
        if (d3Var == null) {
            C41536l.m120506z("binding");
            d3Var = null;
        }
        LayerView c = d3Var.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C9895d3 d3Var = this.f39399t;
        if (d3Var == null) {
            C41536l.m120506z("binding");
            d3Var = null;
        }
        d3Var.f26892j.setText(this.f39388A);
        m50100L1();
        m50103b2();
        m50101R1();
        m50094F1(this.f39389B);
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        C9895d3 d = C9895d3.m36294d(LayoutInflater.from(requireContext()));
        C41536l.m120488h(d, "inflate(LayoutInflater.from(requireContext()))");
        this.f39399t = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        aVar.setView((View) d.mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        return create;
    }
}
