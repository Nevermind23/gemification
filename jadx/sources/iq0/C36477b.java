package iq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import g91.C32343x;
import he1.C41212c;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import lq0.C37124a;
import o31.C37599g;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import sp0.C38503v;
import ue1.C43075l;

/* renamed from: iq0.b */
public final class C36477b extends C1819o {

    /* renamed from: f */
    private final C37124a f87977f;

    /* renamed from: g */
    private final C43075l f87978g;

    /* renamed from: iq0.b$a */
    public static final class C36478a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C38503v f87979d;

        /* renamed from: e */
        private final C36479b f87980e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36478a(C38503v vVar, C36479b bVar) {
            super(vVar.mo3946b());
            C41536l.m120489i(vVar, "binding");
            C41536l.m120489i(bVar, "onTermClicked");
            this.f87979d = vVar;
            this.f87980e = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m108214j(C36478a aVar, int i, View view) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f87980e.mo89278a(i);
        }

        /* renamed from: i */
        public final void mo89277i(int i, C37124a aVar) {
            C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
            SingleLineTextItem singleLineTextItem = this.f87979d.f92295g;
            String F = C32343x.m95388F(aVar.mo90073O(), new Object[0]);
            singleLineTextItem.setText(i + " " + F);
            this.f87979d.mo3946b().setOnClickListener(new C36476a(this, i));
        }
    }

    /* renamed from: iq0.b$b */
    public interface C36479b {
        /* renamed from: a */
        void mo89278a(int i);
    }

    /* renamed from: iq0.b$c */
    static final class C36480c implements C36479b, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f87981a;

        C36480c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f87981a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo89278a(int i) {
            this.f87981a.invoke(Integer.valueOf(i));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C36479b) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f87981a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36477b(C37124a aVar, C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
        C41536l.m120489i(lVar, "onTermClicked");
        this.f87977f = aVar;
        this.f87978g = lVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C36478a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo89277i(((Number) g).intValue(), this.f87977f);
    }

    /* renamed from: l */
    public C36478a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C38503v d = C38503v.m113027d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C36478a(d, new C36480c(this.f87978g));
    }
}
