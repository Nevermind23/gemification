package wi0;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jj0.C25461b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oh0.C27009d;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import wi0.C29440h;
import xh0.C29791h;
import xh0.C29792i;

/* renamed from: wi0.g */
public final class C29439g {

    /* renamed from: a */
    private final PreferencesApiManager f74530a;

    /* renamed from: b */
    private final C25461b f74531b;

    public C29439g(PreferencesApiManager preferencesApiManager, C25461b bVar) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(bVar, "giftCardsMapper");
        this.f74530a = preferencesApiManager;
        this.f74531b = bVar;
    }

    /* renamed from: b */
    public static /* synthetic */ List m89548b(C29439g gVar, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return gVar.mo69277a(list, str);
    }

    /* renamed from: a */
    public final List mo69277a(List list, String str) {
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        C29439g gVar = this;
        List list2 = list;
        C41536l.m120489i(list2, "categories");
        boolean e = gVar.f74530a.getLanguage().mo90435e();
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new C29440h.C29445e(str2, z));
        arrayList.add(new C29440h.C29443c(new StringSource.Dictionary("giftcard.merchant.list.categories.text", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null), new StringSource.Dictionary("giftcard.merchant.list.categories.filter", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null)));
        int i = 10;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29791h hVar = (C29791h) it.next();
            if (e) {
                str3 = hVar.mo69985c();
            } else {
                str3 = hVar.mo69986d();
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            String f = hVar.mo69989f();
            if (f == null) {
                str5 = "";
            } else {
                str5 = f;
            }
            Image.Url url = new Image.Url(str5, new Image.Resource(C27009d.f67785a, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null);
            long e2 = hVar.mo69987e();
            StringSource.Dictionary dictionary = new StringSource.Dictionary("giftcard.merchant.list.see.all.button", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
            List g = hVar.mo69990g();
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(g, i));
            for (Iterator it2 = g.iterator(); it2.hasNext(); it2 = it2) {
                arrayList3.add(gVar.f74531b.mo64031a((C29792i) it2.next(), hVar.mo69987e()));
                gVar = this;
            }
            C29440h.C29442b bVar = new C29440h.C29442b(str4, url, dictionary, e2, arrayList3);
            arrayList.add(bVar);
            arrayList2.add(bVar);
            gVar = this;
            List list3 = list;
            i = 10;
        }
        if (list.isEmpty()) {
            arrayList.add(C29440h.C29444d.f74540b);
        }
        return arrayList;
    }
}
