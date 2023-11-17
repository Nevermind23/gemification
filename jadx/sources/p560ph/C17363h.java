package p560ph;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.C1817m;
import androidx.recyclerview.widget.C1818n;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;

/* renamed from: ph.h */
public final class C17363h {

    /* renamed from: a */
    public static final C17363h f48697a = new C17363h();

    /* renamed from: ph.h$a */
    public static final class C17364a extends C1817m {

        /* renamed from: q */
        final /* synthetic */ RecyclerView f48698q;

        /* renamed from: r */
        final /* synthetic */ C1818n f48699r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17364a(RecyclerView recyclerView, C1818n nVar, Context context) {
            super(context);
            this.f48698q = recyclerView;
            this.f48699r = nVar;
        }

        /* renamed from: t */
        public int mo6017t(View view, int i) {
            if (this.f48698q.getLayoutManager() == null || view == null) {
                return 0;
            }
            C1818n nVar = this.f48699r;
            RecyclerView.C1747p layoutManager = this.f48698q.getLayoutManager();
            C41536l.m120486f(layoutManager);
            int[] c = nVar.mo6023c(layoutManager, view);
            if (c != null) {
                return c[0];
            }
            return 0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public int mo6021x(int i) {
            return 1;
        }
    }

    private C17363h() {
    }

    /* renamed from: a */
    public final void mo44800a(RecyclerView recyclerView, int i, C1818n nVar) {
        C41536l.m120489i(recyclerView, "recyclerView");
        C41536l.m120489i(nVar, "snapHelper");
        C17364a aVar = new C17364a(recyclerView, nVar, recyclerView.getContext());
        aVar.mo5452p(i);
        RecyclerView.C1747p layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.mo5662W1(aVar);
        }
    }
}
