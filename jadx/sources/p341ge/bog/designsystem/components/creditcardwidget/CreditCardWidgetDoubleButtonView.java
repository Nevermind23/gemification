package p341ge.bog.designsystem.components.creditcardwidget;

import af1.C40303i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C10032v2;
import p601sg.C17777b;
import p601sg.C17785j;
import p601sg.C17786k;
import p642vh.C18365j0;
import p642vh.C18368l;
import p683yh.C18917a;
import p683yh.C18918b;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetDoubleButtonView */
public final class CreditCardWidgetDoubleButtonView extends LayerView {

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f39277i = {C41520a0.m120439e(new C41539o(CreditCardWidgetDoubleButtonView.class, "isDigitalCard", "isDigitalCard()Z", 0))};

    /* renamed from: d */
    private final C10032v2 f39278d;

    /* renamed from: e */
    private final C18365j0 f39279e;

    /* renamed from: f */
    private final Button f39280f;

    /* renamed from: g */
    private final Button f39281g;

    /* renamed from: h */
    private View.OnClickListener f39282h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreditCardWidgetDoubleButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m49998b(CreditCardWidgetDoubleButtonView creditCardWidgetDoubleButtonView, View view) {
        C41536l.m120489i(creditCardWidgetDoubleButtonView, "this$0");
        View.OnClickListener onClickListener = creditCardWidgetDoubleButtonView.f39282h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private final void setDigitalCard(boolean z) {
        this.f39279e.mo46151c(this, f39277i[0], z);
    }

    public final Button getFirstButton() {
        return this.f39280f;
    }

    public final Button getSecondButton() {
        return this.f39281g;
    }

    public final void setChevronClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "clickListener");
        this.f39282h = onClickListener;
    }

    public final void setInfoData(C18917a aVar) {
        C41536l.m120489i(aVar, "creditCardInfo");
        this.f39278d.f27648f.setText(aVar.mo46922d());
        C10032v2 v2Var = this.f39278d;
        AppCompatTextView appCompatTextView = v2Var.f27649g;
        Context context = v2Var.mo3946b().getContext();
        int i = C17785j.ds_last_four_digits;
        boolean z = true;
        appCompatTextView.setText(context.getString(i, new Object[]{aVar.mo46931k()}));
        if (!aVar.mo46932l()) {
            this.f39278d.f27658p.setVisibility(8);
            this.f39278d.f27657o.setVisibility(0);
            this.f39278d.f27657o.setType(InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_NEGATIVE);
            InfoBadgeView infoBadgeView = this.f39278d.f27657o;
            C41536l.m120488h(infoBadgeView, "binding.infoBadge");
            InfoBadgeView.m50233e(infoBadgeView, getContext().getString(C17785j.ds_inactive), (String) null, (String) null, 6, (Object) null);
            C10032v2 v2Var2 = this.f39278d;
            v2Var2.f27649g.setText(v2Var2.mo3946b().getContext().getString(i, new Object[]{"****"}));
        } else if (aVar.mo46933m()) {
            this.f39278d.f27658p.setVisibility(8);
            this.f39278d.f27657o.setVisibility(0);
            this.f39278d.f27657o.setType(InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_NEGATIVE);
            InfoBadgeView infoBadgeView2 = this.f39278d.f27657o;
            C41536l.m120488h(infoBadgeView2, "binding.infoBadge");
            InfoBadgeView.m50233e(infoBadgeView2, getContext().getString(C17785j.ds_blocked), (String) null, (String) null, 6, (Object) null);
            if (aVar.mo46925f() || aVar.mo46926g() != null) {
                this.f39278d.f27647e.setVisibility(0);
            } else {
                this.f39278d.f27647e.setVisibility(8);
            }
        } else if (aVar.mo46925f()) {
            this.f39278d.f27658p.setVisibility(8);
            this.f39278d.f27657o.setVisibility(0);
            this.f39278d.f27657o.setType(InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_NEGATIVE);
            InfoBadgeView infoBadgeView3 = this.f39278d.f27657o;
            C41536l.m120488h(infoBadgeView3, "binding.infoBadge");
            InfoBadgeView.m50233e(infoBadgeView3, getContext().getString(C17785j.f49817f), (String) null, (String) null, 6, (Object) null);
            this.f39278d.f27647e.setVisibility(8);
        } else if (aVar.mo46926g() != null) {
            this.f39278d.f27658p.setVisibility(8);
            this.f39278d.f27657o.setVisibility(0);
            this.f39278d.f27657o.setType(InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_NEGATIVE);
            InfoBadgeView infoBadgeView4 = this.f39278d.f27657o;
            C41536l.m120488h(infoBadgeView4, "binding.infoBadge");
            InfoBadgeView.m50233e(infoBadgeView4, getContext().getString(C17785j.ds_card_expires_in, new Object[]{aVar.mo46926g()}), (String) null, (String) null, 6, (Object) null);
            this.f39278d.f27647e.setVisibility(8);
        } else {
            if (aVar.mo46930j().length() <= 0) {
                z = false;
            }
            if (z) {
                this.f39278d.f27658p.setVisibility(0);
                this.f39278d.f27657o.setVisibility(4);
                this.f39278d.f27658p.setText(aVar.mo46930j());
            } else {
                this.f39278d.f27658p.setVisibility(4);
                this.f39278d.f27657o.setVisibility(4);
            }
        }
        AppCompatImageView appCompatImageView = this.f39278d.f27651i;
        C41536l.m120488h(appCompatImageView, "binding.creditCardImage");
        C18368l.m62746A(appCompatImageView, aVar.mo46927h(), (C43075l) null, 2, (Object) null);
        setDigitalCard(aVar.mo46934n());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditCardWidgetDoubleButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreditCardWidgetDoubleButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C10032v2 d = C10032v2.m36797d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context), this, true)");
        this.f39278d = d;
        NotificationBadgeView notificationBadgeView = d.f27654l;
        C41536l.m120488h(notificationBadgeView, "binding.digitalImageBadge");
        this.f39279e = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        Button button = d.f27656n;
        C41536l.m120488h(button, "binding.firstButton");
        this.f39280f = button;
        Button button2 = d.f27659q;
        C41536l.m120488h(button2, "binding.secondButton");
        this.f39281g = button2;
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        setLayerStyle(C17786k.f49834t);
        d.f27650h.setOnClickListener(new C18918b(this));
    }
}
