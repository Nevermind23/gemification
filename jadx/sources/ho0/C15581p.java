package ho0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ao0.C10119a;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.C2396k;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p642vh.C18338b0;
import sn0.C17900d;
import so0.C17906b;
import uo0.C18273e;
import xn0.C18860r;

/* renamed from: ho0.p */
public final class C15581p extends RecyclerView.C1736h {

    /* renamed from: d */
    private C18338b0 f44255d = C18338b0.C18346e.f51796d;

    /* renamed from: e */
    private List f44256e = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C17906b f44257f;

    /* renamed from: ho0.p$a */
    public final class C15582a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18860r f44258d;

        /* renamed from: e */
        final /* synthetic */ C15581p f44259e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15582a(C15581p pVar, C18860r rVar) {
            super(rVar.mo3946b());
            C41536l.m120489i(rVar, "binding");
            this.f44259e = pVar;
            this.f44258d = rVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m56275j(C15581p pVar, C18273e eVar, View view) {
            boolean z;
            C41536l.m120489i(pVar, "this$0");
            C41536l.m120489i(eVar, "$offer");
            C17906b f = pVar.f44257f;
            if (f != null) {
                long k = eVar.mo45962k();
                String d = eVar.mo45953d();
                if (eVar.mo45952c() == C10119a.BNPL) {
                    z = true;
                } else {
                    z = false;
                }
                f.mo32992a(k, d, z);
            }
        }

        /* renamed from: i */
        public final void mo42833i(C18273e eVar) {
            C41536l.m120489i(eVar, "offer");
            this.f44258d.mo3946b().setOnClickListener(new C15580o(this.f44259e, eVar));
            C2396k u = C2379b.m9211u(this.f44258d.mo3946b());
            Object b = eVar.mo45951b();
            if (b == null) {
                b = Integer.valueOf(C17900d.f50943s);
            }
            ((C2394j) u.mo7756x(b).mo7220c0(C17900d.f50943s)).mo7718L0(this.f44258d.f52774e);
        }
    }

    /* renamed from: g */
    public final List mo42826g() {
        return this.f44256e;
    }

    public int getItemCount() {
        return this.f44255d.mo46117b().mo46120b(this.f44256e.size());
    }

    /* renamed from: h */
    public final C18338b0 mo42827h() {
        return this.f44255d;
    }

    /* renamed from: i */
    public void onBindViewHolder(C15582a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo42833i((C18273e) this.f44256e.get(this.f44255d.mo46117b().mo46119a(this.f44256e.size(), i)));
    }

    /* renamed from: j */
    public C15582a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C18860r d = C18860r.m63811d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C15582a(this, d);
    }

    /* renamed from: k */
    public final void mo42830k(C17906b bVar) {
        this.f44257f = bVar;
    }

    /* renamed from: l */
    public final void mo42831l(C18338b0 b0Var) {
        C41536l.m120489i(b0Var, "<set-?>");
        this.f44255d = b0Var;
    }

    /* renamed from: m */
    public final void mo42832m(List list) {
        C41536l.m120489i(list, "items");
        this.f44256e = list;
        notifyDataSetChanged();
    }
}
