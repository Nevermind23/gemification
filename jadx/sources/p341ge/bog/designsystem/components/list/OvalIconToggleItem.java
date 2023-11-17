package p341ge.bog.designsystem.components.list;

import af1.C40303i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.toggle.ToggleView;
import p352ak.C9979o;
import p601sg.C17779d;
import p601sg.C17787l;
import p615tg.C17959a;
import p642vh.C18355e0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.list.OvalIconToggleItem */
public final class OvalIconToggleItem extends ListItem {

    /* renamed from: u */
    static final /* synthetic */ C40303i[] f39693u;

    /* renamed from: o */
    private final C9979o f39694o;

    /* renamed from: p */
    private final C18355e0 f39695p;

    /* renamed from: q */
    private final C18355e0 f39696q;

    /* renamed from: r */
    private final C18355e0 f39697r;

    /* renamed from: s */
    private final C18355e0 f39698s;

    /* renamed from: t */
    private final C18355e0 f39699t;

    /* renamed from: ge.bog.designsystem.components.list.OvalIconToggleItem$a */
    public interface C13356a {
    }

    static {
        Class<OvalIconToggleItem> cls = OvalIconToggleItem.class;
        f39693u = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "header", "getHeader()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "description", "getDescription()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "amountLabel", "getAmountLabel()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "amountValue", "getAmountValue()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "amountDesc", "getAmountDesc()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OvalIconToggleItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50282b(OvalIconToggleItem ovalIconToggleItem, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(ovalIconToggleItem, "this$0");
        ovalIconToggleItem.getClass();
    }

    private final CharSequence getAmountDesc() {
        return this.f39699t.getValue(this, f39693u[4]);
    }

    private final CharSequence getAmountLabel() {
        return this.f39697r.getValue(this, f39693u[2]);
    }

    private final CharSequence getAmountValue() {
        return this.f39698s.getValue(this, f39693u[3]);
    }

    private final void setAmountDesc(CharSequence charSequence) {
        this.f39699t.setValue(this, f39693u[4], charSequence);
    }

    private final void setAmountLabel(CharSequence charSequence) {
        this.f39697r.setValue(this, f39693u[2], charSequence);
    }

    private final void setAmountValue(CharSequence charSequence) {
        this.f39698s.setValue(this, f39693u[3], charSequence);
    }

    /* renamed from: c */
    public final void mo35998c(boolean z) {
        ToggleView toggleView = (ToggleView) getRightItemView();
        if (toggleView != null) {
            toggleView.setChecked(z);
        }
    }

    public final CharSequence getDescription() {
        return this.f39696q.getValue(this, f39693u[1]);
    }

    public final CharSequence getHeader() {
        return this.f39695p.getValue(this, f39693u[0]);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        ViewParent viewParent;
        View view;
        ViewGroup.LayoutParams layoutParams;
        super.onFinishInflate();
        setVisibleBottomItemView(false);
        View bottomItemView = getBottomItemView();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (bottomItemView != null) {
            viewParent = bottomItemView.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view = (View) viewParent;
        } else {
            view = null;
        }
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, 0);
        }
        ToggleView toggleView = (ToggleView) getRightItemView();
        if (toggleView != null) {
            toggleView.setDuplicateParentStateEnabled(false);
            toggleView.setOnCheckedChangeListener(new C13366c(this));
        }
    }

    public final void setDescription(CharSequence charSequence) {
        this.f39696q.setValue(this, f39693u[1], charSequence);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ToggleView toggleView = (ToggleView) getRightItemView();
        if (toggleView != null) {
            toggleView.setEnabled(z);
        }
    }

    public final void setHeader(CharSequence charSequence) {
        this.f39695p.setValue(this, f39693u[0], charSequence);
    }

    public final void setIcon(Image image) {
        C41536l.m120489i(image, "image");
        AppCompatImageView appCompatImageView = this.f39694o.f27332h;
        C41536l.m120488h(appCompatImageView, "binding.icon");
        C18368l.m62746A(appCompatImageView, image, (C43075l) null, 2, (Object) null);
    }

    public final void setOnCheckedChangedListener(C13356a aVar) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OvalIconToggleItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setAmountDesc(String str) {
        C41536l.m120489i(str, "amountDesc");
        setVisibleBottomItemView(true);
        this.f39694o.f27329e.setVisibility(0);
        setAmountDesc((CharSequence) str);
    }

    public final void setAmountLabel(String str) {
        setVisibleBottomItemView(true);
        setAmountLabel((CharSequence) str);
    }

    public final void setAmountValue(Amount amount) {
        C41536l.m120489i(amount, "amount");
        setAmountValue((CharSequence) C17959a.m61877a(amount));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OvalIconToggleItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9979o c = C9979o.m36601c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39694o = c;
        AppCompatTextView appCompatTextView = c.f27336l;
        C41536l.m120488h(appCompatTextView, "binding.title");
        this.f39695p = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f27337m;
        C41536l.m120488h(appCompatTextView2, "binding.titleDescription");
        this.f39696q = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView3 = c.f27330f;
        C41536l.m120488h(appCompatTextView3, "binding.amountLabel");
        this.f39697r = new C18355e0(appCompatTextView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView4 = c.f27331g;
        C41536l.m120488h(appCompatTextView4, "binding.amountValue");
        this.f39698s = new C18355e0(appCompatTextView4, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView5 = c.f27329e;
        C41536l.m120488h(appCompatTextView5, "binding.amountDesc");
        this.f39699t = new C18355e0(appCompatTextView5, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        Resources resources = getResources();
        int i2 = C17779d.f49645S1;
        setPadding(getPaddingLeft(), resources.getDimensionPixelSize(i2), getPaddingRight(), getResources().getDimensionPixelSize(i2));
        int[] iArr = C17787l.f50400k9;
        C41536l.m120488h(iArr, "OvalIconToggleItem");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setHeader(obtainStyledAttributes.getString(C17787l.f50464o9));
        setDescription(obtainStyledAttributes.getString(C17787l.f50448n9));
        String string = obtainStyledAttributes.getString(C17787l.f50432m9);
        if (string != null) {
            setAmountLabel(string);
        }
        String string2 = obtainStyledAttributes.getString(C17787l.f50416l9);
        if (string2 != null) {
            C41536l.m120488h(string2, "amountDesc");
            setAmountDesc(string2);
        }
        obtainStyledAttributes.recycle();
    }
}
