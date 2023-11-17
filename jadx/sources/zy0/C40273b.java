package zy0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import hy0.C36268b;
import hy0.C36270d;
import iy0.C36620o;
import j31.C36725a;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.actioncard.ActionCardData;
import p341ge.bog.designsystem.components.actioncard.ActionCardView;
import p341ge.bog.designsystem.components.actioncard.BadgeData;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p696zg.C19021a;
import xy0.C39944h;

/* renamed from: zy0.b */
public final class C40273b extends C1819o {

    /* renamed from: f */
    private final C40275c f95724f;

    /* renamed from: zy0.b$a */
    public static final class C40274a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36620o f95725d;

        /* renamed from: e */
        private final C40275c f95726e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40274a(C36620o oVar, C40275c cVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            C41536l.m120489i(cVar, "onCategoryClicked");
            this.f95725d = oVar;
            this.f95726e = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m116675j(C40274a aVar, C39944h hVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(hVar, "$item");
            aVar.f95726e.mo81981a(hVar.mo93713d());
        }

        /* renamed from: i */
        public final void mo94300i(C39944h hVar) {
            String str;
            BadgeData.TextBadge textBadge;
            C39944h hVar2 = hVar;
            C41536l.m120489i(hVar2, "item");
            this.f95725d.mo3946b().setOnClickListener(new C40272a(this, hVar2));
            ActionCardView c = this.f95725d.mo3946b();
            String F = C32343x.m95388F(hVar.mo93716f(), new Object[0]);
            C36725a a = hVar.mo93710a();
            if (a == null || (str = a.mo89541d()) == null) {
                str = "";
            }
            Image.Url url = new Image.Url(str, new Image.Resource(C36270d.f87469X, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null);
            if (hVar.mo93712c()) {
                textBadge = BadgeData.TextBadge.f38746d;
            } else {
                textBadge = null;
            }
            Color.Resource resource = r1;
            Color.Resource resource2 = new Color.Resource(C36268b.f87452d);
            c.setData(new ActionCardData(F, url, (C19021a) null, (Color) null, (Color) null, (Color) null, (Color) null, true, resource, textBadge, (String) null, (String) null, (Color) null, (Color) null, (Color) null, false, (Integer) null, (String) null, (Color) null, 523388, (DefaultConstructorMarker) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40273b(C40275c cVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(cVar, "onCategoryClicked");
        this.f95724f = cVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C40274a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo94300i((C39944h) g);
    }

    /* renamed from: l */
    public C40274a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36620o d = C36620o.m108615d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C40274a(d, this.f95724f);
    }
}
