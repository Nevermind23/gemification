package p341ge.bog.mobilebank.p975ui.views.widgets.cardview;

import android.view.View;
import java.util.LinkedHashMap;
import jg1.C41438c;
import p341ge.bog.mobilebank.p975ui.views.widgets.cardview.CardBuilder;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.c */
public final /* synthetic */ class C35790c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CardBuilder f86452d;

    /* renamed from: e */
    public final /* synthetic */ CardBuilder.C35782n f86453e;

    /* renamed from: f */
    public final /* synthetic */ LinkedHashMap f86454f;

    /* renamed from: g */
    public final /* synthetic */ C41438c f86455g;

    /* renamed from: h */
    public final /* synthetic */ int f86456h;

    /* renamed from: i */
    public final /* synthetic */ int f86457i;

    public /* synthetic */ C35790c(CardBuilder cardBuilder, CardBuilder.C35782n nVar, LinkedHashMap linkedHashMap, C41438c cVar, int i, int i2) {
        this.f86452d = cardBuilder;
        this.f86453e = nVar;
        this.f86454f = linkedHashMap;
        this.f86455g = cVar;
        this.f86456h = i;
        this.f86457i = i2;
    }

    public final void onClick(View view) {
        this.f86452d.lambda$setUpButtons$2(this.f86453e, this.f86454f, this.f86455g, this.f86456h, this.f86457i, view);
    }
}
