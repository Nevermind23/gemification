package p452hl;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.textselectorcard.TextSelectorCardView;
import p438gl.C15292b;
import p451hk.C15529g;
import p493kk.C16464r;
import ue1.C43075l;

/* renamed from: hl.b */
public final class C15531b extends RecyclerView.C1736h {

    /* renamed from: g */
    public static final C15532a f44093g = new C15532a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private List f44094d = C41341q.m119907j();

    /* renamed from: e */
    private int f44095e = -1;

    /* renamed from: f */
    private C43075l f44096f;

    /* renamed from: hl.b$a */
    public static final class C15532a {
        private C15532a() {
        }

        public /* synthetic */ C15532a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: hl.b$b */
    public static final class C15533b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C16464r f44097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15533b(C16464r rVar) {
            super(rVar.mo3946b());
            C41536l.m120489i(rVar, "binding");
            this.f44097d = rVar;
        }

        /* renamed from: h */
        public final C16464r mo42645h() {
            return this.f44097d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m56104h(C15531b bVar, C15533b bVar2, TextSelectorCardView textSelectorCardView, boolean z) {
        int i;
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(bVar2, "$holder");
        C41536l.m120489i(textSelectorCardView, "<anonymous parameter 0>");
        int i2 = bVar.f44095e;
        int bindingAdapterPosition = bVar2.getBindingAdapterPosition();
        if (z) {
            i = bindingAdapterPosition;
        } else {
            i = -1;
        }
        bVar.f44095e = i;
        C43075l lVar = bVar.f44096f;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i));
        }
        if (i2 != -1 && i2 != bindingAdapterPosition) {
            bVar.notifyItemChanged(i2);
        }
    }

    /* renamed from: g */
    public void onBindViewHolder(C15533b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        C15292b bVar2 = (C15292b) this.f44094d.get(i);
        TextSelectorCardView c = bVar.mo42645h().mo3946b();
        boolean z = true;
        c.setLine1(c.getContext().getString(C15529g.insurance_package_item_label_limit));
        c.setLine2(bVar2.mo42374a());
        c.setLine3Text1(bVar2.mo42375b());
        c.setLine3Text2(c.getContext().getString(C15529g.insurance_package_item_label_per_month));
        c.setLine4(bVar2.mo42376c(), " " + c.getContext().getString(C15529g.insurance_package_item_label_annually));
        c.setOnSelectionChangeListener((TextSelectorCardView.C13543a) null);
        if (this.f44095e != i) {
            z = false;
        }
        c.setSelected(z);
        c.setOnSelectionChangeListener(new C15530a(this, bVar));
    }

    public int getItemCount() {
        return this.f44094d.size();
    }

    /* renamed from: i */
    public C15533b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C16464r d = C16464r.m58662d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C15533b(d);
    }

    /* renamed from: j */
    public final void mo42643j(C43075l lVar) {
        this.f44096f = lVar;
    }

    /* renamed from: k */
    public final void mo42644k(List list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        this.f44094d = list;
        notifyDataSetChanged();
    }
}
