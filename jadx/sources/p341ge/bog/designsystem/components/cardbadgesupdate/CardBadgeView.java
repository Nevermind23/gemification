package p341ge.bog.designsystem.components.cardbadgesupdate;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p504lh.C16575a;
import p601sg.C17779d;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.cardbadgesupdate.CardBadgeView */
public final class CardBadgeView extends FrameLayout {

    /* renamed from: e */
    public static final C13204a f38946e = new C13204a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C16575a f38947d;

    /* renamed from: ge.bog.designsystem.components.cardbadgesupdate.CardBadgeView$a */
    public static final class C13204a {
        private C13204a() {
        }

        public /* synthetic */ C13204a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C16575a mo35009a(int i) {
            boolean z;
            for (C16575a aVar : C16575a.values()) {
                if (aVar.ordinal() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CardBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.new_card_badge_width), 1073741824), View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.new_card_badge_height), 1073741824));
    }

    public final void setCard(C16575a aVar) {
        C41536l.m120489i(aVar, "card");
        removeAllViews();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(imageView);
        imageView.setImageResource(aVar.mo43716b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C16575a aVar = C16575a.VISA;
        this.f38947d = aVar;
        int[] iArr = C17787l.f50619y8;
        C41536l.m120488h(iArr, "NewCardBadgeView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        C16575a a = f38946e.mo35009a(obtainStyledAttributes.getInt(C17787l.f50634z8, 0));
        aVar = a != null ? a : aVar;
        this.f38947d = aVar;
        setCard(aVar);
        obtainStyledAttributes.recycle();
    }
}
