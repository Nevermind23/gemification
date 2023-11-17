package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0125b;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1314o;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p009a8.C0072b;
import p009a8.C0081k;
import p045d.C5769a;
import p223q8.C7926h;
import p223q8.C7929k;
import p223q8.C7945n;

public class MaterialButton extends AppCompatButton implements Checkable, C7945n {

    /* renamed from: E */
    private static final int[] f15696E = {16842911};

    /* renamed from: F */
    private static final int[] f15697F = {16842912};

    /* renamed from: G */
    private static final int f15698G = C0081k.f370r;

    /* renamed from: A */
    private int f15699A;

    /* renamed from: B */
    private boolean f15700B;

    /* renamed from: C */
    private boolean f15701C;

    /* renamed from: D */
    private int f15702D;

    /* renamed from: q */
    private final C4973a f15703q;

    /* renamed from: r */
    private final LinkedHashSet f15704r;

    /* renamed from: t */
    private C4967a f15705t;

    /* renamed from: u */
    private PorterDuff.Mode f15706u;

    /* renamed from: v */
    private ColorStateList f15707v;

    /* renamed from: w */
    private Drawable f15708w;

    /* renamed from: x */
    private int f15709x;

    /* renamed from: y */
    private int f15710y;

    /* renamed from: z */
    private int f15711z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4966a();

