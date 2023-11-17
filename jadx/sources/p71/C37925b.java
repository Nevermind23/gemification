package p71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import g71.C32110c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import o31.C37626z;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import ue1.C43075l;

/* renamed from: p71.b */
public final class C37925b extends C1819o {

    /* renamed from: f */
    private final C43075l f91024f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37925b(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onCardSelected");
        this.f91024f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m111466m(C6201a aVar, C37925b bVar, CreditCardView.C13270b bVar2, int i, View view) {
        Object obj;
        C41536l.m120489i(aVar, "$binding");
        C41536l.m120489i(bVar, "this$0");
        if (!((C32110c) aVar).f78970e.isActivated()) {
            List f = bVar.mo6026f();
            List f2 = bVar.mo6026f();
            C41536l.m120488h(f2, "currentList");
            Iterator it = f2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((CreditCardView.C13270b) obj).mo35451k()) {
                    break;
                }
            }
            int indexOf = f.indexOf(obj);
            if (indexOf != -1) {
                ((CreditCardView.C13270b) bVar.mo6026f().get(indexOf)).mo35453m(false);
                bVar.notifyItemChanged(indexOf);
            }
            bVar2.mo35453m(true);
            bVar.notifyItemChanged(i);
            bVar.f91024f.invoke(Integer.valueOf(i));
        }
    }

    /* renamed from: l */
    public void onBindViewHolder(C37626z zVar, int i) {
        C41536l.m120489i(zVar, "holder");
        CreditCardView.C13270b bVar = (CreditCardView.C13270b) mo6027g(i);
        C6201a h = zVar.mo90806h();
        if (h instanceof C32110c) {
            C32110c cVar = (C32110c) h;
            cVar.f78970e.setCreditCard(bVar);
            cVar.mo3946b().setOnClickListener(new C37924a(h, this, bVar, i));
        }
    }

    /* renamed from: n */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        return new C37626z(C32110c.m94574d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }
}
