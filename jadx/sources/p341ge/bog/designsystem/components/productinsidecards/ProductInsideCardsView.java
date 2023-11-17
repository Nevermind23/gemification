package p341ge.bog.designsystem.components.productinsidecards;

import af1.C40303i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import he1.C41217g;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p352ak.C10041w4;
import p561pi.C17365a;
import p561pi.C17367b;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17786k;
import p642vh.C18365j0;
import p642vh.C18368l;
import p669xh.C18763a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.productinsidecards.ProductInsideCardsView */
public final class ProductInsideCardsView extends LayerView {

    /* renamed from: h */
    static final /* synthetic */ C40303i[] f40246h = {C41520a0.m120439e(new C41539o(ProductInsideCardsView.class, "isFavorite", "isFavorite()Z", 0))};

    /* renamed from: d */
    private final C41217g f40247d;

    /* renamed from: e */
    private final C10041w4 f40248e;

    /* renamed from: f */
    private final C18365j0 f40249f;

    /* renamed from: g */
    private final HideableAmountView f40250g;

    /* renamed from: ge.bog.designsystem.components.productinsidecards.ProductInsideCardsView$a */
    static final class C13498a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13498a f40251d = new C13498a();

        C13498a() {
            super(0);
        }

        /* renamed from: b */
        public final C17367b invoke() {
            C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            bVar.mo44810m("###,##0.00");
            return bVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProductInsideCardsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50626a(InfoBadgeView.C13346b bVar, String str, String str2, String str3) {
        Context context = getContext();
        C41536l.m120488h(context, "context");
        InfoBadgeView infoBadgeView = new InfoBadgeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        infoBadgeView.setType(bVar);
        infoBadgeView.mo35833d(str, str3, str2);
        this.f40248e.f27703i.addView(infoBadgeView);
    }

    private final C17365a getNumeralFormatter() {
        return (C17365a) this.f40247d.getValue();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C41536l.m120488h(drawableState, "states");
        if (C41333m.m119793r(drawableState, 16842919)) {
            setBackgroundResource(C17778c.f49638w);
            setLayerStyle(C17786k.LayerRadius12Shadow0);
            return;
        }
        Context context = getContext();
        C41536l.m120488h(context, "context");
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        setLayerStyle(C17786k.LayerRadius12Shadow20);
    }

    public final boolean getShowAmount() {
        return this.f40250g.getShowAmount();
    }

    public final void setCreditCards(List<? extends C18763a> list) {
        C41536l.m120489i(list, "cards");
        this.f40248e.f27702h.setCards(list);
    }

    public final void setCurrencies(List<String> list) {
        C41536l.m120489i(list, "currencies");
        this.f40248e.f27703i.setVisibility(0);
        this.f40248e.f27703i.removeAllViews();
        for (String a : list) {
            m50626a(InfoBadgeView.C13346b.INTERACTIVE_CURRENCY_BADGE_SMALL, (String) null, a, (String) null);
        }
    }

    public final void setFavorite(boolean z) {
        this.f40249f.mo46151c(this, f40246h[0], z);
    }

    public final void setShowAmount(boolean z) {
        this.f40250g.setShowAmount(z);
    }

    public final void setTitle(String str) {
        C41536l.m120489i(str, "title");
        this.f40248e.f27701g.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductInsideCardsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductInsideCardsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f40247d = C41219i.m119470b(C13498a.f40251d);
        C10041w4 d = C10041w4.m36829d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f40248e = d;
        AppCompatImageView appCompatImageView = d.f27704j;
        C41536l.m120488h(appCompatImageView, "binding.isFavouriteIcon");
        this.f40249f = new C18365j0(appCompatImageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        HideableAmountView hideableAmountView = d.f27700f;
        C41536l.m120488h(hideableAmountView, "binding.amountTextHideable");
        this.f40250g = hideableAmountView;
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        setLayerStyle(C17786k.LayerRadius12Shadow20);
    }
}
