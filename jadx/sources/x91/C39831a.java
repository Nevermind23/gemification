package x91;

import android.graphics.drawable.Drawable;
import g91.C32289b0;
import j31.C36725a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l11.C37059a;
import m11.C37202b;
import p341ge.bog.designsystem.components.common.Image;
import s91.C38462a;
import y91.C40037b;
import y91.C40038c;
import y91.C40039d;
import y91.C40040e;
import y91.C40041f;

/* renamed from: x91.a */
public final class C39831a {

    /* renamed from: a */
    private final C37059a f94541a;

    public C39831a(C37059a aVar) {
        C41536l.m120489i(aVar, "getPreLoginBackgroundUrl");
        this.f94541a = aVar;
    }

    /* renamed from: a */
    private final C40037b m115582a(C36725a aVar) {
        String str;
        String c = aVar.mo89540c();
        C37202b invoke = this.f94541a.invoke();
        if (invoke != null) {
            str = invoke.mo90260a();
        } else {
            str = null;
        }
        return new C40037b(aVar, C41536l.m120484d(str, aVar.mo89540c()), c, aVar.mo89542e());
    }

    /* renamed from: b */
    public final C40039d mo93528b(C38462a aVar) {
        String str;
        Image.Url url;
        String d;
        String c;
        String d2;
        C41536l.m120489i(aVar, "wishDetails");
        C36725a c2 = aVar.mo92022c();
        if (c2 == null || (d2 = c2.mo89541d()) == null) {
            str = null;
        } else {
            str = C32289b0.m95091c(d2);
        }
        String valueOf = String.valueOf(aVar.mo92023d());
        C36725a c3 = aVar.mo92022c();
        boolean z = false;
        if (c3 != null && c3.mo89542e()) {
            z = true;
        }
        C40041f fVar = new C40041f(str, valueOf, z);
        C36725a a = aVar.mo92020a();
        if (a == null || (d = a.mo89541d()) == null || (c = C32289b0.m95091c(d)) == null) {
            url = null;
        } else {
            url = new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        }
        C40038c cVar = new C40038c(url, "");
        C40040e eVar = new C40040e((String) null, 1, (DefaultConstructorMarker) null);
        List<C36725a> b = aVar.mo92021b();
        ArrayList arrayList = new ArrayList();
        for (C36725a a2 : b) {
            C40037b a3 = m115582a(a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new C40039d(fVar, cVar, eVar, arrayList);
    }
}
