package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0301i;
import androidx.appcompat.view.menu.C0315n;
import androidx.appcompat.widget.C0512x1;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.C0808h;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.C1055a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C1314o;
import com.salesforce.marketingcloud.C11398b;
import p009a8.C0074d;
import p009a8.C0075e;
import p009a8.C0076f;
import p009a8.C0078h;
import p030c.C2210a;

public class NavigationMenuItemView extends C5076d implements C0315n.C0316a {

    /* renamed from: I */
    private static final int[] f16136I = {16842912};

    /* renamed from: A */
    boolean f16137A;

    /* renamed from: B */
    private final CheckedTextView f16138B;

    /* renamed from: C */
    private FrameLayout f16139C;

    /* renamed from: D */
    private C0301i f16140D;

    /* renamed from: E */
    private ColorStateList f16141E;

    /* renamed from: F */
    private boolean f16142F;

    /* renamed from: G */
    private Drawable f16143G;

    /* renamed from: H */
    private final C1055a f16144H;

    /* renamed from: y */
    private int f16145y;

    /* renamed from: z */
    private boolean f16146z;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C5067a extends C1055a {
        C5067a() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.mo3590W(NavigationMenuItemView.this.f16137A);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private void m19746B() {
        if (m19748D()) {
            this.f16138B.setVisibility(8);
            FrameLayout frameLayout = this.f16139C;
            if (frameLayout != null) {
                LinearLayoutCompat.C0360a aVar = (LinearLayoutCompat.C0360a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f16139C.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f16138B.setVisibility(0);
        FrameLayout frameLayout2 = this.f16139C;
        if (frameLayout2 != null) {
            LinearLayoutCompat.C0360a aVar2 = (LinearLayoutCompat.C0360a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f16139C.setLayoutParams(aVar2);
        }
    }

    /* renamed from: C */
    private StateListDrawable m19747C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C2210a.f6464t, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f16136I, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: D */
    private boolean m19748D() {
        if (this.f16140D.getTitle() == null && this.f16140D.getIcon() == null && this.f16140D.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f16139C == null) {
                this.f16139C = (FrameLayout) ((ViewStub) findViewById(C0076f.f271g)).inflate();
            }
            this.f16139C.removeAllViews();
            this.f16139C.addView(view);
        }
    }

    /* renamed from: c */
    public void mo805c(C0301i iVar, int i) {
        int i2;
        this.f16140D = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        if (iVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            ViewCompat.m3627v0(this, m19747C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        C0512x1.m2056a(this, iVar.getTooltipText());
        m19746B();
    }

    /* renamed from: e */
    public boolean mo806e() {
        return false;
    }

    public C0301i getItemData() {
        return this.f16140D;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0301i iVar = this.f16140D;
        if (iVar != null && iVar.isCheckable() && this.f16140D.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f16136I);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f16137A != z) {
            this.f16137A = z;
            this.f16144H.sendAccessibilityEvent(this.f16138B, C11398b.f33142u);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f16138B.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f16142F) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0836a.m3156r(drawable).mutate();
                C0836a.m3153o(drawable, this.f16141E);
            }
            int i = this.f16145y;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f16146z) {
            if (this.f16143G == null) {
                Drawable f = C0808h.m3031f(getResources(), C0075e.f239k, getContext().getTheme());
                this.f16143G = f;
                if (f != null) {
                    int i2 = this.f16145y;
                    f.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f16143G;
        }
        C1314o.m4570l(this.f16138B, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f16138B.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f16145y = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f16141E = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f16142F = z;
        C0301i iVar = this.f16140D;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f16138B.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f16146z = z;
    }

    public void setTextAppearance(int i) {
        C1314o.m4575q(this.f16138B, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f16138B.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f16138B.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5067a aVar = new C5067a();
        this.f16144H = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0078h.f295e, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C0074d.f210i));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C0076f.f272h);
        this.f16138B = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.m3619r0(checkedTextView, aVar);
    }
}
