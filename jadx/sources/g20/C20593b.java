package g20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37107d;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.activity.OperationsActivity;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: g20.b */
public final class C20593b extends C37107d {

    /* renamed from: f */
    public static final C20594a f55645f = new C20594a((DefaultConstructorMarker) null);

    /* renamed from: g20.b$a */
    public static final class C20594a {
        private C20594a() {
        }

        public /* synthetic */ C20594a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C20593b mo49139a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_all_transactions_button, viewGroup, false);
            C41536l.m120488h(inflate, "itemView");
            return new C20593b(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20593b(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        ((MaterialButton) view.findViewById(C10322k.all_transactions_button)).setOnClickListener(new C20591a(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66854j(View view, View view2) {
        C41536l.m120489i(view, "$itemView");
        C36546y.m108282F().mo27152s("statement", "", "seeAll");
        OperationsActivity.C22259a aVar = OperationsActivity.f59076G;
        Context context = view.getContext();
        C41536l.m120488h(context, "itemView.context");
        OperationsActivity.C22259a.m72122b(aVar, context, (Long) null, 2, (Object) null);
    }
}
