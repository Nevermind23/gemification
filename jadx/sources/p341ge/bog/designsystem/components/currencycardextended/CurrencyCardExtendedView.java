package p341ge.bog.designsystem.components.currencycardextended;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import java.math.RoundingMode;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.changebadge.ChangeBadgeView;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10046x2;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18362i;
import p642vh.C18368l;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.currencycardextended.CurrencyCardExtendedView */
public final class CurrencyCardExtendedView extends LayerView {

    /* renamed from: o */
    public static final C13287a f39297o = new C13287a((DefaultConstructorMarker) null);

    /* renamed from: p */
    static final /* synthetic */ C40303i[] f39298p;

    /* renamed from: d */
    private final C10046x2 f39299d;

    /* renamed from: e */
    private final C18355e0 f39300e;

    /* renamed from: f */
    private final C18355e0 f39301f;

    /* renamed from: g */
    private final C18355e0 f39302g;

    /* renamed from: h */
    private final C18355e0 f39303h;

    /* renamed from: i */
    private final C18355e0 f39304i;

    /* renamed from: j */
    private final C18355e0 f39305j;

    /* renamed from: k */
    private final C18362i f39306k;

    /* renamed from: l */
    private final C18362i f39307l;

    /* renamed from: m */
    private final C18362i f39308m;

    /* renamed from: n */
    private final C18362i f39309n;

    /* renamed from: ge.bog.designsystem.components.currencycardextended.CurrencyCardExtendedView$a */
    public static final class C13287a {
        private C13287a() {
        }

