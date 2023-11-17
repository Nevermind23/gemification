package ic1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.sso_client.models.C35955o;
import ua1.C28641f1;
import ua1.C28644g1;
import ua1.C28647h1;

/* renamed from: ic1.a */
public final class C41269a extends RecyclerView.C1736h {

    /* renamed from: f */
    public static final C41270a f97286f = new C41270a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final ArrayList f97287d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C41271b f97288e;

    /* renamed from: ic1.a$a */
    public static final class C41270a {
        private C41270a() {
        }

        public /* synthetic */ C41270a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ic1.a$b */
    public interface C41271b {
        /* renamed from: n0 */
        void mo95734n0(int i);
    }

    /* renamed from: ic1.a$c */
    public final class C41272c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28641f1 f97289d;

        /* renamed from: e */
        final /* synthetic */ C41269a f97290e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41272c(C41269a aVar, C28641f1 f1Var) {
            super(f1Var.mo3946b());
            C41536l.m120489i(f1Var, "binding");
            this.f97290e = aVar;
            this.f97289d = f1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m119582j(C41269a aVar, C41272c cVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            C41271b f = aVar.f97288e;
            if (f != null) {
                f.mo95734n0(cVar.getAdapterPosition());
            }
        }

        /* renamed from: i */
        public final void mo95735i(C35955o oVar) {
            C41536l.m120489i(oVar, "setting");
            this.f97289d.f72730e.setImageResource(oVar.mo88534b());
            SingleLineTextItem singleLineTextItem = this.f97289d.f72731f;
            singleLineTextItem.setText(singleLineTextItem.getContext().getString(oVar.mo88536d()));
            this.itemView.setOnClickListener(new C41275b(this.f97290e, this));
        }
    }

    /* renamed from: ic1.a$d */
    public final class C41273d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28644g1 f97291d;

        /* renamed from: e */
        final /* synthetic */ C41269a f97292e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41273d(C41269a aVar, C28644g1 g1Var) {
            super(g1Var.mo3946b());
            C41536l.m120489i(g1Var, "binding");
            this.f97292e = aVar;
            this.f97291d = g1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m119585j(C41269a aVar, C41273d dVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(dVar, "this$1");
            C41271b f = aVar.f97288e;
            if (f != null) {
                f.mo95734n0(dVar.getAdapterPosition());
            }
        }

        /* renamed from: i */
        public final void mo95736i(C35955o oVar) {
            C41536l.m120489i(oVar, "setting");
            this.f97291d.f72745e.setImageResource(oVar.mo88534b());
            SingleLineTextItem singleLineTextItem = this.f97291d.f72747g;
            singleLineTextItem.setText(singleLineTextItem.getContext().getString(oVar.mo88536d()));
            this.itemView.setOnClickListener(new C41276c(this.f97292e, this));
        }
    }

    /* renamed from: ic1.a$e */
    public final class C41274e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28647h1 f97293d;

        /* renamed from: e */
        final /* synthetic */ C41269a f97294e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41274e(C41269a aVar, C28647h1 h1Var) {
            super(h1Var.mo3946b());
            C41536l.m120489i(h1Var, "binding");
            this.f97294e = aVar;
            this.f97293d = h1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m119589k(C41269a aVar, C41274e eVar, CompoundButton compoundButton, boolean z) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(eVar, "this$1");
            C41271b f = aVar.f97288e;
            if (f != null) {
                f.mo95734n0(eVar.getAdapterPosition());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m119590l(C41274e eVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            eVar.f97293d.f72755g.toggle();
        }

        /* renamed from: j */
        public final void mo95737j(C35955o oVar) {
            C41536l.m120489i(oVar, "setting");
            this.f97293d.f72753e.setImageResource(oVar.mo88534b());
            SingleLineTextItem singleLineTextItem = this.f97293d.f72754f;
            singleLineTextItem.setText(singleLineTextItem.getContext().getString(oVar.mo88536d()));
            if (!oVar.mo88533a()) {
                this.f97293d.f72755g.setEnabled(false);
                this.itemView.setEnabled(false);
            }
            this.f97293d.f72755g.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.f97293d.f72755g.setChecked(oVar.mo88535c());
            this.f97293d.f72755g.setOnCheckedChangeListener(new C41277d(this.f97294e, this));
            this.itemView.setOnClickListener(new C41278e(this));
        }
    }

    /* renamed from: g */
    public final void mo95732g(List list) {
        C41536l.m120489i(list, "settingsList");
        this.f97287d.clear();
        this.f97287d.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f97287d.size();
    }

    public int getItemViewType(int i) {
        C35955o oVar = (C35955o) this.f97287d.get(i);
        if (oVar instanceof C35955o.C35957b) {
            return 3;
        }
        if (oVar instanceof C35955o.C35958c) {
            return 2;
        }
        return 1;
    }

    /* renamed from: h */
    public final void mo95733h(C41271b bVar) {
        C41536l.m120489i(bVar, "callback");
        this.f97288e = bVar;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C41274e) {
            Object obj = this.f97287d.get(i);
            C41536l.m120488h(obj, "settingsList[position]");
            ((C41274e) f0Var).mo95737j((C35955o) obj);
        } else if (f0Var instanceof C41272c) {
            Object obj2 = this.f97287d.get(i);
            C41536l.m120488h(obj2, "settingsList[position]");
            ((C41272c) f0Var).mo95735i((C35955o) obj2);
        } else if (f0Var instanceof C41273d) {
            Object obj3 = this.f97287d.get(i);
            C41536l.m120488h(obj3, "settingsList[position]");
            ((C41273d) f0Var).mo95736i((C35955o) obj3);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 1) {
            C28647h1 d = C28647h1.m87693d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C41274e(this, d);
        } else if (i == 2) {
            C28641f1 d2 = C28641f1.m87667d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C41272c(this, d2);
        } else if (i == 3) {
            C28644g1 d3 = C28644g1.m87681d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …  false\n                )");
            return new C41273d(this, d3);
        } else {
            throw new IllegalStateException("Unknown ViewType");
        }
    }
}
