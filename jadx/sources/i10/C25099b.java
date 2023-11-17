package i10;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import ue1.C43079p;

/* renamed from: i10.b */
public abstract class C25099b {
    /* renamed from: b */
    public static final RecyclerView.C1734f0 m80060b(RecyclerView.C1734f0 f0Var, C43079p pVar) {
        C41536l.m120489i(f0Var, "<this>");
        C41536l.m120489i(pVar, "event");
        f0Var.itemView.setOnClickListener(new C25098a(pVar, f0Var));
        return f0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m80061c(C43079p pVar, RecyclerView.C1734f0 f0Var, View view) {
        C41536l.m120489i(pVar, "$event");
        C41536l.m120489i(f0Var, "$this_listen");
        pVar.invoke(Integer.valueOf(f0Var.getAdapterPosition()), Integer.valueOf(f0Var.getItemViewType()));
    }
}
