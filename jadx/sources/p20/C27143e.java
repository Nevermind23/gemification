package p20;

import a30.C19151a;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10320i;
import p366bk.C10324m;
import p90.C27447v4;
import p90.C27456w4;

/* renamed from: p20.e */
public final class C27143e extends C1819o {

    /* renamed from: f */
    private final boolean f68136f;

    /* renamed from: g */
    private C27147d f68137g;

    /* renamed from: h */
    private C27146c f68138h;

    /* renamed from: p20.e$a */
    public static final class C27144a {

        /* renamed from: a */
        public static final C27144a f68139a = new C27144a();

        private C27144a() {
        }
    }

    /* renamed from: p20.e$b */
    public static final class C27145b extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27145b(C27447v4 v4Var) {
            super(v4Var.mo3946b());
            C41536l.m120489i(v4Var, "binding");
        }
    }

    /* renamed from: p20.e$c */
    public interface C27146c {
        /* renamed from: a */
        void mo65907a();
    }

    /* renamed from: p20.e$d */
    public interface C27147d {
        /* renamed from: a */
        void mo48903a(C19151a aVar);
    }

    /* renamed from: p20.e$e */
    public static final class C27148e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27456w4 f68140d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27148e(C27456w4 w4Var, boolean z) {
            super(w4Var.mo3946b());
            C41536l.m120489i(w4Var, "binding");
            this.f68140d = w4Var;
            ImageView imageView = w4Var.f70175h;
            C41536l.m120488h(imageView, "binding.xBadgeImage");
            C32343x.m95483r1(imageView, !z, false, 2, (Object) null);
        }

        /* renamed from: h */
        public final void mo66443h(C19151a aVar) {
            C41536l.m120489i(aVar, "operation");
            this.f68140d.f70173f.setText(aVar.mo47357c());
            this.f68140d.f70172e.setText(C32343x.m95410Q(aVar.mo47355a(), "₾", false, 2, (Object) null));
            if (aVar.mo47361f()) {
                this.f68140d.f70174g.setBackground((Drawable) null);
                this.f68140d.f70174g.setImageDrawable(C0767a.m2895e(this.itemView.getContext(), C10320i.ic_cash_opeation_full));
                return;
            }
            this.f68140d.f70174g.setBackground(C0767a.m2895e(this.itemView.getContext(), C10320i.bg_circle_bill_split_operation));
            ImageView imageView = this.f68140d.f70174g;
            String d = aVar.mo47358d();
            int i = C10320i.f28688dc;
            C32289b0.m95107s(imageView, d, Integer.valueOf(i), Integer.valueOf(i), true, aVar.mo47356b());
        }
    }

    /* renamed from: p20.e$f */
    public static final class C27149f extends C1796h.C1802f {

        /* renamed from: a */
        public static final C27149f f68141a = new C27149f();

        private C27149f() {
        }

        /* renamed from: a */
        public boolean mo5976a(Object obj, Object obj2) {
            C41536l.m120489i(obj, "oldItem");
            C41536l.m120489i(obj2, "newItem");
            return true;
        }

        /* renamed from: b */
        public boolean mo5977b(Object obj, Object obj2) {
            C41536l.m120489i(obj, "oldItem");
            C41536l.m120489i(obj2, "newItem");
            return C41536l.m120484d(obj, obj2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27143e(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m84105n(C27143e eVar, C19151a aVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(aVar, "$operation");
        C27147d dVar = eVar.f68137g;
        if (dVar != null) {
            dVar.mo48903a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m84106o(C27143e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C27146c cVar = eVar.f68138h;
        if (cVar != null) {
            cVar.mo65907a();
        }
    }

    public int getItemViewType(int i) {
        Object g = mo6027g(i);
        if (C41536l.m120484d(g, C27144a.f68139a)) {
            return C10324m.item_bill_split_operation_add_cash;
        }
        if (g instanceof C19151a) {
            return C10324m.item_bill_split_operation_horizontal;
        }
        throw new IllegalArgumentException("Unknown View Type");
    }

    /* renamed from: m */
    public final void mo66441m(C27146c cVar) {
        C41536l.m120489i(cVar, "onAddCashOperationClickListener");
        this.f68138h = cVar;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C27148e) {
            Object g = mo6027g(i);
            C41536l.m120487g(g, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.moneyrequest.model.BillSplitOperationItem");
            C19151a aVar = (C19151a) g;
            ((C27148e) f0Var).mo66443h(aVar);
            f0Var.itemView.setOnClickListener(new C27141c(this, aVar));
        } else if (f0Var instanceof C27145b) {
            f0Var.itemView.setOnClickListener(new C27142d(this));
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C10324m.item_bill_split_operation_add_cash) {
            C27447v4 d = C27447v4.m85098d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C27145b(d);
        } else if (i == C10324m.item_bill_split_operation_horizontal) {
            C27456w4 d2 = C27456w4.m85132d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C27148e(d2, this.f68136f);
        } else {
            throw new IllegalArgumentException("Invalid View Type");
        }
    }

    /* renamed from: p */
    public final void mo66442p(C27147d dVar) {
        C41536l.m120489i(dVar, "onOperationClickListener");
        this.f68137g = dVar;
    }

    public C27143e(boolean z) {
        super(C27149f.f68141a);
        this.f68136f = z;
    }
}
