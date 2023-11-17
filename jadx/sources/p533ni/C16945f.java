package p533ni;

import af1.C40303i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.github.mikephil.charting.utils.Utils;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.input.BogEditText;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10005r3;
import p352ak.C10012s3;
import p352ak.C10019t3;
import p547oi.C17201b;
import p561pi.C17365a;
import p575qi.C17505a;
import p575qi.C17510b;
import p589ri.C17617a;
import p601sg.C17780e;
import p601sg.C17786k;
import p603si.C17811d;
import p642vh.C18361h0;
import p642vh.C18365j0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ni.f */
public abstract class C16945f {

    /* renamed from: M */
    public static final C16946a f47319M = new C16946a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private boolean f47320A;

    /* renamed from: B */
    private boolean f47321B;

    /* renamed from: C */
    private View.OnFocusChangeListener f47322C;

    /* renamed from: D */
    private CheckboxView.C13222b f47323D;

    /* renamed from: E */
    private List f47324E;

    /* renamed from: F */
    private C17365a f47325F;

    /* renamed from: G */
    private boolean f47326G;

    /* renamed from: H */
    private C17505a f47327H;

    /* renamed from: I */
    private C17617a f47328I;

    /* renamed from: J */
    private C17510b f47329J;

    /* renamed from: K */
    private String f47330K;

    /* renamed from: L */
    private final C16965g f47331L;

    /* renamed from: a */
    private final C6201a f47332a;

    /* renamed from: b */
    private final BogEditText f47333b;

    /* renamed from: c */
    private final TextView f47334c;

    /* renamed from: d */
    private final CheckboxView f47335d;

    /* renamed from: e */
    private final LayerView f47336e;

    /* renamed from: f */
    private final TextView f47337f;

    /* renamed from: g */
    private View f47338g;

    /* renamed from: h */
    private Drawable f47339h;

    /* renamed from: i */
    private Drawable f47340i;

    /* renamed from: j */
    private CharSequence f47341j;

    /* renamed from: k */
    private String f47342k;

    /* renamed from: l */
    private boolean f47343l;

    /* renamed from: m */
    private CharSequence f47344m;

    /* renamed from: n */
    private boolean f47345n;

    /* renamed from: o */
    private C16942c f47346o;

    /* renamed from: p */
    private Image f47347p;

    /* renamed from: q */
    private Integer f47348q;

    /* renamed from: r */
    private boolean f47349r;

    /* renamed from: s */
    private boolean f47350s;

    /* renamed from: t */
    private int f47351t;

    /* renamed from: u */
    private int f47352u;

    /* renamed from: v */
    private int f47353v;

    /* renamed from: w */
    private View.OnClickListener f47354w;

    /* renamed from: x */
    private View.OnClickListener f47355x;

    /* renamed from: y */
    private View.OnClickListener f47356y;

    /* renamed from: z */
    private C17811d f47357z;

    /* renamed from: ni.f$a */
    public static final class C16946a {
        private C16946a() {
        }

        public /* synthetic */ C16946a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ni.f$b */
    public static class C16947b extends C16945f {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C16947b(p352ak.C10005r3 r10) {
            /*
                r9 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                ge.bog.designsystem.components.input.BogEditText r3 = r10.f27468i
                java.lang.String r0 = "binding.textInput"
                kotlin.jvm.internal.C41536l.m120488h(r3, r0)
                android.widget.TextView r4 = r10.f27466g
                java.lang.String r0 = "binding.infoText"
                kotlin.jvm.internal.C41536l.m120488h(r4, r0)
                r5 = 0
                ge.bog.designsystem.components.layersandshadows.LayerView r6 = r10.f27467h
                java.lang.String r0 = "binding.layerView"
                kotlin.jvm.internal.C41536l.m120488h(r6, r0)
                r7 = 0
                r8 = 0
                r1 = r9
                r2 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p533ni.C16945f.C16947b.<init>(ak.r3):void");
        }

        /* renamed from: G */
        public void mo44123G(boolean z) {
            TextView textView = ((C10005r3) mo44151g()).f27464e;
            C41536l.m120488h(textView, "binding.hintText");
            C18368l.m62751F(textView, z, false, 2, (Object) null);
        }

        /* renamed from: V */
        public void mo44138V(CharSequence charSequence) {
            ((C10005r3) mo44151g()).f27464e.setText(charSequence);
        }

        /* renamed from: X */
        public void mo44140X(CharSequence charSequence) {
            int i;
            TextView textView = ((C10005r3) mo44151g()).f27466g;
            textView.setText(charSequence);
            if (charSequence == null) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }

        /* renamed from: o0 */
        public void mo44168o0(int i) {
        }
    }

    /* renamed from: ni.f$c */
    public static class C16948c extends C16955d {

        /* renamed from: a0 */
        static final /* synthetic */ C40303i[] f47358a0;

        /* renamed from: U */
        private final C18361h0 f47359U = new C18361h0(C16950b.f47366d);

        /* renamed from: V */
        private final C18361h0 f47360V = new C18361h0(C16951c.f47367d);

        /* renamed from: W */
        private final C18361h0 f47361W = new C18361h0(C16952d.f47368d);

        /* renamed from: X */
        private final C18361h0 f47362X = new C18361h0(C16953e.f47369d);

        /* renamed from: Y */
        private final C18361h0 f47363Y = new C18361h0(C16954f.f47370d);

        /* renamed from: Z */
        private final C18361h0 f47364Z = new C18361h0(C16949a.f47365d);

        /* renamed from: ni.f$c$a */
        static final class C16949a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16949a f47365d = new C16949a();

            C16949a() {
                super(0);
            }

            public final Object invoke() {
                return "not supported";
            }
        }

        /* renamed from: ni.f$c$b */
        static final class C16950b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16950b f47366d = new C16950b();

            C16950b() {
                super(0);
            }

            public final Object invoke() {
                return "not supported";
            }
        }

        /* renamed from: ni.f$c$c */
        static final class C16951c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16951c f47367d = new C16951c();

            C16951c() {
                super(0);
            }

