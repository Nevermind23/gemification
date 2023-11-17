package p410el;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p493kk.C16463q;
import p615tg.C17963d;
import ue1.C43075l;

/* renamed from: el.b */
public final class C12482b extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43075l f37152f;

    /* renamed from: el.b$a */
    public final class C12483a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16463q f37153d;

        /* renamed from: e */
        final /* synthetic */ C12482b f37154e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12483a(C12482b bVar, C16463q qVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            this.f37154e = bVar;
            this.f37153d = qVar;
            qVar.f46605e.setOnClickListener(new C12481a(bVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m47523i(C12482b bVar, C12483a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            bVar.f37152f.invoke(Integer.valueOf(aVar.getAdapterPosition()));
        }

        /* renamed from: j */
        public final C16463q mo33096j() {
            return this.f37153d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12482b(C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "onCardSelected");
        this.f37152f = lVar;
    }

    /* renamed from: l */
    public void onBindViewHolder(C12483a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo33096j().f46605e.setCreditCard((CreditCardView.C13270b) mo6027g(i));
    }

    /* renamed from: m */
    public C12483a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16463q d = C16463q.m58658d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C12483a(this, d);
    }
}
