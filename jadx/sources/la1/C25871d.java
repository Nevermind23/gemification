package la1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p086g1.C6201a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;
import ue1.C43081r;

/* renamed from: la1.d */
public final class C25871d extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f65855d;

    /* renamed from: e */
    private C43075l f65856e = C25875d.f65863d;

    /* renamed from: f */
    private C43080q f65857f = C25873b.f65861d;

    /* renamed from: g */
    private C43080q f65858g = C25874c.f65862d;

    /* renamed from: la1.d$a */
    public static final class C25872a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private Object f65859d;

        /* renamed from: e */
        private Object f65860e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25872a(View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
        }

        /* renamed from: h */
        public final Object mo64669h() {
            return this.f65860e;
        }

        /* renamed from: i */
        public final Object mo64670i() {
            return this.f65859d;
        }

        /* renamed from: j */
        public final void mo64671j(Object obj) {
            this.f65860e = obj;
        }

        /* renamed from: k */
        public final void mo64672k(Object obj) {
            this.f65859d = obj;
        }
    }

    /* renamed from: la1.d$b */
    static final class C25873b extends C41537m implements C43080q {

        /* renamed from: d */
        public static final C25873b f65861d = new C25873b();

        C25873b() {
            super(3);
        }

        /* renamed from: a */
        public final void mo64673a(C6201a aVar, Object obj, int i) {
            C41536l.m120489i(aVar, "<anonymous parameter 0>");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo64673a((C6201a) obj, obj2, ((Number) obj3).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: la1.d$c */
    static final class C25874c extends C41537m implements C43080q {

        /* renamed from: d */
        public static final C25874c f65862d = new C25874c();

        C25874c() {
            super(3);
        }

        /* renamed from: a */
        public final void mo64674a(C6201a aVar, Object obj, int i) {
            C41536l.m120489i(aVar, "<anonymous parameter 0>");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo64674a((C6201a) obj, obj2, ((Number) obj3).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: la1.d$d */
    static final class C25875d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C25875d f65863d = new C25875d();

        C25875d() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "it");
            throw new IllegalStateException();
        }
    }

    /* renamed from: la1.d$e */
    static final class C25876e extends C41537m implements C43080q {

        /* renamed from: d */
        final /* synthetic */ C43081r f65864d;

        /* renamed from: e */
        final /* synthetic */ C25871d f65865e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25876e(C43081r rVar, C25871d dVar) {
            super(3);
            this.f65864d = rVar;
            this.f65865e = dVar;
        }

        /* renamed from: a */
        public final void mo64676a(C6201a aVar, Object obj, int i) {
            C41536l.m120489i(aVar, "binding");
            this.f65864d.invoke(this.f65865e, aVar, obj, Integer.valueOf(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo64676a((C6201a) obj, obj2, ((Number) obj3).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: la1.d$f */
    static final class C25877f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43079p f65866d;

        /* renamed from: e */
        final /* synthetic */ C25871d f65867e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25877f(C43079p pVar, C25871d dVar) {
            super(1);
            this.f65866d = pVar;
            this.f65867e = dVar;
        }

        /* renamed from: a */
        public final C6201a invoke(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "it");
            return (C6201a) this.f65866d.invoke(this.f65867e, viewGroup);
        }
    }

    public C25871d(List list) {
        C41536l.m120489i(list, "items");
        this.f65855d = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m81300k(C25871d dVar, C25872a aVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(aVar, "$holder");
        C43080q qVar = dVar.f65858g;
        Object h = aVar.mo64669h();
        if (h != null) {
            qVar.invoke((C6201a) h, aVar.mo64670i(), Integer.valueOf(aVar.getAdapterPosition()));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type B of ge.bog.sso_client.common.adapter.SimpleListAdapter.onCreateViewHolder$lambda-1$lambda-0");
    }

    /* renamed from: g */
    public final void mo64664g(C43081r rVar) {
        C41536l.m120489i(rVar, "block");
        this.f65857f = new C25876e(rVar, this);
    }

    public int getItemCount() {
        return this.f65855d.size();
    }

    /* renamed from: h */
    public void onBindViewHolder(C25872a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = this.f65855d.get(i);
        aVar.mo64672k(obj);
        C43080q qVar = this.f65857f;
        Object h = aVar.mo64669h();
        if (h != null) {
            qVar.invoke((C6201a) h, obj, Integer.valueOf(i));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type B of ge.bog.sso_client.common.adapter.SimpleListAdapter");
    }

    /* renamed from: i */
    public final void mo64666i(C43079p pVar) {
        C41536l.m120489i(pVar, "block");
        this.f65856e = new C25877f(pVar, this);
    }

    /* renamed from: j */
    public C25872a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C6201a aVar = (C6201a) this.f65856e.invoke(viewGroup);
        View b = aVar.mo3946b();
        C41536l.m120488h(b, "binding.root");
        C25872a aVar2 = new C25872a(b);
        aVar2.mo64671j(aVar);
        aVar2.itemView.setOnClickListener(new C25870c(this, aVar2));
        return aVar2;
    }

    /* renamed from: l */
    public final C25871d mo64668l(C43075l lVar) {
        C41536l.m120489i(lVar, "block");
        lVar.invoke(this);
        return this;
    }
}
