package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0444i;
import androidx.appcompat.widget.C0485s0;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.text.C0963a;
import androidx.core.view.C1055a;
import androidx.core.view.C1058a0;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C1314o;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.internal.C5071a;
import com.google.android.material.internal.C5074b;
import com.google.android.material.internal.C5089m;
import com.google.android.material.internal.CheckableImageButton;
import com.salesforce.marketingcloud.C11398b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p009a8.C0072b;
import p009a8.C0073c;
import p009a8.C0074d;
import p009a8.C0076f;
import p009a8.C0080j;
import p009a8.C0081k;
import p026b8.C2170a;
import p045d.C5769a;
import p060e1.C5958l0;
import p060e1.C5965n;
import p080f8.C6170a;
import p184n8.C7343c;
import p223q8.C7922g;
import p223q8.C7929k;

public class TextInputLayout extends LinearLayout {

    /* renamed from: B0 */
    private static final int f16514B0 = C0081k.f367o;

    /* renamed from: C0 */
    private static final int[][] f16515C0 = {new int[]{16842919}, new int[0]};

    /* renamed from: A */
    private C5965n f16516A;
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public boolean f16517A0;

    /* renamed from: B */
    private ColorStateList f16518B;

    /* renamed from: C */
    private ColorStateList f16519C;

    /* renamed from: D */
    private boolean f16520D;

    /* renamed from: E */
    private CharSequence f16521E;

    /* renamed from: F */
    private boolean f16522F;

    /* renamed from: G */
    private C7922g f16523G;

    /* renamed from: H */
    private C7922g f16524H;

    /* renamed from: I */
    private StateListDrawable f16525I;

    /* renamed from: J */
    private boolean f16526J;

    /* renamed from: K */
    private C7922g f16527K;

    /* renamed from: L */
    private C7922g f16528L;

    /* renamed from: M */
    private C7929k f16529M;

    /* renamed from: N */
    private boolean f16530N;

    /* renamed from: O */
    private final int f16531O;

    /* renamed from: P */
    private int f16532P;

    /* renamed from: Q */
    private int f16533Q;

    /* renamed from: R */
    private int f16534R;

    /* renamed from: S */
    private int f16535S;

    /* renamed from: T */
    private int f16536T;

    /* renamed from: U */
    private int f16537U;

    /* renamed from: V */
    private int f16538V;

    /* renamed from: W */
    private final Rect f16539W;

    /* renamed from: a0 */
    private final Rect f16540a0;

    /* renamed from: b0 */
    private final RectF f16541b0;

    /* renamed from: c0 */
    private Typeface f16542c0;

    /* renamed from: d */
    private final FrameLayout f16543d;

    /* renamed from: d0 */
    private Drawable f16544d0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5175a0 f16545e;

    /* renamed from: e0 */
    private int f16546e0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5199s f16547f;

    /* renamed from: f0 */
    private final LinkedHashSet f16548f0;

    /* renamed from: g */
    EditText f16549g;

    /* renamed from: g0 */
    private Drawable f16550g0;

    /* renamed from: h */
    private CharSequence f16551h;

    /* renamed from: h0 */
    private int f16552h0;

    /* renamed from: i */
    private int f16553i;

    /* renamed from: i0 */
    private Drawable f16554i0;

    /* renamed from: j */
    private int f16555j;

    /* renamed from: j0 */
    private ColorStateList f16556j0;

    /* renamed from: k */
    private int f16557k;

    /* renamed from: k0 */
    private ColorStateList f16558k0;

    /* renamed from: l */
    private int f16559l;

    /* renamed from: l0 */
    private int f16560l0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C5206v f16561m;

    /* renamed from: m0 */
    private int f16562m0;

    /* renamed from: n */
    boolean f16563n;

    /* renamed from: n0 */
    private int f16564n0;

    /* renamed from: o */
    private int f16565o;

    /* renamed from: o0 */
    private ColorStateList f16566o0;

    /* renamed from: p */
    private boolean f16567p;

    /* renamed from: p0 */
    private int f16568p0;

    /* renamed from: q */
    private C5172f f16569q;

    /* renamed from: q0 */
    private int f16570q0;

    /* renamed from: r */
    private TextView f16571r;

    /* renamed from: r0 */
    private int f16572r0;

    /* renamed from: s */
    private int f16573s;

    /* renamed from: s0 */
    private int f16574s0;

    /* renamed from: t */
    private int f16575t;

    /* renamed from: t0 */
    private int f16576t0;

    /* renamed from: u */
    private CharSequence f16577u;

    /* renamed from: u0 */
    private boolean f16578u0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f16579v;

    /* renamed from: v0 */
    final C5071a f16580v0;

    /* renamed from: w */
    private TextView f16581w;

    /* renamed from: w0 */
    private boolean f16582w0;

    /* renamed from: x */
    private ColorStateList f16583x;

    /* renamed from: x0 */
    private boolean f16584x0;

    /* renamed from: y */
    private int f16585y;

    /* renamed from: y0 */
    private ValueAnimator f16586y0;

    /* renamed from: z */
    private C5965n f16587z;

    /* renamed from: z0 */
    private boolean f16588z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5166a();

        /* renamed from: f */
        CharSequence f16589f;

