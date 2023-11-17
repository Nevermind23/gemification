package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p013v4.media.session.C0125b;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0483r1;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.C1058a0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C1080c;
import androidx.core.widget.C1314o;
import com.google.android.material.internal.C5087k;
import com.google.android.material.internal.C5089m;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p009a8.C0074d;
import p009a8.C0076f;
import p009a8.C0078h;
import p009a8.C0080j;
import p009a8.C0082l;
import p045d.C5769a;
import p184n8.C7343c;

/* renamed from: com.google.android.material.textfield.s */
class C5199s extends LinearLayout {

    /* renamed from: d */
    final TextInputLayout f16637d;

    /* renamed from: e */
    private final FrameLayout f16638e;

    /* renamed from: f */
    private final CheckableImageButton f16639f;

    /* renamed from: g */
    private ColorStateList f16640g;

    /* renamed from: h */
    private PorterDuff.Mode f16641h;

    /* renamed from: i */
    private View.OnLongClickListener f16642i;

    /* renamed from: j */
    private final CheckableImageButton f16643j;

    /* renamed from: k */
    private final C5203d f16644k;

    /* renamed from: l */
    private int f16645l = 0;

    /* renamed from: m */
    private final LinkedHashSet f16646m = new LinkedHashSet();

    /* renamed from: n */
    private ColorStateList f16647n;

    /* renamed from: o */
    private PorterDuff.Mode f16648o;

    /* renamed from: p */
    private View.OnLongClickListener f16649p;

    /* renamed from: q */
    private CharSequence f16650q;

    /* renamed from: r */
    private final TextView f16651r;

    /* renamed from: s */
    private boolean f16652s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public EditText f16653t;

    /* renamed from: u */
    private final AccessibilityManager f16654u;

    /* renamed from: v */
    private C1080c.C1082b f16655v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final TextWatcher f16656w = new C5200a();

    /* renamed from: x */
    private final TextInputLayout.C5173g f16657x;

    /* renamed from: com.google.android.material.textfield.s$a */
    class C5200a extends C5087k {
        C5200a() {
        }

        public void afterTextChanged(Editable editable) {
            C5199s.this.mo17284m().mo17213a(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C5199s.this.mo17284m().mo17300b(charSequence, i, i2, i3);
        }
    }

    /* renamed from: com.google.android.material.textfield.s$b */
    class C5201b implements TextInputLayout.C5173g {
        C5201b() {
        }

