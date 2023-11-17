package yx0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.load.resource.bitmap.C2524n;
import fx0.C32023c;
import g91.C32343x;
import java.util.Map;
import jx0.C36812b0;
import jx0.C36844z;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p035c4.C2256h;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: yx0.g */
public final class C40104g extends C1819o {

    /* renamed from: h */
    public static final C40105a f95339h = new C40105a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private Integer f95340f;

    /* renamed from: g */
    private C43075l f95341g;

    /* renamed from: yx0.g$a */
    public static final class C40105a {
        private C40105a() {
        }

        public /* synthetic */ C40105a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: yx0.g$b */
    public final class C40106b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36812b0 f95342d;

        /* renamed from: e */
        final /* synthetic */ C40104g f95343e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40106b(C40104g gVar, C36812b0 b0Var) {
            super(b0Var.mo3946b());
            C41536l.m120489i(b0Var, "binding");
            this.f95343e = gVar;
            this.f95342d = b0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m116223j(C40104g gVar, C40106b bVar, SelectElementViewData selectElementViewData, View view) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(bVar, "this$1");
            C41536l.m120489i(selectElementViewData, "$data");
            gVar.mo94051m(Integer.valueOf(bVar.getAbsoluteAdapterPosition()));
            C43075l k = gVar.mo94049k();
            if (k != null) {
                k.invoke(selectElementViewData);
            }
        }

        /* renamed from: i */
        public final void mo94052i(SelectElementViewData selectElementViewData, boolean z) {
            C41536l.m120489i(selectElementViewData, "data");
            this.itemView.setOnClickListener(new C40109h(this.f95343e, this, selectElementViewData));
            this.f95342d.f88804f.setText(selectElementViewData.mo80348h());
            ImageView imageView = this.f95342d.f88803e;
            C41536l.m120488h(imageView, "binding.iconSelected");
            C32343x.m95483r1(imageView, z, false, 2, (Object) null);
        }
    }

    /* renamed from: yx0.g$c */
    public final class C40107c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36844z f95344d;

        /* renamed from: e */
        final /* synthetic */ C40104g f95345e;

        /* renamed from: yx0.g$c$a */
        static final class C40108a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C40108a f95346d = new C40108a();

            C40108a() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setImage");
                C2394j A0 = jVar.mo7215a(new C2256h().mo7252u0(new C2524n()));
                C41536l.m120488h(A0, "apply(RequestOptions().transform(CircleCrop()))");
                return A0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40107c(C40104g gVar, C36844z zVar) {
            super(zVar.mo3946b());
            C41536l.m120489i(zVar, "binding");
            this.f95345e = gVar;
            this.f95344d = zVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m116226j(C40104g gVar, C40107c cVar, SelectElementViewData selectElementViewData, View view) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            C41536l.m120489i(selectElementViewData, "$data");
            gVar.mo94051m(Integer.valueOf(cVar.getAbsoluteAdapterPosition()));
            C43075l k = gVar.mo94049k();
            if (k != null) {
                k.invoke(selectElementViewData);
            }
        }

        /* renamed from: i */
        public final void mo94053i(SelectElementViewData selectElementViewData, boolean z) {
            SelectElementViewData selectElementViewData2 = selectElementViewData;
            C41536l.m120489i(selectElementViewData2, "data");
            this.itemView.setOnClickListener(new C40110i(this.f95345e, this, selectElementViewData2));
            this.f95344d.f88924i.setText(selectElementViewData.mo80348h());
            AppCompatImageView appCompatImageView = this.f95344d.f88921f;
            C41536l.m120488h(appCompatImageView, "binding.pacakgeImage");
            String e = selectElementViewData.mo80344e();
            if (e == null) {
                e = "";
            }
            C18368l.m62777z(appCompatImageView, new Image.Url(e, new Image.Resource(C32023c.f78830c, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null), C40108a.f95346d);
            this.f95344d.f88922g.setText(selectElementViewData.mo80341b());
            this.f95344d.f88923h.setText(selectElementViewData.mo80340a());
            AppCompatImageView appCompatImageView2 = this.f95344d.f88925j;
            C41536l.m120488h(appCompatImageView2, "binding.selectedImage");
            C32343x.m95483r1(appCompatImageView2, z, false, 2, (Object) null);
        }
    }

    public C40104g() {
        super(C37599g.f90345a.mo90787d());
    }

    public int getItemViewType(int i) {
        if (((SelectElementViewData) mo6027g(i)).mo80347g()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: k */
    public final C43075l mo94049k() {
        return this.f95341g;
    }

    /* renamed from: l */
    public final void mo94050l(C43075l lVar) {
        this.f95341g = lVar;
    }

    /* renamed from: m */
    public final void mo94051m(Integer num) {
        this.f95340f = num;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        int itemViewType = getItemViewType(i);
        boolean z = false;
        if (itemViewType == 1) {
            C40106b bVar = (C40106b) f0Var;
            Object g = mo6027g(i);
            C41536l.m120488h(g, "getItem(position)");
            SelectElementViewData selectElementViewData = (SelectElementViewData) g;
            Integer num = this.f95340f;
            if (num != null && i == num.intValue()) {
                z = true;
            }
            bVar.mo94052i(selectElementViewData, z);
        } else if (itemViewType == 2) {
            C40107c cVar = (C40107c) f0Var;
            Object g2 = mo6027g(i);
            C41536l.m120488h(g2, "getItem(position)");
            SelectElementViewData selectElementViewData2 = (SelectElementViewData) g2;
            Integer num2 = this.f95340f;
            if (num2 != null && i == num2.intValue()) {
                z = true;
            }
            cVar.mo94053i(selectElementViewData2, z);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 1) {
            C36812b0 d = C36812b0.m109061d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C40106b(this, d);
        } else if (i == 2) {
            C36844z d2 = C36844z.m109189d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
            return new C40107c(this, d2);
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }
}
