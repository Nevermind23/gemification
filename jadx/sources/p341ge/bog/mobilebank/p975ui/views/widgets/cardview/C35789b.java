package p341ge.bog.mobilebank.p975ui.views.widgets.cardview;

import android.view.View;
import java.util.Map;
import jg1.C41438c;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.b */
public final /* synthetic */ class C35789b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CardBuilder f86447d;

    /* renamed from: e */
    public final /* synthetic */ Map.Entry f86448e;

    /* renamed from: f */
    public final /* synthetic */ C41438c f86449f;

    /* renamed from: g */
    public final /* synthetic */ int f86450g;

    /* renamed from: h */
    public final /* synthetic */ int f86451h;

    public /* synthetic */ C35789b(CardBuilder cardBuilder, Map.Entry entry, C41438c cVar, int i, int i2) {
        this.f86447d = cardBuilder;
        this.f86448e = entry;
        this.f86449f = cVar;
        this.f86450g = i;
        this.f86451h = i2;
    }

    public final void onClick(View view) {
        this.f86447d.lambda$setUpButtons$0(this.f86448e, this.f86449f, this.f86450g, this.f86451h, view);
    }
}
