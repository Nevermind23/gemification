package p341ge.bog.designsystem.components.creditcardwidget;

import af1.C40303i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.C2394j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C10025u2;
import p601sg.C17777b;
import p601sg.C17780e;
import p601sg.C17786k;
import p642vh.C18365j0;
import p642vh.C18368l;
import p683yh.C18917a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView */
public final class CreditCardWidgetBannerView extends LayerView {

    /* renamed from: f */
    static final /* synthetic */ C40303i[] f39273f = {C41520a0.m120439e(new C41539o(CreditCardWidgetBannerView.class, "isDigitalCard", "isDigitalCard()Z", 0))};

    /* renamed from: d */
    private final C10025u2 f39274d;

    /* renamed from: e */
    private final C18365j0 f39275e;

    /* renamed from: ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView$a */
    static final class C13283a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13283a f39276d = new C13283a();

        C13283a() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2247a c0 = jVar.mo7220c0(C17780e.thumbnail_card);
            C41536l.m120488h(c0, "placeholder(R.drawable.thumbnail_card)");
            return (C2394j) c0;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreditCardWidgetBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final void setDigitalCard(boolean z) {
        this.f39275e.mo46151c(this, f39273f[0], z);
    }

    public final void setInfoData(C18917a aVar) {
        int i;
        C41536l.m120489i(aVar, "creditCardInfo");
        C10025u2 u2Var = this.f39274d;
        u2Var.f27612f.setText(aVar.mo46923e());
        u2Var.f27611e.setText(aVar.mo46922d());
        AppCompatImageView appCompatImageView = u2Var.f27613g;
        C41536l.m120488h(appCompatImageView, "creditCardImage");
        C18368l.m62777z(appCompatImageView, aVar.mo46927h(), C13283a.f39276d);
        setDigitalCard(aVar.mo46934n());
        u2Var.f27617k.setText(aVar.mo46930j());
        AppCompatTextView appCompatTextView = u2Var.f27617k;
        Integer i2 = aVar.mo46929i();
        if (i2 != null) {
            i = i2.intValue();
        } else {
            Context context = u2Var.mo3946b().getContext();
            C41536l.m120488h(context, "root.context");
            i = C18368l.m62755d(context, C17777b.f49603w);
        }
        appCompatTextView.setTextColor(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditCardWidgetBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreditCardWidgetBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10025u2 d = C10025u2.m36770d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39274d = d;
        NotificationBadgeView notificationBadgeView = d.f27616j;
        C41536l.m120488h(notificationBadgeView, "binding.digitalImageBadge");
        this.f39275e = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        setLayerStyle(C17786k.LayerRadius12Shadow30);
    }
}
