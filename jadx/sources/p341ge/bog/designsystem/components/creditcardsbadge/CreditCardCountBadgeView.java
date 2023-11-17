package p341ge.bog.designsystem.components.creditcardsbadge;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10018t2;
import p601sg.C17779d;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.creditcardsbadge.CreditCardCountBadgeView */
public final class CreditCardCountBadgeView extends LayerView {

    /* renamed from: d */
    private final C10018t2 f39248d;

    /* renamed from: e */
    private int f39249e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreditCardCountBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(this.f39249e), 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.height_credit_cards_badge), 1073741824));
    }

    public final void setCardsNum(int i) {
        if (i == 1) {
            this.f39248d.f27582g.setVisibility(8);
            this.f39248d.f27581f.setVisibility(8);
            this.f39248d.f27580e.setVisibility(0);
            this.f39248d.f27580e.setText(String.valueOf(i));
        } else if (i == 2) {
            this.f39248d.f27582g.setVisibility(8);
            this.f39248d.f27580e.setVisibility(0);
            this.f39248d.f27581f.setVisibility(0);
            this.f39248d.f27580e.setText(String.valueOf(i));
            this.f39249e = C17779d.width_credit_cards_badge_two;
        } else if (i != 3) {
            this.f39248d.f27581f.setVisibility(0);
            this.f39248d.f27582g.setVisibility(0);
            this.f39248d.f27580e.setVisibility(0);
            this.f39249e = C17779d.width_credit_cards_badge_three_or_more;
            this.f39248d.f27580e.setText("3+");
        } else {
            this.f39248d.f27581f.setVisibility(0);
            this.f39248d.f27582g.setVisibility(0);
            this.f39248d.f27580e.setVisibility(0);
            this.f39248d.f27580e.setText(String.valueOf(i));
            this.f39249e = C17779d.width_credit_cards_badge_three_or_more;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditCardCountBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreditCardCountBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10018t2 c = C10018t2.m36746c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39248d = c;
        this.f39249e = C17779d.width_credit_cards_badge_one;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f50584w3);
            C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…CreditCardCountBadgeView)");
            setCardsNum(obtainStyledAttributes.getInt(C17787l.f50599x3, 1));
            obtainStyledAttributes.recycle();
        }
    }
}