        /* renamed from: a */
        public void mo17185a(TextInputLayout textInputLayout) {
            if (C5199s.this.f16653t != textInputLayout.getEditText()) {
                if (C5199s.this.f16653t != null) {
                    C5199s.this.f16653t.removeTextChangedListener(C5199s.this.f16656w);
                    if (C5199s.this.f16653t.getOnFocusChangeListener() == C5199s.this.mo17284m().mo17216e()) {
                        C5199s.this.f16653t.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                    }
                }
                EditText unused = C5199s.this.f16653t = textInputLayout.getEditText();
                if (C5199s.this.f16653t != null) {
                    C5199s.this.f16653t.addTextChangedListener(C5199s.this.f16656w);
                }
                C5199s.this.mo17284m().mo17219n(C5199s.this.f16653t);
                C5199s sVar = C5199s.this;
                sVar.m20435c0(sVar.mo17284m());
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.s$c */
    class C5202c implements View.OnAttachStateChangeListener {
        C5202c() {
        }

        public void onViewAttachedToWindow(View view) {
            C5199s.this.m20439g();
        }

        public void onViewDetachedFromWindow(View view) {
            C5199s.this.m20431J();
        }
    }

    /* renamed from: com.google.android.material.textfield.s$d */
    private static class C5203d {

        /* renamed from: a */
        private final SparseArray f16661a = new SparseArray();

        /* renamed from: b */
        private final C5199s f16662b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f16663c;

        /* renamed from: d */
        private final int f16664d;

        C5203d(C5199s sVar, C0483r1 r1Var) {
            this.f16662b = sVar;
            this.f16663c = r1Var.mo2327n(C0082l.f577T7, 0);
            this.f16664d = r1Var.mo2327n(C0082l.f781o8, 0);
        }

        /* renamed from: b */
        private C5204t m20504b(int i) {
            if (i == -1) {
                return new C5186g(this.f16662b);
            }
            if (i == 0) {
                return new C5212x(this.f16662b);
            }
            if (i == 1) {
                return new C5214z(this.f16662b, this.f16664d);
            }
            if (i == 2) {
                return new C5183f(this.f16662b);
            }
            if (i == 3) {
                return new C5196q(this.f16662b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5204t mo17299c(int i) {
            C5204t tVar = (C5204t) this.f16661a.get(i);
            if (tVar != null) {
                return tVar;
            }
            C5204t b = m20504b(i);
            this.f16661a.append(i, b);
            return b;
        }
    }

    C5199s(TextInputLayout textInputLayout, C0483r1 r1Var) {
        super(textInputLayout.getContext());
        C5201b bVar = new C5201b();
        this.f16657x = bVar;
        this.f16654u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f16637d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f16638e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i = m20440i(this, from, C0076f.f255V);
        this.f16639f = i;
        CheckableImageButton i2 = m20440i(frameLayout, from, C0076f.f254U);
        this.f16643j = i2;
        this.f16644k = new C5203d(this, r1Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f16651r = appCompatTextView;
        m20450z(r1Var);
        m20449y(r1Var);
        m20430A(r1Var);
        frameLayout.addView(i2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(i);
        textInputLayout.mo17068h(bVar);
        addOnAttachStateChangeListener(new C5202c());
    }

    /* renamed from: A */
    private void m20430A(C0483r1 r1Var) {
        this.f16651r.setVisibility(8);
        this.f16651r.setId(C0076f.f263b0);
        this.f16651r.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.m3623t0(this.f16651r, 1);
        mo17283l0(r1Var.mo2327n(C0082l.f428E8, 0));
        int i = C0082l.f438F8;
        if (r1Var.mo2332s(i)) {
            mo17285m0(r1Var.mo2316c(i));
        }
        mo17281k0(r1Var.mo2329p(C0082l.f418D8));
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m20431J() {
        AccessibilityManager accessibilityManager;
        C1080c.C1082b bVar = this.f16655v;
        if (bVar != null && (accessibilityManager = this.f16654u) != null) {
            C1080c.m4086b(accessibilityManager, bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m20435c0(C5204t tVar) {
        if (this.f16653t != null) {
            if (tVar.mo17216e() != null) {
                this.f16653t.setOnFocusChangeListener(tVar.mo17216e());
            }
            if (tVar.mo17218g() != null) {
                this.f16643j.setOnFocusChangeListener(tVar.mo17218g());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m20439g() {
        if (this.f16655v != null && this.f16654u != null && ViewCompat.m3578U(this)) {
            C1080c.m4085a(this.f16654u, this.f16655v);
        }
    }

    /* renamed from: i */
    private CheckableImageButton m20440i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C0078h.f296f, viewGroup, false);
        checkableImageButton.setId(i);
        C5205u.m20530d(checkableImageButton);
        if (C7343c.m28011i(getContext())) {
            C1058a0.m3953d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* renamed from: j */
    private void m20441j(int i) {
        Iterator it = this.f16646m.iterator();
        if (it.hasNext()) {
            C0125b.m366a(it.next());
            throw null;
        }
    }

    /* renamed from: n0 */
    private void m20442n0(C5204t tVar) {
        tVar.mo17221s();
        this.f16655v = tVar.mo17236h();
        m20439g();
    }

    /* renamed from: o0 */
    private void m20443o0(C5204t tVar) {
        m20431J();
        this.f16655v = null;
        tVar.mo17222u();
    }

    /* renamed from: p0 */
    private void m20444p0(boolean z) {
        if (!z || mo17286n() == null) {
            C5205u.m20527a(this.f16637d, this.f16643j, this.f16647n, this.f16648o);
            return;
        }
        Drawable mutate = C0836a.m3156r(mo17286n()).mutate();
        C0836a.m3152n(mutate, this.f16637d.getErrorCurrentTextColors());
        this.f16643j.setImageDrawable(mutate);
    }

    /* renamed from: q0 */
    private void m20445q0() {
        int i;
        boolean z;
        boolean z2;
        FrameLayout frameLayout = this.f16638e;
        int i2 = 8;
        if (this.f16643j.getVisibility() != 0 || mo17248D()) {
            i = 8;
        } else {
            i = 0;
        }
        frameLayout.setVisibility(i);
        if (this.f16650q == null || this.f16652s) {
            z = true;
        } else {
            z = false;
        }
        if (mo17247C() || mo17248D() || !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    /* renamed from: r */
    private int m20446r(C5204t tVar) {
        int a = this.f16644k.f16663c;
        if (a == 0) {
            return tVar.mo17215d();
        }
        return a;
    }

    /* renamed from: r0 */
    private void m20447r0() {
        boolean z;
        int i = 0;
        if (mo17289q() == null || !this.f16637d.mo17003M() || !this.f16637d.mo17011b0()) {
            z = false;
        } else {
            z = true;
        }
        CheckableImageButton checkableImageButton = this.f16639f;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        m20445q0();
        mo17291s0();
        if (!mo17296x()) {
            this.f16637d.mo17071l0();
        }
    }

    /* renamed from: t0 */
    private void m20448t0() {
        int i;
        int visibility = this.f16651r.getVisibility();
        boolean z = false;
        if (this.f16650q == null || this.f16652s) {
            i = 8;
        } else {
            i = 0;
        }
        if (visibility != i) {
            C5204t m = mo17284m();
            if (i == 0) {
                z = true;
            }
            m.mo17220q(z);
        }
        m20445q0();
        this.f16651r.setVisibility(i);
        this.f16637d.mo17071l0();
    }

    /* renamed from: y */
    private void m20449y(C0483r1 r1Var) {
        int i = C0082l.f791p8;
        if (!r1Var.mo2332s(i)) {
            int i2 = C0082l.f595V7;
            if (r1Var.mo2332s(i2)) {
                this.f16647n = C7343c.m28004b(getContext(), r1Var, i2);
            }
            int i3 = C0082l.f604W7;
            if (r1Var.mo2332s(i3)) {
                this.f16648o = C5089m.m19906g(r1Var.mo2324k(i3, -1), (PorterDuff.Mode) null);
            }
        }
        int i4 = C0082l.f586U7;
        if (r1Var.mo2332s(i4)) {
            mo17260Q(r1Var.mo2324k(i4, 0));
            int i5 = C0082l.f567S7;
            if (r1Var.mo2332s(i5)) {
                mo17257N(r1Var.mo2329p(i5));
            }
            mo17255L(r1Var.mo2314a(C0082l.f557R7, true));
        } else if (r1Var.mo2332s(i)) {
            int i6 = C0082l.f801q8;
            if (r1Var.mo2332s(i6)) {
                this.f16647n = C7343c.m28004b(getContext(), r1Var, i6);
            }
            int i7 = C0082l.f811r8;
            if (r1Var.mo2332s(i7)) {
                this.f16648o = C5089m.m19906g(r1Var.mo2324k(i7, -1), (PorterDuff.Mode) null);
            }
            mo17260Q(r1Var.mo2314a(i, false) ? 1 : 0);
            mo17257N(r1Var.mo2329p(C0082l.f771n8));
        }
    }

    /* renamed from: z */
    private void m20450z(C0483r1 r1Var) {
        int i = C0082l.f641a8;
        if (r1Var.mo2332s(i)) {
            this.f16640g = C7343c.m28004b(getContext(), r1Var, i);
        }
        int i2 = C0082l.f651b8;
        if (r1Var.mo2332s(i2)) {
            this.f16641h = C5089m.m19906g(r1Var.mo2324k(i2, -1), (PorterDuff.Mode) null);
        }
        int i3 = C0082l.f631Z7;
        if (r1Var.mo2332s(i3)) {
            mo17267X(r1Var.mo2320g(i3));
        }
        this.f16639f.setContentDescription(getResources().getText(C0080j.f333f));
        ViewCompat.m3544C0(this.f16639f, 2);
        this.f16639f.setClickable(false);
        this.f16639f.setPressable(false);
        this.f16639f.setFocusable(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo17246B() {
        return mo17296x() && this.f16643j.isChecked();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo17247C() {
        return this.f16638e.getVisibility() == 0 && this.f16643j.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo17248D() {
        return this.f16639f.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo17249E(boolean z) {
        this.f16652s = z;
        m20448t0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo17250F() {
        m20447r0();
        mo17252H();
        mo17251G();
        if (mo17284m().mo17244t()) {
            m20444p0(this.f16637d.mo17011b0());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo17251G() {
        C5205u.m20529c(this.f16637d, this.f16643j, this.f16647n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo17252H() {
        C5205u.m20529c(this.f16637d, this.f16639f, this.f16640g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo17253I(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        C5204t m = mo17284m();
        boolean z3 = true;
        if (!m.mo17240l() || (isChecked = this.f16643j.isChecked()) == m.mo17241m()) {
            z2 = false;
        } else {
            this.f16643j.setChecked(!isChecked);
            z2 = true;
        }
        if (!m.mo17238j() || (isActivated = this.f16643j.isActivated()) == m.mo17239k()) {
            z3 = z2;
        } else {
            mo17254K(!isActivated);
        }
        if (z || z3) {
            mo17251G();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo17254K(boolean z) {
        this.f16643j.setActivated(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo17255L(boolean z) {
        this.f16643j.setCheckable(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo17256M(int i) {
        mo17257N(i != 0 ? getResources().getText(i) : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo17257N(CharSequence charSequence) {
        if (mo17282l() != charSequence) {
            this.f16643j.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo17258O(int i) {
        mo17259P(i != 0 ? C5769a.m23210b(getContext(), i) : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo17259P(Drawable drawable) {
        this.f16643j.setImageDrawable(drawable);
        if (drawable != null) {
            C5205u.m20527a(this.f16637d, this.f16643j, this.f16647n, this.f16648o);
            mo17251G();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo17260Q(int i) {
        boolean z;
        if (this.f16645l != i) {
            m20443o0(mo17284m());
            int i2 = this.f16645l;
            this.f16645l = i;
            m20441j(i2);
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            mo17265V(z);
            C5204t m = mo17284m();
            mo17258O(m20446r(m));
            mo17256M(m.mo17214c());
            mo17255L(m.mo17240l());
            if (m.mo17237i(this.f16637d.getBoxBackgroundMode())) {
                m20442n0(m);
                mo17261R(m.mo17217f());
                EditText editText = this.f16653t;
                if (editText != null) {
                    m.mo17219n(editText);
                    m20435c0(m);
                }
                C5205u.m20527a(this.f16637d, this.f16643j, this.f16647n, this.f16648o);
                mo17253I(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + this.f16637d.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo17261R(View.OnClickListener onClickListener) {
        C5205u.m20532f(this.f16643j, onClickListener, this.f16649p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo17262S(View.OnLongClickListener onLongClickListener) {
        this.f16649p = onLongClickListener;
        C5205u.m20533g(this.f16643j, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo17263T(ColorStateList colorStateList) {
        if (this.f16647n != colorStateList) {
            this.f16647n = colorStateList;
            C5205u.m20527a(this.f16637d, this.f16643j, colorStateList, this.f16648o);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo17264U(PorterDuff.Mode mode) {
        if (this.f16648o != mode) {
            this.f16648o = mode;
            C5205u.m20527a(this.f16637d, this.f16643j, this.f16647n, mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo17265V(boolean z) {
        int i;
        if (mo17247C() != z) {
            CheckableImageButton checkableImageButton = this.f16643j;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m20445q0();
            mo17291s0();
            this.f16637d.mo17071l0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo17266W(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C5769a.m23210b(getContext(), i);
        } else {
            drawable = null;
        }
        mo17267X(drawable);
        mo17252H();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo17267X(Drawable drawable) {
        this.f16639f.setImageDrawable(drawable);
        m20447r0();
        C5205u.m20527a(this.f16637d, this.f16639f, this.f16640g, this.f16641h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo17268Y(View.OnClickListener onClickListener) {
        C5205u.m20532f(this.f16639f, onClickListener, this.f16642i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo17269Z(View.OnLongClickListener onLongClickListener) {
        this.f16642i = onLongClickListener;
        C5205u.m20533g(this.f16639f, onLongClickListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo17270a0(ColorStateList colorStateList) {
        if (this.f16640g != colorStateList) {
            this.f16640g = colorStateList;
            C5205u.m20527a(this.f16637d, this.f16639f, colorStateList, this.f16641h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo17271b0(PorterDuff.Mode mode) {
        if (this.f16641h != mode) {
            this.f16641h = mode;
            C5205u.m20527a(this.f16637d, this.f16639f, this.f16640g, mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo17272d0(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        mo17273e0(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void mo17273e0(CharSequence charSequence) {
        this.f16643j.setContentDescription(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo17274f0(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C5769a.m23210b(getContext(), i);
        } else {
            drawable = null;
        }
        mo17275g0(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo17275g0(Drawable drawable) {
        this.f16643j.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo17276h() {
        this.f16643j.performClick();
        this.f16643j.jumpDrawablesToCurrentState();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo17277h0(boolean z) {
        if (z && this.f16645l != 1) {
            mo17260Q(1);
        } else if (!z) {
            mo17260Q(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo17278i0(ColorStateList colorStateList) {
        this.f16647n = colorStateList;
        C5205u.m20527a(this.f16637d, this.f16643j, colorStateList, this.f16648o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo17279j0(PorterDuff.Mode mode) {
        this.f16648o = mode;
        C5205u.m20527a(this.f16637d, this.f16643j, this.f16647n, mode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public CheckableImageButton mo17280k() {
        if (mo17248D()) {
            return this.f16639f;
        }
        if (!mo17296x() || !mo17247C()) {
            return null;
        }
        return this.f16643j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo17281k0(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f16650q = charSequence2;
        this.f16651r.setText(charSequence);
        m20448t0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public CharSequence mo17282l() {
        return this.f16643j.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo17283l0(int i) {
        C1314o.m4575q(this.f16651r, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C5204t mo17284m() {
        return this.f16644k.mo17299c(this.f16645l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo17285m0(ColorStateList colorStateList) {
        this.f16651r.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Drawable mo17286n() {
        return this.f16643j.getDrawable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo17287o() {
        return this.f16645l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public CheckableImageButton mo17288p() {
        return this.f16643j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Drawable mo17289q() {
        return this.f16639f.getDrawable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public CharSequence mo17290s() {
        return this.f16643j.getContentDescription();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public void mo17291s0() {
        int i;
        if (this.f16637d.f16549g != null) {
            if (mo17247C() || mo17248D()) {
                i = 0;
            } else {
                i = ViewCompat.m3549F(this.f16637d.f16549g);
            }
            ViewCompat.m3552G0(this.f16651r, getContext().getResources().getDimensionPixelSize(C0074d.f173B), this.f16637d.f16549g.getPaddingTop(), i, this.f16637d.f16549g.getPaddingBottom());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Drawable mo17292t() {
        return this.f16643j.getDrawable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public CharSequence mo17293u() {
        return this.f16650q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public ColorStateList mo17294v() {
        return this.f16651r.getTextColors();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public TextView mo17295w() {
        return this.f16651r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo17296x() {
        return this.f16645l != 0;
    }
}
