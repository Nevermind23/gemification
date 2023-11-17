package p687yl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32300e0;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p536nl.C17061n;
import p606sl.C17844j;
import p631uj.C18174a;

/* renamed from: yl.e */
public final class C18949e extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C18951b f52948f;

    /* renamed from: yl.e$a */
    public final class C18950a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C17061n f52949d;

        /* renamed from: e */
        final /* synthetic */ C18949e f52950e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18950a(C18949e eVar, C17061n nVar) {
            super(nVar.mo3946b());
            C41536l.m120489i(nVar, "binding");
            this.f52950e = eVar;
            this.f52949d = nVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64042j(C18949e eVar, C17844j jVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(jVar, "$item");
            C18951b k = eVar.f52948f;
            if (k != null) {
                k.mo46983a(jVar.mo45487d(), (String) C32300e0.f79712a.mo72818d(jVar.mo45484a(), jVar.mo45485b()));
            }
        }

        /* renamed from: i */
        public final void mo46995i(C17844j jVar) {
            C41536l.m120489i(jVar, "item");
            TextImageCardView textImageCardView = this.f52949d.f47660e;
            textImageCardView.setOnClickListener(new C18948d(this.f52950e, jVar));
            textImageCardView.setDescription((CharSequence) C32300e0.f79712a.mo72818d(jVar.mo45484a(), jVar.mo45485b()));
            Image c = jVar.mo45486c();
            if (c != null) {
                textImageCardView.setImage(c);
            }
            textImageCardView.mo36861d(C18174a.INVISIBLE, "");
        }
    }

    /* renamed from: yl.e$b */
    public interface C18951b {
        /* renamed from: a */
        void mo46983a(long j, String str);
    }

    public C18949e() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: l */
    public void onBindViewHolder(C18950a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        C17844j jVar = (C17844j) mo6027g(i);
        C41536l.m120487g(jVar, "null cannot be cast to non-null type ge.bog.mobilebank.bnpl.domain.model.BnplMerchant");
        aVar.mo46995i(jVar);
    }

    /* renamed from: m */
    public C18950a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C17061n d = C17061n.m59951d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C18950a(this, d);
    }

    /* renamed from: n */
    public final void mo46994n(C18951b bVar) {
        this.f52948f = bVar;
    }
}
