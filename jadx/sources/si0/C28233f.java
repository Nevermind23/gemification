package si0;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh0.C27009d;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import xh0.C29791h;

/* renamed from: si0.f */
public final class C28233f {

    /* renamed from: a */
    private final PreferencesApiManager f71595a;

    public C28233f(PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f71595a = preferencesApiManager;
    }

    /* renamed from: a */
    public final List mo67766a(List list, Set set) {
        String str;
        String str2;
        String str3;
        List list2 = list;
        Set set2 = set;
        C41536l.m120489i(list2, "categories");
        C41536l.m120489i(set2, "filteredCategories");
        boolean e = this.f71595a.getLanguage().mo90435e();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29791h hVar = (C29791h) it.next();
            long e2 = hVar.mo69987e();
            if (e) {
                str = hVar.mo69985c();
            } else {
                str = hVar.mo69986d();
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            String f = hVar.mo69989f();
            if (f == null) {
                str3 = "";
            } else {
                str3 = f;
            }
            arrayList.add(new C28228a(e2, new Image.Url(str3, new Image.Resource(C27009d.f67787c, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null), str2, set2.contains(Long.valueOf(hVar.mo69987e()))));
        }
        return arrayList;
    }
}
