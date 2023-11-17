package p687yl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p536nl.C17059l;

/* renamed from: yl.f */
public final class C18952f extends C1819o {

    /* renamed from: f */
    private final C18953a f52951f;

    /* renamed from: yl.f$a */
    public interface C18953a {
        /* renamed from: a */
        void mo46998a(int i);
    }

    /* renamed from: yl.f$b */
    public static final class C18954b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C17059l f52952d;

        /* renamed from: e */
        private final C18953a f52953e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18954b(C17059l lVar, C18953a aVar) {
            super(lVar.mo3946b());
            C41536l.m120489i(lVar, "binding");
            C41536l.m120489i(aVar, "onShopClicked");
            this.f52952d = lVar;
            this.f52953e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64049j(C18954b bVar, int i, View view) {
            C41536l.m120489i(bVar, "this$0");
            bVar.f52953e.mo46998a(i);
        }

        /* renamed from: i */
        public final void mo46999i(String str, int i) {
            C41536l.m120489i(str, "item");
            this.f52952d.f47654g.setText(str);
            this.f52952d.mo3946b().setOnClickListener(new C18955g(this, i));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18952f(C18953a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onShopClicked");
        this.f52951f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C18954b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo46999i((String) g, i);
    }

    /* renamed from: l */
    public C18954b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C17059l d = C17059l.m59943d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C18954b(d, this.f52951f);
    }
}
