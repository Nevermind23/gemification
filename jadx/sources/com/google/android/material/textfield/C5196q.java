package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.C1080c;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.CheckableImageButton;
import p009a8.C0075e;
import p009a8.C0080j;
import p026b8.C2170a;

/* renamed from: com.google.android.material.textfield.q */
class C5196q extends C5204t {

    /* renamed from: p */
    private static final boolean f16624p = true;

    /* renamed from: e */
    private AutoCompleteTextView f16625e;

    /* renamed from: f */
    private final View.OnClickListener f16626f = new C5189j(this);

    /* renamed from: g */
    private final View.OnFocusChangeListener f16627g = new C5190k(this);

    /* renamed from: h */
    private final C1080c.C1082b f16628h = new C5191l(this);

    /* renamed from: i */
    private boolean f16629i;

    /* renamed from: j */
    private boolean f16630j;

    /* renamed from: k */
    private boolean f16631k;

    /* renamed from: l */
    private long f16632l = Long.MAX_VALUE;

    /* renamed from: m */
    private AccessibilityManager f16633m;

    /* renamed from: n */
    private ValueAnimator f16634n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ValueAnimator f16635o;

    /* renamed from: com.google.android.material.textfield.q$a */
    class C5197a extends AnimatorListenerAdapter {
        C5197a() {
        }

        public void onAnimationEnd(Animator animator) {
            C5196q.this.mo17301r();
            C5196q.this.f16635o.start();
        }
    }

    C5196q(C5199s sVar) {
        super(sVar);
    }

    /* renamed from: D */
    private static AutoCompleteTextView m20392D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: E */
    private ValueAnimator m20393E(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C2170a.f6350a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C5192m(this));
        return ofFloat;
    }

    /* renamed from: F */
    private void m20394F() {
        this.f16635o = m20393E(67, Utils.FLOAT_EPSILON, 1.0f);
        ValueAnimator E = m20393E(50, 1.0f, Utils.FLOAT_EPSILON);
        this.f16634n = E;
        E.addListener(new C5197a());
    }

    /* renamed from: G */
    private boolean m20395G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f16632l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m20396H() {
        boolean isPopupShowing = this.f16625e.isPopupShowing();
        m20403O(isPopupShowing);
        this.f16630j = isPopupShowing;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m20397I(ValueAnimator valueAnimator) {
        this.f16668d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m20398J(View view) {
        m20405Q();
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m20399K(View view, boolean z) {
        this.f16629i = z;
        mo17301r();
        if (!z) {
            m20403O(false);
            this.f16630j = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m20400L(boolean z) {
        int i;
        AutoCompleteTextView autoCompleteTextView = this.f16625e;
        if (autoCompleteTextView != null && !C5198r.m20429a(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = this.f16668d;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            ViewCompat.m3544C0(checkableImageButton, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ boolean m20401M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (m20395G()) {
                this.f16630j = false;
            }
            m20405Q();
            m20406R();
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m20402N() {
        m20406R();
        m20403O(false);
    }

    /* renamed from: O */
    private void m20403O(boolean z) {
        if (this.f16631k != z) {
            this.f16631k = z;
            this.f16635o.cancel();
            this.f16634n.start();
        }
    }

    /* renamed from: P */
    private void m20404P() {
        this.f16625e.setOnTouchListener(new C5194o(this));
        if (f16624p) {
            this.f16625e.setOnDismissListener(new C5195p(this));
        }
        this.f16625e.setThreshold(0);
    }

    /* renamed from: Q */
    private void m20405Q() {
        if (this.f16625e != null) {
            if (m20395G()) {
                this.f16630j = false;
            }
            if (!this.f16630j) {
                if (f16624p) {
                    m20403O(!this.f16631k);
                } else {
                    this.f16631k = !this.f16631k;
                    mo17301r();
                }
                if (this.f16631k) {
                    this.f16625e.requestFocus();
                    this.f16625e.showDropDown();
                    return;
                }
                this.f16625e.dismissDropDown();
                return;
            }
            this.f16630j = false;
        }
    }

    /* renamed from: R */
    private void m20406R() {
        this.f16630j = true;
        this.f16632l = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo17213a(Editable editable) {
        if (this.f16633m.isTouchExplorationEnabled() && C5198r.m20429a(this.f16625e) && !this.f16668d.hasFocus()) {
            this.f16625e.dismissDropDown();
        }
        this.f16625e.post(new C5193n(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo17214c() {
        return C0080j.f334g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo17215d() {
        return f16624p ? C0075e.f236g : C0075e.f237h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View.OnFocusChangeListener mo17216e() {
        return this.f16627g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View.OnClickListener mo17217f() {
        return this.f16626f;
    }

    /* renamed from: h */
    public C1080c.C1082b mo17236h() {
        return this.f16628h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo17237i(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo17238j() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo17239k() {
        return this.f16629i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo17240l() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo17241m() {
        return this.f16631k;
    }

    /* renamed from: n */
    public void mo17219n(EditText editText) {
        this.f16625e = m20392D(editText);
        m20404P();
        this.f16665a.setErrorIconDrawable((Drawable) null);
        if (!C5198r.m20429a(editText) && this.f16633m.isTouchExplorationEnabled()) {
            ViewCompat.m3544C0(this.f16668d, 2);
        }
        this.f16665a.setEndIconVisible(true);
    }

    /* renamed from: o */
    public void mo17242o(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (!C5198r.m20429a(this.f16625e)) {
            accessibilityNodeInfoCompat.mo3592Y(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.mo3583K()) {
            accessibilityNodeInfoCompat.mo3611j0((CharSequence) null);
        }
    }

    /* renamed from: p */
    public void mo17243p(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 1 && this.f16633m.isEnabled() && !C5198r.m20429a(this.f16625e)) {
            m20405Q();
            m20406R();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo17221s() {
        m20394F();
        this.f16633m = (AccessibilityManager) this.f16667c.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo17244t() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo17222u() {
        AutoCompleteTextView autoCompleteTextView = this.f16625e;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
            if (f16624p) {
                this.f16625e.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
        }
    }
}
