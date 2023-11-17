package p341ge.bog.mobilebank.hubmenu.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10145d;
import com.salesforce.marketingcloud.UrlHandler;
import he1.C41217g;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pk0.C27588d;
import ue1.C43064a;
import ue1.C43075l;
import zk0.C30326f;

/* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.SearchItemsView */
public final class SearchItemsView extends RecyclerView implements C30326f.C30330d {

    /* renamed from: S0 */
    public static final C24442a f63051S0 = new C24442a((DefaultConstructorMarker) null);

    /* renamed from: P0 */
    private final C41217g f63052P0;

    /* renamed from: Q0 */
    private final C41217g f63053Q0;

    /* renamed from: R0 */
    private C43075l f63054R0;

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.SearchItemsView$a */
    public static final class C24442a {
        private C24442a() {
        }

        public /* synthetic */ C24442a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.SearchItemsView$b */
    static final class C24443b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Context f63055d;

        /* renamed from: e */
        final /* synthetic */ SearchItemsView f63056e;

        /* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.SearchItemsView$b$a */
        public static final class C24444a extends RecyclerView.C1756u {

            /* renamed from: a */
            final /* synthetic */ Context f63057a;

            /* renamed from: b */
            final /* synthetic */ SearchItemsView f63058b;

            C24444a(Context context, SearchItemsView searchItemsView) {
                this.f63057a = context;
                this.f63058b = searchItemsView;
            }

            /* renamed from: d */
            public void mo5739d(RecyclerView recyclerView, int i) {
                C41536l.m120489i(recyclerView, "recyclerView");
                C10145d.m37091e(this.f63057a, this.f63058b);
                super.mo5739d(recyclerView, i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24443b(Context context, SearchItemsView searchItemsView) {
            super(0);
            this.f63055d = context;
            this.f63056e = searchItemsView;
        }

        /* renamed from: b */
        public final C24444a invoke() {
            return new C24444a(this.f63055d, this.f63056e);
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.view.SearchItemsView$c */
    static final class C24445c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SearchItemsView f63059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24445c(SearchItemsView searchItemsView) {
            super(0);
            this.f63059d = searchItemsView;
        }

        /* renamed from: b */
        public final C30326f invoke() {
            C30326f fVar = new C30326f();
            fVar.mo70648j(this.f63059d);
            return fVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchItemsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: P1 */
    private final void m78496P1() {
        setLayoutManager(new LinearLayoutManager(getContext()));
        setAdapter(getSearchItemsAdapter());
        mo5363n(getScrollListener());
    }

    private final C24443b.C24444a getScrollListener() {
        return (C24443b.C24444a) this.f63053Q0.getValue();
    }

    private final C30326f getSearchItemsAdapter() {
        return (C30326f) this.f63052P0.getValue();
    }

    /* renamed from: Q1 */
    public final void mo62214Q1(C43075l lVar) {
        C41536l.m120489i(lVar, UrlHandler.ACTION);
        this.f63054R0 = lVar;
    }

    /* renamed from: R1 */
    public final void mo62215R1(List list) {
        C41536l.m120489i(list, "searchItems");
        getSearchItemsAdapter().mo70650l(list);
        getSearchItemsAdapter().notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo62216b(C27588d.C27591c cVar) {
        C41536l.m120489i(cVar, "searchItem");
        C43075l lVar = this.f63054R0;
        if (lVar != null) {
            lVar.invoke(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo5367o1(getScrollListener());
        super.onDetachedFromWindow();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchItemsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchItemsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f63052P0 = C41219i.m119470b(new C24445c(this));
        this.f63053Q0 = C41219i.m119470b(new C24443b(context, this));
        m78496P1();
    }
}
