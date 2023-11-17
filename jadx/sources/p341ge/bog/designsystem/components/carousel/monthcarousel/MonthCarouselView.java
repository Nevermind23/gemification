package p341ge.bog.designsystem.components.carousel.monthcarousel;

import af1.C40303i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Date;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C9880b4;
import p560ph.C17347a;
import p560ph.C17359g;
import p642vh.C18360h;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.carousel.monthcarousel.MonthCarouselView */
public final class MonthCarouselView extends C17359g {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f39005n = {C41520a0.m120439e(new C41539o(MonthCarouselView.class, "endDate", "getEndDate()Ljava/util/Date;", 0))};

    /* renamed from: k */
    private final C9880b4 f39006k;

    /* renamed from: l */
    private final C18360h f39007l;

    /* renamed from: m */
    private C13218a f39008m;

    /* renamed from: ge.bog.designsystem.components.carousel.monthcarousel.MonthCarouselView$a */
    public interface C13218a {
        /* renamed from: a */
        Date mo35113a(int i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MonthCarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final Date getEndDate() {
        return this.f39007l.getValue(this, f39005n[0]);
    }

    private final void setEndDate(Date date) {
        this.f39007l.setValue(this, f39005n[0], date);
    }

    /* renamed from: f */
    public void mo35111f(int i) {
        Date a;
        super.mo35111f(i);
        C13218a aVar = this.f39008m;
        if (aVar == null || (a = aVar.mo35113a(i)) == null) {
            throw new IllegalStateException("EndDateCalculator interface must be implemented");
        }
        setEndDate(a);
    }

    public final void setEndDateCalculator(C13218a aVar) {
        C41536l.m120489i(aVar, "endDateCalculator");
        this.f39008m = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MonthCarouselView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MonthCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9880b4 c = C9880b4.m36240c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39006k = c;
        TextView textView = c.f26813f;
        C41536l.m120488h(textView, "binding.endDateValueText");
        this.f39007l = new C18360h(textView, "dd.MM.yyyy", C18368l.m62759h(this));
        RecyclerView recyclerView = c.f26814g;
        C41536l.m120488h(recyclerView, "binding.recyclerView");
        mo44792d(recyclerView, C17347a.C17348a.MONTH);
    }
}
