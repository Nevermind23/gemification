package k60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g60.C20742c;
import g91.C32307h;
import g91.C32359z0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p794ix.C25265a;
import r90.C27950a;
import ue1.C43075l;

/* renamed from: k60.e */
public final class C25675e extends C20742c {

    /* renamed from: i */
    public static final C25676a f65396i = new C25676a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C43075l f65397d;

    /* renamed from: e */
    private final BogImageView f65398e;

    /* renamed from: f */
    private final BogTextView f65399f;

    /* renamed from: g */
    private final BogTextView f65400g;

    /* renamed from: h */
    private final BogTextView f65401h;

    /* renamed from: k60.e$a */
    public static final class C25676a {
        private C25676a() {
        }

        public /* synthetic */ C25676a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25675e mo64180a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_umts_card, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context).inf…umts_card, parent, false)");
            return new C25675e(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25675e(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.umts_card_image);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.umts_card_image)");
        this.f65398e = (BogImageView) findViewById;
        View findViewById2 = view.findViewById(C10322k.umts_card_name);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.umts_card_name)");
        this.f65399f = (BogTextView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.umts_card_number);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.umts_card_number)");
        this.f65400g = (BogTextView) findViewById3;
        View findViewById4 = view.findViewById(C10322k.umts_card_exp_date);
        C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.umts_card_exp_date)");
        this.f65401h = (BogTextView) findViewById4;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m80848j(C25675e eVar, C25265a aVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(aVar, "$data");
        C43075l lVar = eVar.f65397d;
        if (lVar != null) {
            lVar.invoke(aVar);
        }
    }

    /* renamed from: i */
    public void onBind(C25265a aVar) {
        long j;
        C41536l.m120489i(aVar, "data");
        this.f65399f.setText(C27950a.m86287d(aVar.mo63854d(), false, 2, (Object) null));
        BogTextView bogTextView = this.f65400g;
        String c = aVar.mo63853c();
        bogTextView.setText("**** " + c);
        BogTextView bogTextView2 = this.f65401h;
        Long b = aVar.mo63852b();
        if (b != null) {
            j = b.longValue();
        } else {
            j = 0;
        }
        bogTextView2.setText(C32359z0.m95546Q(j, "dd/mm/yyyy"));
        this.f65398e.setImageResource(C32307h.m95224a(aVar.mo63855e()));
        this.itemView.setOnClickListener(new C25674d(this, aVar));
    }

    /* renamed from: k */
    public final void mo64179k(C43075l lVar) {
        this.f65397d = lVar;
    }
}
