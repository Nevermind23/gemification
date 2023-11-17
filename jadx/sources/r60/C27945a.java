package r60;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o60.C26760a;
import o60.C26761b;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.model.ProductDescriptionDetailsUiModel;
import p341ge.bog.mobilebank.cleanarch.productdescription.presentation.model.ProductDescriptionUiModel;

/* renamed from: r60.a */
public final class C27945a {
    /* renamed from: a */
    public final ProductDescriptionDetailsUiModel mo67512a(C26760a aVar) {
        C41536l.m120489i(aVar, "productDescriptionDetails");
        return new ProductDescriptionDetailsUiModel(aVar.mo65962c(), aVar.mo65960a(), aVar.mo65961b(), aVar.mo65963d(), aVar.mo65964e());
    }

    /* renamed from: b */
    public final ProductDescriptionUiModel mo67513b(C26761b bVar) {
        C41536l.m120489i(bVar, "productDescriptionText");
        String g = bVar.mo65975g();
        String h = bVar.mo65976h();
        String b = bVar.mo65969b();
        String c = bVar.mo65970c();
        String d = bVar.mo65971d();
        String e = bVar.mo65972e();
        String a = bVar.mo65968a();
        List<C26760a> f = bVar.mo65974f();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(f, 10));
        for (C26760a a2 : f) {
            arrayList.add(mo67512a(a2));
        }
        return new ProductDescriptionUiModel(g, h, b, c, d, e, a, arrayList);
    }
}
