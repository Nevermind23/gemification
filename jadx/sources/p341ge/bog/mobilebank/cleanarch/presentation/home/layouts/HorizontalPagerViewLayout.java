package p341ge.bog.mobilebank.cleanarch.presentation.home.layouts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.layouts.HorizontalPagerViewLayout */
public final class HorizontalPagerViewLayout extends FrameLayout {

    /* renamed from: e */
    public static final C21712a f57989e = new C21712a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private ViewPager2 f57990d;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.home.layouts.HorizontalPagerViewLayout$a */
    public static final class C21712a {
        private C21712a() {
        }

        public /* synthetic */ C21712a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HorizontalPagerViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final ViewPager2 getViewPager() {
        return this.f57990d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((((float) (View.MeasureSpec.getSize(i) - C32343x.m95394I(48))) * 0.375f) + ((float) C32343x.m95394I(16))), 1073741824));
    }

    public final void setViewPager(ViewPager2 viewPager2) {
        C41536l.m120489i(viewPager2, "<set-?>");
        this.f57990d = viewPager2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HorizontalPagerViewLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalPagerViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        View.inflate(context, C10324m.layout_horizontal_pager, this);
        View findViewById = findViewById(C10322k.card_view_pager);
        C41536l.m120488h(findViewById, "findViewById(R.id.card_view_pager)");
        this.f57990d = (ViewPager2) findViewById;
    }
}
