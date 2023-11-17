package u30;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o30.C26715e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p366bk.C10313b;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r30.C27909i;
import ue1.C43064a;
import ue1.C43075l;
import v30.C28987d;

/* renamed from: u30.s */
public final class C28572s extends C28567n {

    /* renamed from: o */
    public static final C28573a f72514o = new C28573a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final TextView f72515d;

    /* renamed from: e */
    private final View f72516e;

    /* renamed from: f */
    private final View f72517f;

    /* renamed from: g */
    private final StateView f72518g;

    /* renamed from: h */
    private final RecyclerView f72519h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C43064a f72520i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C43064a f72521j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C43075l f72522k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C43064a f72523l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C43064a f72524m;

    /* renamed from: n */
    private final Animation f72525n;

    /* renamed from: u30.s$a */
    public static final class C28573a {
        private C28573a() {
        }

        public /* synthetic */ C28573a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28572s mo68309a(ViewGroup viewGroup, C43075l lVar, C43064a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            C41536l.m120489i(viewGroup, "parent");
            C28572s sVar = new C28572s(C32343x.m95473o0(viewGroup, C10324m.item_payment_group, false, 2, (Object) null));
            sVar.f72520i = aVar;
            sVar.f72521j = aVar2;
            sVar.f72522k = lVar;
            sVar.f72523l = aVar3;
            sVar.f72524m = aVar4;
            return sVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28572s(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f72515d = (TextView) view.findViewById(C10322k.payments_header_text);
        this.f72516e = view.findViewById(C10322k.create_template_text);
        this.f72517f = view.findViewById(C10322k.all_payments_text);
        this.f72518g = (StateView) view.findViewById(C10322k.f28746Hv);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C10322k.payments_recycler);
        this.f72519h = recyclerView;
        this.f72525n = AnimationUtils.loadAnimation(view.getContext(), C10313b.infinite_alpha);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m87537r(C28572s sVar, View view) {
        C41536l.m120489i(sVar, "this$0");
        C43064a aVar = sVar.f72520i;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m87538s(C28572s sVar, View view) {
        C41536l.m120489i(sVar, "this$0");
        C43064a aVar = sVar.f72521j;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m87539t(C28572s sVar, View view) {
        C41536l.m120489i(sVar, "this$0");
        C43064a aVar = sVar.f72523l;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m87540u(C28572s sVar, View view) {
        C41536l.m120489i(sVar, "this$0");
        C43064a aVar = sVar.f72524m;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: v */
    private final void m87541v(C27909i iVar) {
        if (C41536l.m120484d(iVar, C27909i.C27912c.f71100b)) {
            this.f72518g.mo53598f();
        } else if (C41536l.m120484d(iVar, C27909i.C27911b.f71099b)) {
            this.f72518g.mo53597e();
        } else if (C41536l.m120484d(iVar, C27909i.C27910a.f71098b)) {
            this.f72518g.mo53596d();
        } else if (iVar instanceof C27909i.C27913d) {
            this.f72518g.mo53595c();
        }
    }

    /* renamed from: q */
    public void onBind(C27909i iVar) {
        boolean z;
        int i;
        C41536l.m120489i(iVar, "item");
        m87541v(iVar);
        View loadingView = this.f72518g.getLoadingView();
        if (loadingView == null || loadingView.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View loadingView2 = this.f72518g.getLoadingView();
            C41536l.m120486f(loadingView2);
            loadingView2.startAnimation(this.f72525n);
        } else {
            View loadingView3 = this.f72518g.getLoadingView();
            if (loadingView3 != null) {
                loadingView3.clearAnimation();
            }
        }
        View view = this.f72517f;
        C41536l.m120488h(view, "allPaymentsButton");
        boolean z2 = iVar instanceof C27909i.C27913d;
        C32343x.m95483r1(view, z2, false, 2, (Object) null);
        View view2 = this.f72516e;
        C41536l.m120488h(view2, "createTemplateButton");
        C27909i.C27912c cVar = C27909i.C27912c.f71100b;
        C32343x.m95483r1(view2, C41536l.m120484d(iVar, cVar), false, 2, (Object) null);
        this.f72516e.setOnClickListener(new C28568o(this));
        this.f72517f.setOnClickListener(new C28569p(this));
        TextView textView = this.f72515d;
        if (C41536l.m120484d(iVar, cVar)) {
            i = C10328q.payments_label_payments_header;
        } else {
            i = C10328q.payments_label_my_payments_header;
        }
        textView.setText(i);
        this.f72519h.setAdapter((RecyclerView.C1736h) null);
        if (z2) {
            this.f72519h.setAdapter(new C26715e(((C27909i.C27913d) iVar).mo67486b(), new C28987d(), this.f72522k));
        }
        View noDataView = this.f72518g.getNoDataView();
        if (noDataView != null) {
            noDataView.setOnClickListener(new C28570q(this));
        }
        View errorView = this.f72518g.getErrorView();
        if (errorView != null) {
            errorView.setOnClickListener(new C28571r(this));
        }
    }
}
