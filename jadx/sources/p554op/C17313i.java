package p554op;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.packagecard.PackageCardView;
import p341ge.bog.designsystem.components.packagecard.SoloCardView;
import p356ao.C10112d;
import p356ao.C10115g;
import p413eo.C12739e0;
import p413eo.C12763p0;
import p568pp.C17471a;
import p568pp.C17472b;
import p615tg.C17963d;

/* renamed from: op.i */
public final class C17313i extends C1819o {

    /* renamed from: f */
    private final C17316c f48623f;

    /* renamed from: op.i$a */
    public static final class C17314a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12739e0 f48624d;

        /* renamed from: e */
        private final C17316c f48625e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17314a(C12739e0 e0Var, C17316c cVar) {
            super(e0Var.mo3946b());
            C41536l.m120489i(e0Var, "binding");
            C41536l.m120489i(cVar, "listener");
            this.f48624d = e0Var;
            this.f48625e = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m60673j(C17314a aVar) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f48625e.mo33464a();
        }

        /* renamed from: i */
        public final void mo44729i(C17472b.C17473a aVar) {
            C41536l.m120489i(aVar, "info");
            SoloCardView soloCardView = this.f48624d.f37706e;
            soloCardView.setHeaderIcon(new Image.Resource(C10112d.solo_icon, (Boolean) null, 2, (DefaultConstructorMarker) null));
            soloCardView.setHeaderTitle(C32343x.m95388F("text.packages.solo.card.static.header", new Object[0]));
            soloCardView.setHeaderDesc(C32343x.m95388F("text.packages.solo.card.static.details", new Object[0]));
            soloCardView.setButtonText(C32343x.m95388F("text.packages.solo.card.show.solo.button", new Object[0]));
            C17471a aVar2 = (C17471a) C41358y.m120009Y(aVar.mo44981a());
            if (aVar2 != null) {
                soloCardView.setTopTitle(C32343x.m95388F(aVar2.mo44977c(), new Object[0]));
                soloCardView.setTopDesc(C32343x.m95388F(aVar2.mo44975a(), new Object[0]));
                soloCardView.setTopIcon(new Image.Url(aVar2.mo44976b(), (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null));
                C17471a aVar3 = (C17471a) C41358y.m120020j0(aVar.mo44981a());
                if (aVar3 != null) {
                    soloCardView.setBottomTitle(C32343x.m95388F(aVar3.mo44977c(), new Object[0]));
                    soloCardView.setBottomDesc(C32343x.m95388F(aVar3.mo44975a(), new Object[0]));
                    soloCardView.setBottomIcon(new Image.Url(aVar3.mo44976b(), (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null));
                    soloCardView.setOnButtonClickListener(new C17312h(this));
                }
            }
        }
    }

    /* renamed from: op.i$b */
    public static final class C17315b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12763p0 f48626d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17315b(C12763p0 p0Var) {
            super(p0Var.mo3946b());
            C41536l.m120489i(p0Var, "binding");
            this.f48626d = p0Var;
        }

        /* renamed from: h */
        public final void mo44730h(C17472b.C17474b bVar) {
            Integer num;
            C41536l.m120489i(bVar, "info");
            PackageCardView packageCardView = this.f48626d.f37822e;
            packageCardView.setForceWhiteTexts(bVar.mo44989e());
            Integer a = bVar.mo44985a();
            if (a != null) {
                int intValue = a.intValue();
                Context context = this.itemView.getContext();
                C41536l.m120488h(context, "itemView.context");
                num = Integer.valueOf(C32343x.m95418U(intValue, context));
            } else {
                num = null;
            }
            packageCardView.setBackgroundColor(num);
            packageCardView.setHeaderData(bVar.mo44991f());
            packageCardView.setLimitInfoData(bVar.mo44993h());
            packageCardView.setTransactionsData(bVar.mo45000n());
            packageCardView.setInfoTextsData(bVar.mo44992g());
            packageCardView.setButtonData(bVar.mo44986b());
        }
    }

    /* renamed from: op.i$c */
    public interface C17316c {
        /* renamed from: a */
        void mo33464a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17313i(C17316c cVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(cVar, "soloCardClickListener");
        this.f48623f = cVar;
    }

    public int getItemViewType(int i) {
        if (((C17472b) mo6027g(i)) instanceof C17472b.C17474b) {
            return C10115g.item_package_card;
        }
        return C10115g.item_benef_type;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C17315b) {
            Object g = mo6027g(i);
            C41536l.m120487g(g, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.shared.model.PackageDataItem.PackageInfoUiModel");
            ((C17315b) f0Var).mo44730h((C17472b.C17474b) g);
        } else if (f0Var instanceof C17314a) {
            Object g2 = mo6027g(i);
            C41536l.m120487g(g2, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.shared.model.PackageDataItem.PackageBecomeSoloUiModel");
            ((C17314a) f0Var).mo44729i((C17472b.C17473a) g2);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C10115g.item_package_card) {
            C12763p0 d = C12763p0.m48449d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
            return new C17315b(d);
        }
        C12739e0 d2 = C12739e0.m48350d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d2, "inflate(LayoutInflater.f….context), parent, false)");
        return new C17314a(d2, this.f48623f);
    }
}
