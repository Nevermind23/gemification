package p520mj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41224m;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.list.C13368e;
import p352ak.C10008s;

/* renamed from: mj.a */
public final class C16714a extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f46955d = C41341q.m119907j();

    /* renamed from: mj.a$a */
    public static final class C16715a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C10008s f46956d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16715a(C10008s sVar) {
            super(sVar.mo3946b());
            C41536l.m120489i(sVar, "binding");
            this.f46956d = sVar;
        }

        /* renamed from: h */
        public final void mo43835h(C41224m mVar) {
            C41536l.m120489i(mVar, "item");
            this.f46956d.mo3946b().setText((CharSequence) mVar.mo95678e());
            this.f46956d.mo3946b().setType((C13368e) mVar.mo95680f());
        }
    }

    /* renamed from: f */
    public void onBindViewHolder(C16715a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo43835h((C41224m) this.f46955d.get(i));
    }

    /* renamed from: g */
    public C16715a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C10008s d = C10008s.m36708d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C16715a(d);
    }

    public int getItemCount() {
        return this.f46955d.size();
    }

    /* renamed from: h */
    public final void mo43834h(List list) {
        C41536l.m120489i(list, "list");
        this.f46955d = list;
        notifyDataSetChanged();
    }
}
