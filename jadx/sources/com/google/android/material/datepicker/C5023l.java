package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C1055a;
import androidx.core.view.C1060a1;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1493e0;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.C5075c;
import com.google.android.material.internal.C5089m;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0075e;
import p009a8.C0076f;
import p009a8.C0078h;
import p009a8.C0080j;
import p009a8.C0081k;
import p045d.C5769a;
import p093g8.C6255a;
import p184n8.C7342b;
import p223q8.C7922g;

/* renamed from: com.google.android.material.datepicker.l */
public final class C5023l<S> extends C1483c {

    /* renamed from: P */
    static final Object f16013P = "CONFIRM_BUTTON_TAG";

    /* renamed from: Q */
    static final Object f16014Q = "CANCEL_BUTTON_TAG";

    /* renamed from: R */
    static final Object f16015R = "TOGGLE_BUTTON_TAG";

    /* renamed from: A */
    private CalendarConstraints f16016A;

    /* renamed from: B */
    private C5010k f16017B;

    /* renamed from: C */
    private int f16018C;

    /* renamed from: D */
    private CharSequence f16019D;

    /* renamed from: E */
    private boolean f16020E;

    /* renamed from: F */
    private int f16021F;

    /* renamed from: G */
    private int f16022G;

    /* renamed from: H */
    private CharSequence f16023H;

    /* renamed from: I */
    private int f16024I;

    /* renamed from: J */
    private CharSequence f16025J;

    /* renamed from: K */
    private TextView f16026K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public CheckableImageButton f16027L;

    /* renamed from: M */
    private C7922g f16028M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Button f16029N;

    /* renamed from: O */
    private boolean f16030O;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final LinkedHashSet f16031t = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final LinkedHashSet f16032u = new LinkedHashSet();

    /* renamed from: v */
    private final LinkedHashSet f16033v = new LinkedHashSet();

    /* renamed from: w */
    private final LinkedHashSet f16034w = new LinkedHashSet();

    /* renamed from: x */
    private int f16035x;

    /* renamed from: y */
    private DateSelector f16036y;

    /* renamed from: z */
    private C5038r f16037z;

    /* renamed from: com.google.android.material.datepicker.l$a */
    class C5024a implements View.OnClickListener {
        C5024a() {
        }

