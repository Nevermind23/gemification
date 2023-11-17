package n10;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m10.C26122f;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import t10.C28296a;
import ue1.C43075l;

/* renamed from: n10.q */
public final class C26357q extends RecyclerView.C1734f0 {

    /* renamed from: o */
    public static final C26358a f66764o = new C26358a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final Handler f66765p = new Handler();

    /* renamed from: d */
    private final SwipeLayout f66766d;

    /* renamed from: e */
    private final TextView f66767e;

    /* renamed from: f */
    private final TextView f66768f;

    /* renamed from: g */
    private final ImageView f66769g;

    /* renamed from: h */
    private C43075l f66770h;

    /* renamed from: i */
    private C43075l f66771i;

    /* renamed from: j */
    private C43075l f66772j;

    /* renamed from: k */
    private C43075l f66773k;

    /* renamed from: l */
    private final PopupWindow f66774l;

    /* renamed from: m */
    private final Context f66775m;

    /* renamed from: n */
    private final Handler f66776n = new Handler();

    /* renamed from: n10.q$a */
    public static final class C26358a {
        private C26358a() {
        }

        public /* synthetic */ C26358a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26357q mo65548a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_contact_treasury_swipeable, viewGroup, false);
            C41536l.m120488h(inflate, "itemView");
            return new C26357q(inflate);
        }

        /* renamed from: b */
        public final Handler mo65549b() {
            return C26357q.f66765p;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26357q(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.treasury_swipe_layout);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.treasury_swipe_layout)");
        this.f66766d = (SwipeLayout) findViewById;
        View findViewById2 = view.findViewById(C10322k.treasury_name_tv);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.treasury_name_tv)");
        this.f66767e = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.treasury_code_tv);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.treasury_code_tv)");
        this.f66768f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C10322k.favorite_icon_image);
        C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.favorite_icon_image)");
        this.f66769g = (ImageView) findViewById4;
        Context context = view.getContext();
        C41536l.m120488h(context, "itemView.context");
        this.f66775m = context;
        view.setOnLongClickListener(new C26353m(this));
        View inflate = LayoutInflater.from(context).inflate(C10324m.layout_contact_account_favorite_hint, (ViewGroup) null);
        C26122f fVar = C26122f.f66243a;
        C41536l.m120488h(inflate, "content");
        this.f66774l = fVar.mo65034g(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m82376l(C26357q qVar, View view) {
        C41536l.m120489i(qVar, "this$0");
        qVar.f66766d.mo7588f(true);
        qVar.f66766d.mo7586B(1, true);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m82378o(C26357q qVar, C28296a aVar, View view) {
        C41536l.m120489i(qVar, "this$0");
        C41536l.m120489i(aVar, "$treasuryCode");
        C43075l lVar = qVar.f66771i;
        if (lVar != null) {
            lVar.invoke(aVar.mo67926a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m82379p(C26357q qVar, C28296a aVar, boolean z, String str) {
        C41536l.m120489i(qVar, "this$0");
        C41536l.m120489i(aVar, "$treasuryCode");
        qVar.f66766d.mo7586B(2, true);
        if (C41536l.m120484d(str, "DELETE_ID")) {
            qVar.f66766d.mo7588f(true);
            C43075l lVar = qVar.f66772j;
            if (lVar != null) {
                lVar.invoke(aVar.mo67926a());
            }
        } else if (C41536l.m120484d(str, "SHARE_ID")) {
            qVar.f66766d.mo7588f(true);
            C43075l lVar2 = qVar.f66773k;
            if (lVar2 != null) {
                lVar2.invoke(aVar.mo67926a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m82380q(C26357q qVar, C28296a aVar, View view) {
        C41536l.m120489i(qVar, "this$0");
        C41536l.m120489i(aVar, "$treasuryCode");
        C43075l lVar = qVar.f66770h;
        if (lVar != null) {
            lVar.invoke(aVar.mo67926a());
        }
    }

    /* renamed from: n */
    public final void mo65543n(C28296a aVar) {
        int i;
        C41536l.m120489i(aVar, "treasuryCode");
        C26122f fVar = C26122f.f66243a;
        fVar.mo65033f(this.f66766d);
        this.f66768f.setText(aVar.mo67926a());
        this.f66767e.setText(aVar.mo67927b());
        ImageView imageView = this.f66769g;
        if (aVar.mo67929d()) {
            i = C10320i.ic_vector_star_filled;
        } else {
            i = C10320i.f28690h9;
        }
        imageView.setImageResource(i);
        this.f66769g.setOnClickListener(new C26354n(this, aVar));
        this.f66766d.setOnSwipeItemClickListener(new C26355o(this, aVar));
        this.itemView.setOnClickListener(new C26356p(this, aVar));
        fVar.mo65035i(this.f66776n, this.f66766d, this.f66774l, this.f66769g);
    }

    /* renamed from: r */
    public final void mo65544r(C43075l lVar) {
        this.f66770h = lVar;
    }

    /* renamed from: s */
    public final void mo65545s(C43075l lVar) {
        this.f66771i = lVar;
    }

    /* renamed from: t */
    public final void mo65546t(C43075l lVar) {
        this.f66772j = lVar;
    }

    /* renamed from: u */
    public final void mo65547u(C43075l lVar) {
        this.f66773k = lVar;
    }
}
