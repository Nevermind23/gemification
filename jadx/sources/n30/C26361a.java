package n30;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p366bk.C10320i;
import r30.C27906g;
import x00.C29606a;

/* renamed from: n30.a */
public final class C26361a extends C29606a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26361a(Context context) {
        super(context, C10320i.divider_money_request_from_contacts);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: j */
    public boolean mo39050j(View view, RecyclerView recyclerView) {
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        int k0 = recyclerView.mo5355k0(view);
        RecyclerView.C1736h adapter = recyclerView.getAdapter();
        C41536l.m120486f(adapter);
        if (k0 == -1 || k0 == adapter.getItemCount() - 1) {
            return false;
        }
        int itemViewType = adapter.getItemViewType(k0);
        int itemViewType2 = adapter.getItemViewType(k0 + 1);
        C27906g.C27907a aVar = C27906g.C27907a.MONEY_REQUEST_VERTICAL;
        if ((itemViewType != aVar.mo67483b() || itemViewType2 == aVar.mo67483b()) && itemViewType != C27906g.C27907a.MONEY_REQUEST_HORIZONTAL.mo67483b()) {
            return false;
        }
        return true;
    }
}
