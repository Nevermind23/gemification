package p341ge.bog.designsystem.components.rateview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C10055y4;
import p436gj.C15280a;
import p436gj.C15281b;
import p436gj.C15286d;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.rateview.RateStarView */
public final class RateStarView extends FrameLayout {

    /* renamed from: d */
    private final C10055y4 f40270d;

    /* renamed from: e */
    private final C41217g f40271e;

    /* renamed from: f */
    private C15280a f40272f;

    /* renamed from: ge.bog.designsystem.components.rateview.RateStarView$a */
    static final class C13501a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13501a f40273d = new C13501a();

        C13501a() {
            super(0);
        }

        /* renamed from: b */
        public final C15281b invoke() {
            return new C15281b();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RateStarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50636b(RateStarView rateStarView, int i) {
        C41536l.m120489i(rateStarView, "this$0");
        C15280a aVar = rateStarView.f40272f;
        if (aVar != null) {
            aVar.mo35632a(i);
        }
    }

    private final C15281b getRateAdapter() {
        return (C15281b) this.f40271e.getValue();
    }

    public final void setChangeRateEnabled(boolean z) {
        getRateAdapter().mo42364k(z);
    }

    public final void setRatingChosenListener(C15280a aVar) {
        this.f40272f = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RateStarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RateStarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10055y4 d = C10055y4.m36882d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40270d = d;
        this.f40271e = C41219i.m119470b(C13501a.f40273d);
        d.f27780e.setAdapter(getRateAdapter());
        getRateAdapter().mo42365l(new C15286d(this));
    }
}
