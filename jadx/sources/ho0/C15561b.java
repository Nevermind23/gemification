package ho0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p380ck.C10464h;
import so0.C17905a;
import uo0.C18271c;
import xn0.C18856n;

/* renamed from: ho0.b */
public final class C15561b extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C17905a f44211f;

    /* renamed from: ho0.b$a */
    public final class C15562a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18856n f44212d;

        /* renamed from: e */
        final /* synthetic */ C15561b f44213e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15562a(C15561b bVar, C18856n nVar) {
            super(nVar.mo3946b());
            C41536l.m120489i(nVar, "binding");
            this.f44213e = bVar;
            this.f44212d = nVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m56218j(C15561b bVar, C18271c cVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(cVar, "$data");
            C17905a k = bVar.f44211f;
            if (k != null) {
                k.mo32993a(Long.valueOf(cVar.mo45936c()), (Integer) null);
            }
            C36546y.m108282F().mo27137H("life_style_offers", "CLICK_OFFER_SINGLE_CATEGORY", cVar.mo45934a(), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo42805i(uo0.C18271c r12) {
            /*
                r11 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.C41536l.m120489i(r12, r0)
                java.lang.String r0 = r12.mo45937d()
                if (r0 == 0) goto L_0x001f
                ge.bog.designsystem.components.common.Image$Url r0 = new ge.bog.designsystem.components.common.Image$Url
                java.lang.String r2 = r12.mo45937d()
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 126(0x7e, float:1.77E-43)
                r10 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                goto L_0x0028
            L_0x001f:
                ge.bog.designsystem.components.common.Image$Resource r0 = new ge.bog.designsystem.components.common.Image$Resource
                int r1 = sn0.C17900d.f50944t
                r2 = 2
                r3 = 0
                r0.<init>(r1, r3, r2, r3)
            L_0x0028:
                xn0.n r1 = r11.f44212d
                ge.bog.designsystem.components.textimagecard.TextImageCardView r1 = r1.f52765e
                r1.setImage(r0)
                xn0.n r0 = r11.f44212d
                ge.bog.designsystem.components.textimagecard.TextImageCardView r0 = r0.f52765e
                java.lang.String r1 = r12.mo45934a()
                r0.setDescription(r1)
                xn0.n r0 = r11.f44212d
                ge.bog.designsystem.components.textimagecard.TextImageCardView r0 = r0.f52765e
                ho0.b r1 = r11.f44213e
                ho0.a r2 = new ho0.a
                r2.<init>(r1, r12)
                r0.setOnClickListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ho0.C15561b.C15562a.mo42805i(uo0.c):void");
        }
    }

    public C15561b() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: l */
    public void onBindViewHolder(C15562a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo42805i((C18271c) g);
    }

    /* renamed from: m */
    public C15562a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C18856n d = C18856n.m63795d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C15562a(this, d);
    }

    /* renamed from: n */
    public final void mo42804n(C17905a aVar) {
        this.f44211f = aVar;
    }
}
