package a41;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b31.C31120i;
import b31.C31121j;
import b31.C31122k;
import he1.C41238w;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import ue1.C43075l;
import x11.C39771d;

/* renamed from: a41.c */
public final class C30484c extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43075l f76479f;

    /* renamed from: g */
    private Integer f76480g;

    /* renamed from: a41.c$a */
    static final class C30485a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30485a f76481d = new C30485a();

        C30485a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo70833a(NewProductHeaderView.C13482a aVar) {
            C41536l.m120489i(aVar, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70833a((NewProductHeaderView.C13482a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: a41.c$b */
    public final class C30486b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C6201a f76482d;

        /* renamed from: e */
        final /* synthetic */ C30484c f76483e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30486b(C30484c cVar, C6201a aVar) {
            super(aVar.mo3946b());
            C41536l.m120489i(aVar, "binding");
            this.f76483e = cVar;
            this.f76482d = aVar;
            Integer l = cVar.mo70829l();
            if (l != null) {
                NewProductHeaderView newProductHeaderView = (NewProductHeaderView) aVar.mo3946b().findViewById(C39771d.f94476q);
                newProductHeaderView.setBackgroundTintList(ColorStateList.valueOf(C0767a.m2893c(newProductHeaderView.getContext(), l.intValue())));
            }
        }

        /* renamed from: h */
        public final void mo70834h(C30483b bVar) {
            C41536l.m120489i(bVar, "data");
            NewProductHeaderView newProductHeaderView = (NewProductHeaderView) this.f76482d.mo3946b().findViewById(C39771d.f94476q);
            newProductHeaderView.setHeaderType(bVar.mo70822c());
            newProductHeaderView.setData(bVar.mo70823d());
            String e = bVar.mo70824e();
            if (e != null) {
                newProductHeaderView.mo36609n(new Image.Url(e, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), this.f76483e.f76479f);
            }
            Image b = bVar.mo70821b();
            if (b != null) {
                newProductHeaderView.setCircularImage(b);
            }
            Image f = bVar.mo70826f();
            if (f != null) {
                newProductHeaderView.setThumbnailImage(f);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30484c(C43075l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C30485a.f76481d : lVar);
    }

    public long getItemId(int i) {
        return ((C30483b) mo6027g(i)).mo70820a();
    }

    public int getItemViewType(int i) {
        return ((C30483b) mo6027g(i)).mo70822c().ordinal();
    }

    /* renamed from: l */
    public final Integer mo70829l() {
        return this.f76480g;
    }

    /* renamed from: m */
    public void onBindViewHolder(C30486b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo70834h((C30483b) g);
    }

    /* renamed from: n */
    public C30486b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == NewProductHeaderView.C13482a.WHITE.ordinal()) {
            C31122k d = C31122k.m92608d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C30486b(this, d);
        } else if (i == NewProductHeaderView.C13482a.BLACK.ordinal()) {
            C31120i d2 = C31120i.m92600d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C30486b(this, d2);
        } else {
            C31121j d3 = C31121j.m92604d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            return new C30486b(this, d3);
        }
    }

    /* renamed from: o */
    public final void mo70832o(Integer num) {
        this.f76480g = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30484c(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onLoadFailed");
        this.f76479f = lVar;
    }
}
