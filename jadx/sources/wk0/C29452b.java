package wk0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.C1305j;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p615tg.C17963d;
import p642vh.C18368l;
import sk0.C28245h;
import ue1.C43075l;
import xk0.C29816a;

/* renamed from: wk0.b */
public final class C29452b extends C1819o {

    /* renamed from: f */
    private C29453a f74547f;

    /* renamed from: wk0.b$a */
    public interface C29453a {
        /* renamed from: Y0 */
        void mo68975Y0(C29816a aVar);
    }

    /* renamed from: wk0.b$b */
    public static final class C29454b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28245h f74548d;

        /* renamed from: e */
        private C29453a f74549e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29454b(C28245h hVar) {
            super(hVar.mo3946b());
            C41536l.m120489i(hVar, "binding");
            this.f74548d = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m89574j(C29454b bVar, C29816a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "$data");
            C29453a aVar2 = bVar.f74549e;
            if (aVar2 != null) {
                aVar2.mo68975Y0(aVar);
            }
        }

        /* renamed from: i */
        public final void mo69303i(C29816a aVar) {
            C41536l.m120489i(aVar, "data");
            Context context = this.f74548d.mo3946b().getContext();
            C28245h hVar = this.f74548d;
            AppCompatImageView appCompatImageView = hVar.f71670g;
            C41536l.m120488h(appCompatImageView, "transferImage");
            C18368l.m62746A(appCompatImageView, aVar.mo70071c(), (C43075l) null, 2, (Object) null);
            AppCompatImageView appCompatImageView2 = hVar.f71670g;
            Color e = aVar.mo70072e();
            C41536l.m120488h(context, "context");
            C1305j.m4529c(appCompatImageView2, ColorStateList.valueOf(e.mo35260a(context)));
            hVar.f71671h.setBackgroundColor(aVar.mo70070b().mo35260a(context));
            boolean z = true;
            hVar.f71669f.setText(C34646b.m101752f(aVar.mo70073f(), (Context) null, 1, (Object) null));
            View view = hVar.f71668e;
            C41536l.m120488h(view, "separator");
            if (getBindingAdapterPosition() <= 0) {
                z = false;
            }
            C32343x.m95483r1(view, z, false, 2, (Object) null);
            this.f74548d.mo3946b().setOnClickListener(new C29455c(this, aVar));
        }

        /* renamed from: k */
        public final void mo69304k(C29453a aVar) {
            this.f74549e = aVar;
        }
    }

    public C29452b(C29453a aVar) {
        super(C17963d.f51158a.mo45633d());
        this.f74547f = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m89569n(C29452b bVar, C29816a aVar) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(aVar, "productType");
        C29453a aVar2 = bVar.f74547f;
        if (aVar2 != null) {
            aVar2.mo68975Y0(aVar);
        }
    }

    /* renamed from: l */
    public void onBindViewHolder(C29454b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo69303i((C29816a) g);
    }

    /* renamed from: m */
    public C29454b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28245h d = C28245h.m86803d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        C29454b bVar = new C29454b(d);
        bVar.mo69304k(new C29451a(this));
        return bVar;
    }
}
