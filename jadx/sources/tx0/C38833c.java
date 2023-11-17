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
import jx0.C36831m;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Image;
import p380ck.C10463g;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: tx0.c */
public final class C38833c extends C1819o {

    /* renamed from: f */
    private final C38834a f92905f;

    /* renamed from: tx0.c$a */
    public interface C38834a {
        /* renamed from: a */
        void mo92216a(C31456c cVar);
    }

    /* renamed from: tx0.c$b */
    public static final class C38835b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36831m f92906d;

        /* renamed from: e */
        private final C38834a f92907e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38835b(C36831m mVar, C38834a aVar) {
            super(mVar.mo3946b());
            C41536l.m120489i(mVar, "binding");
            C41536l.m120489i(aVar, "onNodeClickedListener");
            this.f92906d = mVar;
            this.f92907e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m113641j(C31456c cVar, C38835b bVar, View view) {
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
            bVar.f92907e.mo92216a(cVar);
        }

        /* renamed from: i */
        public final void mo92544i(C31456c cVar) {
            C31456c cVar2 = cVar;
            C41536l.m120489i(cVar2, "item");
            C36831m mVar = this.f92906d;
            mVar.f88883e.setOnClickListener(new C38836d(cVar2, this));
            mVar.f88885g.setText(C32343x.m95386E(cVar.mo71852c().mo71837t(), true, new Object[0]));
            if (cVar.mo71852c().mo71828k() != null) {
                AppCompatImageView appCompatImageView = mVar.f88884f;
                C41536l.m120488h(appCompatImageView, "icon");
                String c = C32289b0.m95091c(cVar.mo71852c().mo71828k());
                C41536l.m120488h(c, "generateImageUrl(item.data.logo)");
                C18368l.m62746A(appCompatImageView, new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
                return;
            }
            AppCompatImageView appCompatImageView2 = mVar.f88884f;
            C41536l.m120488h(appCompatImageView2, "icon");
            C18368l.m62746A(appCompatImageView2, new Image.Resource(C32023c.f78830c, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38833c(C38834a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onNodeClickedListener");
        this.f92905f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C38835b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo92544i((C31456c) g);
    }

    /* renamed from: l */
    public C38835b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36831m d = C36831m.m109137d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C38835b(d, this.f92905f);
    }
}
