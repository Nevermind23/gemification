package tx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import cx0.C31456c;
import g91.C32343x;
import iu0.C36546y;
import jx0.C36833o;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p380ck.C10463g;

/* renamed from: tx0.e */
public final class C38837e extends C1819o {

    /* renamed from: f */
    private final C38838a f92910f;

    /* renamed from: tx0.e$a */
    public interface C38838a {
        /* renamed from: a */
        void mo92219a(C31456c cVar);
    }

    /* renamed from: tx0.e$b */
    public static final class C38839b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36833o f92911d;

        /* renamed from: e */
        private final C38838a f92912e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38839b(C36833o oVar, C38838a aVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            C41536l.m120489i(aVar, "onNodeClickedListener");
            this.f92911d = oVar;
            this.f92912e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m113647j(C31456c cVar, C38839b bVar, View view) {
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
            bVar.f92912e.mo92219a(cVar);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo92548i(cx0.C31456c r13) {
            /*
                r12 = this;
                java.lang.String r0 = "item"
                kotlin.jvm.internal.C41536l.m120489i(r13, r0)
                jx0.o r0 = r12.f92911d
                ge.bog.designsystem.components.categorycard.CategoryCardView r0 = r0.f88890e
                tx0.f r1 = new tx0.f
                r1.<init>(r13, r12)
                r0.setOnClickListener(r1)
                cx0.a r1 = r13.mo71852c()
                java.lang.String r1 = r1.mo71837t()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 1
                java.lang.String r1 = g91.C32343x.m95386E(r1, r3, r2)
                r0.setText(r1)
                cx0.a r1 = r13.mo71852c()
                java.lang.String r1 = r1.mo71828k()
                if (r1 == 0) goto L_0x004f
                ge.bog.designsystem.components.common.Image$Url r1 = new ge.bog.designsystem.components.common.Image$Url
                cx0.a r2 = r13.mo71852c()
                java.lang.String r2 = r2.mo71828k()
                java.lang.String r3 = g91.C32289b0.m95091c(r2)
                java.lang.String r2 = "generateImageUrl(item.data.logo)"
                kotlin.jvm.internal.C41536l.m120488h(r3, r2)
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 126(0x7e, float:1.77E-43)
                r11 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0058
            L_0x004f:
                ge.bog.designsystem.components.common.Image$Resource r1 = new ge.bog.designsystem.components.common.Image$Resource
                int r2 = fx0.C32023c.f78830c
                r3 = 2
                r4 = 0
                r1.<init>(r2, r4, r3, r4)
            L_0x0058:
                r0.setImage(r1)
                cx0.a r1 = r13.mo71852c()
                java.lang.String r1 = r1.mo71818c()
                if (r1 == 0) goto L_0x0071
                ge.bog.designsystem.components.common.Color$Raw r2 = new ge.bog.designsystem.components.common.Color$Raw
                int r1 = android.graphics.Color.parseColor(r1)
                r2.<init>(r1)
                r0.setBackgroundColor(r2)
            L_0x0071:
                cx0.a r13 = r13.mo71852c()
                java.lang.String r13 = r13.mo71819d()
                if (r13 == 0) goto L_0x0087
                ge.bog.designsystem.components.common.Color$Raw r1 = new ge.bog.designsystem.components.common.Color$Raw
                int r13 = android.graphics.Color.parseColor(r13)
                r1.<init>(r13)
                r0.setImageTint(r1)
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tx0.C38837e.C38839b.mo92548i(cx0.c):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38837e(C38838a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "onNodeClickedListener");
        this.f92910f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C38839b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo92548i((C31456c) g);
    }

    /* renamed from: l */
    public C38839b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36833o d = C36833o.m109145d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C38839b(d, this.f92910f);
    }
}
