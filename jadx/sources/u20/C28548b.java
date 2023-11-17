package u20;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p366bk.C10320i;
import w20.C29192a;
import x00.C29606a;

/* renamed from: u20.b */
public final class C28548b extends C29606a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28548b(Context context) {
        super(context, C10320i.list_divider_invert_tr_25_1dp);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: j */
    public boolean mo39050j(View view, RecyclerView recyclerView) {
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        int k0 = recyclerView.mo5355k0(view);
        RecyclerView.C1736h adapter = recyclerView.getAdapter();
        C41536l.m120486f(adapter);
        if (!(k0 == -1 || k0 == adapter.getItemCount() - 1)) {
            int itemViewType = adapter.getItemViewType(k0);
            C29192a.C29199g gVar = C29192a.C29199g.RECEIVER;
            if (itemViewType == gVar.mo69064b() && adapter.getItemViewType(k0 + 1) == gVar.mo69064b()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
