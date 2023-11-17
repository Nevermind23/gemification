package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0315n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0512x1;
import androidx.appcompat.widget.C0515y0;
import p030c.C2219j;

public class ActionMenuItemView extends AppCompatTextView implements C0315n.C0316a, View.OnClickListener, ActionMenuView.C0338a {

    /* renamed from: d */
    C0301i f1466d;

    /* renamed from: e */
    private CharSequence f1467e;

    /* renamed from: f */
    private Drawable f1468f;

    /* renamed from: g */
    C0297g.C0299b f1469g;

    /* renamed from: h */
    private C0515y0 f1470h;

    /* renamed from: i */
    C0284b f1471i;

    /* renamed from: j */
    private boolean f1472j;

    /* renamed from: k */
    private boolean f1473k;

    /* renamed from: l */
    private int f1474l;

    /* renamed from: m */
    private int f1475m;

    /* renamed from: n */
    private int f1476n;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0283a extends C0515y0 {
        public C0283a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: b */
        public C0318p mo823b() {
            C0284b bVar = ActionMenuItemView.this.f1471i;
            if (bVar != null) {
                return bVar.mo825a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo824c() {
            C0318p b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0297g.C0299b bVar = actionMenuItemView.f1469g;
            if (bVar == null || !bVar.mo827d(actionMenuItemView.f1466d) || (b = mo823b()) == null || !b.mo922b()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0284b {
        /* renamed from: a */
        public abstract C0318p mo825a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    private boolean m969g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i2 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m970h() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1467e);
        if (this.f1468f != null && (!this.f1466d.mo1050B() || (!this.f1472j && !this.f1473k))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.f1467e;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f1466d.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f1466d.getTitle();
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1466d.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence3 = this.f1466d.getTitle();
            }
            C0512x1.m2056a(this, charSequence3);
            return;
        }
        C0512x1.m2056a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo803a() {
        return mo807f();
    }

    /* renamed from: b */
    public boolean mo804b() {
        return mo807f() && this.f1466d.getIcon() == null;
    }

    /* renamed from: c */
    public void mo805c(C0301i iVar, int i) {
        int i2;
        this.f1466d = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo1068i(this));
        setId(iVar.getItemId());
        if (iVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f1470h == null) {
            this.f1470h = new C0283a();
        }
    }

    /* renamed from: e */
    public boolean mo806e() {
        return true;
    }

    /* renamed from: f */
    public boolean mo807f() {
        return !TextUtils.isEmpty(getText());
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0301i getItemData() {
        return this.f1466d;
    }

    public void onClick(View view) {
        C0297g.C0299b bVar = this.f1469g;
        if (bVar != null) {
            bVar.mo827d(this.f1466d);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1472j = m969g();
        m970h();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean f = mo807f();
        if (f && (i4 = this.f1475m) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f1474l);
        } else {
            i3 = this.f1474l;
        }
        if (mode != 1073741824 && this.f1474l > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!f && this.f1468f != null) {
            super.setPadding((getMeasuredWidth() - this.f1468f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0515y0 y0Var;
        if (!this.f1466d.hasSubMenu() || (y0Var = this.f1470h) == null || !y0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1473k != z) {
            this.f1473k = z;
            C0301i iVar = this.f1466d;
            if (iVar != null) {
                iVar.mo1051c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1468f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1476n;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        m970h();
    }

    public void setItemInvoker(C0297g.C0299b bVar) {
        this.f1469g = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1475m = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0284b bVar) {
        this.f1471i = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1467e = charSequence;
        m970h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1472j = m969g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2219j.f6855v, i, 0);
        this.f1474l = obtainStyledAttributes.getDimensionPixelSize(C2219j.f6860w, 0);
        obtainStyledAttributes.recycle();
        this.f1476n = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1475m = -1;
        setSaveEnabled(false);
    }
}
