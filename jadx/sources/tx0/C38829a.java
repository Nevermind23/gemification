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
import jx0.C36829k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Image;
import p380ck.C10463g;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: tx0.a */
public final class C38829a extends C1819o {

    /* renamed from: f */
    private final C38830a f92900f;

    /* renamed from: tx0.a$a */
    public interface C38830a {
        /* renamed from: a */
        void mo92213a(C31456c cVar);
    }

    /* renamed from: tx0.a$b */
    public static final class C38831b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36829k f92901d;

        /* renamed from: e */
        private final C38830a f92902e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38831b(C36829k kVar, C38830a aVar) {
            super(kVar.mo3946b());
            C41536l.m120489i(kVar, "binding");
            C41536l.m120489i(aVar, "onNodeClickedListener");
            this.f92901d = kVar;
            this.f92902e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m113635j(C31456c cVar, C38831b bVar, View view) {
            String str;
            C41536l.m120489i(cVar, "$item");
            C41536l.m120489i(bVar, "this$0");
            C10463g F = C36546y.m108282F();
            if (cVar.mo71854e()) {
                str = "category";
            } else {
                str = "provider";
            }
            F.mo27156w("payment_tree", str, "click", C32343x.m95386E(cVar.mo71852c().mo71837t(), true, new Object[0]));
            bVar.f92902e.mo92213a(cVar);
        }

        /* renamed from: i */
        public final void mo92540i(C31456c cVar) {
            C31456c cVar2 = cVar;
            C41536l.m120489i(cVar2, "item");
            C36829k kVar = this.f92901d;
            kVar.f88876e.setOnClickListener(new C38832b(cVar2, this));
            kVar.f88878g.setText(C32343x.m95386E(cVar.mo71852c().mo71837t(), true, new Object[0]));
            if (cVar.mo71852c().mo71828k() != null) {
                AppCompatImageView appCompatImageView = kVar.f88877f;
                C41536l.m120488h(appCompatImageView, "icon");
                String c = C32289b0.m95091c(cVar.mo71852c().mo71828k());
                C41536l.m120488h(c, "generateImageUrl(item.data.logo)");
                C18368l.m62746A(appCompatImageView, new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
                return;
            }
            AppCompatImageView appCompatImageView2 = kVar.f88877f;
            C41536l.m120488h(appCompatImageView2, "icon");
            C18368l.m62746A(appCompatImageView2, new Image.Resource(C32023c.f78830c, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38829a(C38830a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onNodeClickedListener");
        this.f92900f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C38831b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo92540i((C31456c) g);
    }

    /* renamed from: l */
    public C38831b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36829k d = C36829k.m109129d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C38831b(d, this.f92900f);
    }
}
