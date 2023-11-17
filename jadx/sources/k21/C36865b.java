package k21;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b31.C31119h;
import i21.C36343a;
import kotlin.jvm.internal.C41536l;
import l21.C37065a;
import p615tg.C17963d;

/* renamed from: k21.b */
public final class C36865b extends C1819o {

    /* renamed from: f */
    private final C36343a f88957f;

    /* renamed from: k21.b$a */
    public static final class C36866a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31119h f88958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36866a(C31119h hVar) {
            super(hVar.mo3946b());
            C41536l.m120489i(hVar, "binding");
            this.f88958d = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m109224j(C36343a aVar, C37065a aVar2, View view) {
            C41536l.m120489i(aVar, "$listener");
            C41536l.m120489i(aVar2, "$item");
            aVar.mo89057a(aVar2.mo89980a());
        }

        /* renamed from: i */
        public final void mo89790i(C37065a aVar, C36343a aVar2) {
            C41536l.m120489i(aVar, "item");
            C41536l.m120489i(aVar2, "listener");
            this.f88958d.f77343f.setText(aVar.mo89980a().mo84223b());
            this.f88958d.f77342e.setChecked(aVar.mo89981b());
            this.f88958d.mo3946b().setOnClickListener(new C36864a(aVar2, aVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36865b(C36343a aVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "listener");
        this.f88957f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C36866a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo89790i((C37065a) g, this.f88957f);
    }

    /* renamed from: l */
    public C36866a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C31119h d = C31119h.m92596d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C36866a(d);
    }
}
