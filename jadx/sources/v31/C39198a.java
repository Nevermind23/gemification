package v31;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;

/* renamed from: v31.a */
public final class C39198a extends C1819o {

    /* renamed from: v31.a$a */
    public static final class C39199a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final SingleLineTextItem f93383d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39199a(SingleLineTextItem singleLineTextItem) {
            super(singleLineTextItem);
            C41536l.m120489i(singleLineTextItem, "view");
            this.f93383d = singleLineTextItem;
        }

        /* renamed from: h */
        public final void mo92836h(String str) {
            C41536l.m120489i(str, "text");
            this.f93383d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            this.f93383d.setText(str);
        }
    }

    public C39198a() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C39199a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo92836h((String) g);
    }

    /* renamed from: l */
    public C39199a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        Context context = viewGroup.getContext();
        C41536l.m120488h(context, "parent.context");
        return new C39199a(new SingleLineTextItem(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