        /* renamed from: f */
        boolean f15712f;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        class C4966a implements Parcelable.ClassLoaderCreator {
            C4966a() {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m19035b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f15712f = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f15712f ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m19035b(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    interface C4967a {
        /* renamed from: a */
        void mo15687a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0072b.f122B);
    }

    /* renamed from: a */
    private CharSequence m19024a(int i) {
        return getText().subSequence(getLayout().getLineStart(i), getLayout().getLineEnd(i));
    }

    /* renamed from: b */
    private int m19025b(CharSequence charSequence) {
        TextPaint paint = getPaint();
        String charSequence2 = charSequence.toString();
        if (getTransformationMethod() != null) {
            charSequence2 = getTransformationMethod().getTransformation(charSequence2, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence2), getLayout().getEllipsizedWidth());
    }

    /* renamed from: g */
    private boolean m19026g() {
        int i = this.f15702D;
        return i == 3 || i == 4;
    }

    private String getA11yClassName() {
        return (mo15625f() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, m19025b(m19024a(i2)));
        }
        return i;
    }

    /* renamed from: h */
    private boolean m19027h() {
        int i = this.f15702D;
        return i == 1 || i == 2;
    }

    /* renamed from: i */
    private boolean m19028i() {
        int i = this.f15702D;
        return i == 16 || i == 32;
    }

    /* renamed from: j */
    private boolean m19029j() {
        return ViewCompat.m3541B(this) == 1;
    }

    /* renamed from: k */
    private boolean m19030k() {
        C4973a aVar = this.f15703q;
        return aVar != null && !aVar.mo15725o();
    }

    /* renamed from: l */
    private void m19031l() {
        if (m19027h()) {
            C1314o.m4570l(this, this.f15708w, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (m19026g()) {
            C1314o.m4570l(this, (Drawable) null, (Drawable) null, this.f15708w, (Drawable) null);
        } else if (m19028i()) {
            C1314o.m4570l(this, (Drawable) null, this.f15708w, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: m */
    private void m19032m(boolean z) {
        Drawable drawable = this.f15708w;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = C0836a.m3156r(drawable).mutate();
            this.f15708w = mutate;
            C0836a.m3153o(mutate, this.f15707v);
            PorterDuff.Mode mode = this.f15706u;
            if (mode != null) {
                C0836a.m3154p(this.f15708w, mode);
            }
            int i = this.f15709x;
            if (i == 0) {
                i = this.f15708w.getIntrinsicWidth();
            }
            int i2 = this.f15709x;
            if (i2 == 0) {
                i2 = this.f15708w.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f15708w;
            int i3 = this.f15710y;
            int i4 = this.f15711z;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f15708w.setVisible(true, z);
        }
        if (z) {
            m19031l();
            return;
        }
        Drawable[] a = C1314o.m4559a(this);
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[1];
        Drawable drawable5 = a[2];
        if ((!m19027h() || drawable3 == this.f15708w) && ((!m19026g() || drawable5 == this.f15708w) && (!m19028i() || drawable4 == this.f15708w))) {
            z2 = false;
        }
        if (z2) {
            m19031l();
        }
    }

    /* renamed from: n */
    private void m19033n(int i, int i2) {
        if (this.f15708w != null && getLayout() != null) {
            if (m19027h() || m19026g()) {
                this.f15711z = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i3 = this.f15702D;
                boolean z = true;
                if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f15710y = 0;
                    m19032m(false);
                    return;
                }
                int i4 = this.f15709x;
                if (i4 == 0) {
                    i4 = this.f15708w.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i - getTextLayoutWidth()) - ViewCompat.m3549F(this)) - i4) - this.f15699A) - ViewCompat.m3551G(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                boolean j = m19029j();
                if (this.f15702D != 4) {
                    z = false;
                }
                if (j != z) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.f15710y != textLayoutWidth) {
                    this.f15710y = textLayoutWidth;
                    m19032m(false);
                }
            } else if (m19028i()) {
                this.f15710y = 0;
                if (this.f15702D == 16) {
                    this.f15711z = 0;
                    m19032m(false);
                    return;
                }
                int i5 = this.f15709x;
                if (i5 == 0) {
                    i5 = this.f15708w.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.f15699A) - getPaddingBottom()) / 2);
                if (this.f15711z != max) {
                    this.f15711z = max;
                    m19032m(false);
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo15625f() {
        C4973a aVar = this.f15703q;
        return aVar != null && aVar.mo15726p();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m19030k()) {
            return this.f15703q.mo15714b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f15708w;
    }

    public int getIconGravity() {
        return this.f15702D;
    }

    public int getIconPadding() {
        return this.f15699A;
    }

    public int getIconSize() {
        return this.f15709x;
    }

    public ColorStateList getIconTint() {
        return this.f15707v;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f15706u;
    }

    public int getInsetBottom() {
        return this.f15703q.mo15715c();
    }

    public int getInsetTop() {
        return this.f15703q.mo15716d();
    }

    public ColorStateList getRippleColor() {
        if (m19030k()) {
            return this.f15703q.mo15719h();
        }
        return null;
    }

    public C7929k getShapeAppearanceModel() {
        if (m19030k()) {
            return this.f15703q.mo15720i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m19030k()) {
            return this.f15703q.mo15721j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m19030k()) {
            return this.f15703q.mo15722k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m19030k()) {
            return this.f15703q.mo15723l();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m19030k()) {
            return this.f15703q.mo15724m();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f15700B;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m19030k()) {
            C7926h.m29971f(this, this.f15703q.mo15718f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo15625f()) {
            View.mergeDrawableStates(onCreateDrawableState, f15696E);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f15697F);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo15625f());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m19033n(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3880a());
        setChecked(savedState.f15712f);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f15712f = this.f15700B;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m19033n(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        if (this.f15703q.mo15727q()) {
            toggle();
        }
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f15708w != null) {
            if (this.f15708w.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m19030k()) {
            this.f15703q.mo15729s(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!m19030k()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f15703q.mo15730t();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C5769a.m23210b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m19030k()) {
            this.f15703q.mo15731u(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo15625f() && isEnabled() && this.f15700B != z) {
            this.f15700B = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).mo15696m(this, this.f15700B);
            }
            if (!this.f15701C) {
                this.f15701C = true;
                Iterator it = this.f15704r.iterator();
                if (!it.hasNext()) {
                    this.f15701C = false;
                } else {
                    C0125b.m366a(it.next());
                    throw null;
                }
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m19030k()) {
            this.f15703q.mo15732v(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m19030k()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m19030k()) {
            this.f15703q.mo15718f().mo22940W(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f15708w != drawable) {
            this.f15708w = drawable;
            m19032m(true);
            m19033n(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f15702D != i) {
            this.f15702D = i;
            m19033n(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f15699A != i) {
            this.f15699A = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C5769a.m23210b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f15709x != i) {
            this.f15709x = i;
            m19032m(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f15707v != colorStateList) {
            this.f15707v = colorStateList;
            m19032m(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f15706u != mode) {
            this.f15706u = mode;
            m19032m(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C5769a.m23209a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f15703q.mo15733w(i);
    }

    public void setInsetTop(int i) {
        this.f15703q.mo15734x(i);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(C4967a aVar) {
        this.f15705t = aVar;
    }

    public void setPressed(boolean z) {
        C4967a aVar = this.f15705t;
        if (aVar != null) {
            aVar.mo15687a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m19030k()) {
            this.f15703q.mo15735y(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m19030k()) {
            setRippleColor(C5769a.m23209a(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C7929k kVar) {
        if (m19030k()) {
            this.f15703q.mo15736z(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m19030k()) {
            this.f15703q.mo15708A(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m19030k()) {
            this.f15703q.mo15709B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m19030k()) {
            setStrokeColor(C5769a.m23209a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m19030k()) {
            this.f15703q.mo15710C(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m19030k()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m19030k()) {
            this.f15703q.mo15711D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m19030k()) {
            this.f15703q.mo15712E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m19033n(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f15703q.mo15713F(z);
    }

    public void toggle() {
        setChecked(!this.f15700B);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f15698G
            android.content.Context r9 = p249s8.C8273a.m31120c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f15704r = r9
            r9 = 0
            r8.f15700B = r9
            r8.f15701C = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p009a8.C0082l.f786p3
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C5088l.m19898i(r0, r1, r2, r3, r4, r5)
            int r1 = p009a8.C0082l.f403C3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f15699A = r1
            int r1 = p009a8.C0082l.f433F3
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C5089m.m19906g(r1, r2)
            r8.f15706u = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p009a8.C0082l.f423E3
            android.content.res.ColorStateList r1 = p184n8.C7343c.m28003a(r1, r0, r2)
            r8.f15707v = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p009a8.C0082l.f383A3
            android.graphics.drawable.Drawable r1 = p184n8.C7343c.m28007e(r1, r0, r2)
            r8.f15708w = r1
            int r1 = p009a8.C0082l.f393B3
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f15702D = r1
            int r1 = p009a8.C0082l.f413D3
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f15709x = r1
            q8.k$b r10 = p223q8.C7929k.m29978e(r7, r10, r11, r6)
            q8.k r10 = r10.mo22998m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f15703q = r11
            r11.mo15728r(r0)
            r0.recycle()
            int r10 = r8.f15699A
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f15708w
            if (r10 == 0) goto L_0x0084
            r9 = r2
        L_0x0084:
            r8.m19032m(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
