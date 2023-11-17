package u30;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;

/* renamed from: u30.n */
public abstract class C28567n extends RecyclerView.C1734f0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28567n(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
    }

    public abstract void onBind(Object obj);
}
