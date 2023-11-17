package fw0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import o31.C37626z;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import ue1.C43075l;
import yv0.C40082g;

/* renamed from: fw0.b */
public final class C32020b extends C1819o {

    /* renamed from: f */
    private final C43075l f78823f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32020b(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onCardSelected");
        this.f78823f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m94465m(C32020b bVar, int i, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.f78823f.invoke(Integer.valueOf(i));
    }

    /* renamed from: l */
    public void onBindViewHolder(C37626z zVar, int i) {
        C41536l.m120489i(zVar, "holder");
        C40082g gVar = (C40082g) zVar.mo90806h();
        gVar.f95297e.setCreditCard((CreditCardView.C13270b) mo6027g(i));
        gVar.mo3946b().setOnClickListener(new C32019a(this, i));
    }

    /* renamed from: n */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C40082g d = C40082g.m116134d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C37626z(d);
    }
}
