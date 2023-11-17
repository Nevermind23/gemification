package jo0;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import ao0.C10119a;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import ko0.C16516a;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Color;
import sn0.C17900d;
import so0.C17906b;
import uo0.C18269a;
import uo0.C18273e;
import xn0.C18855m;
import xn0.C18857o;

/* renamed from: jo0.a */
public final class C16302a extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C17906b f46124f;

    /* renamed from: jo0.a$a */
    public final class C16303a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18857o f46125d;

        /* renamed from: e */
        final /* synthetic */ C16302a f46126e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16303a(C16302a aVar, C18857o oVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f46126e = aVar;
            this.f46125d = oVar;
        }

        /* renamed from: h */
        public final void mo43286h(C16516a.C16517a aVar) {
            C41536l.m120489i(aVar, "item");
            Context context = this.itemView.getContext();
            this.f46125d.f52767e.setTitle(aVar.mo43658c());
            ((C2394j) C2379b.m9210t(this.itemView.getContext()).mo7756x(aVar.mo43659d().mo35313a()).mo7232j(C17900d.f50940f)).mo7718L0(this.f46125d.f52769g);
            C18269a b = aVar.mo43657b();
            this.f46125d.f52768f.setBackgroundColor(C0767a.m2893c(context, b.mo45919a()));
            this.f46125d.f52769g.setColorFilter(C0767a.m2893c(context, b.mo45920b()), PorterDuff.Mode.SRC_IN);
            this.f46125d.f52767e.setTitleTextColor(new Color.Resource(b.mo45921c()));
        }
    }

    /* renamed from: jo0.a$b */
    public final class C16304b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18855m f46127d;

        /* renamed from: e */
        final /* synthetic */ C16302a f46128e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16304b(C16302a aVar, C18855m mVar) {
            super(mVar.mo3946b());
            C41536l.m120489i(mVar, "binding");
            this.f46128e = aVar;
            this.f46127d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m58105j(C16302a aVar, C18273e eVar, View view) {
            boolean z;
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(eVar, "$offer");
            C17906b k = aVar.f46124f;
            if (k != null) {
                long k2 = eVar.mo45962k();
                String d = eVar.mo45953d();
                if (eVar.mo45952c() == C10119a.BNPL) {
                    z = true;
                } else {
                    z = false;
                }
                k.mo32992a(k2, d, z);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo43287i(ko0.C16516a.C16518b r15) {
            /*
                r14 = this;
                java.lang.String r0 = "item"
                kotlin.jvm.internal.C41536l.m120489i(r15, r0)
                uo0.e r15 = r15.mo43663b()
                xn0.m r0 = r14.f46127d
                ge.bog.designsystem.components.textimagecard.TextImageCardView r0 = r0.f52763e
                jo0.a r1 = r14.f46128e
                ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a r2 = r15.mo45950a()
                java.util.List r2 = ie1.C41341q.m119911n(r2)
                java.lang.String r4 = r15.mo45956f()
                if (r4 == 0) goto L_0x002d
                ge.bog.designsystem.components.common.Image$Url r13 = new ge.bog.designsystem.components.common.Image$Url
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 126(0x7e, float:1.77E-43)
                r12 = 0
                r3 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                goto L_0x0036
            L_0x002d:
                ge.bog.designsystem.components.common.Image$Resource r13 = new ge.bog.designsystem.components.common.Image$Resource
                int r3 = sn0.C17900d.f50943s
                r4 = 2
                r5 = 0
                r13.<init>(r3, r5, r4, r5)
            L_0x0036:
                r0.setImage(r13)
                java.lang.String r3 = r15.mo45963l()
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r3 = g91.C32343x.m95388F(r3, r4)
                r0.setDescription(r3)
                uj.a r3 = r15.mo45965n()
                java.lang.String r4 = r15.mo45966o()
                r0.mo36861d(r3, r4)
                r0.mo36859a(r2)
                xn0.m r0 = r14.f46127d
                ge.bog.designsystem.components.textimagecard.TextImageCardView r0 = r0.mo3946b()
                jo0.b r2 = new jo0.b
                r2.<init>(r1, r15)
                r0.setOnClickListener(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jo0.C16302a.C16304b.mo43287i(ko0.a$b):void");
        }
    }

    public C16302a() {
        super(C37599g.f90345a.mo90787d());
    }

    public int getItemViewType(int i) {
        return ((C16516a) mo6027g(i)).mo43656a();
    }

    /* renamed from: l */
    public final void mo43285l(C17906b bVar) {
        this.f46124f = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ko0.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ko0.a$b} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C1734f0 r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            boolean r0 = r3 instanceof jo0.C16302a.C16304b
            r1 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.Object r4 = r2.mo6027g(r4)
            boolean r0 = r4 instanceof ko0.C16516a.C16518b
            if (r0 == 0) goto L_0x0015
            r1 = r4
            ko0.a$b r1 = (ko0.C16516a.C16518b) r1
        L_0x0015:
            if (r1 != 0) goto L_0x0018
            return
        L_0x0018:
            jo0.a$b r3 = (jo0.C16302a.C16304b) r3
            r3.mo43287i(r1)
            goto L_0x0035
        L_0x001e:
            boolean r0 = r3 instanceof jo0.C16302a.C16303a
            if (r0 == 0) goto L_0x0035
            java.lang.Object r4 = r2.mo6027g(r4)
            boolean r0 = r4 instanceof ko0.C16516a.C16517a
            if (r0 == 0) goto L_0x002d
            r1 = r4
            ko0.a$a r1 = (ko0.C16516a.C16517a) r1
        L_0x002d:
            if (r1 != 0) goto L_0x0030
            return
        L_0x0030:
            jo0.a$a r3 = (jo0.C16302a.C16303a) r3
            r3.mo43286h(r1)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jo0.C16302a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C16516a.C16519c.HEADER.ordinal()) {
            C18857o d = C18857o.m63799d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C16303a(this, d);
        } else if (i == C16516a.C16519c.OFFER.ordinal()) {
            C18855m d2 = C18855m.m63791d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C16304b(this, d2);
        } else {
            throw new IllegalStateException("Unknown ViewType: " + i);
        }
    }
}
