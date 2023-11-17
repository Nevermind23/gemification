package kc1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10220y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import ua1.C28680s1;

/* renamed from: kc1.n */
public final class C41491n extends RecyclerView.C1736h {

    /* renamed from: f */
    public static final C41492a f97662f = new C41492a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final ArrayList f97663d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C41494c f97664e;

    /* renamed from: kc1.n$a */
    public static final class C41492a {
        private C41492a() {
        }

        public /* synthetic */ C41492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kc1.n$b */
    public final class C41493b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28680s1 f97665d;

        /* renamed from: e */
        final /* synthetic */ C41491n f97666e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41493b(C41491n nVar, C28680s1 s1Var) {
            super(s1Var.mo3946b());
            C41536l.m120489i(s1Var, "binding");
            this.f97666e = nVar;
            this.f97665d = s1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m120365j(C41491n nVar, C41493b bVar, View view) {
            C41536l.m120489i(nVar, "this$0");
            C41536l.m120489i(bVar, "this$1");
            C41494c f = nVar.f97664e;
            if (f != null) {
                f.mo96246B0(bVar.getAdapterPosition());
            }
        }

        /* renamed from: i */
        public final void mo96256i(C41463a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "device");
            if (aVar.mo96224f()) {
                this.f97665d.f72930h.setVisibility(0);
            } else {
                this.f97665d.f72930h.setVisibility(8);
            }
            this.f97665d.f72931i.getSubtitle();
            this.f97665d.f72928f.setImageDrawable(aVar.mo96220c());
            this.f97665d.f72929g.setVisibility(8);
            this.f97665d.f72932j.setVisibility(8);
            this.f97665d.f72933k.setVisibility(8);
            this.f97665d.f72931i.setVisibility(8);
            String a = aVar.mo96218a();
            if (a == null || C40439w.m117118v(a)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (aVar.mo96222e()) {
                    this.f97665d.f72932j.setVisibility(0);
                    TwoLineReverseTextItem twoLineReverseTextItem = this.f97665d.f72932j;
                    twoLineReverseTextItem.setText(aVar.mo96219b());
                    twoLineReverseTextItem.setTitle(twoLineReverseTextItem.getResources().getString(C10220y.customer_devices_current_session));
                } else {
                    this.f97665d.f72929g.setVisibility(0);
                    this.f97665d.f72929g.setText(aVar.mo96219b());
                }
            } else if (aVar.mo96222e()) {
                this.f97665d.f72931i.setVisibility(0);
                ThreeLineTextItem threeLineTextItem = this.f97665d.f72931i;
                threeLineTextItem.setText(aVar.mo96219b());
                threeLineTextItem.setTitle(aVar.mo96218a());
                threeLineTextItem.setSubtitle(threeLineTextItem.getResources().getString(C10220y.customer_devices_current_session));
            } else {
                this.f97665d.f72933k.setVisibility(0);
                TwoLineTextItem twoLineTextItem = this.f97665d.f72933k;
                twoLineTextItem.setText(aVar.mo96219b());
                twoLineTextItem.setTitle(aVar.mo96218a());
            }
            this.itemView.setOnClickListener(new C41495o(this.f97666e, this));
        }
    }

    /* renamed from: kc1.n$c */
    public interface C41494c {
        /* renamed from: B0 */
        void mo96246B0(int i);
    }

    /* renamed from: g */
    public final void mo96254g(List list) {
        C41536l.m120489i(list, "usedDevices");
        this.f97663d.clear();
        this.f97663d.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f97663d.size();
    }

    public int getItemViewType(int i) {
        return 1;
    }

    /* renamed from: h */
    public final void mo96255h(C41494c cVar) {
        C41536l.m120489i(cVar, "callback");
        this.f97664e = cVar;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C41493b) {
            Object obj = this.f97663d.get(i);
            C41536l.m120488h(obj, "usedDevices[position]");
            ((C41493b) f0Var).mo96256i((C41463a) obj);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 1) {
            C28680s1 d = C28680s1.m87836d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C41493b(this, d);
        }
        throw new IllegalStateException("Unknown ViewType");
    }
}
