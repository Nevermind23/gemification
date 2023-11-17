package hp0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import ap0.C10135h;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import o31.C37626z;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p668xg.C18761c;
import ue1.C43075l;

/* renamed from: hp0.b */
public final class C15586b extends C1819o {

    /* renamed from: f */
    private final int f44274f;

    /* renamed from: g */
    private final C43075l f44275g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15586b(int i, C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onAccountSelected");
        this.f44274f = i;
        this.f44275g = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m56283m(C15586b bVar, int i, int i2, C18761c cVar) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(cVar, "<anonymous parameter 1>");
        bVar.f44275g.invoke(Integer.valueOf(i));
    }

    /* renamed from: l */
    public void onBindViewHolder(C37626z zVar, int i) {
        boolean z;
        C41536l.m120489i(zVar, "holder");
        C10135h hVar = (C10135h) zVar.mo90806h();
        AccountSelectorItemView accountSelectorItemView = hVar.f28104e;
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        accountSelectorItemView.setData((AccountSelectorItemView.C13140a) g);
        AccountSelectorItemView accountSelectorItemView2 = hVar.f28104e;
        if (i == this.f44274f) {
            z = true;
        } else {
            z = false;
        }
        accountSelectorItemView2.setActivated(z);
        hVar.mo3946b().setOnCurrencyItemSelectedListener(new C15585a(this, i));
    }

    /* renamed from: n */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C10135h d = C10135h.m37069d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C37626z(d);
    }
}
