package u10;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p366bk.C10322k;
import t10.C28296a;
import ue1.C43075l;

/* renamed from: u10.b */
public final class C28537b extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final ImageView f72441d;

    /* renamed from: e */
    private final TextView f72442e;

    /* renamed from: f */
    private final ImageButton f72443f;

    /* renamed from: g */
    private C43075l f72444g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28537b(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f72441d = (ImageView) view.findViewById(C10322k.bank_logo_image);
        this.f72442e = (TextView) view.findViewById(C10322k.f28771N);
        this.f72443f = (ImageButton) view.findViewById(C10322k.f28717Da);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m87467j(C28537b bVar, C28296a aVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(aVar, "$account");
        C43075l lVar = bVar.f72444g;
        if (lVar != null) {
            lVar.invoke(aVar.mo67926a());
        }
    }

    /* renamed from: i */
    public final void mo68268i(C28296a aVar) {
        C41536l.m120489i(aVar, "account");
        this.f72441d.setImageResource(aVar.mo67928c());
        this.f72442e.setText(aVar.mo67926a());
        this.f72443f.setOnClickListener(new C28536a(this, aVar));
    }

    /* renamed from: k */
    public final void mo68269k(C43075l lVar) {
        this.f72444g = lVar;
    }
}