        public /* synthetic */ C13287a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Class<CurrencyCardExtendedView> cls = CurrencyCardExtendedView.class;
        f39298p = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "currencyName", "getCurrencyName()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "sellBuyHeaderText", "getSellBuyHeaderText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "rateHeaderText", "getRateHeaderText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "sellSubtitleText", "getSellSubtitleText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "buySubtitleText", "getBuySubtitleText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "additionalRateTitleText", "getAdditionalRateTitleText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "rate", "getRate()F", 0)), C41520a0.m120439e(new C41539o(cls, "buyRate", "getBuyRate()F", 0)), C41520a0.m120439e(new C41539o(cls, "sellRate", "getSellRate()F", 0)), C41520a0.m120439e(new C41539o(cls, "additionalRate", "getAdditionalRate()F", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CurrencyCardExtendedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
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
        setLayerStyle(C17786k.LayerRadius12Shadow30);
    }

    public final float getAdditionalRate() {
        return this.f39309n.getValue(this, f39298p[9]).floatValue();
    }

    public final CharSequence getAdditionalRateTitleText() {
        return this.f39305j.getValue(this, f39298p[5]);
    }

    public final float getBuyRate() {
        return this.f39307l.getValue(this, f39298p[7]).floatValue();
    }

    public final CharSequence getBuySubtitleText() {
        return this.f39304i.getValue(this, f39298p[4]);
    }

    public final CurrencyBadgeView getCurrencyBadge() {
        CurrencyBadgeView currencyBadgeView = this.f39299d.f27734k;
        C41536l.m120488h(currencyBadgeView, "binding.currencyBadgeView");
        return currencyBadgeView;
    }

    public final CharSequence getCurrencyName() {
        return this.f39300e.getValue(this, f39298p[0]);
    }

    public final float getRate() {
        return this.f39306k.getValue(this, f39298p[6]).floatValue();
    }

    public final ChangeBadgeView getRateChangeBadge() {
        ChangeBadgeView changeBadgeView = this.f39299d.f27738o;
        C41536l.m120488h(changeBadgeView, "binding.rateChangeBadge");
        return changeBadgeView;
    }

    public final CharSequence getRateHeaderText() {
        return this.f39302g.getValue(this, f39298p[2]);
    }

    public final CharSequence getSellBuyHeaderText() {
        return this.f39301f.getValue(this, f39298p[1]);
    }

    public final float getSellRate() {
        return this.f39308m.getValue(this, f39298p[8]).floatValue();
    }

    public final CharSequence getSellSubtitleText() {
        return this.f39303h.getValue(this, f39298p[3]);
    }

    public final void setAdditionalRate(float f) {
        this.f39309n.mo46146b(this, f39298p[9], f);
    }

    public final void setAdditionalRateTitleText(CharSequence charSequence) {
        this.f39305j.setValue(this, f39298p[5], charSequence);
    }

    public final void setAdditionalRateVisibility(boolean z) {
        this.f39299d.f27729f.setVisibility(z ? 0 : 8);
    }

    public final void setBuyRate(float f) {
        this.f39307l.mo46146b(this, f39298p[7], f);
    }

    public final void setBuySubtitleText(CharSequence charSequence) {
        this.f39304i.setValue(this, f39298p[4], charSequence);
    }

    public final void setCurrencyName(CharSequence charSequence) {
        this.f39300e.setValue(this, f39298p[0], charSequence);
    }

    public final void setRate(float f) {
        this.f39306k.mo46146b(this, f39298p[6], f);
    }

    public final void setRateHeaderText(CharSequence charSequence) {
        this.f39302g.setValue(this, f39298p[2], charSequence);
    }

    public final void setSellBuyHeaderText(CharSequence charSequence) {
        this.f39301f.setValue(this, f39298p[1], charSequence);
    }

    public final void setSellRate(float f) {
        this.f39308m.mo46146b(this, f39298p[8], f);
    }

    public final void setSellSubtitleText(CharSequence charSequence) {
        this.f39303h.setValue(this, f39298p[3], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrencyCardExtendedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CurrencyCardExtendedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10046x2 d = C10046x2.m36848d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n        LayoutI…ontext), this, true\n    )");
        this.f39299d = d;
        TextView textView = d.f27735l;
        C41536l.m120488h(textView, "binding.currencyTitle");
        this.f39300e = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = d.f27740q;
        C41536l.m120488h(textView2, "binding.sellBuyHeader");
        this.f39301f = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView3 = d.f27739p;
        C41536l.m120488h(textView3, "binding.rateHeader");
        this.f39302g = new C18355e0(textView3, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView4 = d.f27742s;
        C41536l.m120488h(textView4, "binding.sellRateSubtitle");
        this.f39303h = new C18355e0(textView4, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView5 = d.f27733j;
        C41536l.m120488h(textView5, "binding.buyRateSubtitle");
        this.f39304i = new C18355e0(textView5, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView6 = d.f27731h;
        C41536l.m120488h(textView6, "binding.additionalRateTitle");
        this.f39305j = new C18355e0(textView6, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView7 = d.f27737n;
        C41536l.m120488h(textView7, "binding.officialRate");
        this.f39306k = new C18362i(textView7, "0.0000", (RoundingMode) null, 4, (DefaultConstructorMarker) null);
        TextView textView8 = d.f27732i;
        C41536l.m120488h(textView8, "binding.buyRate");
        this.f39307l = new C18362i(textView8, "0.0000", (RoundingMode) null, 4, (DefaultConstructorMarker) null);
        TextView textView9 = d.f27741r;
        C41536l.m120488h(textView9, "binding.sellRate");
        this.f39308m = new C18362i(textView9, "0.0000", (RoundingMode) null, 4, (DefaultConstructorMarker) null);
        TextView textView10 = d.f27728e;
        C41536l.m120488h(textView10, "binding.additionalRate");
        this.f39309n = new C18362i(textView10, "0.0000", (RoundingMode) null, 4, (DefaultConstructorMarker) null);
        setLayerStyle(C17786k.LayerRadius12Shadow20);
        setBackgroundColor(C18368l.m62755d(context2, C17777b.f49596k));
        int[] iArr = C17787l.f50069P3;
        C41536l.m120488h(iArr, "CurrencyCardExtendedView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setSellBuyHeaderText(obtainStyledAttributes.getString(C17787l.f50129T3));
        setRateHeaderText(obtainStyledAttributes.getString(C17787l.f50114S3));
        setSellSubtitleText(obtainStyledAttributes.getString(C17787l.f50144U3));
        setBuySubtitleText(obtainStyledAttributes.getString(C17787l.f50099R3));
        setAdditionalRateTitleText(obtainStyledAttributes.getString(C17787l.f50084Q3));
        obtainStyledAttributes.recycle();
    }
}
