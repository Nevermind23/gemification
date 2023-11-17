package p341ge.bog.mobilebank.p975ui.views.widgets.cardview;

import android.view.MenuItem;
import androidx.appcompat.widget.C0430g1;
import java.util.LinkedHashMap;
import jg1.C41438c;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.a */
public final /* synthetic */ class C35788a implements C0430g1.C0433c {

    /* renamed from: d */
    public final /* synthetic */ CardBuilder f86442d;

    /* renamed from: e */
    public final /* synthetic */ LinkedHashMap f86443e;

    /* renamed from: f */
    public final /* synthetic */ C41438c f86444f;

    /* renamed from: g */
    public final /* synthetic */ int f86445g;

    /* renamed from: h */
    public final /* synthetic */ int f86446h;

    public /* synthetic */ C35788a(CardBuilder cardBuilder, LinkedHashMap linkedHashMap, C41438c cVar, int i, int i2) {
        this.f86442d = cardBuilder;
        this.f86443e = linkedHashMap;
        this.f86444f = cVar;
        this.f86445g = i;
        this.f86446h = i2;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f86442d.lambda$setUpButtons$1(this.f86443e, this.f86444f, this.f86445g, this.f86446h, menuItem);
    }
}