            public final Object invoke() {
                return "not supported";
            }
        }

        /* renamed from: ni.f$c$d */
        static final class C16952d extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16952d f47368d = new C16952d();

            C16952d() {
                super(0);
            }

            public final Object invoke() {
                return "not supported";
            }
        }

        /* renamed from: ni.f$c$e */
        static final class C16953e extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16953e f47369d = new C16953e();

            C16953e() {
                super(0);
            }

            public final Object invoke() {
                return "not supported";
            }
        }

        /* renamed from: ni.f$c$f */
        static final class C16954f extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16954f f47370d = new C16954f();

            C16954f() {
                super(0);
            }

            public final Object invoke() {
                return "not supported";
            }
        }

        static {
            Class<C16948c> cls = C16948c.class;
            f47358a0 = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "endComponentView", "getEndComponentView()Landroid/view/View;", 0)), C41520a0.m120439e(new C41539o(cls, "endIconImageBig", "getEndIconImageBig()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "endIconImageSmall", "getEndIconImageSmall()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "startIconImage", "getStartIconImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "startIconTintColor", "getStartIconTintColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "checkBoxVisible", "getCheckBoxVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16948c(C10012s3 s3Var) {
            super(s3Var);
            C41536l.m120489i(s3Var, "binding");
            s3Var.f27525t.setVisibility(0);
            mo44118B().setInputType(2);
        }

        /* renamed from: A */
        public Integer mo44117A() {
            return (Integer) this.f47363Y.getValue(this, f47358a0[4]);
        }

        /* renamed from: J */
        public void mo44126J(boolean z) {
            this.f47364Z.setValue(this, f47358a0[5], Boolean.valueOf(z));
        }

        /* renamed from: O */
        public void mo44131O(View view) {
            this.f47359U.setValue(this, f47358a0[0], view);
        }

        /* renamed from: P */
        public void mo44132P(Drawable drawable) {
            this.f47360V.setValue(this, f47358a0[1], drawable);
        }

        /* renamed from: Q */
        public void mo44133Q(Drawable drawable) {
            this.f47361W.setValue(this, f47358a0[2], drawable);
        }

        /* renamed from: f0 */
        public void mo44150f0(View.OnClickListener onClickListener) {
            C41536l.m120489i(onClickListener, "clickListener");
            ((C10012s3) mo44151g()).f27525t.setOnClickListener(onClickListener);
        }

        /* renamed from: g0 */
        public void mo44152g0(String str) {
            int i;
            ConstraintLayout constraintLayout = ((C10012s3) mo44151g()).f27525t;
            if (str == null) {
                i = 8;
            } else {
                i = 0;
            }
            constraintLayout.setVisibility(i);
            ((C10012s3) mo44151g()).f27526u.setText(str);
        }

        /* renamed from: i */
        public boolean mo44155i() {
            return ((Boolean) this.f47364Z.getValue(this, f47358a0[5])).booleanValue();
        }

        /* renamed from: j0 */
        public void mo44158j0(Image image) {
            this.f47362X.setValue(this, f47358a0[3], image);
        }

        /* renamed from: k0 */
        public void mo44160k0(Integer num) {
            this.f47363Y.setValue(this, f47358a0[4], num);
        }

        /* renamed from: n */
        public View mo44165n() {
            return (View) this.f47359U.getValue(this, f47358a0[0]);
        }

        /* renamed from: o */
        public Drawable mo44167o() {
            return (Drawable) this.f47360V.getValue(this, f47358a0[1]);
        }

        /* renamed from: p */
        public Drawable mo44169p() {
            return (Drawable) this.f47361W.getValue(this, f47358a0[2]);
        }

        /* renamed from: x */
        public String mo44180x() {
            return ((C10012s3) mo44151g()).f27526u.getText().toString();
        }

        /* renamed from: z */
        public Image mo44182z() {
            return (Image) this.f47362X.getValue(this, f47358a0[3]);
        }
    }

    /* renamed from: ni.f$d */
    public static class C16955d extends C16945f {

        /* renamed from: T */
        static final /* synthetic */ C40303i[] f47371T;

        /* renamed from: N */
        private long f47372N = 150;

        /* renamed from: O */
        private final C18361h0 f47373O = new C18361h0(C16956a.f47378d);

        /* renamed from: P */
        private final C18365j0 f47374P;

        /* renamed from: Q */
        private final C18361h0 f47375Q;

        /* renamed from: R */
        private final C18361h0 f47376R;

        /* renamed from: S */
        private final C18365j0 f47377S;

        /* renamed from: ni.f$d$a */
        static final class C16956a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16956a f47378d = new C16956a();

            C16956a() {
                super(0);
            }

            public final Object invoke() {
                return "not supported";
            }
        }

        /* renamed from: ni.f$d$b */
        static final class C16957b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16957b f47379d = new C16957b();

            C16957b() {
                super(0);
            }

            public final Object invoke() {
                return "Regular input not supports start icon";
            }
        }

        /* renamed from: ni.f$d$c */
        static final class C16958c extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16958c f47380d = new C16958c();

            C16958c() {
                super(0);
            }

            public final Object invoke() {
                return "Regular input not supports start icon";
            }
        }

        static {
            Class<C16955d> cls = C16955d.class;
            f47371T = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "phonePrefixText", "getPhonePrefixText()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "checkBoxVisible", "getCheckBoxVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "startIconImage", "getStartIconImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "startIconTintColor", "getStartIconTintColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "hasInputButton", "getHasInputButton()Z", 0))};
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C16955d(p352ak.C10012s3 r10) {
            /*
                r9 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                ge.bog.designsystem.components.input.BogEditText r3 = r10.f27529x
                java.lang.String r0 = "binding.textInput"
                kotlin.jvm.internal.C41536l.m120488h(r3, r0)
                android.widget.TextView r4 = r10.f27520o
                java.lang.String r0 = "binding.infoText"
                kotlin.jvm.internal.C41536l.m120488h(r4, r0)
                ge.bog.designsystem.components.checkbox.CheckboxView r5 = r10.f27521p
                ge.bog.designsystem.components.layersandshadows.LayerView r6 = r10.f27523r
                java.lang.String r0 = "binding.layerView"
                kotlin.jvm.internal.C41536l.m120488h(r6, r0)
                android.widget.TextView r7 = r10.f27524s
                r8 = 0
                r1 = r9
                r2 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                android.widget.FrameLayout r0 = r10.f27513h
                ni.g r1 = new ni.g
                r1.<init>(r9)
                r0.setOnClickListener(r1)
                androidx.appcompat.widget.AppCompatImageView r0 = r10.f27515j
                ni.h r1 = new ni.h
                r1.<init>(r9)
                r0.setOnClickListener(r1)
                ge.bog.designsystem.components.buttons.Button r0 = r10.f27510e
                ni.i r1 = new ni.i
                r1.<init>(r9)
                r0.setOnClickListener(r1)
                android.widget.FrameLayout r0 = r10.f27511f
                ni.j r1 = new ni.j
                r1.<init>(r9)
                r0.setOnClickListener(r1)
                r0 = 150(0x96, double:7.4E-322)
                r9.f47372N = r0
                vh.h0 r0 = new vh.h0
                ni.f$d$a r1 = p533ni.C16945f.C16955d.C16956a.f47378d
                r0.<init>(r1)
                r9.f47373O = r0
                vh.j0 r0 = new vh.j0
                ge.bog.designsystem.components.checkbox.CheckboxView r3 = r10.f27521p
                java.lang.String r1 = "binding.infoTextCheckbox"
                kotlin.jvm.internal.C41536l.m120488h(r3, r1)
                r4 = 0
                r5 = 0
                r6 = 6
                r7 = 0
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                r9.f47374P = r0
                vh.h0 r0 = new vh.h0
                ni.f$d$b r1 = p533ni.C16945f.C16955d.C16957b.f47379d
                r0.<init>(r1)
                r9.f47375Q = r0
                vh.h0 r0 = new vh.h0
                ni.f$d$c r1 = p533ni.C16945f.C16955d.C16958c.f47380d
                r0.<init>(r1)
                r9.f47376R = r0
                vh.j0 r0 = new vh.j0
                android.widget.FrameLayout r3 = r10.f27522q
                java.lang.String r10 = "binding.inputButtonContainer"
                kotlin.jvm.internal.C41536l.m120488h(r3, r10)
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                r9.f47377S = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p533ni.C16945f.C16955d.<init>(ak.s3):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: A0 */
        public static final void m59649A0(C16955d dVar, View view) {
            C41536l.m120489i(dVar, "this$0");
            View.OnClickListener q = dVar.mo44171q();
            if (q != null) {
                q.onClick(view);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: B0 */
        public static final void m59650B0(C16955d dVar, View view) {
            C41536l.m120489i(dVar, "this$0");
            View.OnClickListener t = dVar.mo44176t();
            if (t != null) {
                t.onClick(view);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: C0 */
        public static final void m59651C0(C16955d dVar, View view) {
            C41536l.m120489i(dVar, "this$0");
            dVar.mo44164m0("");
        }

        /* renamed from: E0 */
        private final float m59652E0() {
            float measuredWidth = (float) ((C10012s3) mo44151g()).f27517l.getMeasuredWidth();
            return -((measuredWidth - (0.8f * measuredWidth)) * 0.5f);
        }

        /* renamed from: F0 */
        private final float m59653F0() {
            return -(((float) (C18368l.m62762k(44) - ((C10012s3) mo44151g()).f27517l.getMeasuredHeight())) * 0.5f);
        }

        /* access modifiers changed from: private */
        /* renamed from: G0 */
        public static final void m59654G0(boolean z, C16955d dVar) {
            C41536l.m120489i(dVar, "this$0");
            if (z) {
                TextView textView = ((C10012s3) dVar.mo44151g()).f27524s;
                C41536l.m120488h(textView, "binding.mask");
                C18368l.m62751F(textView, false, false, 2, (Object) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: H0 */
        public static final void m59655H0(boolean z, C16955d dVar) {
            C41536l.m120489i(dVar, "this$0");
            if (!z) {
                TextView textView = ((C10012s3) dVar.mo44151g()).f27524s;
                C41536l.m120488h(textView, "binding.mask");
                C18368l.m62751F(textView, true, false, 2, (Object) null);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (r5 != false) goto L_0x0031;
         */
        /* renamed from: I0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m59656I0(java.lang.Boolean r5) {
            /*
                r4 = this;
                g1.a r0 = r4.mo44151g()
                ak.s3 r0 = (p352ak.C10012s3) r0
                android.widget.FrameLayout r0 = r0.f27511f
                java.lang.String r1 = "binding.clearButton"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                if (r5 == 0) goto L_0x0014
                boolean r5 = r5.booleanValue()
                goto L_0x001c
            L_0x0014:
                ge.bog.designsystem.components.input.BogEditText r5 = r4.mo44118B()
                boolean r5 = r5.hasFocus()
            L_0x001c:
                r1 = 0
                if (r5 == 0) goto L_0x0030
                java.lang.String r5 = r4.mo44181y()
                int r5 = r5.length()
                r2 = 1
                if (r5 <= 0) goto L_0x002c
                r5 = r2
                goto L_0x002d
            L_0x002c:
                r5 = r1
            L_0x002d:
                if (r5 == 0) goto L_0x0030
                goto L_0x0031
            L_0x0030:
                r2 = r1
            L_0x0031:
                r5 = 2
                r3 = 0
                p642vh.C18368l.m62751F(r0, r2, r1, r5, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p533ni.C16945f.C16955d.m59656I0(java.lang.Boolean):void");
        }

        /* renamed from: J0 */
        static /* synthetic */ void m59657J0(C16955d dVar, Boolean bool, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    bool = null;
                }
                dVar.m59656I0(bool);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleClearButton");
        }

        /* access modifiers changed from: private */
        /* renamed from: z0 */
        public static final void m59664z0(C16955d dVar, View view) {
            C41536l.m120489i(dVar, "this$0");
            View.OnClickListener m = dVar.mo44163m();
            if (m != null) {
                m.onClick(view);
            }
        }

        /* renamed from: A */
        public Integer mo44117A() {
            return (Integer) this.f47376R.getValue(this, f47371T[3]);
        }

        /* renamed from: D */
        public void mo44120D(boolean z, boolean z2) {
            boolean z3;
            float f;
            C16945f.super.mo44120D(z, z2);
            if (z || z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            LinearLayout linearLayout = ((C10012s3) mo44151g()).f27516k;
            float f2 = 1.0f;
            if (z3) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            linearLayout.setAlpha(f);
            CheckboxView checkboxView = ((C10012s3) mo44151g()).f27521p;
            if (!z3) {
                f2 = 0.5f;
            }
            checkboxView.setAlpha(f2);
            ((C10012s3) mo44151g()).f27521p.setEnabled(z3);
        }

        /* renamed from: D0 */
        public long mo44183D0() {
            return this.f47372N;
        }

        /* renamed from: E */
        public void mo44121E(View view, boolean z) {
            C41536l.m120489i(view, "view");
            C16945f.super.mo44121E(view, z);
            m59656I0(Boolean.valueOf(z));
        }

        /* renamed from: F */
        public void mo44122F(Editable editable) {
            C16945f.super.mo44122F(editable);
            m59657J0(this, (Boolean) null, 1, (Object) null);
        }

        /* renamed from: G */
        public void mo44123G(boolean z) {
            float f;
            float f2;
            long j;
            TextView textView = ((C10012s3) mo44151g()).f27517l;
            if (textView.getMeasuredHeight() == 0 || textView.getMeasuredWidth() == 0) {
                textView.measure(0, 0);
            }
            textView.setPivotX(((float) textView.getMeasuredWidth()) / 2.0f);
            if (z) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            float f3 = Utils.FLOAT_EPSILON;
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = m59652E0();
            }
            if (!z) {
                f3 = m59653F0();
            }
            if (mo44149f()) {
                j = mo44183D0();
            } else {
                j = 0;
            }
            ((C10012s3) mo44151g()).f27517l.animate().withStartAction(new C16970k(z, this)).withEndAction(new C16971l(z, this)).scaleX(f).scaleY(f).translationX(f2).translationY(f3).setDuration(j).start();
        }

        /* renamed from: J */
        public void mo44126J(boolean z) {
            this.f47374P.mo46151c(this, f47371T[1], z);
        }

        /* renamed from: K */
        public void mo44127K(boolean z) {
            CheckboxView s = mo44175s();
            if (s != null) {
                s.setChecked(z);
            }
        }

        /* renamed from: O */
        public void mo44131O(View view) {
            C41238w wVar;
            FrameLayout frameLayout = ((C10012s3) mo44151g()).f27513h;
            frameLayout.removeAllViews();
            if (view != null) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
                frameLayout.setVisibility(0);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                frameLayout.setVisibility(8);
            }
        }

        /* renamed from: P */
        public void mo44132P(Drawable drawable) {
            ImageView imageView;
            View childAt = ((C10012s3) mo44151g()).f27513h.getChildAt(0);
            if (childAt instanceof ImageView) {
                imageView = (ImageView) childAt;
            } else {
                imageView = null;
            }
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            ((C10012s3) mo44151g()).f27513h.setVisibility(0);
        }

        /* renamed from: Q */
        public void mo44133Q(Drawable drawable) {
            AppCompatImageView appCompatImageView = ((C10012s3) mo44151g()).f27515j;
            appCompatImageView.setImageDrawable(drawable);
            appCompatImageView.setVisibility(0);
        }

        /* renamed from: U */
        public void mo44137U(boolean z) {
            this.f47377S.mo46151c(this, f47371T[4], z);
        }

        /* renamed from: V */
        public void mo44138V(CharSequence charSequence) {
            ((C10012s3) mo44151g()).f27517l.setText(charSequence);
        }

        /* renamed from: W */
        public void mo44139W(int i, int i2, int i3) {
            ImageView imageView;
            C10012s3 s3Var = (C10012s3) mo44151g();
            if (i != 0) {
                View childAt = ((C10012s3) mo44151g()).f27513h.getChildAt(0);
                if (childAt instanceof ImageView) {
                    imageView = (ImageView) childAt;
                } else {
                    imageView = null;
                }
                if (imageView != null) {
                    imageView.setColorFilter(i);
                }
            }
            if (i2 != 0) {
                s3Var.f27515j.setColorFilter(i2);
            }
            if (i3 != 0) {
                s3Var.f27527v.setColorFilter(i3);
            }
        }

        /* renamed from: X */
        public void mo44140X(CharSequence charSequence) {
            int i;
            TextView textView = ((C10012s3) mo44151g()).f27520o;
            textView.setText(charSequence);
            if (charSequence == null) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }

        /* renamed from: Z */
        public void mo44142Z(boolean z) {
            ((C10012s3) mo44151g()).f27510e.setEnabled(z);
        }

        /* renamed from: a0 */
        public void mo44143a0(CharSequence charSequence) {
            boolean z;
            if (charSequence != null) {
                z = true;
            } else {
                z = false;
            }
            mo44137U(z);
            ((C10012s3) mo44151g()).f27510e.setButtonText(charSequence);
        }

        /* renamed from: g0 */
        public void mo44152g0(String str) {
            this.f47373O.setValue(this, f47371T[0], str);
        }

        /* renamed from: i */
        public boolean mo44155i() {
            return this.f47374P.getValue(this, f47371T[1]).booleanValue();
        }

        /* renamed from: i0 */
        public void mo44156i0(Integer num) {
            if (num == null) {
                ((C10012s3) mo44151g()).f27527v.clearColorFilter();
            } else {
                ((C10012s3) mo44151g()).f27527v.setColorFilter(C18368l.m62755d(mo44157j(), num.intValue()));
            }
        }

        /* renamed from: j0 */
        public void mo44158j0(Image image) {
            this.f47375Q.setValue(this, f47371T[2], image);
        }

        /* renamed from: k0 */
        public void mo44160k0(Integer num) {
            this.f47376R.setValue(this, f47371T[3], num);
        }

        /* renamed from: n */
        public View mo44165n() {
            return ((C10012s3) mo44151g()).f27513h.getChildAt(0);
        }

        /* renamed from: o */
        public Drawable mo44167o() {
            View childAt = ((C10012s3) mo44151g()).f27513h.getChildAt(0);
            ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
            if (imageView != null) {
                return imageView.getDrawable();
            }
            return null;
        }

        /* renamed from: p */
        public Drawable mo44169p() {
            return ((C10012s3) mo44151g()).f27515j.getDrawable();
        }

        /* renamed from: r */
        public boolean mo44173r() {
            return this.f47377S.getValue(this, f47371T[4]).booleanValue();
        }

        /* renamed from: u */
        public boolean mo44177u() {
            return ((C10012s3) mo44151g()).f27510e.isEnabled();
        }

        /* renamed from: v */
        public CharSequence mo44178v() {
            return ((C10012s3) mo44151g()).f27510e.getButtonText();
        }

        /* renamed from: x */
        public String mo44180x() {
            return (String) this.f47373O.getValue(this, f47371T[0]);
        }

        /* renamed from: z */
        public Image mo44182z() {
            return (Image) this.f47375Q.getValue(this, f47371T[2]);
        }
    }

    /* renamed from: ni.f$e */
    public static class C16959e extends C16955d {

        /* renamed from: Y */
        static final /* synthetic */ C40303i[] f47381Y;

        /* renamed from: U */
        private final C41555e f47382U;

        /* renamed from: V */
        private final C41555e f47383V;

        /* renamed from: W */
        private long f47384W;

        /* renamed from: X */
        private final C18361h0 f47385X = new C18361h0(C16960a.f47386d);

        /* renamed from: ni.f$e$a */
        static final class C16960a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16960a f47386d = new C16960a();

            C16960a() {
                super(0);
            }

            public final Object invoke() {
                return "not supported";
            }
        }

        /* renamed from: ni.f$e$b */
        public static final class C16961b extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10012s3 f47387a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16961b(Object obj, C10012s3 s3Var) {
                super(obj);
                this.f47387a = s3Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                boolean z;
                C41536l.m120489i(iVar, "property");
                Image image = (Image) obj2;
                if (!C41536l.m120484d((Image) obj, image)) {
                    AppCompatImageView appCompatImageView = this.f47387a.f27527v;
                    C41536l.m120488h(appCompatImageView, "binding.startIcon");
                    C18368l.m62746A(appCompatImageView, image, (C43075l) null, 2, (Object) null);
                    LayerView layerView = this.f47387a.f27528w;
                    C41536l.m120488h(layerView, "binding.startIconLayerView");
                    if (image != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C18368l.m62751F(layerView, z, false, 2, (Object) null);
                }
            }
        }

        /* renamed from: ni.f$e$c */
        public static final class C16962c extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C10012s3 f47388a;

            /* renamed from: b */
            final /* synthetic */ C16959e f47389b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16962c(Object obj, C10012s3 s3Var, C16959e eVar) {
                super(obj);
                this.f47388a = s3Var;
                this.f47389b = eVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                Integer num = (Integer) obj2;
                if (C41536l.m120484d((Integer) obj, num)) {
                    return;
                }
                if (num != null) {
                    this.f47388a.f27527v.setColorFilter(C0767a.m2893c(this.f47389b.mo44157j(), num.intValue()));
                } else {
                    this.f47388a.f27527v.clearColorFilter();
                }
            }
        }

        static {
            Class<C16959e> cls = C16959e.class;
            f47381Y = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "startIconImage", "getStartIconImage()Lge/bog/designsystem/components/common/Image;", 0)), C41520a0.m120439e(new C41539o(cls, "startIconTintColor", "getStartIconTintColor()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "checkBoxVisible", "getCheckBoxVisible()Z", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16959e(C10012s3 s3Var) {
            super(s3Var);
            C41536l.m120489i(s3Var, "binding");
            C41551a aVar = C41551a.f97718a;
            this.f47382U = new C16961b((Object) null, s3Var);
            this.f47383V = new C16962c((Object) null, s3Var, this);
            BogEditText B = mo44118B();
            B.setCursorVisible(false);
            B.setLines(1);
            B.setMaxLines(1);
            B.setEllipsize(TextUtils.TruncateAt.END);
            B.setKeyListener((KeyListener) null);
        }

        /* renamed from: A */
        public Integer mo44117A() {
            return (Integer) this.f47383V.getValue(this, f47381Y[1]);
        }

        /* renamed from: D0 */
        public long mo44183D0() {
            return this.f47384W;
        }

        /* renamed from: J */
        public void mo44126J(boolean z) {
            this.f47385X.setValue(this, f47381Y[2], Boolean.valueOf(z));
        }

        /* renamed from: M */
        public void mo44129M(boolean z) {
            C16945f.super.mo44129M(false);
        }

        /* renamed from: O */
        public void mo44131O(View view) {
            C41238w wVar;
            FrameLayout frameLayout = ((C10012s3) mo44151g()).f27513h;
            frameLayout.removeAllViews();
            if (view != null) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
                frameLayout.setVisibility(0);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                frameLayout.setVisibility(8);
            }
        }

        /* renamed from: i */
        public boolean mo44155i() {
            return ((Boolean) this.f47385X.getValue(this, f47381Y[2])).booleanValue();
        }

        /* renamed from: j0 */
        public void mo44158j0(Image image) {
            this.f47382U.setValue(this, f47381Y[0], image);
        }

        /* renamed from: k0 */
        public void mo44160k0(Integer num) {
            this.f47383V.setValue(this, f47381Y[1], num);
        }

        /* renamed from: n */
        public View mo44165n() {
            return ((C10012s3) mo44151g()).f27513h.getChildAt(0);
        }

        /* renamed from: z */
        public Image mo44182z() {
            return (Image) this.f47382U.getValue(this, f47381Y[0]);
        }
    }

    /* renamed from: ni.f$f */
    public static class C16963f extends C16945f {

        /* renamed from: O */
        static final /* synthetic */ C40303i[] f47390O = {C41520a0.m120439e(new C41539o(C16963f.class, "checkBoxVisible", "getCheckBoxVisible()Z", 0))};

        /* renamed from: N */
        private final C18361h0 f47391N = new C18361h0(C16964a.f47392d);

        /* renamed from: ni.f$f$a */
        static final class C16964a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C16964a f47392d = new C16964a();

            C16964a() {
                super(0);
            }

            public final Object invoke() {
                return "not supported";
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C16963f(p352ak.C10019t3 r10) {
            /*
                r9 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                ge.bog.designsystem.components.input.BogEditText r3 = r10.f27586g
                java.lang.String r0 = "binding.textInput"
                kotlin.jvm.internal.C41536l.m120488h(r3, r0)
                android.widget.TextView r4 = r10.f27584e
                java.lang.String r0 = "binding.infoText"
                kotlin.jvm.internal.C41536l.m120488h(r4, r0)
                r5 = 0
                ge.bog.designsystem.components.layersandshadows.LayerView r6 = r10.f27585f
                java.lang.String r0 = "binding.layerView"
                kotlin.jvm.internal.C41536l.m120488h(r6, r0)
                r7 = 0
                r8 = 0
                r1 = r9
                r2 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                vh.h0 r10 = new vh.h0
                ni.f$f$a r0 = p533ni.C16945f.C16963f.C16964a.f47392d
                r10.<init>(r0)
                r9.f47391N = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p533ni.C16945f.C16963f.<init>(ak.t3):void");
        }

        /* renamed from: J */
        public void mo44126J(boolean z) {
            this.f47391N.setValue(this, f47390O[0], Boolean.valueOf(z));
        }

        /* renamed from: X */
        public void mo44140X(CharSequence charSequence) {
            int i;
            TextView textView = ((C10019t3) mo44151g()).f27584e;
            textView.setText(charSequence);
            if (charSequence == null) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }

        /* renamed from: i */
        public boolean mo44155i() {
            return ((Boolean) this.f47391N.getValue(this, f47390O[0])).booleanValue();
        }
    }

    /* renamed from: ni.f$g */
    public static final class C16965g implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C16945f f47393d;

        C16965g(C16945f fVar) {
            this.f47393d = fVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f47393d.mo44122F(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public /* synthetic */ C16945f(C6201a aVar, BogEditText bogEditText, TextView textView, CheckboxView checkboxView, LayerView layerView, TextView textView2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, bogEditText, textView, checkboxView, layerView, textView2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m59561c(C16945f fVar, View view, boolean z) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120488h(view, "view");
        fVar.mo44121E(view, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m59562d(C16945f fVar, CheckboxView.C13222b bVar, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(compoundButton, "a");
        if (fVar.mo44155i() && bVar != null) {
            bVar.mo27107a(compoundButton, z, z2);
        }
    }

    /* renamed from: s0 */
    private final void m59563s0(EditText editText) {
        InputMethodManager inputMethodManager = (InputMethodManager) mo44157j().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    /* renamed from: A */
    public Integer mo44117A() {
        return this.f47348q;
    }

    /* renamed from: B */
    public final BogEditText mo44118B() {
        return this.f47333b;
    }

    /* renamed from: C */
    public int mo44119C() {
        return this.f47351t;
    }

    /* renamed from: D */
    public void mo44120D(boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2;
        if (z || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i = mo44119C();
        } else {
            i = mo44161l();
        }
        if (z3) {
            i2 = mo44159k();
        } else {
            i2 = C17786k.TextBody2Information150Left;
        }
        C1314o.m4575q(this.f47333b, i);
        C1314o.m4575q(this.f47334c, i2);
        C17505a aVar = this.f47327H;
        if (aVar != null) {
            aVar.mo45023w(i);
        }
        mo44129M(z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
        if (r4 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44121E(android.view.View r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            android.view.View$OnFocusChangeListener r0 = r3.f47322C
            if (r0 == 0) goto L_0x000c
            r0.onFocusChange(r4, r5)
        L_0x000c:
            g1.a r4 = r3.f47332a
            android.view.View r4 = r4.mo3946b()
            r4.setActivated(r5)
            if (r5 == 0) goto L_0x005c
            ge.bog.designsystem.components.input.BogEditText r4 = r3.f47333b
            r3.m59563s0(r4)
            pi.a r4 = r3.f47325F
            if (r4 == 0) goto L_0x0078
            ge.bog.designsystem.components.input.BogEditText r0 = r3.f47333b
            ni.f$g r1 = r3.f47331L
            r0.removeTextChangedListener(r1)
            java.lang.String r0 = r3.mo44181y()
            java.lang.String r4 = r4.mo44805e()
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = ""
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            ge.bog.designsystem.components.input.BogEditText r0 = r3.f47333b
            r0.setText(r4)
            ge.bog.designsystem.components.input.BogEditText r4 = r3.f47333b
            java.lang.String r0 = r3.mo44181y()
            int r0 = r0.length()
            r4.setSelection(r0)
            ge.bog.designsystem.components.input.BogEditText r4 = r3.f47333b
            ni.f$g r0 = r3.f47331L
            r4.addTextChangedListener(r0)
            goto L_0x0078
        L_0x005c:
            pi.a r4 = r3.f47325F
            if (r4 == 0) goto L_0x006d
            ge.bog.designsystem.components.input.BogEditText r0 = r3.f47333b
            java.lang.String r1 = r3.mo44181y()
            java.lang.String r4 = r4.mo44804d(r1)
            r0.setText(r4)
        L_0x006d:
            boolean r4 = r3.f47321B
            if (r4 == 0) goto L_0x0078
            si.d r4 = r3.f47357z
            if (r4 == 0) goto L_0x0078
            r4.mo35918a()
        L_0x0078:
            qi.a r4 = r3.f47327H
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x009b
            ge.bog.designsystem.components.input.BogEditText r2 = r3.f47333b
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = r4.mo45021i(r2)
            if (r4 == 0) goto L_0x009b
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0096
            r4 = r0
            goto L_0x0097
        L_0x0096:
            r4 = r1
        L_0x0097:
            if (r4 != r0) goto L_0x009b
            r4 = r0
            goto L_0x009c
        L_0x009b:
            r4 = r1
        L_0x009c:
            if (r5 != 0) goto L_0x00b5
            ge.bog.designsystem.components.input.BogEditText r5 = r3.f47333b
            android.text.Editable r5 = r5.getText()
            if (r5 == 0) goto L_0x00af
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r5 = r1
            goto L_0x00b0
        L_0x00af:
            r5 = r0
        L_0x00b0:
            if (r5 != 0) goto L_0x00b6
            if (r4 == 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r0 = r1
        L_0x00b6:
            r3.mo44123G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p533ni.C16945f.mo44121E(android.view.View, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r0 == false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44122F(android.text.Editable r5) {
        /*
            r4 = this;
            qi.a r0 = r4.f47327H
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r0.mo45021i(r3)
            if (r0 == 0) goto L_0x001d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0018
            r0 = r1
            goto L_0x0019
        L_0x0018:
            r0 = r2
        L_0x0019:
            if (r0 != r1) goto L_0x001d
            r0 = r1
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            ge.bog.designsystem.components.input.BogEditText r3 = r4.f47333b
            boolean r3 = r3.isFocused()
            if (r3 != 0) goto L_0x0037
            if (r5 == 0) goto L_0x0031
            int r5 = r5.length()
            if (r5 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r5 = r2
            goto L_0x0032
        L_0x0031:
            r5 = r1
        L_0x0032:
            if (r5 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            r4.mo44123G(r1)
            r4.mo44147e()
            boolean r5 = r4.f47320A
            if (r5 == 0) goto L_0x0049
            si.d r5 = r4.f47357z
            if (r5 == 0) goto L_0x0049
            r5.mo35918a()
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p533ni.C16945f.mo44122F(android.text.Editable):void");
    }

    /* renamed from: G */
    public void mo44123G(boolean z) {
    }

    /* renamed from: H */
    public final void mo44124H(boolean z) {
        this.f47326G = z;
    }

    /* renamed from: I */
    public final void mo44125I(CheckboxView.C13222b bVar) {
        this.f47323D = bVar;
        CheckboxView checkboxView = this.f47335d;
        if (checkboxView != null) {
            checkboxView.setOnCheckedStateChangeListener(new C16944e(this, bVar));
        }
    }

    /* renamed from: J */
    public void mo44126J(boolean z) {
        this.f47349r = z;
    }

    /* renamed from: K */
    public void mo44127K(boolean z) {
        this.f47350s = z;
    }

    /* renamed from: L */
    public void mo44128L(int i) {
        this.f47352u = i;
    }

    /* renamed from: M */
    public void mo44129M(boolean z) {
        BogEditText bogEditText = this.f47333b;
        bogEditText.setFocusableInTouchMode(z);
        bogEditText.setFocusable(z);
        bogEditText.setLongClickable(z);
        bogEditText.setClickable(z);
    }

    /* renamed from: N */
    public void mo44130N(View.OnClickListener onClickListener) {
        this.f47354w = onClickListener;
    }

    /* renamed from: O */
    public void mo44131O(View view) {
        this.f47338g = view;
    }

    /* renamed from: P */
    public void mo44132P(Drawable drawable) {
        this.f47339h = drawable;
    }

    /* renamed from: Q */
    public void mo44133Q(Drawable drawable) {
        this.f47340i = drawable;
    }

    /* renamed from: R */
    public void mo44134R(View.OnClickListener onClickListener) {
        this.f47355x = onClickListener;
    }

    /* renamed from: S */
    public final void mo44135S(List list) {
        this.f47324E = list;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C17201b) it.next()).mo44613a(this.f47330K);
            }
        }
    }

    /* renamed from: T */
    public final void mo44136T(C17365a aVar) {
        this.f47325F = aVar;
        if (aVar != null) {
            aVar.mo44801a(this.f47330K);
            this.f47333b.setInputType(aVar.mo44806f());
        }
    }

    /* renamed from: U */
    public void mo44137U(boolean z) {
        this.f47343l = z;
    }

    /* renamed from: V */
    public void mo44138V(CharSequence charSequence) {
        this.f47341j = charSequence;
    }

    /* renamed from: W */
    public void mo44139W(int i, int i2, int i3) {
    }

    /* renamed from: X */
    public abstract void mo44140X(CharSequence charSequence);

    /* renamed from: Y */
    public void mo44141Y(View.OnClickListener onClickListener) {
        this.f47356y = onClickListener;
    }

    /* renamed from: Z */
    public void mo44142Z(boolean z) {
        this.f47345n = z;
    }

    /* renamed from: a0 */
    public void mo44143a0(CharSequence charSequence) {
        this.f47344m = charSequence;
    }

    /* renamed from: b0 */
    public void mo44144b0(C16942c cVar) {
        C41536l.m120489i(cVar, "<set-?>");
        this.f47346o = cVar;
    }

    /* renamed from: c0 */
    public final void mo44145c0(C17617a aVar) {
        C17505a aVar2;
        this.f47328I = aVar;
        C17505a aVar3 = this.f47327H;
        if (aVar3 != null) {
            aVar3.mo45022j();
        }
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new C17505a(this.f47337f, this.f47333b, aVar, mo44157j());
        }
        this.f47327H = aVar2;
    }

    /* renamed from: d0 */
    public void mo44146d0() {
        mo44144b0(C16942c.NEGATIVE);
        this.f47336e.setBackgroundResource(C17780e.shape_input_negative);
        mo44128L(C17786k.TextBody2Negative500Left);
        C1314o.m4575q(this.f47334c, mo44159k());
    }

    /* renamed from: e */
    public void mo44147e() {
        mo44144b0(C16942c.NEUTRAL);
        this.f47336e.setBackgroundResource(C17780e.selector_input);
        mo44128L(C17786k.TextBody2Information500Left);
        C1314o.m4575q(this.f47334c, mo44159k());
    }

    /* renamed from: e0 */
    public final void mo44148e0(View.OnFocusChangeListener onFocusChangeListener) {
        this.f47322C = onFocusChangeListener;
    }

    /* renamed from: f */
    public final boolean mo44149f() {
        return this.f47326G;
    }

    /* renamed from: f0 */
    public void mo44150f0(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "clickListener");
    }

    /* renamed from: g */
    public final C6201a mo44151g() {
        return this.f47332a;
    }

    /* renamed from: g0 */
    public void mo44152g0(String str) {
        this.f47342k = str;
    }

    /* renamed from: h */
    public final CheckboxView.C13222b mo44153h() {
        return this.f47323D;
    }

    /* renamed from: h0 */
    public void mo44154h0() {
        mo44144b0(C16942c.POSITIVE);
        this.f47336e.setBackgroundResource(C17780e.shape_input_positive);
        mo44128L(C17786k.TextBody2Positive500Left);
        C1314o.m4575q(this.f47334c, mo44159k());
    }

    /* renamed from: i */
    public boolean mo44155i() {
        return this.f47349r;
    }

    /* renamed from: i0 */
    public void mo44156i0(Integer num) {
    }

    /* renamed from: j */
    public final Context mo44157j() {
        Context context = this.f47332a.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        return context;
    }

    /* renamed from: j0 */
    public void mo44158j0(Image image) {
        this.f47347p = image;
    }

    /* renamed from: k */
    public int mo44159k() {
        return this.f47352u;
    }

    /* renamed from: k0 */
    public void mo44160k0(Integer num) {
        this.f47348q = num;
    }

    /* renamed from: l */
    public int mo44161l() {
        return this.f47353v;
    }

    /* renamed from: l0 */
    public final void mo44162l0(String str) {
        this.f47330K = str;
        if (str != null) {
            if (this.f47329J == null) {
                this.f47329J = new C17510b(str, this.f47333b);
            } else {
                String y = mo44181y();
                mo44164m0("");
                C17510b bVar = this.f47329J;
                if (bVar != null) {
                    bVar.mo45030d(str);
                }
                mo44164m0(y);
            }
            C17365a aVar = this.f47325F;
            if (aVar != null) {
                aVar.mo44801a(str);
            }
            List<C17201b> list = this.f47324E;
            if (list != null) {
                for (C17201b a : list) {
                    a.mo44613a(str);
                }
            }
        }
    }

    /* renamed from: m */
    public View.OnClickListener mo44163m() {
        return this.f47354w;
    }

    /* renamed from: m0 */
    public void mo44164m0(String str) {
        String d;
        C41536l.m120489i(str, "text");
        BogEditText bogEditText = this.f47333b;
        C17365a aVar = this.f47325F;
        if (!(aVar == null || (d = aVar.mo44804d(str)) == null)) {
            str = d;
        }
        bogEditText.setText(str);
    }

    /* renamed from: n */
    public View mo44165n() {
        return this.f47338g;
    }

    /* renamed from: n0 */
    public void mo44166n0(int i) {
        this.f47351t = i;
    }

    /* renamed from: o */
    public Drawable mo44167o() {
        return this.f47339h;
    }

    /* renamed from: o0 */
    public void mo44168o0(int i) {
        this.f47333b.setInputType(i);
    }

    /* renamed from: p */
    public Drawable mo44169p() {
        return this.f47340i;
    }

    /* renamed from: p0 */
    public final void mo44170p0(C17811d dVar) {
        this.f47357z = dVar;
    }

    /* renamed from: q */
    public View.OnClickListener mo44171q() {
        return this.f47355x;
    }

    /* renamed from: q0 */
    public final void mo44172q0(boolean z) {
        this.f47321B = z;
    }

    /* renamed from: r */
    public boolean mo44173r() {
        return this.f47343l;
    }

    /* renamed from: r0 */
    public final void mo44174r0(boolean z) {
        this.f47320A = z;
    }

    /* renamed from: s */
    public final CheckboxView mo44175s() {
        return this.f47335d;
    }

    /* renamed from: t */
    public View.OnClickListener mo44176t() {
        return this.f47356y;
    }

    /* renamed from: u */
    public boolean mo44177u() {
        return this.f47345n;
    }

    /* renamed from: v */
    public CharSequence mo44178v() {
        return this.f47344m;
    }

    /* renamed from: w */
    public C16942c mo44179w() {
        return this.f47346o;
    }

    /* renamed from: x */
    public String mo44180x() {
        return this.f47342k;
    }

    /* renamed from: y */
    public String mo44181y() {
        String c;
        String i;
        String valueOf = String.valueOf(this.f47333b.getText());
        C17505a aVar = this.f47327H;
        if (!(aVar == null || (i = aVar.mo45021i(valueOf)) == null)) {
            valueOf = i;
        }
        C17365a aVar2 = this.f47325F;
        if (aVar2 == null || (c = aVar2.mo44803c(valueOf)) == null) {
            return valueOf;
        }
        return c;
    }

    /* renamed from: z */
    public Image mo44182z() {
        return this.f47347p;
    }

    private C16945f(C6201a aVar, BogEditText bogEditText, TextView textView, CheckboxView checkboxView, LayerView layerView, TextView textView2) {
        this.f47332a = aVar;
        this.f47333b = bogEditText;
        this.f47334c = textView;
        this.f47335d = checkboxView;
        this.f47336e = layerView;
        this.f47337f = textView2;
        this.f47345n = true;
        this.f47346o = C16942c.NEUTRAL;
        this.f47351t = C17786k.f49823N;
        this.f47352u = C17786k.TextBody2Information500Left;
        this.f47353v = C17786k.TextBody1InvertComponents150Left;
        this.f47326G = true;
        C16965g gVar = new C16965g(this);
        this.f47331L = gVar;
        bogEditText.setId(View.generateViewId());
        bogEditText.setOnFocusChangeListener(new C16943d(this));
        bogEditText.addTextChangedListener(gVar);
    }
}
