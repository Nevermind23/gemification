package u71;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import c71.C31287g;
import g71.C32122o;
import g91.C32343x;
import j71.C36758j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.textselectorcard.TextSelectorCardView;
import ue1.C43075l;

/* renamed from: u71.b */
public final class C39037b extends C1819o {

    /* renamed from: h */
    public static final C39038a f93172h = new C39038a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C43075l f93173f;

    /* renamed from: g */
    private int f93174g = -1;

    /* renamed from: u71.b$a */
    public static final class C39038a {
        private C39038a() {
        }

        public /* synthetic */ C39038a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: u71.b$b */
    public final class C39039b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C32122o f93175d;

        /* renamed from: e */
        final /* synthetic */ C39037b f93176e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39039b(C39037b bVar, C32122o oVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f93176e = bVar;
            this.f93175d = oVar;
        }

        /* renamed from: h */
        public final C32122o mo92721h() {
            return this.f93175d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39037b(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onPassTypeSelected");
        this.f93173f = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m113973m(C39037b bVar, C39039b bVar2, TextSelectorCardView textSelectorCardView, boolean z) {
        int i;
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(bVar2, "$holder");
        C41536l.m120489i(textSelectorCardView, "<anonymous parameter 0>");
        int i2 = bVar.f93174g;
        int bindingAdapterPosition = bVar2.getBindingAdapterPosition();
        if (z) {
            i = bindingAdapterPosition;
        } else {
            i = -1;
        }
        bVar.f93174g = i;
        if (i != -1) {
            C43075l lVar = bVar.f93173f;
            Object g = bVar.mo6027g(i);
            C41536l.m120488h(g, "getItem(selected)");
            lVar.invoke(g);
        }
        if (!(i2 == -1 || i2 == bindingAdapterPosition)) {
            bVar.notifyItemChanged(i2);
        }
        if (i2 != -1 && i2 == bindingAdapterPosition) {
            bVar2.mo92721h().mo3946b().setSelected(true);
        }
    }

    /* renamed from: l */
    public void onBindViewHolder(C39039b bVar, int i) {
        boolean z;
        C41536l.m120489i(bVar, "holder");
        C36758j jVar = (C36758j) mo6027g(i);
        TextSelectorCardView c = bVar.mo92721h().mo3946b();
        boolean z2 = true;
        c.setLine1(c.getContext().getString(C31287g.tc_pass));
        c.setLine2(C32343x.m95388F(jVar.mo89641b(), new Object[0]));
        c.setLine3Text1(C32343x.m95410Q(jVar.mo89640a(), "GEL", false, 2, (Object) null));
        c.setOnSelectionChangeListener((TextSelectorCardView.C13543a) null);
        if (this.f93174g == i) {
            z = true;
        } else {
            z = false;
        }
        c.setSelected(z);
        if (this.f93174g == i) {
            z2 = false;
        }
        c.setClickable(z2);
        c.setOnSelectionChangeListener(new C39036a(this, bVar));
    }

    /* renamed from: n */
    public C39039b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C32122o d = C32122o.m94623d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C39039b(this, d);
    }

    /* renamed from: o */
    public final void mo92720o(int i) {
        int i2 = this.f93174g;
        if (i2 != i) {
            this.f93174g = i;
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
            if (i != -1) {
                notifyItemChanged(i);
            }
        }
    }
}
