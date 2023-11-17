package n71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import g71.C32110c;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import o31.C37626z;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import ue1.C43075l;

/* renamed from: n71.b */
public final class C37362b extends C1819o {

    /* renamed from: f */
    private final C43075l f89845f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37362b(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onCardSelected");
        this.f89845f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m110116m(C37362b bVar, int i, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.f89845f.invoke(Integer.valueOf(i));
    }

    /* renamed from: l */
    public void onBindViewHolder(C37626z zVar, int i) {
        C41536l.m120489i(zVar, "holder");
        CreditCardView.C13270b bVar = (CreditCardView.C13270b) mo6027g(i);
        C6201a h = zVar.mo90806h();
        if (h instanceof C32110c) {
            C32110c cVar = (C32110c) h;
            cVar.f78970e.setCreditCard(bVar);
            cVar.mo3946b().setOnClickListener(new C37361a(this, i));
        }
    }

    /* renamed from: n */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        return new C37626z(C32110c.m94574d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
