package zk0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1305j;
import androidx.recyclerview.widget.RecyclerView;
import g11.C32041b;
import g91.C32343x;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import ok0.C27028d;
import p045d.C5769a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import pk0.C27551a;
import pk0.C27588d;
import sk0.C28241d;
import sk0.C28242e;
import sk0.C28243f;
import sk0.C28244g;
import z21.C40141a;

/* renamed from: zk0.f */
public final class C30326f extends RecyclerView.C1736h {

    /* renamed from: d */
    private C30330d f76236d;

    /* renamed from: e */
    private List f76237e = C41341q.m119907j();

    /* renamed from: zk0.f$a */
    public final class C30327a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C30326f f76238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30327a(C30326f fVar, C28242e eVar) {
            super(eVar.mo3946b());
            C41536l.m120489i(eVar, "binding");
            this.f76238d = fVar;
        }
    }

    /* renamed from: zk0.f$b */
    public final class C30328b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28243f f76239d;

        /* renamed from: e */
        final /* synthetic */ C30326f f76240e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30328b(C30326f fVar, C28243f fVar2) {
            super(fVar2.mo3946b());
            C41536l.m120489i(fVar2, "binding");
            this.f76240e = fVar;
            this.f76239d = fVar2;
        }

        /* renamed from: h */
        private final void m91449h(C27588d.C27590b bVar) {
            C28243f fVar = this.f76239d;
            if (bVar.mo66948a() != null) {
                AppCompatTextView appCompatTextView = fVar.f71662f;
                C41536l.m120488h(appCompatTextView, "titleHeader");
                C32343x.m95447f1(appCompatTextView);
                fVar.f71662f.setText(C34646b.m101752f(bVar.mo66948a(), (Context) null, 1, (Object) null));
                return;
            }
            AppCompatTextView appCompatTextView2 = fVar.f71662f;
            C41536l.m120488h(appCompatTextView2, "titleHeader");
            C32343x.m95401L0(appCompatTextView2);
        }

        /* renamed from: i */
        public final void mo70651i(C27588d dVar) {
            C41536l.m120489i(dVar, "searchItem");
            if (dVar instanceof C27588d.C27590b) {
                m91449h((C27588d.C27590b) dVar);
            }
        }
    }

    /* renamed from: zk0.f$c */
    public final class C30329c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28244g f76241d;

        /* renamed from: e */
        private C30330d f76242e;

        /* renamed from: f */
        final /* synthetic */ C30326f f76243f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30329c(C30326f fVar, C28244g gVar) {
            super(gVar.mo3946b());
            C41536l.m120489i(gVar, "binding");
            this.f76243f = fVar;
            this.f76241d = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m91452j(C30329c cVar, C27588d dVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(dVar, "$searchItem");
            C30330d dVar2 = cVar.f76242e;
            if (dVar2 != null) {
                dVar2.mo62216b((C27588d.C27591c) dVar);
            }
        }

        /* renamed from: i */
        public final void mo70652i(C27588d dVar) {
            ColorStateList colorStateList;
            C41536l.m120489i(dVar, "searchItem");
            Context context = this.f76241d.mo3946b().getContext();
            if (dVar instanceof C27588d.C27591c.C27592a) {
                C28244g gVar = this.f76241d;
                C27588d.C27591c.C27592a aVar = (C27588d.C27591c.C27592a) dVar;
                gVar.f71664e.setImageDrawable(C5769a.m23210b(context, aVar.mo66953b()));
                AppCompatImageView appCompatImageView = gVar.f71664e;
                Color c = aVar.mo66954c();
                if (c != null) {
                    C41536l.m120488h(context, "context");
                    colorStateList = c.mo35261b(context);
                } else {
                    colorStateList = null;
                }
                C1305j.m4529c(appCompatImageView, colorStateList);
                Color a = aVar.mo66952a();
                if (a != null) {
                    LayerView layerView = gVar.f71665f;
                    C41536l.m120488h(context, "context");
                    layerView.setBackgroundColor(a.mo35260a(context));
                }
                gVar.f71666g.setText(C34646b.m101752f(aVar.mo66955d(), (Context) null, 1, (Object) null));
                gVar.mo3946b().setOnClickListener(new C30333g(this, dVar));
            }
        }

        /* renamed from: k */
        public final void mo70653k(C30330d dVar) {
            this.f76242e = dVar;
        }
    }

    /* renamed from: zk0.f$d */
    public interface C30330d {
        /* renamed from: b */
        void mo62216b(C27588d.C27591c cVar);
    }

    /* renamed from: zk0.f$e */
    private enum C30331e {
        HUB_SETTINGS_ITEM,
        LOGOUT_ITEM,
        HEADER,
        FOOTER
    }

    /* renamed from: zk0.f$f */
    public final class C30332f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28241d f76249d;

        /* renamed from: e */
        private C30330d f76250e;

        /* renamed from: f */
        final /* synthetic */ C30326f f76251f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30332f(C30326f fVar, C28241d dVar) {
            super(dVar.mo3946b());
            C41536l.m120489i(dVar, "binding");
            this.f76251f = fVar;
            this.f76249d = dVar;
        }

        /* renamed from: i */
        private final void m91458i(Context context, C27588d.C27591c.C27593b bVar) {
            m91467s();
            if (bVar.mo66960b() instanceof C32041b.C32042a.C32047e) {
                m91464p(context, ((C32041b.C32042a.C32047e) bVar.mo66960b()).mo72536f(), bVar);
            } else {
                m91459k(context, bVar);
            }
        }

        /* renamed from: k */
        private final void m91459k(Context context, C27588d.C27591c.C27593b bVar) {
            ColorStateList colorStateList;
            C28241d dVar = this.f76249d;
            dVar.f71654h.setImageDrawable(C5769a.m23210b(context, bVar.mo66961c()));
            AppCompatImageView appCompatImageView = dVar.f71654h;
            Color d = bVar.mo66962d();
            if (d != null) {
                colorStateList = d.mo35261b(context);
            } else {
                colorStateList = null;
            }
            C1305j.m4529c(appCompatImageView, colorStateList);
            Color a = bVar.mo66959a();
            if (a != null) {
                dVar.f71655i.setBackgroundColor(a.mo35260a(context));
            }
            dVar.f71657k.setText(m91461m(bVar, context));
            AppCompatTextView appCompatTextView = dVar.f71656j;
            C41536l.m120488h(appCompatTextView, "subTitleText");
            m91465q(appCompatTextView, bVar.mo66960b());
            dVar.mo3946b().setOnClickListener(new C30334h(this, bVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m91460l(C30332f fVar, C27588d.C27591c.C27593b bVar, View view) {
            C41536l.m120489i(fVar, "this$0");
            C41536l.m120489i(bVar, "$searchItem");
            C30330d dVar = fVar.f76250e;
            if (dVar != null) {
                dVar.mo62216b(bVar);
            }
        }

        /* renamed from: m */
        private final CharSequence m91461m(C27588d.C27591c.C27593b bVar, Context context) {
            if (bVar.mo66960b() instanceof C27551a.C27573e) {
                return C27551a.C27552a.C27553a.f70463h.mo66928g(C34646b.m101752f(bVar.mo66960b().mo66932d(), (Context) null, 1, (Object) null), context, C27028d.f67860H);
            }
            return C34646b.m101752f(bVar.mo66960b().mo66932d(), (Context) null, 1, (Object) null);
        }

        /* renamed from: n */
        private final boolean m91462n(AppCompatTextView appCompatTextView, C32041b.C32042a.C32045c cVar) {
            StringSource g = cVar.mo72541g();
            if (g == null) {
                return false;
            }
            appCompatTextView.setText(C34646b.m101752f(g, (Context) null, 1, (Object) null));
            return true;
        }

        /* renamed from: o */
        private final void m91463o(AppCompatTextView appCompatTextView, C32041b.C32042a aVar) {
            if (aVar instanceof C32041b.C32042a.C32045c) {
                C32343x.m95483r1(appCompatTextView, m91462n(appCompatTextView, (C32041b.C32042a.C32045c) aVar), false, 2, (Object) null);
            }
        }

        /* renamed from: p */
        private final void m91464p(Context context, boolean z, C27588d.C27591c.C27593b bVar) {
            if (z) {
                m91466r();
                return;
            }
            m91467s();
            m91459k(context, bVar);
        }

        /* renamed from: q */
        private final void m91465q(AppCompatTextView appCompatTextView, C40141a aVar) {
            C32343x.m95455i0(appCompatTextView);
            if (aVar instanceof C32041b.C32042a) {
                m91463o(appCompatTextView, (C32041b.C32042a) aVar);
            }
        }

        /* renamed from: r */
        private final void m91466r() {
            C28241d dVar = this.f76249d;
            LayerView layerView = dVar.f71655i;
            C41536l.m120488h(layerView, "searchItemImageLayer");
            C32343x.m95455i0(layerView);
            LinearLayout linearLayout = dVar.f71651e;
            C41536l.m120488h(linearLayout, "containerTitles");
            C32343x.m95455i0(linearLayout);
            LoadingView loadingView = dVar.f71653g;
            C41536l.m120488h(loadingView, "loadingView");
            C32343x.m95447f1(loadingView);
        }

        /* renamed from: s */
        private final void m91467s() {
            C28241d dVar = this.f76249d;
            LayerView layerView = dVar.f71655i;
            C41536l.m120488h(layerView, "searchItemImageLayer");
            C32343x.m95447f1(layerView);
            LinearLayout linearLayout = dVar.f71651e;
            C41536l.m120488h(linearLayout, "containerTitles");
            C32343x.m95447f1(linearLayout);
            LoadingView loadingView = dVar.f71653g;
            C41536l.m120488h(loadingView, "loadingView");
            C32343x.m95455i0(loadingView);
        }

        /* renamed from: j */
        public final void mo70654j(C27588d dVar, boolean z) {
            C41536l.m120489i(dVar, "searchItem");
            View view = this.f76249d.f71652f;
            C41536l.m120488h(view, "binding.divider");
            C32343x.m95458j0(view, z);
            if (dVar instanceof C27588d.C27591c.C27593b) {
                Context context = this.f76249d.mo3946b().getContext();
                C41536l.m120488h(context, "binding.root.context");
                m91458i(context, (C27588d.C27591c.C27593b) dVar);
            }
        }

        /* renamed from: t */
        public final void mo70655t(C30330d dVar) {
            this.f76250e = dVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m91444h(C30326f fVar, C27588d.C27591c cVar) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(cVar, "searchItem");
        C30330d dVar = fVar.f76236d;
        if (dVar != null) {
            dVar.mo62216b(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m91445i(C30326f fVar, C27588d.C27591c cVar) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(cVar, "searchItem");
        C30330d dVar = fVar.f76236d;
        if (dVar != null) {
            dVar.mo62216b(cVar);
        }
    }

    public int getItemCount() {
        return this.f76237e.size();
    }

    public int getItemViewType(int i) {
        C27588d dVar = (C27588d) this.f76237e.get(i);
        if (dVar instanceof C27588d.C27591c.C27593b) {
            return C30331e.HUB_SETTINGS_ITEM.ordinal();
        }
        if (dVar instanceof C27588d.C27591c.C27592a) {
            return C30331e.LOGOUT_ITEM.ordinal();
        }
        if (dVar instanceof C27588d.C27590b) {
            return C30331e.HEADER.ordinal();
        }
        if (dVar instanceof C27588d.C27589a) {
            return C30331e.FOOTER.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: j */
    public final void mo70648j(C30330d dVar) {
        this.f76236d = dVar;
    }

    /* renamed from: k */
    public final boolean mo70649k(int i) {
        if (i == -1 || i == getItemCount() - 1 || !(this.f76237e.get(i) instanceof C27588d.C27591c.C27593b) || !(this.f76237e.get(i + 1) instanceof C27588d.C27591c.C27593b)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void mo70650l(List list) {
        C41536l.m120489i(list, "searchItems");
        this.f76237e = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C30332f) {
            ((C30332f) f0Var).mo70654j((C27588d) this.f76237e.get(i), mo70649k(i));
        } else if (f0Var instanceof C30329c) {
            ((C30329c) f0Var).mo70652i((C27588d) this.f76237e.get(i));
        } else if (f0Var instanceof C30328b) {
            ((C30328b) f0Var).mo70651i((C27588d) this.f76237e.get(i));
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C30331e.HUB_SETTINGS_ITEM.ordinal()) {
            C28241d d = C28241d.m86787d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …      false\n            )");
            C30332f fVar = new C30332f(this, d);
            fVar.mo70655t(new C30324d(this));
            return fVar;
        } else if (i == C30331e.LOGOUT_ITEM.ordinal()) {
            C28244g d2 = C28244g.m86799d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …      false\n            )");
            C30329c cVar = new C30329c(this, d2);
            cVar.mo70653k(new C30325e(this));
            return cVar;
        } else if (i == C30331e.HEADER.ordinal()) {
            C28243f d3 = C28243f.m86795d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …      false\n            )");
            return new C30328b(this, d3);
        } else if (i == C30331e.FOOTER.ordinal()) {
            C28242e d4 = C28242e.m86791d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …      false\n            )");
            return new C30327a(this, d4);
        } else {
            throw new IllegalStateException("Illegal viewType state on SearchItemsAdapter.onCreateViewHolder");
        }
    }
}
