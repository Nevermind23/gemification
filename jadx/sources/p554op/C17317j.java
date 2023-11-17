package p554op;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.packagecard.PackageCardView;
import p356ao.C10112d;
import p356ao.C10115g;
import p413eo.C12742f0;
import p413eo.C12763p0;
import p568pp.C17472b;
import p615tg.C17963d;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: op.j */
public final class C17317j extends C1819o {

    /* renamed from: op.j$a */
    public static final class C17318a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12742f0 f48627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17318a(C12742f0 f0Var) {
            super(f0Var.mo3946b());
            C41536l.m120489i(f0Var, "binding");
            this.f48627d = f0Var;
        }

        /* renamed from: h */
        public final void mo44731h() {
            ImageView imageView = this.f48627d.f37721g;
            C41536l.m120488h(imageView, "binding.soloImage");
            C18368l.m62746A(imageView, new Image.Resource(C10112d.solo_icon, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
            this.f48627d.f37720f.setText(C32343x.m95388F("text.packages.solo.card.static.header", new Object[0]));
            this.f48627d.f37719e.setText(C32343x.m95388F("text.packages.solo.card.static.details", new Object[0]));
        }
    }

    /* renamed from: op.j$b */
    public static final class C17319b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12763p0 f48628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17319b(C12763p0 p0Var) {
            super(p0Var.mo3946b());
            C41536l.m120489i(p0Var, "binding");
            this.f48628d = p0Var;
        }

        /* renamed from: h */
        public final void mo44732h(C17472b.C17474b bVar) {
            C41536l.m120489i(bVar, "info");
            PackageCardView packageCardView = this.f48628d.f37822e;
            packageCardView.setForceWhiteTexts(bVar.mo44989e());
            packageCardView.setHeaderData(bVar.mo44991f());
        }
    }

    public C17317j() {
        super(C17963d.f51158a.mo45633d());
    }

    public int getItemViewType(int i) {
        if (((C17472b) mo6027g(i)) instanceof C17472b.C17474b) {
            return C10115g.item_package_card;
        }
        return C10115g.item_benef_type;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C17319b) {
            Object g = mo6027g(i);
            C41536l.m120487g(g, "null cannot be cast to non-null type ge.bog.mobilebank.categorypackages.presentation.shared.model.PackageDataItem.PackageInfoUiModel");
            ((C17319b) f0Var).mo44732h((C17472b.C17474b) g);
        } else if (f0Var instanceof C17318a) {
            ((C17318a) f0Var).mo44731h();
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C10115g.item_package_card) {
            C12763p0 d = C12763p0.m48449d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
            return new C17319b(d);
        }
        C12742f0 d2 = C12742f0.m48362d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
        return new C17318a(d2);
    }
}
