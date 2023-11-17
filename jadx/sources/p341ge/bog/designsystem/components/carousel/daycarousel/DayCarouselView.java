package p341ge.bog.designsystem.components.carousel.daycarousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C10060z2;
import p560ph.C17347a;
import p560ph.C17359g;

/* renamed from: ge.bog.designsystem.components.carousel.daycarousel.DayCarouselView */
public final class DayCarouselView extends C17359g {

    /* renamed from: k */
    private final C10060z2 f39004k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DayCarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DayCarouselView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DayCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10060z2 c = C10060z2.m36901c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39004k = c;
        RecyclerView recyclerView = c.f27811e;
        C41536l.m120488h(recyclerView, "binding.recyclerView");
        mo44792d(recyclerView, C17347a.C17348a.DAY);
    }
}
