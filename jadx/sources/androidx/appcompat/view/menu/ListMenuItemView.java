package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0315n;
import androidx.appcompat.widget.C0483r1;
import androidx.core.view.ViewCompat;
import p030c.C2210a;
import p030c.C2215f;
import p030c.C2216g;
import p030c.C2219j;

public class ListMenuItemView extends LinearLayout implements C0315n.C0316a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: d */
    private C0301i f1481d;

    /* renamed from: e */
    private ImageView f1482e;

    /* renamed from: f */
    private RadioButton f1483f;

    /* renamed from: g */
    private TextView f1484g;

    /* renamed from: h */
    private CheckBox f1485h;

    /* renamed from: i */
    private TextView f1486i;

    /* renamed from: j */
    private ImageView f1487j;

    /* renamed from: k */
    private ImageView f1488k;

    /* renamed from: l */
    private LinearLayout f1489l;

    /* renamed from: m */
    private Drawable f1490m;

    /* renamed from: n */
    private int f1491n;

    /* renamed from: o */
    private Context f1492o;

    /* renamed from: p */
    private boolean f1493p;

    /* renamed from: q */
    private Drawable f1494q;

    /* renamed from: r */
    private boolean f1495r;

    /* renamed from: s */
    private LayoutInflater f1496s;

    /* renamed from: t */
    private boolean f1497t;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6432C);
    }

    /* renamed from: a */
    private void m981a(View view) {
        m982b(view, -1);
    }

    /* renamed from: b */
    private void m982b(View view, int i) {
        LinearLayout linearLayout = this.f1489l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: d */
    private void m983d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C2216g.f6587h, this, false);
        this.f1485h = checkBox;
        m981a(checkBox);
    }

    /* renamed from: f */
    private void m984f() {
        ImageView imageView = (ImageView) getInflater().inflate(C2216g.f6588i, this, false);
        this.f1482e = imageView;
        m982b(imageView, 0);
    }

    /* renamed from: g */
    private void m985g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C2216g.f6590k, this, false);
        this.f1483f = radioButton;
        m981a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1496s == null) {
            this.f1496s = LayoutInflater.from(getContext());
        }
        return this.f1496s;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f1487j;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1488k;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1488k.getLayoutParams();
            rect.top += this.f1488k.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: c */
    public void mo805c(C0301i iVar, int i) {
        int i2;
        this.f1481d = iVar;
        if (iVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(iVar.mo1068i(this));
        setCheckable(iVar.isCheckable());
        mo832h(iVar.mo1049A(), iVar.mo1053g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    /* renamed from: e */
    public boolean mo806e() {
        return false;
    }

    public C0301i getItemData() {
        return this.f1481d;
    }

    /* renamed from: h */
    public void mo832h(boolean z, char c) {
        int i;
        if (!z || !this.f1481d.mo1049A()) {
            i = 8;
        } else {
            i = 0;
        }
        if (i == 0) {
            this.f1486i.setText(this.f1481d.mo1066h());
        }
        if (this.f1486i.getVisibility() != i) {
            this.f1486i.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.m3627v0(this, this.f1490m);
        TextView textView = (TextView) findViewById(C2215f.f6550M);
        this.f1484g = textView;
        int i = this.f1491n;
        if (i != -1) {
            textView.setTextAppearance(this.f1492o, i);
        }
        this.f1486i = (TextView) findViewById(C2215f.f6543F);
        ImageView imageView = (ImageView) findViewById(C2215f.f6546I);
        this.f1487j = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1494q);
        }
        this.f1488k = (ImageView) findViewById(C2215f.f6571r);
        this.f1489l = (LinearLayout) findViewById(C2215f.f6565l);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1482e != null && this.f1493p) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1482e.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.f1483f != null || this.f1485h != null) {
            if (this.f1481d.mo1076m()) {
                if (this.f1483f == null) {
                    m985g();
                }
                compoundButton = this.f1483f;
                view = this.f1485h;
            } else {
                if (this.f1485h == null) {
                    m983d();
                }
                compoundButton = this.f1485h;
                view = this.f1483f;
            }
            if (z) {
                compoundButton.setChecked(this.f1481d.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f1485h;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f1483f;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1481d.mo1076m()) {
            if (this.f1483f == null) {
                m985g();
            }
            compoundButton = this.f1483f;
        } else {
            if (this.f1485h == null) {
                m983d();
            }
            compoundButton = this.f1485h;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1497t = z;
        this.f1493p = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f1488k;
        if (imageView != null) {
            if (this.f1495r || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.f1481d.mo1106z() || this.f1497t) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f1493p) {
            ImageView imageView = this.f1482e;
            if (imageView != null || drawable != null || this.f1493p) {
                if (imageView == null) {
                    m984f();
                }
                if (drawable != null || this.f1493p) {
                    ImageView imageView2 = this.f1482e;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f1482e.getVisibility() != 0) {
                        this.f1482e.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f1482e.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1484g.setText(charSequence);
            if (this.f1484g.getVisibility() != 0) {
                this.f1484g.setVisibility(0);
            }
        } else if (this.f1484g.getVisibility() != 8) {
            this.f1484g.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0483r1 v = C0483r1.m1946v(getContext(), attributeSet, C2219j.f6758b2, i, 0);
        this.f1490m = v.mo2320g(C2219j.f6768d2);
        this.f1491n = v.mo2327n(C2219j.f6763c2, -1);
        this.f1493p = v.mo2314a(C2219j.f6773e2, false);
        this.f1492o = context;
        this.f1494q = v.mo2320g(C2219j.f6778f2);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C2210a.f6470z, 0);
        this.f1495r = obtainStyledAttributes.hasValue(0);
        v.mo2333w();
        obtainStyledAttributes.recycle();
    }
}