        public void onClick(View view) {
            Iterator it = C5023l.this.f16031t.iterator();
            while (it.hasNext()) {
                ((C5030m) it.next()).mo16281a(C5023l.this.mo16268O1());
            }
            C5023l.this.mo4577k1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.l$b */
    class C5025b implements View.OnClickListener {
        C5025b() {
        }

        public void onClick(View view) {
            Iterator it = C5023l.this.f16032u.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C5023l.this.mo4577k1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.l$c */
    class C5026c implements C1060a1 {

        /* renamed from: d */
        final /* synthetic */ int f16040d;

        /* renamed from: e */
        final /* synthetic */ View f16041e;

        /* renamed from: f */
        final /* synthetic */ int f16042f;

        C5026c(int i, View view, int i2) {
            this.f16040d = i;
            this.f16041e = view;
            this.f16042f = i2;
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int i = windowInsetsCompat.mo3489f(WindowInsetsCompat.C1048m.m3910e()).f3466b;
            if (this.f16040d >= 0) {
                this.f16041e.getLayoutParams().height = this.f16040d + i;
                View view2 = this.f16041e;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f16041e;
            view3.setPadding(view3.getPaddingLeft(), this.f16042f + i, this.f16041e.getPaddingRight(), this.f16041e.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.datepicker.l$d */
    class C5027d extends C5037q {
        C5027d() {
        }

        /* renamed from: a */
        public void mo16272a() {
            C5023l.this.f16029N.setEnabled(false);
        }

        /* renamed from: b */
        public void mo16273b(Object obj) {
            C5023l.this.m19557X1();
            C5023l.this.f16029N.setEnabled(C5023l.this.m19547M1().mo16175k1());
        }
    }

    /* renamed from: com.google.android.material.datepicker.l$e */
    class C5028e implements View.OnClickListener {
        C5028e() {
        }

        public void onClick(View view) {
            C5023l.this.f16029N.setEnabled(C5023l.this.m19547M1().mo16175k1());
            C5023l.this.f16027L.toggle();
            C5023l lVar = C5023l.this;
            lVar.m19558Y1(lVar.f16027L);
            C5023l.this.m19555V1();
        }
    }

    /* renamed from: com.google.android.material.datepicker.l$f */
    public static final class C5029f {

        /* renamed from: a */
        final DateSelector f16046a;

        /* renamed from: b */
        int f16047b = 0;

        /* renamed from: c */
        CalendarConstraints f16048c;

        /* renamed from: d */
        int f16049d = 0;

        /* renamed from: e */
        CharSequence f16050e = null;

        /* renamed from: f */
        int f16051f = 0;

        /* renamed from: g */
        CharSequence f16052g = null;

        /* renamed from: h */
        int f16053h = 0;

        /* renamed from: i */
        CharSequence f16054i = null;

        /* renamed from: j */
        Object f16055j = null;

        /* renamed from: k */
        int f16056k = 0;

        private C5029f(DateSelector dateSelector) {
            this.f16046a = dateSelector;
        }

        /* renamed from: b */
        private Month m19564b() {
            if (!this.f16046a.mo16177p1().isEmpty()) {
                Month e = Month.m19420e(((Long) this.f16046a.mo16177p1().iterator().next()).longValue());
                if (m19566d(e, this.f16048c)) {
                    return e;
                }
            }
            Month f = Month.m19421f();
            if (m19566d(f, this.f16048c)) {
                return f;
            }
            return this.f16048c.mo16144m();
        }

        /* renamed from: c */
        public static C5029f m19565c() {
            return new C5029f(new SingleDateSelector());
        }

        /* renamed from: d */
        private static boolean m19566d(Month month, CalendarConstraints calendarConstraints) {
            if (month.compareTo(calendarConstraints.mo16144m()) < 0 || month.compareTo(calendarConstraints.mo16140i()) > 0) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public C5023l mo16275a() {
            if (this.f16048c == null) {
                this.f16048c = new CalendarConstraints.C4986b().mo16154a();
            }
            if (this.f16049d == 0) {
                this.f16049d = this.f16046a.mo16174e0();
            }
            Object obj = this.f16055j;
            if (obj != null) {
                this.f16046a.mo16172O0(obj);
            }
            if (this.f16048c.mo16143l() == null) {
                this.f16048c.mo16147r(m19564b());
            }
            return C5023l.m19553T1(this);
        }

        /* renamed from: e */
        public C5029f mo16276e(CalendarConstraints calendarConstraints) {
            this.f16048c = calendarConstraints;
            return this;
        }

        /* renamed from: f */
        public C5029f mo16277f(int i) {
            this.f16056k = i;
            return this;
        }

        /* renamed from: g */
        public C5029f mo16278g(Object obj) {
            this.f16055j = obj;
            return this;
        }

        /* renamed from: h */
        public C5029f mo16279h(int i) {
            this.f16049d = i;
            this.f16050e = null;
            return this;
        }

        /* renamed from: i */
        public C5029f mo16280i(CharSequence charSequence) {
            this.f16050e = charSequence;
            this.f16049d = 0;
            return this;
        }
    }

    /* renamed from: K1 */
    private static Drawable m19545K1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C5769a.m23210b(context, C0075e.f234b));
        stateListDrawable.addState(new int[0], C5769a.m23210b(context, C0075e.f235c));
        return stateListDrawable;
    }

    /* renamed from: L1 */
    private void m19546L1(Window window) {
        if (!this.f16030O) {
            View findViewById = requireView().findViewById(C0076f.fullscreen_header);
            C5075c.m19853a(window, true, C5089m.m19902c(findViewById), (Integer) null);
            ViewCompat.m3550F0(findViewById, new C5026c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
            this.f16030O = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public DateSelector m19547M1() {
        if (this.f16036y == null) {
            this.f16036y = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f16036y;
    }

    /* renamed from: N1 */
    private static int m19548N1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C0074d.f184O);
        int i = Month.m19421f().f15928g;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C0074d.f186Q) * i) + ((i - 1) * resources.getDimensionPixelOffset(C0074d.f190U));
    }

    /* renamed from: P1 */
    private int m19549P1(Context context) {
        int i = this.f16035x;
        if (i != 0) {
            return i;
        }
        return m19547M1().mo16176o0(context);
    }

    /* renamed from: Q1 */
    private void m19550Q1(Context context) {
        boolean z;
        this.f16027L.setTag(f16015R);
        this.f16027L.setImageDrawable(m19545K1(context));
        CheckableImageButton checkableImageButton = this.f16027L;
        if (this.f16021F != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        ViewCompat.m3619r0(this.f16027L, (C1055a) null);
        m19558Y1(this.f16027L);
        this.f16027L.setOnClickListener(new C5028e());
    }

    /* renamed from: R1 */
    static boolean m19551R1(Context context) {
        return m19554U1(context, 16843277);
    }

    /* renamed from: S1 */
    static boolean m19552S1(Context context) {
        return m19554U1(context, C0072b.f130N);
    }

    /* renamed from: T1 */
    static C5023l m19553T1(C5029f fVar) {
        C5023l lVar = new C5023l();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", fVar.f16047b);
        bundle.putParcelable("DATE_SELECTOR_KEY", fVar.f16046a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", fVar.f16048c);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", fVar.f16049d);
        bundle.putCharSequence("TITLE_TEXT_KEY", fVar.f16050e);
        bundle.putInt("INPUT_MODE_KEY", fVar.f16056k);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", fVar.f16051f);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", fVar.f16052g);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", fVar.f16053h);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", fVar.f16054i);
        lVar.setArguments(bundle);
        return lVar;
    }

    /* renamed from: U1 */
    static boolean m19554U1(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C7342b.m28000d(context, C0072b.f125E, C5010k.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public void m19555V1() {
        C5038r rVar;
        int P1 = m19549P1(requireContext());
        this.f16017B = C5010k.m19509A1(m19547M1(), P1, this.f16016A);
        if (this.f16027L.isChecked()) {
            rVar = C5031n.m19574j1(m19547M1(), P1, this.f16016A);
        } else {
            rVar = this.f16017B;
        }
        this.f16037z = rVar;
        m19557X1();
        C1493e0 p = getChildFragmentManager().mo4428p();
        p.mo4639r(C0076f.f240A, this.f16037z);
        p.mo4517k();
        this.f16037z.mo16256h1(new C5027d());
    }

    /* renamed from: W1 */
    public static long m19556W1() {
        return C5045x.m19623o().getTimeInMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public void m19557X1() {
        String headerText = getHeaderText();
        this.f16026K.setContentDescription(String.format(getString(C0080j.f340p), new Object[]{headerText}));
        this.f16026K.setText(headerText);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m19558Y1(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f16027L.isChecked()) {
            str = checkableImageButton.getContext().getString(C0080j.f323I);
        } else {
            str = checkableImageButton.getContext().getString(C0080j.f325K);
        }
        this.f16027L.setContentDescription(str);
    }

    /* renamed from: J1 */
    public boolean mo16267J1(C5030m mVar) {
        return this.f16031t.add(mVar);
    }

    /* renamed from: O1 */
    public final Object mo16268O1() {
        return m19547M1().mo16178s1();
    }

    public String getHeaderText() {
        return m19547M1().mo16170K0(getContext());
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f16033v.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16035x = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f16036y = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f16016A = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f16018C = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f16019D = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f16021F = bundle.getInt("INPUT_MODE_KEY");
        this.f16022G = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16023H = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f16024I = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16025J = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.f16020E) {
            i = C0078h.f311v;
        } else {
            i = C0078h.f310u;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f16020E) {
            inflate.findViewById(C0076f.f240A).setLayoutParams(new LinearLayout.LayoutParams(m19548N1(context), -2));
        } else {
            inflate.findViewById(C0076f.f241B).setLayoutParams(new LinearLayout.LayoutParams(m19548N1(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C0076f.f245F);
        this.f16026K = textView;
        ViewCompat.m3623t0(textView, 1);
        this.f16027L = (CheckableImageButton) inflate.findViewById(C0076f.f246G);
        TextView textView2 = (TextView) inflate.findViewById(C0076f.f250K);
        CharSequence charSequence = this.f16019D;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f16018C);
        }
        m19550Q1(context);
        this.f16029N = (Button) inflate.findViewById(C0076f.f266d);
        if (m19547M1().mo16175k1()) {
            this.f16029N.setEnabled(true);
        } else {
            this.f16029N.setEnabled(false);
        }
        this.f16029N.setTag(f16013P);
        CharSequence charSequence2 = this.f16023H;
        if (charSequence2 != null) {
            this.f16029N.setText(charSequence2);
        } else {
            int i2 = this.f16022G;
            if (i2 != 0) {
                this.f16029N.setText(i2);
            }
        }
        this.f16029N.setOnClickListener(new C5024a());
        Button button = (Button) inflate.findViewById(C0076f.f260a);
        button.setTag(f16014Q);
        CharSequence charSequence3 = this.f16025J;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.f16024I;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new C5025b());
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f16034w.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f16035x);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f16036y);
        CalendarConstraints.C4986b bVar = new CalendarConstraints.C4986b(this.f16016A);
        if (this.f16017B.mo16259u1() != null) {
            bVar.mo16156c(this.f16017B.mo16259u1().f15930i);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.mo16154a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f16018C);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f16019D);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f16022G);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f16023H);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f16024I);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f16025J);
    }

    public void onStart() {
        super.onStart();
        Window window = mo4585u1().getWindow();
        if (this.f16020E) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f16028M);
            m19546L1(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0074d.f188S);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f16028M, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C6255a(mo4585u1(), rect));
        }
        m19555V1();
    }

    public void onStop() {
        this.f16037z.mo16303i1();
        super.onStop();
    }

    /* renamed from: q1 */
    public final Dialog mo710q1(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m19549P1(requireContext()));
        Context context = dialog.getContext();
        this.f16020E = m19551R1(context);
        int d = C7342b.m28000d(context, C0072b.f159r, C5023l.class.getCanonicalName());
        C7922g gVar = new C7922g(context, (AttributeSet) null, C0072b.f125E, C0081k.f378z);
        this.f16028M = gVar;
        gVar.mo22934M(context);
        this.f16028M.mo22941X(ColorStateList.valueOf(d));
        this.f16028M.mo22940W(ViewCompat.m3628w(dialog.getWindow().getDecorView()));
        return dialog;
    }
}
