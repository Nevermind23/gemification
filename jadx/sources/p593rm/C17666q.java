package p593rm;

import android.view.View;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult;

/* renamed from: rm.q */
public final /* synthetic */ class C17666q implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OrderCardResult f49384d;

    /* renamed from: e */
    public final /* synthetic */ OrderCardResultActivity f49385e;

    public /* synthetic */ C17666q(OrderCardResult orderCardResult, OrderCardResultActivity orderCardResultActivity) {
        this.f49384d = orderCardResult;
        this.f49385e = orderCardResultActivity;
    }

    public final void onClick(View view) {
        OrderCardResultActivity.m52114a3(this.f49384d, this.f49385e, view);
    }
}
