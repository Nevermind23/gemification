package p341ge.bog.mobilebank.bnpl.presentation.categories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32300e0;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p480jl.C16212c;
import p536nl.C17057j;
import p606sl.C17844j;
import p631uj.C18174a;
import p646vl.C18413c;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.b */
public final class C13788b extends C1819o {

    /* renamed from: f */
    private final C13789a f41048f;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.b$a */
    public interface C13789a {
        /* renamed from: a */
        void mo38159a(long j, String str);
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.b$b */
    public static final class C13790b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C17057j f41049d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13790b(C17057j jVar) {
            super(jVar.mo3946b());
            C41536l.m120489i(jVar, "binding");
            this.f41049d = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m51477j(C13789a aVar, C17844j jVar, View view) {
            C41536l.m120489i(aVar, "$listener");
            C41536l.m120489i(jVar, "$item");
            aVar.mo38159a(jVar.mo45487d(), (String) C32300e0.f79712a.mo72818d(jVar.mo45484a(), jVar.mo45485b()));
        }

        /* renamed from: i */
        public final void mo38163i(C17844j jVar, C13789a aVar) {
            C41536l.m120489i(jVar, "item");
            C41536l.m120489i(aVar, "listener");
            TextImageCardView textImageCardView = this.f41049d.f47643e;
            textImageCardView.setDescription((CharSequence) C32300e0.f79712a.mo72818d(jVar.mo45484a(), jVar.mo45485b()));
            Image c = jVar.mo45486c();
            if (c == null) {
                c = new Image.Resource(C16212c.f45718g, (Boolean) null, 2, (DefaultConstructorMarker) null);
            }
            textImageCardView.setImage(c);
            textImageCardView.mo36861d(C18174a.INVISIBLE, "");
            textImageCardView.setOnClickListener(new C18413c(aVar, jVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13788b(C13789a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onMerchantClickedListener");
        this.f41048f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C13790b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        C17844j jVar = (C17844j) mo6027g(i);
        C41536l.m120487g(jVar, "null cannot be cast to non-null type ge.bog.mobilebank.bnpl.domain.model.BnplMerchant");
        bVar.mo38163i(jVar, this.f41048f);
    }

    /* renamed from: l */
    public C13790b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C17057j d = C17057j.m59935d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C13790b(d);
    }

    /* renamed from: m */
    public final void mo38162m(List list) {
        C41536l.m120489i(list, "items");
        mo6029i(list);
        notifyDataSetChanged();
    }
}