        /* renamed from: g */
        boolean f16590g;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        class C5166a implements Parcelable.ClassLoaderCreator {
            C5166a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f16589f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f16589f, parcel, i);
            parcel.writeInt(this.f16590g ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16589f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f16590g = parcel.readInt() != 1 ? false : true;
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C5167a implements TextWatcher {
        C5167a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo17080q0(!textInputLayout.f16517A0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f16563n) {
                textInputLayout2.mo17069i0(editable);
            }
            if (TextInputLayout.this.f16579v) {
                TextInputLayout.this.m20301u0(editable);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C5168b implements Runnable {
        C5168b() {
        }

        public void run() {
            TextInputLayout.this.f16547f.mo17276h();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C5169c implements Runnable {
        C5169c() {
        }

        public void run() {
            TextInputLayout.this.f16549g.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C5170d implements ValueAnimator.AnimatorUpdateListener {
        C5170d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f16580v0.mo16490u0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C5171e extends C1055a {

        /* renamed from: a */
        private final TextInputLayout f16595a;

        public C5171e(TextInputLayout textInputLayout) {
            this.f16595a = textInputLayout;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Editable editable;
            boolean z;
            String str;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.f16595a.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f16595a.getHint();
            CharSequence error = this.f16595a.getError();
            CharSequence placeholderText = this.f16595a.getPlaceholderText();
            int counterMaxLength = this.f16595a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f16595a.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(editable);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f16595a.mo17005O();
            boolean z5 = !TextUtils.isEmpty(error);
            if (z5 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z = true;
            } else {
                z = false;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f16595a.f16545e.mo17207v(accessibilityNodeInfoCompat);
            if (z2) {
                accessibilityNodeInfoCompat.mo3634w0(editable);
            } else if (!TextUtils.isEmpty(str)) {
                accessibilityNodeInfoCompat.mo3634w0(str);
                if (z4 && placeholderText != null) {
                    accessibilityNodeInfoCompat.mo3634w0(str + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.mo3634w0(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.mo3611j0(str);
                } else {
                    if (z2) {
                        str = editable + ", " + str;
                    }
                    accessibilityNodeInfoCompat.mo3634w0(str);
                }
                accessibilityNodeInfoCompat.mo3628t0(!z2);
            }
            if (editable == null || editable.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.mo3614l0(counterMaxLength);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.mo3604f0(error);
            }
            View s = this.f16595a.f16561m.mo17323s();
            if (s != null) {
                accessibilityNodeInfoCompat.mo3612k0(s);
            }
            this.f16595a.f16547f.mo17284m().mo17242o(view, accessibilityNodeInfoCompat);
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f16595a.f16547f.mo17284m().mo17243p(view, accessibilityEvent);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C5172f {
        /* renamed from: a */
        int mo17184a(Editable editable);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C5173g {
        /* renamed from: a */
        void mo17185a(TextInputLayout textInputLayout);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f140Z);
    }

    /* renamed from: A */
    private boolean m20250A() {
        return this.f16520D && !TextUtils.isEmpty(this.f16521E) && (this.f16523G instanceof C5188i);
    }

    /* renamed from: B */
    private void m20251B() {
        Iterator it = this.f16548f0.iterator();
        while (it.hasNext()) {
            ((C5173g) it.next()).mo17185a(this);
        }
    }

    /* renamed from: C */
    private void m20252C(Canvas canvas) {
        C7922g gVar;
        if (this.f16528L != null && (gVar = this.f16527K) != null) {
            gVar.draw(canvas);
            if (this.f16549g.isFocused()) {
                Rect bounds = this.f16528L.getBounds();
                Rect bounds2 = this.f16527K.getBounds();
                float D = this.f16580v0.mo16448D();
                int centerX = bounds2.centerX();
                bounds.left = C2170a.m8292c(centerX, bounds2.left, D);
                bounds.right = C2170a.m8292c(centerX, bounds2.right, D);
                this.f16528L.draw(canvas);
            }
        }
    }

    /* renamed from: D */
    private void m20253D(Canvas canvas) {
        if (this.f16520D) {
            this.f16580v0.mo16477l(canvas);
        }
    }

    /* renamed from: E */
    private void m20254E(boolean z) {
        ValueAnimator valueAnimator = this.f16586y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f16586y0.cancel();
        }
        if (!z || !this.f16584x0) {
            this.f16580v0.mo16490u0(Utils.FLOAT_EPSILON);
        } else {
            mo17070k(Utils.FLOAT_EPSILON);
        }
        if (m20250A() && ((C5188i) this.f16523G).mo17225k0()) {
            m20305x();
        }
        this.f16578u0 = true;
        m20260K();
        this.f16545e.mo17193i(true);
        this.f16547f.mo17249E(true);
    }

    /* renamed from: F */
    private C7922g m20255F(boolean z) {
        float f;
        float f2;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(C0074d.f209h0);
        if (z) {
            f = dimensionPixelOffset;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        EditText editText = this.f16549g;
        if (editText instanceof C5209w) {
            f2 = ((C5209w) editText).getPopupElevation();
        } else {
            f2 = (float) getResources().getDimensionPixelOffset(C0074d.f195Z);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C0074d.f197a0);
        C7929k m = C7929k.m29974a().mo22992A(f).mo22996E(f).mo23003s(dimensionPixelOffset).mo23007w(dimensionPixelOffset).mo22998m();
        C7922g m2 = C7922g.m29922m(getContext(), f2);
        m2.setShapeAppearanceModel(m);
        m2.mo22943Z(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m2;
    }

    /* renamed from: G */
    private static Drawable m20256G(C7922g gVar, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{C6170a.m24587h(i2, i, 0.1f), i}), gVar, gVar);
    }

    /* renamed from: H */
    private int m20257H(int i, boolean z) {
        int compoundPaddingLeft = i + this.f16549g.getCompoundPaddingLeft();
        if (getPrefixText() == null || z) {
            return compoundPaddingLeft;
        }
        return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    /* renamed from: I */
    private int m20258I(int i, boolean z) {
        int compoundPaddingRight = i - this.f16549g.getCompoundPaddingRight();
        if (getPrefixText() == null || !z) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* renamed from: J */
    private static Drawable m20259J(Context context, C7922g gVar, int i, int[][] iArr) {
        int c = C6170a.m24582c(context, C0072b.f159r, "TextInputLayout");
        C7922g gVar2 = new C7922g(gVar.mo22929D());
        int h = C6170a.m24587h(i, c, 0.1f);
        gVar2.mo22941X(new ColorStateList(iArr, new int[]{h, 0}));
        gVar2.setTint(c);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h, c});
        C7922g gVar3 = new C7922g(gVar.mo22929D());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    /* renamed from: K */
    private void m20260K() {
        TextView textView = this.f16581w;
        if (textView != null && this.f16579v) {
            textView.setText((CharSequence) null);
            C5958l0.m23911b(this.f16543d, this.f16516A);
            this.f16581w.setVisibility(4);
        }
    }

    /* renamed from: Q */
    private boolean m20261Q() {
        if (this.f16532P != 1 || this.f16549g.getMinLines() > 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static /* synthetic */ int m20262R(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* renamed from: S */
    private void m20263S() {
        m20289o();
        mo17073n0();
        mo17170w0();
        m20278f0();
        m20283j();
        if (this.f16532P != 0) {
            m20292p0();
        }
        m20268Z();
    }

    /* renamed from: T */
    private void m20264T() {
        if (m20250A()) {
            RectF rectF = this.f16541b0;
            this.f16580v0.mo16481o(rectF, this.f16549g.getWidth(), this.f16549g.getGravity());
            if (rectF.width() > Utils.FLOAT_EPSILON && rectF.height() > Utils.FLOAT_EPSILON) {
                m20288n(rectF);
                rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.f16534R));
                ((C5188i) this.f16523G).mo17228n0(rectF);
            }
        }
    }

    /* renamed from: U */
    private void m20265U() {
        if (m20250A() && !this.f16578u0) {
            m20305x();
            m20264T();
        }
    }

    /* renamed from: V */
    private static void m20266V(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m20266V((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: X */
    private void m20267X() {
        TextView textView = this.f16581w;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: Z */
    private void m20268Z() {
        EditText editText = this.f16549g;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.f16532P;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* renamed from: c0 */
    private boolean m20272c0() {
        if ((this.f16547f.mo17248D() || ((this.f16547f.mo17296x() && mo17002L()) || this.f16547f.mo17293u() != null)) && this.f16547f.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m20274d0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f16545e.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private void m20276e0() {
        if (this.f16581w != null && this.f16579v && !TextUtils.isEmpty(this.f16577u)) {
            this.f16581w.setText(this.f16577u);
            C5958l0.m23911b(this.f16543d, this.f16587z);
            this.f16581w.setVisibility(0);
            this.f16581w.bringToFront();
            announceForAccessibility(this.f16577u);
        }
    }

    /* renamed from: f0 */
    private void m20278f0() {
        if (this.f16532P != 1) {
            return;
        }
        if (C7343c.m28012j(getContext())) {
            this.f16533Q = getResources().getDimensionPixelSize(C0074d.f230x);
        } else if (C7343c.m28011i(getContext())) {
            this.f16533Q = getResources().getDimensionPixelSize(C0074d.f229w);
        }
    }

    /* renamed from: g0 */
    private void m20280g0(Rect rect) {
        C7922g gVar = this.f16527K;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.f16535S, rect.right, i);
        }
        C7922g gVar2 = this.f16528L;
        if (gVar2 != null) {
            int i2 = rect.bottom;
            gVar2.setBounds(rect.left, i2 - this.f16536T, rect.right, i2);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f16549g;
        if (!(editText instanceof AutoCompleteTextView) || C5198r.m20429a(editText)) {
            return this.f16523G;
        }
        int d = C6170a.m24583d(this.f16549g, C0072b.f154m);
        int i = this.f16532P;
        if (i == 2) {
            return m20259J(getContext(), this.f16523G, d, f16515C0);
        }
        if (i == 1) {
            return m20256G(this.f16523G, this.f16538V, d, f16515C0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f16525I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f16525I = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f16525I.addState(new int[0], m20255F(false));
        }
        return this.f16525I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f16524H == null) {
            this.f16524H = m20255F(true);
        }
        return this.f16524H;
    }

    /* renamed from: h0 */
    private void m20281h0() {
        Editable editable;
        if (this.f16571r != null) {
            EditText editText = this.f16549g;
            if (editText == null) {
                editable = null;
            } else {
                editable = editText.getText();
            }
            mo17069i0(editable);
        }
    }

    /* renamed from: i */
    private void m20282i() {
        TextView textView = this.f16581w;
        if (textView != null) {
            this.f16543d.addView(textView);
            this.f16581w.setVisibility(0);
        }
    }

    /* renamed from: j */
    private void m20283j() {
        if (this.f16549g != null && this.f16532P == 1) {
            if (C7343c.m28012j(getContext())) {
                EditText editText = this.f16549g;
                ViewCompat.m3552G0(editText, ViewCompat.m3551G(editText), getResources().getDimensionPixelSize(C0074d.f228v), ViewCompat.m3549F(this.f16549g), getResources().getDimensionPixelSize(C0074d.f227u));
            } else if (C7343c.m28011i(getContext())) {
                EditText editText2 = this.f16549g;
                ViewCompat.m3552G0(editText2, ViewCompat.m3551G(editText2), getResources().getDimensionPixelSize(C0074d.f226t), ViewCompat.m3549F(this.f16549g), getResources().getDimensionPixelSize(C0074d.f225s));
            }
        }
    }

    /* renamed from: j0 */
    private static void m20284j0(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = C0080j.f330c;
        } else {
            i3 = C0080j.f329b;
        }
        textView.setContentDescription(context.getString(i3, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: k0 */
    private void m20285k0() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f16571r;
        if (textView != null) {
            if (this.f16567p) {
                i = this.f16573s;
            } else {
                i = this.f16575t;
            }
            mo17009a0(textView, i);
            if (!this.f16567p && (colorStateList2 = this.f16518B) != null) {
                this.f16571r.setTextColor(colorStateList2);
            }
            if (this.f16567p && (colorStateList = this.f16519C) != null) {
                this.f16571r.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: l */
    private void m20286l() {
        C7922g gVar = this.f16523G;
        if (gVar != null) {
            C7929k D = gVar.mo22929D();
            C7929k kVar = this.f16529M;
            if (D != kVar) {
                this.f16523G.setShapeAppearanceModel(kVar);
            }
            if (m20302v()) {
                this.f16523G.mo22947d0((float) this.f16534R, this.f16537U);
            }
            int p = m20291p();
            this.f16538V = p;
            this.f16523G.mo22941X(ColorStateList.valueOf(p));
            m20287m();
            mo17073n0();
        }
    }

    /* renamed from: m */
    private void m20287m() {
        ColorStateList colorStateList;
        if (this.f16527K != null && this.f16528L != null) {
            if (m20304w()) {
                C7922g gVar = this.f16527K;
                if (this.f16549g.isFocused()) {
                    colorStateList = ColorStateList.valueOf(this.f16560l0);
                } else {
                    colorStateList = ColorStateList.valueOf(this.f16537U);
                }
                gVar.mo22941X(colorStateList);
                this.f16528L.mo22941X(ColorStateList.valueOf(this.f16537U));
            }
            invalidate();
        }
    }

    /* renamed from: n */
    private void m20288n(RectF rectF) {
        float f = rectF.left;
        int i = this.f16531O;
        rectF.left = f - ((float) i);
        rectF.right += (float) i;
    }

    /* renamed from: o */
    private void m20289o() {
        int i = this.f16532P;
        if (i == 0) {
            this.f16523G = null;
            this.f16527K = null;
            this.f16528L = null;
        } else if (i == 1) {
            this.f16523G = new C7922g(this.f16529M);
            this.f16527K = new C7922g();
            this.f16528L = new C7922g();
        } else if (i == 2) {
            if (!this.f16520D || (this.f16523G instanceof C5188i)) {
                this.f16523G = new C7922g(this.f16529M);
            } else {
                this.f16523G = new C5188i(this.f16529M);
            }
            this.f16527K = null;
            this.f16528L = null;
        } else {
            throw new IllegalArgumentException(this.f16532P + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    /* renamed from: o0 */
    private boolean m20290o0() {
        int max;
        if (this.f16549g == null || this.f16549g.getMeasuredHeight() >= (max = Math.max(this.f16547f.getMeasuredHeight(), this.f16545e.getMeasuredHeight()))) {
            return false;
        }
        this.f16549g.setMinimumHeight(max);
        return true;
    }

    /* renamed from: p */
    private int m20291p() {
        int i = this.f16538V;
        if (this.f16532P == 1) {
            return C6170a.m24586g(C6170a.m24584e(this, C0072b.f159r, 0), this.f16538V);
        }
        return i;
    }

    /* renamed from: p0 */
    private void m20292p0() {
        if (this.f16532P != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16543d.getLayoutParams();
            int u = m20300u();
            if (u != layoutParams.topMargin) {
                layoutParams.topMargin = u;
                this.f16543d.requestLayout();
            }
        }
    }

    /* renamed from: q */
    private Rect m20293q(Rect rect) {
        if (this.f16549g != null) {
            Rect rect2 = this.f16540a0;
            boolean f = C5089m.m19905f(this);
            rect2.bottom = rect.bottom;
            int i = this.f16532P;
            if (i == 1) {
                rect2.left = m20257H(rect.left, f);
                rect2.top = rect.top + this.f16533Q;
                rect2.right = m20258I(rect.right, f);
                return rect2;
            } else if (i != 2) {
                rect2.left = m20257H(rect.left, f);
                rect2.top = getPaddingTop();
                rect2.right = m20258I(rect.right, f);
                return rect2;
            } else {
                rect2.left = rect.left + this.f16549g.getPaddingLeft();
                rect2.top = rect.top - m20300u();
                rect2.right = rect.right - this.f16549g.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r */
    private int m20294r(Rect rect, Rect rect2, float f) {
        if (m20261Q()) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.f16549g.getCompoundPaddingBottom();
    }

    /* renamed from: r0 */
    private void m20295r0(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f16549g;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z3 = false;
        } else {
            z3 = true;
        }
        EditText editText2 = this.f16549g;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        } else {
            z4 = true;
        }
        ColorStateList colorStateList2 = this.f16556j0;
        if (colorStateList2 != null) {
            this.f16580v0.mo16472f0(colorStateList2);
            this.f16580v0.mo16483p0(this.f16556j0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f16556j0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.f16576t0);
            } else {
                i = this.f16576t0;
            }
            this.f16580v0.mo16472f0(ColorStateList.valueOf(i));
            this.f16580v0.mo16483p0(ColorStateList.valueOf(i));
        } else if (mo17011b0()) {
            this.f16580v0.mo16472f0(this.f16561m.mo17321q());
        } else if (this.f16567p && (textView = this.f16571r) != null) {
            this.f16580v0.mo16472f0(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f16558k0) != null) {
            this.f16580v0.mo16472f0(colorStateList);
        }
        if (z3 || !this.f16582w0 || (isEnabled() && z4)) {
            if (z2 || this.f16578u0) {
                m20306y(z);
            }
        } else if (z2 || !this.f16578u0) {
            m20254E(z);
        }
    }

    /* renamed from: s */
    private int m20296s(Rect rect, float f) {
        if (m20261Q()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.f16549g.getCompoundPaddingTop();
    }

    /* renamed from: s0 */
    private void m20297s0() {
        EditText editText;
        if (this.f16581w != null && (editText = this.f16549g) != null) {
            this.f16581w.setGravity(editText.getGravity());
            this.f16581w.setPadding(this.f16549g.getCompoundPaddingLeft(), this.f16549g.getCompoundPaddingTop(), this.f16549g.getCompoundPaddingRight(), this.f16549g.getCompoundPaddingBottom());
        }
    }

    private void setEditText(EditText editText) {
        if (this.f16549g == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f16549g = editText;
            int i = this.f16553i;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f16557k);
            }
            int i2 = this.f16555j;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f16559l);
            }
            this.f16526J = false;
            m20263S();
            setTextInputAccessibilityDelegate(new C5171e(this));
            this.f16580v0.mo16461J0(this.f16549g.getTypeface());
            this.f16580v0.mo16487r0(this.f16549g.getTextSize());
            this.f16580v0.mo16479m0(this.f16549g.getLetterSpacing());
            int gravity = this.f16549g.getGravity();
            this.f16580v0.mo16473g0((gravity & -113) | 48);
            this.f16580v0.mo16485q0(gravity);
            this.f16549g.addTextChangedListener(new C5167a());
            if (this.f16556j0 == null) {
                this.f16556j0 = this.f16549g.getHintTextColors();
            }
            if (this.f16520D) {
                if (TextUtils.isEmpty(this.f16521E)) {
                    CharSequence hint = this.f16549g.getHint();
                    this.f16551h = hint;
                    setHint(hint);
                    this.f16549g.setHint((CharSequence) null);
                }
                this.f16522F = true;
            }
            if (this.f16571r != null) {
                mo17069i0(this.f16549g.getText());
            }
            mo17072m0();
            this.f16561m.mo17315f();
            this.f16545e.bringToFront();
            this.f16547f.bringToFront();
            m20251B();
            this.f16547f.mo17291s0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m20295r0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f16521E)) {
            this.f16521E = charSequence;
            this.f16580v0.mo16455G0(charSequence);
            if (!this.f16578u0) {
                m20264T();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f16579v != z) {
            if (z) {
                m20282i();
            } else {
                m20267X();
                this.f16581w = null;
            }
            this.f16579v = z;
        }
    }

    /* renamed from: t */
    private Rect m20298t(Rect rect) {
        if (this.f16549g != null) {
            Rect rect2 = this.f16540a0;
            float B = this.f16580v0.mo16444B();
            rect2.left = rect.left + this.f16549g.getCompoundPaddingLeft();
            rect2.top = m20296s(rect, B);
            rect2.right = rect.right - this.f16549g.getCompoundPaddingRight();
            rect2.bottom = m20294r(rect, rect2, B);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: t0 */
    private void m20299t0() {
        EditText editText = this.f16549g;
        m20301u0(editText == null ? null : editText.getText());
    }

    /* renamed from: u */
    private int m20300u() {
        float r;
        if (!this.f16520D) {
            return 0;
        }
        int i = this.f16532P;
        if (i == 0) {
            r = this.f16580v0.mo16486r();
        } else if (i != 2) {
            return 0;
        } else {
            r = this.f16580v0.mo16486r() / 2.0f;
        }
        return (int) r;
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m20301u0(Editable editable) {
        if (this.f16569q.mo17184a(editable) != 0 || this.f16578u0) {
            m20260K();
        } else {
            m20276e0();
        }
    }

    /* renamed from: v */
    private boolean m20302v() {
        return this.f16532P == 2 && m20304w();
    }

    /* renamed from: v0 */
    private void m20303v0(boolean z, boolean z2) {
        int defaultColor = this.f16566o0.getDefaultColor();
        int colorForState = this.f16566o0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f16566o0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f16537U = colorForState2;
        } else if (z2) {
            this.f16537U = colorForState;
        } else {
            this.f16537U = defaultColor;
        }
    }

    /* renamed from: w */
    private boolean m20304w() {
        return this.f16534R > -1 && this.f16537U != 0;
    }

    /* renamed from: x */
    private void m20305x() {
        if (m20250A()) {
            ((C5188i) this.f16523G).mo17226l0();
        }
    }

    /* renamed from: y */
    private void m20306y(boolean z) {
        ValueAnimator valueAnimator = this.f16586y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f16586y0.cancel();
        }
        if (!z || !this.f16584x0) {
            this.f16580v0.mo16490u0(1.0f);
        } else {
            mo17070k(1.0f);
        }
        this.f16578u0 = false;
        if (m20250A()) {
            m20264T();
        }
        m20299t0();
        this.f16545e.mo17193i(false);
        this.f16547f.mo17249E(false);
    }

    /* renamed from: z */
    private C5965n m20307z() {
        C5965n nVar = new C5965n();
        nVar.mo19350p0(87);
        nVar.mo19355t0(C2170a.f6350a);
        return nVar;
    }

    /* renamed from: L */
    public boolean mo17002L() {
        return this.f16547f.mo17247C();
    }

    /* renamed from: M */
    public boolean mo17003M() {
        return this.f16561m.mo17328z();
    }

    /* renamed from: N */
    public boolean mo17004N() {
        return this.f16561m.mo17302A();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final boolean mo17005O() {
        return this.f16578u0;
    }

    /* renamed from: P */
    public boolean mo17006P() {
        return this.f16522F;
    }

    /* renamed from: W */
    public void mo17007W() {
        this.f16545e.mo17194j();
    }

    /* renamed from: Y */
    public void mo17008Y(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        boolean f7 = C5089m.m19905f(this);
        this.f16530N = f7;
        if (f7) {
            f5 = f2;
        } else {
            f5 = f;
        }
        if (!f7) {
            f = f2;
        }
        if (f7) {
            f6 = f4;
        } else {
            f6 = f3;
        }
        if (!f7) {
            f3 = f4;
        }
        C7922g gVar = this.f16523G;
        if (gVar == null || gVar.mo22930F() != f5 || this.f16523G.mo22931G() != f || this.f16523G.mo22960s() != f6 || this.f16523G.mo22962t() != f3) {
            this.f16529M = this.f16529M.mo22988v().mo22992A(f5).mo22996E(f).mo23003s(f6).mo23007w(f3).mo22998m();
            m20286l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo17009a0(TextView textView, int i) {
        boolean z = true;
        try {
            C1314o.m4575q(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C1314o.m4575q(textView, C0081k.f355c);
            textView.setTextColor(C0767a.m2893c(getContext(), C0073c.f166b));
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f16543d.addView(view, layoutParams2);
            this.f16543d.setLayoutParams(layoutParams);
            m20292p0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean mo17011b0() {
        return this.f16561m.mo17317l();
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f16549g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f16551h != null) {
            boolean z = this.f16522F;
            this.f16522F = false;
            CharSequence hint = editText.getHint();
            this.f16549g.setHint(this.f16551h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f16549g.setHint(hint);
                this.f16522F = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f16543d.getChildCount());
            for (int i2 = 0; i2 < this.f16543d.getChildCount(); i2++) {
                View childAt = this.f16543d.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f16549g) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f16517A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f16517A0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m20253D(canvas);
        m20252C(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z;
        if (!this.f16588z0) {
            boolean z2 = true;
            this.f16588z0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C5071a aVar = this.f16580v0;
            if (aVar != null) {
                z = aVar.mo16451E0(drawableState) | false;
            } else {
                z = false;
            }
            if (this.f16549g != null) {
                if (!ViewCompat.m3579V(this) || !isEnabled()) {
                    z2 = false;
                }
                mo17080q0(z2);
            }
            mo17072m0();
            mo17170w0();
            if (z) {
                invalidate();
            }
            this.f16588z0 = false;
        }
    }

    public int getBaseline() {
        EditText editText = this.f16549g;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m20300u();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C7922g getBoxBackground() {
        int i = this.f16532P;
        if (i == 1 || i == 2) {
            return this.f16523G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f16538V;
    }

    public int getBoxBackgroundMode() {
        return this.f16532P;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f16533Q;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (C5089m.m19905f(this)) {
            return this.f16529M.mo22977j().mo22917a(this.f16541b0);
        }
        return this.f16529M.mo22979l().mo22917a(this.f16541b0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (C5089m.m19905f(this)) {
            return this.f16529M.mo22979l().mo22917a(this.f16541b0);
        }
        return this.f16529M.mo22977j().mo22917a(this.f16541b0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (C5089m.m19905f(this)) {
            return this.f16529M.mo22984r().mo22917a(this.f16541b0);
        }
        return this.f16529M.mo22986t().mo22917a(this.f16541b0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (C5089m.m19905f(this)) {
            return this.f16529M.mo22986t().mo22917a(this.f16541b0);
        }
        return this.f16529M.mo22984r().mo22917a(this.f16541b0);
    }

    public int getBoxStrokeColor() {
        return this.f16564n0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f16566o0;
    }

    public int getBoxStrokeWidth() {
        return this.f16535S;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f16536T;
    }

    public int getCounterMaxLength() {
        return this.f16565o;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f16563n || !this.f16567p || (textView = this.f16571r) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f16518B;
    }

    public ColorStateList getCounterTextColor() {
        return this.f16518B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f16556j0;
    }

    public EditText getEditText() {
        return this.f16549g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f16547f.mo17282l();
    }

    public Drawable getEndIconDrawable() {
        return this.f16547f.mo17286n();
    }

    public int getEndIconMode() {
        return this.f16547f.mo17287o();
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f16547f.mo17288p();
    }

    public CharSequence getError() {
        if (this.f16561m.mo17328z()) {
            return this.f16561m.mo17319o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f16561m.mo17318n();
    }

    public int getErrorCurrentTextColors() {
        return this.f16561m.mo17320p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f16547f.mo17289q();
    }

    public CharSequence getHelperText() {
        if (this.f16561m.mo17302A()) {
            return this.f16561m.mo17322r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f16561m.mo17324t();
    }

    public CharSequence getHint() {
        if (this.f16520D) {
            return this.f16521E;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f16580v0.mo16486r();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f16580v0.mo16491v();
    }

    public ColorStateList getHintTextColor() {
        return this.f16558k0;
    }

    public C5172f getLengthCounter() {
        return this.f16569q;
    }

    public int getMaxEms() {
        return this.f16555j;
    }

    public int getMaxWidth() {
        return this.f16559l;
    }

    public int getMinEms() {
        return this.f16553i;
    }

    public int getMinWidth() {
        return this.f16557k;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f16547f.mo17290s();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f16547f.mo17292t();
    }

    public CharSequence getPlaceholderText() {
        if (this.f16579v) {
            return this.f16577u;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f16585y;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f16583x;
    }

    public CharSequence getPrefixText() {
        return this.f16545e.mo17187a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f16545e.mo17188b();
    }

    public TextView getPrefixTextView() {
        return this.f16545e.mo17189c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f16545e.mo17190d();
    }

    public Drawable getStartIconDrawable() {
        return this.f16545e.mo17191e();
    }

    public CharSequence getSuffixText() {
        return this.f16547f.mo17293u();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f16547f.mo17294v();
    }

    public TextView getSuffixTextView() {
        return this.f16547f.mo17295w();
    }

    public Typeface getTypeface() {
        return this.f16542c0;
    }

    /* renamed from: h */
    public void mo17068h(C5173g gVar) {
        this.f16548f0.add(gVar);
        if (this.f16549g != null) {
            gVar.mo17185a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo17069i0(Editable editable) {
        boolean z;
        int a = this.f16569q.mo17184a(editable);
        boolean z2 = this.f16567p;
        int i = this.f16565o;
        if (i == -1) {
            this.f16571r.setText(String.valueOf(a));
            this.f16571r.setContentDescription((CharSequence) null);
            this.f16567p = false;
        } else {
            if (a > i) {
                z = true;
            } else {
                z = false;
            }
            this.f16567p = z;
            m20284j0(getContext(), this.f16571r, a, this.f16565o, this.f16567p);
            if (z2 != this.f16567p) {
                m20285k0();
            }
            this.f16571r.setText(C0963a.m3446c().mo3426j(getContext().getString(C0080j.f331d, new Object[]{Integer.valueOf(a), Integer.valueOf(this.f16565o)})));
        }
        if (this.f16549g != null && z2 != this.f16567p) {
            mo17080q0(false);
            mo17170w0();
            mo17072m0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo17070k(float f) {
        if (this.f16580v0.mo16448D() != f) {
            if (this.f16586y0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f16586y0 = valueAnimator;
                valueAnimator.setInterpolator(C2170a.f6351b);
                this.f16586y0.setDuration(167);
                this.f16586y0.addUpdateListener(new C5170d());
            }
            this.f16586y0.setFloatValues(new float[]{this.f16580v0.mo16448D(), f});
            this.f16586y0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d7  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17071l0() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f16549g
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.m20274d0()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            com.google.android.material.textfield.a0 r0 = r10.f16545e
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f16549g
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f16544d0
            if (r6 == 0) goto L_0x0025
            int r6 = r10.f16546e0
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f16544d0 = r6
            r10.f16546e0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.f16549g
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C1314o.m4559a(r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f16544d0
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.f16549g
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.C1314o.m4570l(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.f16544d0
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.f16549g
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C1314o.m4559a(r0)
            android.widget.EditText r6 = r10.f16549g
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            androidx.core.widget.C1314o.m4570l(r6, r2, r7, r8, r0)
            r10.f16544d0 = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.m20272c0()
            if (r6 == 0) goto L_0x00d7
            com.google.android.material.textfield.s r2 = r10.f16547f
            android.widget.TextView r2 = r2.mo17295w()
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.f16549g
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.textfield.s r6 = r10.f16547f
            com.google.android.material.internal.CheckableImageButton r6 = r6.mo17280k()
            if (r6 == 0) goto L_0x0092
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = androidx.core.view.C1058a0.m3951b(r6)
            int r2 = r2 + r6
        L_0x0092:
            android.widget.EditText r6 = r10.f16549g
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C1314o.m4559a(r6)
            android.graphics.drawable.Drawable r7 = r10.f16550g0
            if (r7 == 0) goto L_0x00b3
            int r8 = r10.f16552h0
            if (r8 == r2) goto L_0x00b3
            r10.f16552h0 = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.f16549g
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.f16550g0
            r4 = r6[r4]
            androidx.core.widget.C1314o.m4570l(r0, r1, r2, r3, r4)
            goto L_0x00f8
        L_0x00b3:
            if (r7 != 0) goto L_0x00c1
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f16550g0 = r7
            r10.f16552h0 = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00c1:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.f16550g0
            if (r2 == r3) goto L_0x00d5
            r10.f16554i0 = r2
            android.widget.EditText r0 = r10.f16549g
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            androidx.core.widget.C1314o.m4570l(r0, r1, r2, r3, r4)
            goto L_0x00f8
        L_0x00d5:
            r5 = r0
            goto L_0x00f8
        L_0x00d7:
            android.graphics.drawable.Drawable r6 = r10.f16550g0
            if (r6 == 0) goto L_0x00f9
            android.widget.EditText r6 = r10.f16549g
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C1314o.m4559a(r6)
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.f16550g0
            if (r3 != r7) goto L_0x00f5
            android.widget.EditText r0 = r10.f16549g
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f16554i0
            r4 = r6[r4]
            androidx.core.widget.C1314o.m4570l(r0, r1, r3, r7, r4)
            goto L_0x00f6
        L_0x00f5:
            r5 = r0
        L_0x00f6:
            r10.f16550g0 = r2
        L_0x00f8:
            r0 = r5
        L_0x00f9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo17071l0():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo17072m0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f16549g;
        if (editText != null && this.f16532P == 0 && (background = editText.getBackground()) != null) {
            if (C0485s0.m1967a(background)) {
                background = background.mutate();
            }
            if (mo17011b0()) {
                background.setColorFilter(C0444i.m1770e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f16567p || (textView = this.f16571r) == null) {
                C0836a.m3141c(background);
                this.f16549g.refreshDrawableState();
            } else {
                background.setColorFilter(C0444i.m1770e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo17073n0() {
        EditText editText = this.f16549g;
        if (editText != null && this.f16523G != null) {
            if ((this.f16526J || editText.getBackground() == null) && this.f16532P != 0) {
                ViewCompat.m3627v0(this.f16549g, getEditTextBoxBackground());
                this.f16526J = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f16580v0.mo16466W(configuration);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f16549g;
        if (editText != null) {
            Rect rect = this.f16539W;
            C5074b.m19850a(this, editText, rect);
            m20280g0(rect);
            if (this.f16520D) {
                this.f16580v0.mo16487r0(this.f16549g.getTextSize());
                int gravity = this.f16549g.getGravity();
                this.f16580v0.mo16473g0((gravity & -113) | 48);
                this.f16580v0.mo16485q0(gravity);
                this.f16580v0.mo16470c0(m20293q(rect));
                this.f16580v0.mo16478l0(m20298t(rect));
                this.f16580v0.mo16467Y();
                if (m20250A() && !this.f16578u0) {
                    m20264T();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean o0 = m20290o0();
        boolean l0 = mo17071l0();
        if (o0 || l0) {
            this.f16549g.post(new C5169c());
        }
        m20297s0();
        this.f16547f.mo17291s0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3880a());
        setError(savedState.f16589f);
        if (savedState.f16590g) {
            post(new C5168b());
        }
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i) {
        boolean z;
        float f;
        float f2;
        super.onRtlPropertiesChanged(i);
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.f16530N;
        if (z != z3) {
            if (z && !z3) {
                z2 = true;
            }
            float a = this.f16529M.mo22984r().mo22917a(this.f16541b0);
            float a2 = this.f16529M.mo22986t().mo22917a(this.f16541b0);
            float a3 = this.f16529M.mo22977j().mo22917a(this.f16541b0);
            float a4 = this.f16529M.mo22979l().mo22917a(this.f16541b0);
            if (z2) {
                f = a;
            } else {
                f = a2;
            }
            if (z2) {
                a = a2;
            }
            if (z2) {
                f2 = a3;
            } else {
                f2 = a4;
            }
            if (z2) {
                a3 = a4;
            }
            mo17008Y(f, a, f2, a3);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (mo17011b0()) {
            savedState.f16589f = getError();
        }
        savedState.f16590g = this.f16547f.mo17246B();
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void mo17080q0(boolean z) {
        m20295r0(z, false);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f16538V != i) {
            this.f16538V = i;
            this.f16568p0 = i;
            this.f16572r0 = i;
            this.f16574s0 = i;
            m20286l();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0767a.m2893c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f16568p0 = defaultColor;
        this.f16538V = defaultColor;
        this.f16570q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f16572r0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f16574s0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m20286l();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f16532P) {
            this.f16532P = i;
            if (this.f16549g != null) {
                m20263S();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f16533Q = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f16564n0 != i) {
            this.f16564n0 = i;
            mo17170w0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f16560l0 = colorStateList.getDefaultColor();
            this.f16576t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f16562m0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f16564n0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f16564n0 != colorStateList.getDefaultColor()) {
            this.f16564n0 = colorStateList.getDefaultColor();
        }
        mo17170w0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f16566o0 != colorStateList) {
            this.f16566o0 = colorStateList;
            mo17170w0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f16535S = i;
        mo17170w0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f16536T = i;
        mo17170w0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f16563n != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f16571r = appCompatTextView;
                appCompatTextView.setId(C0076f.f256W);
                Typeface typeface = this.f16542c0;
                if (typeface != null) {
                    this.f16571r.setTypeface(typeface);
                }
                this.f16571r.setMaxLines(1);
                this.f16561m.mo17314e(this.f16571r, 2);
                C1058a0.m3953d((ViewGroup.MarginLayoutParams) this.f16571r.getLayoutParams(), getResources().getDimensionPixelOffset(C0074d.f219m0));
                m20285k0();
                m20281h0();
            } else {
                this.f16561m.mo17303B(this.f16571r, 2);
                this.f16571r = null;
            }
            this.f16563n = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f16565o != i) {
            if (i > 0) {
                this.f16565o = i;
            } else {
                this.f16565o = -1;
            }
            if (this.f16563n) {
                m20281h0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f16573s != i) {
            this.f16573s = i;
            m20285k0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f16519C != colorStateList) {
            this.f16519C = colorStateList;
            m20285k0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f16575t != i) {
            this.f16575t = i;
            m20285k0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f16518B != colorStateList) {
            this.f16518B = colorStateList;
            m20285k0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f16556j0 = colorStateList;
        this.f16558k0 = colorStateList;
        if (this.f16549g != null) {
            mo17080q0(false);
        }
    }

    public void setEnabled(boolean z) {
        m20266V(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f16547f.mo17254K(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f16547f.mo17255L(z);
    }

    public void setEndIconContentDescription(int i) {
        this.f16547f.mo17256M(i);
    }

    public void setEndIconDrawable(int i) {
        this.f16547f.mo17258O(i);
    }

    public void setEndIconMode(int i) {
        this.f16547f.mo17260Q(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f16547f.mo17261R(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f16547f.mo17262S(onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f16547f.mo17263T(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f16547f.mo17264U(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.f16547f.mo17265V(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f16561m.mo17328z()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f16561m.mo17312O(charSequence);
        } else {
            this.f16561m.mo17325v();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f16561m.mo17304D(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f16561m.mo17305E(z);
    }

    public void setErrorIconDrawable(int i) {
        this.f16547f.mo17266W(i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f16547f.mo17268Y(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f16547f.mo17269Z(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f16547f.mo17270a0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f16547f.mo17271b0(mode);
    }

    public void setErrorTextAppearance(int i) {
        this.f16561m.mo17306F(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f16561m.mo17307G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f16582w0 != z) {
            this.f16582w0 = z;
            mo17080q0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo17004N()) {
                setHelperTextEnabled(true);
            }
            this.f16561m.mo17313P(charSequence);
        } else if (mo17004N()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f16561m.mo17310J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f16561m.mo17309I(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f16561m.mo17308H(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f16520D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(C11398b.f33142u);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f16584x0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f16520D) {
            this.f16520D = z;
            if (!z) {
                this.f16522F = false;
                if (!TextUtils.isEmpty(this.f16521E) && TextUtils.isEmpty(this.f16549g.getHint())) {
                    this.f16549g.setHint(this.f16521E);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f16549g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f16521E)) {
                        setHint(hint);
                    }
                    this.f16549g.setHint((CharSequence) null);
                }
                this.f16522F = true;
            }
            if (this.f16549g != null) {
                m20292p0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f16580v0.mo16471d0(i);
        this.f16558k0 = this.f16580v0.mo16482p();
        if (this.f16549g != null) {
            mo17080q0(false);
            m20292p0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f16558k0 != colorStateList) {
            if (this.f16556j0 == null) {
                this.f16580v0.mo16472f0(colorStateList);
            }
            this.f16558k0 = colorStateList;
            if (this.f16549g != null) {
                mo17080q0(false);
            }
        }
    }

    public void setLengthCounter(C5172f fVar) {
        this.f16569q = fVar;
    }

    public void setMaxEms(int i) {
        this.f16555j = i;
        EditText editText = this.f16549g;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.f16559l = i;
        EditText editText = this.f16549g;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f16553i = i;
        EditText editText = this.f16549g;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.f16557k = i;
        EditText editText = this.f16549g;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.f16547f.mo17272d0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.f16547f.mo17274f0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.f16547f.mo17277h0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f16547f.mo17278i0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f16547f.mo17279j0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f16581w == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f16581w = appCompatTextView;
            appCompatTextView.setId(C0076f.f259Z);
            ViewCompat.m3544C0(this.f16581w, 2);
            C5965n z = m20307z();
            this.f16587z = z;
            z.mo19361x0(67);
            this.f16516A = m20307z();
            setPlaceholderTextAppearance(this.f16585y);
            setPlaceholderTextColor(this.f16583x);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f16579v) {
                setPlaceholderTextEnabled(true);
            }
            this.f16577u = charSequence;
        }
        m20299t0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f16585y = i;
        TextView textView = this.f16581w;
        if (textView != null) {
            C1314o.m4575q(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f16583x != colorStateList) {
            this.f16583x = colorStateList;
            TextView textView = this.f16581w;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f16545e.mo17195k(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f16545e.mo17196l(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f16545e.mo17197m(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f16545e.mo17198n(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C5769a.m23210b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f16545e.mo17202q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f16545e.mo17203r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f16545e.mo17204s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f16545e.mo17205t(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f16545e.mo17206u(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f16547f.mo17281k0(charSequence);
    }

    public void setSuffixTextAppearance(int i) {
        this.f16547f.mo17283l0(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f16547f.mo17285m0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C5171e eVar) {
        EditText editText = this.f16549g;
        if (editText != null) {
            ViewCompat.m3619r0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f16542c0) {
            this.f16542c0 = typeface;
            this.f16580v0.mo16461J0(typeface);
            this.f16561m.mo17311L(typeface);
            TextView textView = this.f16571r;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo17170w0() {
        boolean z;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f16523G != null && this.f16532P != 0) {
            boolean z2 = false;
            if (isFocused() || ((editText2 = this.f16549g) != null && editText2.hasFocus())) {
                z = true;
            } else {
                z = false;
            }
            if (isHovered() || ((editText = this.f16549g) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.f16537U = this.f16576t0;
            } else if (mo17011b0()) {
                if (this.f16566o0 != null) {
                    m20303v0(z, z2);
                } else {
                    this.f16537U = getErrorCurrentTextColors();
                }
            } else if (!this.f16567p || (textView = this.f16571r) == null) {
                if (z) {
                    this.f16537U = this.f16564n0;
                } else if (z2) {
                    this.f16537U = this.f16562m0;
                } else {
                    this.f16537U = this.f16560l0;
                }
            } else if (this.f16566o0 != null) {
                m20303v0(z, z2);
            } else {
                this.f16537U = textView.getCurrentTextColor();
            }
            this.f16547f.mo17250F();
            mo17007W();
            if (this.f16532P == 2) {
                int i = this.f16534R;
                if (!z || !isEnabled()) {
                    this.f16534R = this.f16535S;
                } else {
                    this.f16534R = this.f16536T;
                }
                if (this.f16534R != i) {
                    m20265U();
                }
            }
            if (this.f16532P == 1) {
                if (!isEnabled()) {
                    this.f16538V = this.f16570q0;
                } else if (z2 && !z) {
                    this.f16538V = this.f16574s0;
                } else if (z) {
                    this.f16538V = this.f16572r0;
                } else {
                    this.f16538V = this.f16568p0;
                }
            }
            m20286l();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r9 = f16514B0
            r1 = r21
            android.content.Context r1 = p249s8.C8273a.m31120c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f16553i = r10
            r0.f16555j = r10
            r0.f16557k = r10
            r0.f16559l = r10
            com.google.android.material.textfield.v r1 = new com.google.android.material.textfield.v
            r1.<init>(r0)
            r0.f16561m = r1
            com.google.android.material.textfield.d0 r1 = new com.google.android.material.textfield.d0
            r1.<init>()
            r0.f16569q = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f16539W = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f16540a0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f16541b0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f16548f0 = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.f16580v0 = r1
            android.content.Context r11 = r20.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r13 = 0
            r0.setWillNotDraw(r13)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r11)
            r0.f16543d = r14
            r14.setAddStatesFromChildren(r12)
            android.animation.TimeInterpolator r2 = p026b8.C2170a.f6350a
            r1.mo16457H0(r2)
            r1.mo16447C0(r2)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo16473g0(r2)
            int[] r3 = p009a8.C0082l.f820s7
            r1 = 5
            int[] r6 = new int[r1]
            int r15 = p009a8.C0082l.f537P7
            r6[r13] = r15
            int r5 = p009a8.C0082l.f517N7
            r6[r12] = r5
            int r4 = p009a8.C0082l.f661c8
            r2 = 2
            r6[r2] = r4
            int r1 = p009a8.C0082l.f711h8
            r16 = 3
            r6[r16] = r1
            int r13 = p009a8.C0082l.f751l8
            r16 = 4
            r6[r16] = r13
            r17 = r1
            r1 = r11
            r2 = r22
            r18 = r4
            r4 = r23
            r19 = r5
            r5 = r9
            androidx.appcompat.widget.r1 r1 = com.google.android.material.internal.C5088l.m19899j(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.a0 r2 = new com.google.android.material.textfield.a0
            r2.<init>(r0, r1)
            r0.f16545e = r2
            int r3 = p009a8.C0082l.f741k8
            boolean r3 = r1.mo2314a(r3, r12)
            r0.f16520D = r3
            int r3 = p009a8.C0082l.f870x7
            java.lang.CharSequence r3 = r1.mo2329p(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = p009a8.C0082l.f731j8
            boolean r3 = r1.mo2314a(r3, r12)
            r0.f16584x0 = r3
            int r3 = p009a8.C0082l.f681e8
            boolean r3 = r1.mo2314a(r3, r12)
            r0.f16582w0 = r3
            int r3 = p009a8.C0082l.f890z7
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x00d8
            int r3 = r1.mo2324k(r3, r10)
            r0.setMinEms(r3)
            goto L_0x00e7
        L_0x00d8:
            int r3 = p009a8.C0082l.f860w7
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x00e7
            int r3 = r1.mo2319f(r3, r10)
            r0.setMinWidth(r3)
        L_0x00e7:
            int r3 = p009a8.C0082l.f880y7
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x00f7
            int r3 = r1.mo2324k(r3, r10)
            r0.setMaxEms(r3)
            goto L_0x0106
        L_0x00f7:
            int r3 = p009a8.C0082l.f850v7
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x0106
            int r3 = r1.mo2319f(r3, r10)
            r0.setMaxWidth(r3)
        L_0x0106:
            q8.k$b r3 = p223q8.C7929k.m29978e(r11, r7, r8, r9)
            q8.k r3 = r3.mo22998m()
            r0.f16529M = r3
            android.content.res.Resources r3 = r11.getResources()
            int r4 = p009a8.C0074d.f213j0
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.f16531O = r3
            int r3 = p009a8.C0082l.f407C7
            r4 = 0
            int r3 = r1.mo2318e(r3, r4)
            r0.f16533Q = r3
            int r3 = p009a8.C0082l.f477J7
            android.content.res.Resources r4 = r11.getResources()
            int r5 = p009a8.C0074d.f215k0
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo2319f(r3, r4)
            r0.f16535S = r3
            int r3 = p009a8.C0082l.f487K7
            android.content.res.Resources r4 = r11.getResources()
            int r5 = p009a8.C0074d.f217l0
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo2319f(r3, r4)
            r0.f16536T = r3
            int r3 = r0.f16535S
            r0.f16534R = r3
            int r3 = p009a8.C0082l.f447G7
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.mo2317d(r3, r4)
            int r5 = p009a8.C0082l.f437F7
            float r5 = r1.mo2317d(r5, r4)
            int r6 = p009a8.C0082l.f417D7
            float r6 = r1.mo2317d(r6, r4)
            int r7 = p009a8.C0082l.f427E7
            float r4 = r1.mo2317d(r7, r4)
            q8.k r7 = r0.f16529M
            q8.k$b r7 = r7.mo22988v()
            r8 = 0
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x0175
            r7.mo22992A(r3)
        L_0x0175:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x017c
            r7.mo22996E(r5)
        L_0x017c:
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0183
            r7.mo23007w(r6)
        L_0x0183:
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x018a
            r7.mo23003s(r4)
        L_0x018a:
            q8.k r3 = r7.mo22998m()
            r0.f16529M = r3
            int r3 = p009a8.C0082l.f387A7
            android.content.res.ColorStateList r3 = p184n8.C7343c.m28004b(r11, r1, r3)
            if (r3 == 0) goto L_0x01f0
            int r4 = r3.getDefaultColor()
            r0.f16568p0 = r4
            r0.f16538V = r4
            boolean r4 = r3.isStateful()
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01cc
            int[] r4 = new int[r12]
            r6 = 0
            r4[r6] = r5
            int r4 = r3.getColorForState(r4, r10)
            r0.f16570q0 = r4
            r4 = 2
            int[] r5 = new int[r4]
            r5 = {16842908, 16842910} // fill-array
            int r5 = r3.getColorForState(r5, r10)
            r0.f16572r0 = r5
            int[] r5 = new int[r4]
            r5 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r5, r10)
            r0.f16574s0 = r3
            goto L_0x01fc
        L_0x01cc:
            r4 = 2
            int r3 = r0.f16568p0
            r0.f16572r0 = r3
            int r3 = p009a8.C0073c.f168d
            android.content.res.ColorStateList r3 = p045d.C5769a.m23209a(r11, r3)
            int[] r6 = new int[r12]
            r7 = 0
            r6[r7] = r5
            int r5 = r3.getColorForState(r6, r10)
            r0.f16570q0 = r5
            int[] r5 = new int[r12]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r5[r7] = r6
            int r3 = r3.getColorForState(r5, r10)
            r0.f16574s0 = r3
            goto L_0x01fc
        L_0x01f0:
            r4 = 2
            r7 = 0
            r0.f16538V = r7
            r0.f16568p0 = r7
            r0.f16570q0 = r7
            r0.f16572r0 = r7
            r0.f16574s0 = r7
        L_0x01fc:
            int r3 = p009a8.C0082l.f840u7
            boolean r5 = r1.mo2332s(r3)
            if (r5 == 0) goto L_0x020c
            android.content.res.ColorStateList r3 = r1.mo2316c(r3)
            r0.f16558k0 = r3
            r0.f16556j0 = r3
        L_0x020c:
            int r3 = p009a8.C0082l.f457H7
            android.content.res.ColorStateList r5 = p184n8.C7343c.m28004b(r11, r1, r3)
            r6 = 0
            int r3 = r1.mo2315b(r3, r6)
            r0.f16564n0 = r3
            int r3 = p009a8.C0073c.f169e
            int r3 = androidx.core.content.C0767a.m2893c(r11, r3)
            r0.f16560l0 = r3
            int r3 = p009a8.C0073c.f170f
            int r3 = androidx.core.content.C0767a.m2893c(r11, r3)
            r0.f16576t0 = r3
            int r3 = p009a8.C0073c.f171g
            int r3 = androidx.core.content.C0767a.m2893c(r11, r3)
            r0.f16562m0 = r3
            if (r5 == 0) goto L_0x0236
            r0.setBoxStrokeColorStateList(r5)
        L_0x0236:
            int r3 = p009a8.C0082l.f467I7
            boolean r5 = r1.mo2332s(r3)
            if (r5 == 0) goto L_0x0245
            android.content.res.ColorStateList r3 = p184n8.C7343c.m28004b(r11, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x0245:
            int r3 = r1.mo2327n(r13, r10)
            if (r3 == r10) goto L_0x0254
            r3 = 0
            int r5 = r1.mo2327n(r13, r3)
            r0.setHintTextAppearance(r5)
            goto L_0x0255
        L_0x0254:
            r3 = 0
        L_0x0255:
            r5 = r18
            int r5 = r1.mo2327n(r5, r3)
            int r6 = p009a8.C0082l.f613X7
            java.lang.CharSequence r6 = r1.mo2329p(r6)
            int r7 = p009a8.C0082l.f622Y7
            boolean r7 = r1.mo2314a(r7, r3)
            r8 = r17
            int r8 = r1.mo2327n(r8, r3)
            int r9 = p009a8.C0082l.f701g8
            boolean r9 = r1.mo2314a(r9, r3)
            int r11 = p009a8.C0082l.f691f8
            java.lang.CharSequence r11 = r1.mo2329p(r11)
            int r13 = p009a8.C0082l.f831t8
            int r13 = r1.mo2327n(r13, r3)
            int r4 = p009a8.C0082l.f821s8
            java.lang.CharSequence r4 = r1.mo2329p(r4)
            int r12 = p009a8.C0082l.f497L7
            boolean r12 = r1.mo2314a(r12, r3)
            int r3 = p009a8.C0082l.f507M7
            int r3 = r1.mo2324k(r3, r10)
            r0.setCounterMaxLength(r3)
            r3 = 0
            int r10 = r1.mo2327n(r15, r3)
            r0.f16575t = r10
            r10 = r19
            int r10 = r1.mo2327n(r10, r3)
            r0.f16573s = r10
            int r10 = p009a8.C0082l.f397B7
            int r3 = r1.mo2324k(r10, r3)
            r0.setBoxBackgroundMode(r3)
            r0.setErrorContentDescription(r6)
            int r3 = r0.f16573s
            r0.setCounterOverflowTextAppearance(r3)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorTextAppearance(r5)
            int r3 = r0.f16575t
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r4)
            r0.setPlaceholderTextAppearance(r13)
            int r3 = p009a8.C0082l.f671d8
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x02d4
            android.content.res.ColorStateList r3 = r1.mo2316c(r3)
            r0.setErrorTextColor(r3)
        L_0x02d4:
            int r3 = p009a8.C0082l.f721i8
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x02e3
            android.content.res.ColorStateList r3 = r1.mo2316c(r3)
            r0.setHelperTextColor(r3)
        L_0x02e3:
            int r3 = p009a8.C0082l.f761m8
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x02f2
            android.content.res.ColorStateList r3 = r1.mo2316c(r3)
            r0.setHintTextColor(r3)
        L_0x02f2:
            int r3 = p009a8.C0082l.f547Q7
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x0301
            android.content.res.ColorStateList r3 = r1.mo2316c(r3)
            r0.setCounterTextColor(r3)
        L_0x0301:
            int r3 = p009a8.C0082l.f527O7
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x0310
            android.content.res.ColorStateList r3 = r1.mo2316c(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x0310:
            int r3 = p009a8.C0082l.f841u8
            boolean r4 = r1.mo2332s(r3)
            if (r4 == 0) goto L_0x031f
            android.content.res.ColorStateList r3 = r1.mo2316c(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x031f:
            com.google.android.material.textfield.s r3 = new com.google.android.material.textfield.s
            r3.<init>(r0, r1)
            r0.f16547f = r3
            int r4 = p009a8.C0082l.f830t7
            r5 = 1
            boolean r4 = r1.mo2314a(r4, r5)
            r1.mo2333w()
            r1 = 2
            androidx.core.view.ViewCompat.m3544C0(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r1 < r6) goto L_0x033d
            androidx.core.view.ViewCompat.m3546D0(r0, r5)
        L_0x033d:
            r14.addView(r2)
            r14.addView(r3)
            r0.addView(r14)
            r0.setEnabled(r4)
            r0.setHelperTextEnabled(r9)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r12)
            r0.setHelperText(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f16547f.mo17257N(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f16547f.mo17259P(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f16547f.mo17267X(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f16547f.mo17273e0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f16547f.mo17275g0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f16545e.mo17199o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f16545e.mo17201p(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
