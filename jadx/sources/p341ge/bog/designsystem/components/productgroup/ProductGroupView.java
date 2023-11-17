package p341ge.bog.designsystem.components.productgroup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10027u4;
import p352ak.C10034v4;
import p379cj.C10447a;
import p601sg.C17777b;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.productgroup.ProductGroupView */
public final class ProductGroupView extends LayerView {

    /* renamed from: d */
    private C10447a f40190d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProductGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    public final void mo36581a(String str, Integer num, Integer num2) {
        C41536l.m120489i(str, "text");
        this.f40190d.mo27123o(str, num, num2);
    }

    public final C10447a.C10448a getDrawableType() {
        return this.f40190d.mo27110b();
    }

    public final Drawable getIcon() {
        return this.f40190d.mo27111c();
    }

    public final Integer getIconTint() {
        return this.f40190d.mo27112d();
    }

    public final String getImageUrl() {
        return this.f40190d.mo27113e();
    }

    public final CharSequence getTitle() {
        return this.f40190d.mo27114f();
    }

    public final void setAmount(Amount amount) {
        C41536l.m120489i(amount, "amount");
        this.f40190d.mo27115g(amount);
    }

    public final void setBadgeVisible(boolean z) {
        this.f40190d.mo27117i(z);
    }

    public final void setDrawableType(C10447a.C10448a aVar) {
        this.f40190d.mo27118j(aVar);
    }

    public final void setIcon(Drawable drawable) {
        this.f40190d.mo27119k(drawable);
    }

    public final void setIconTint(Integer num) {
        this.f40190d.mo27121m(num);
    }

    public final void setImageUrl(String str) {
        this.f40190d.mo27122n(str);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f40190d.mo27124p(charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductGroupView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10447a aVar;
        C41536l.m120489i(context, "context");
        setLayerStyle(C17786k.f49834t);
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        setForeground(C0767a.m2895e(context, C17780e.selector_product_group));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f50165V9, 0, 0);
        try {
            LayoutInflater from = LayoutInflater.from(context);
            int i2 = obtainStyledAttributes.getInt(C17787l.f50241aa, 0);
            if (i2 == 0) {
                C10034v4 d = C10034v4.m36804d(from, this, true);
                C41536l.m120488h(d, "inflate(\n               …                        )");
                aVar = new C10447a.C10453c(d);
            } else if (i2 == 1) {
                C10027u4 d2 = C10027u4.m36777d(from, this, true);
                C41536l.m120488h(d2, "inflate(\n               …                        )");
                aVar = new C10447a.C10450b(d2);
            } else {
                throw new IllegalStateException("Unknown Product Group type");
            }
            this.f40190d = aVar;
            int i3 = obtainStyledAttributes.getInt(C17787l.f50225Z9, 0);
            setIcon(obtainStyledAttributes.getDrawable(C17787l.f50180W9));
            setDrawableType(C10447a.C10448a.f29752e.mo27126a(i3));
            setTitle(obtainStyledAttributes.getString(C17787l.f50257ba));
            setIconTint(Integer.valueOf(obtainStyledAttributes.getColor(C17787l.f50195X9, 0)));
            setBadgeVisible(obtainStyledAttributes.getBoolean(C17787l.f50210Y9, false));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
