package tx0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import cx0.C31456c;
import fx0.C32023c;
import g91.C32289b0;
import g91.C32343x;
import iu0.C36546y;
import java.util.Map;
import jx0.C36835q;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Image;
import p380ck.C10463g;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: tx0.g */
public final class C38841g extends C1819o {

    /* renamed from: f */
    private final C38842a f92915f;

    /* renamed from: g */
    private boolean f92916g;

    /* renamed from: tx0.g$a */
    public interface C38842a {
        /* renamed from: a */
        void mo92222a(C31456c cVar);
    }

    /* renamed from: tx0.g$b */
    public static final class C38843b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36835q f92917d;

        /* renamed from: e */
        private final C38842a f92918e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38843b(C36835q qVar, C38842a aVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
            C41536l.m120489i(aVar, "onNodeClickedListener");
            this.f92917d = qVar;
            this.f92918e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m113654j(boolean z, C31456c cVar, C38843b bVar, View view) {
            String str;
            C41536l.m120489i(cVar, "$item");
            C41536l.m120489i(bVar, "this$0");
            C10463g F = C36546y.m108282F();
            if (z) {
                str = "search_result_payment";
            } else if (cVar.mo71854e()) {
                str = "category";
            } else {
                str = "provider";
            }
            F.mo27156w("payment_tree", str, "click", C32343x.m95386E(cVar.mo71852c().mo71837t(), true, new Object[0]));
            bVar.f92918e.mo92222a(cVar);
        }

        /* renamed from: i */
        public final void mo92553i(C31456c cVar, boolean z) {
            C31456c cVar2 = cVar;
            C41536l.m120489i(cVar2, "item");
            C36835q qVar = this.f92917d;
            qVar.f88895e.setOnClickListener(new C38844h(z, cVar2, this));
            qVar.f88897g.setText(C32343x.m95386E(cVar.mo71852c().mo71837t(), true, new Object[0]));
            if (cVar.mo71852c().mo71828k() != null) {
                AppCompatImageView appCompatImageView = qVar.f88896f;
                C41536l.m120488h(appCompatImageView, "icon");
                String c = C32289b0.m95091c(cVar.mo71852c().mo71828k());
                C41536l.m120488h(c, "generateImageUrl(item.data.logo)");
                C18368l.m62746A(appCompatImageView, new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
                return;
            }
            AppCompatImageView appCompatImageView2 = qVar.f88896f;
            C41536l.m120488h(appCompatImageView2, "icon");
            C18368l.m62746A(appCompatImageView2, new Image.Resource(C32023c.f78830c, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38841g(C38842a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onNodeClickedListener");
        this.f92915f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C38843b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo92553i((C31456c) g, this.f92916g);
    }

    /* renamed from: l */
    public C38843b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36835q d = C36835q.m109153d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C38843b(d, this.f92915f);
    }

    /* renamed from: m */
    public final void mo92552m(boolean z) {
        this.f92916g = z;
    }
}
