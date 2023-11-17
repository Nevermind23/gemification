package p341ge.bog.mobilebank.loanactivation.presentation.subtypes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import np0.C37436b;
import np0.C37443i;
import o31.C37599g;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import sp0.C38504w;
import uq0.C39060a;
import vq0.C39437a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.b */
public final class C32510b extends C1819o {

    /* renamed from: f */
    private final C32511a f80132f;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.b$a */
    public interface C32511a {
        /* renamed from: a */
        void mo73568a(C39437a aVar);
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.b$b */
    public static final class C32512b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38504w f80133d;

        /* renamed from: e */
        private final C32511a f80134e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32512b(C38504w wVar, C32511a aVar) {
            super(wVar.mo3946b());
            C41536l.m120489i(wVar, "binding");
            C41536l.m120489i(aVar, "callback");
            this.f80133d = wVar;
            this.f80134e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m96110j(C32512b bVar, C39437a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "$item");
            bVar.f80134e.mo73568a(aVar);
        }

        /* renamed from: i */
        public final void mo73576i(C39437a aVar) {
            C41536l.m120489i(aVar, "item");
            EmptyWidget emptyWidget = this.f80133d.f92297e;
            emptyWidget.setTitle(aVar.mo93070g());
            emptyWidget.setText(aVar.mo93065c());
            emptyWidget.setEnableTwoLineText(true);
            TextImageCardView textImageCardView = this.f80133d.f92298f;
            textImageCardView.setImage(new Image.Resource(aVar.mo93067e(), (Boolean) null, 2, (DefaultConstructorMarker) null));
            textImageCardView.setDescription(C32303f.m95203n(aVar.mo93063a(), aVar.mo93064b()));
            textImageCardView.setText(C32343x.m95388F("loan.offer.subtypes.page.effective.int.rate", aVar.mo93066d()));
            textImageCardView.mo36860c(Integer.valueOf(C37443i.f90021g), new Color.Resource(C37436b.f89969c));
            textImageCardView.mo36862e(Integer.valueOf(C37443i.f90020f), new Color.Resource(C37436b.f89968b));
            this.itemView.setOnClickListener(new C39060a(this, aVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32510b(C32511a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, "callback");
        this.f80132f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C32512b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        bVar.mo73576i((C39437a) obj);
    }

    /* renamed from: l */
    public C32512b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C38504w d = C38504w.m113031d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C32512b(d, this.f80132f);
    }
}
