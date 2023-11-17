package u10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import t10.C28296a;
import ue1.C43075l;

/* renamed from: u10.d */
public final class C28539d extends RecyclerView.C1734f0 {

    /* renamed from: h */
    public static final C28540a f72447h = new C28540a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private ImageView f72448d;

    /* renamed from: e */
    private TextView f72449e;

    /* renamed from: f */
    private TextView f72450f;

    /* renamed from: g */
    private C43075l f72451g;

    /* renamed from: u10.d$a */
    public static final class C28540a {
        private C28540a() {
        }

        public /* synthetic */ C28540a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28539d mo68273a(ViewGroup viewGroup) {
            C41536l.m120489i(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.contact_treasury_layout, viewGroup, false);
            C41536l.m120488h(inflate, "itemView");
            return new C28539d(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28539d(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.favorite_icon_image);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.favorite_icon_image)");
        this.f72448d = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C10322k.treasury_name_tv);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.treasury_name_tv)");
        this.f72449e = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.treasury_code_tv);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.treasury_code_tv)");
        this.f72450f = (TextView) findViewById3;
        this.f72448d.setImageResource(C10320i.ic_contact_account_delete);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m87471j(C28539d dVar, C28296a aVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(aVar, "$treasuryCode");
        C43075l lVar = dVar.f72451g;
        if (lVar != null) {
            lVar.invoke(aVar.mo67926a());
        }
    }

    /* renamed from: i */
    public final void mo68271i(C28296a aVar) {
        C41536l.m120489i(aVar, "treasuryCode");
        this.f72450f.setText(aVar.mo67926a());
        this.f72449e.setText(aVar.mo67927b());
        this.f72448d.setOnClickListener(new C28538c(this, aVar));
    }

    /* renamed from: k */
    public final void mo68272k(C43075l lVar) {
        this.f72451g = lVar;
    }
}
