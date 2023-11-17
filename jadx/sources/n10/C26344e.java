package n10;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

/* renamed from: n10.e */
public final class C26344e extends RecyclerView.C1734f0 {

    /* renamed from: p */
    public static final C26345a f66718p = new C26345a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final Handler f66719q = new Handler();

    /* renamed from: d */
    private final SwipeLayout f66720d;

    /* renamed from: e */
    private final TextView f66721e;

    /* renamed from: f */
    private final ImageView f66722f;

    /* renamed from: g */
    private final ImageView f66723g;

    /* renamed from: h */
    private final FrameLayout f66724h;

    /* renamed from: i */
    private final View f66725i;

    /* renamed from: j */
    private Context f66726j;

    /* renamed from: k */
    private C43075l f66727k;

    /* renamed from: l */
    private C43075l f66728l;

    /* renamed from: m */
    private C43075l f66729m;

    /* renamed from: n */
    private C43075l f66730n;

    /* renamed from: o */
    private final PopupWindow f66731o;

    /* renamed from: n10.e$a */
    public static final class C26345a {
        private C26345a() {
        }

        public /* synthetic */ C26345a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26344e mo65525a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_contact_account_swipeable, viewGroup, false);
            C41536l.m120488h(inflate, "itemView");
            return new C26344e(inflate);
        }

        /* renamed from: b */
        public final Handler mo65526b() {
            return C26344e.f66719q;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26344e(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.contact_account_swipe_layout);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.…act_account_swipe_layout)");
        this.f66720d = (SwipeLayout) findViewById;
        View findViewById2 = view.findViewById(C10322k.contact_account_number_text_view);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.…account_number_text_view)");
        this.f66721e = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.contact_bank_logo);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.contact_bank_logo)");
        this.f66722f = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(C10322k.contact_favorite_icon);
        C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.contact_favorite_icon)");
        this.f66723g = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(C10322k.contact_favorite_layout);
        C41536l.m120488h(findViewById5, "itemView.findViewById(R.….contact_favorite_layout)");
        this.f66724h = (FrameLayout) findViewById5;
        View findViewById6 = view.findViewById(C10322k.account_container);
        C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.account_container)");
        this.f66725i = findViewById6;
        Context context = view.getContext();
        C41536l.m120488h(context, "itemView.context");
        this.f66726j = context;
        view.setOnLongClickListener(new C26340a(this));
        View inflate = LayoutInflater.from(this.f66726j).inflate(C10324m.layout_contact_account_favorite_hint, (ViewGroup) null);
        C26122f fVar = C26122f.f66243a;
        C41536l.m120488h(inflate, "content");
        this.f66731o = fVar.mo65034g(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m82340l(C26344e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.f66720d.mo7588f(true);
        eVar.f66720d.mo7586B(1, true);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m82342o(C26344e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C43075l lVar = eVar.f66727k;
        if (lVar != null) {
            CharSequence text = eVar.f66721e.getText();
            C41536l.m120487g(text, "null cannot be cast to non-null type kotlin.String");
            lVar.invoke((String) text);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m82343p(C26344e eVar, C28296a aVar, boolean z, String str) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(aVar, "$acctNo");
        eVar.f66720d.mo7586B(2, true);
        if (C41536l.m120484d(str, "DELETE_ID")) {
            eVar.f66720d.mo7588f(true);
            C43075l lVar = eVar.f66728l;
            if (lVar != null) {
                lVar.invoke(aVar.mo67926a());
            }
        } else if (C41536l.m120484d(str, "SHARE_ID")) {
            eVar.f66720d.mo7588f(true);
            C43075l lVar2 = eVar.f66729m;
            if (lVar2 != null) {
                lVar2.invoke(aVar.mo67926a());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m82344q(C26344e eVar, C28296a aVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(aVar, "$acctNo");
        C43075l lVar = eVar.f66730n;
        if (lVar != null) {
            lVar.invoke(aVar.mo67926a());
        }
    }

    /* renamed from: n */
    public final void mo65520n(C28296a aVar) {
        int i;
        C41536l.m120489i(aVar, "acctNo");
        this.f66721e.setText(aVar.mo67926a());
        C26122f fVar = C26122f.f66243a;
        fVar.mo65033f(this.f66720d);
        ImageView imageView = this.f66723g;
        if (aVar.mo67929d()) {
            i = C10320i.ic_vector_star_filled;
        } else {
            i = C10320i.f28690h9;
        }
        imageView.setImageResource(i);
        this.f66722f.setImageResource(aVar.mo67928c());
        this.f66724h.setOnClickListener(new C26341b(this));
        this.f66720d.setOnSwipeItemClickListener(new C26342c(this, aVar));
        this.f66725i.setOnClickListener(new C26343d(this, aVar));
        fVar.mo65035i(f66719q, this.f66720d, this.f66731o, this.f66723g);
    }

    /* renamed from: r */
    public final void mo65521r(C43075l lVar) {
        this.f66730n = lVar;
    }

    /* renamed from: s */
    public final void mo65522s(C43075l lVar) {
        this.f66727k = lVar;
    }

    /* renamed from: t */
    public final void mo65523t(C43075l lVar) {
        this.f66728l = lVar;
    }

    /* renamed from: u */
    public final void mo65524u(C43075l lVar) {
        this.f66729m = lVar;
    }
}
