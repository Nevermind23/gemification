package p341ge.bog.mobilebank.giftcards.presentation.filtered;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jj0.C25461b;
import jj0.C25462c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24254d;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import ui0.C28798a;
import ui0.C28799b;
import xh0.C29791h;
import xh0.C29792i;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.filtered.c */
public final class C24253c {

    /* renamed from: a */
    private final PreferencesApiManager f62721a;

    /* renamed from: b */
    private final C25461b f62722b;

    /* renamed from: c */
    private final C25462c f62723c;

    public C24253c(PreferencesApiManager preferencesApiManager, C25461b bVar, C25462c cVar) {
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(bVar, "giftCardsMapper");
        C41536l.m120489i(cVar, "offerFilters");
        this.f62721a = preferencesApiManager;
        this.f62722b = bVar;
        this.f62723c = cVar;
    }

    /* renamed from: b */
    private final C24254d.C24256b m78067b(List list, Long l, boolean z) {
        String str;
        boolean e = this.f62721a.getLanguage().mo90435e();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C29791h hVar = (C29791h) it.next();
            if (e) {
                str = hVar.mo69985c();
            } else {
                str = hVar.mo69986d();
            }
            if (str == null) {
                str = "";
            }
            arrayList.add(new C28798a(new StringSource.Raw(str), hVar.mo69987e(), l));
        }
        return new C24254d.C24256b(arrayList, z);
    }

    /* renamed from: c */
    private final List m78068c(List list, Long l, String str) {
        ArrayList arrayList;
        Object obj;
        List g;
        String str2;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long e = ((C29791h) obj).mo69987e();
            if (l != null && e == l.longValue()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C29791h hVar = (C29791h) obj;
        if (!(hVar == null || (g = hVar.mo69990g()) == null)) {
            ArrayList<C29792i> arrayList2 = new ArrayList<>();
            for (Object next : g) {
                C29792i iVar = (C29792i) next;
                C25462c cVar = this.f62723c;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (cVar.mo64032a(iVar, str2)) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (C29792i a : arrayList2) {
                C25461b bVar = this.f62722b;
                C41536l.m120486f(l);
                arrayList.add(new C24254d.C24260f(bVar.mo64031a(a, l.longValue())));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List mo61908a(C28799b bVar) {
        boolean z;
        C41536l.m120489i(bVar, "filterData");
        ArrayList arrayList = new ArrayList();
        List c = bVar.mo68527c();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (bVar.mo68528d().contains(Long.valueOf(((C29791h) next).mo69987e())) || bVar.mo68528d().isEmpty()) {
                z = true;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        Long g = bVar.mo68532g();
        if (g == null) {
            C29791h hVar = (C29791h) C41358y.m120009Y(arrayList2);
            if (hVar != null) {
                g = Long.valueOf(hVar.mo69987e());
            } else {
                g = null;
            }
        }
        if (bVar.mo68533h()) {
            arrayList.add(new C24254d.C24259e(bVar.mo68528d().size(), bVar.mo68529e()));
            arrayList.add(m78067b(arrayList2, g, bVar.mo68529e()));
        }
        String f = bVar.mo68531f();
        if (f == null) {
            f = "";
        }
        arrayList.add(new C24254d.C24261g(f, bVar.mo68529e()));
        List c2 = m78068c(arrayList2, g, bVar.mo68531f());
        if (c2 == null || c2.isEmpty()) {
            z = true;
        }
        if (z) {
            arrayList.add(C24254d.C24258d.f62731f);
        } else {
            arrayList.addAll(c2);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final StringSource mo61909d(List list, boolean z, Long l) {
        Object obj;
        String str;
        boolean z2;
        C41536l.m120489i(list, "categories");
        boolean e = this.f62721a.getLanguage().mo90435e();
        if (!z) {
            return new StringSource.Dictionary("text.discovery.page.tab.giftcard", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long e2 = ((C29791h) obj).mo69987e();
            if (l != null && e2 == l.longValue()) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C29791h hVar = (C29791h) obj;
        if (hVar == null) {
            return new StringSource.Dictionary("text.discovery.page.tab.giftcard", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
        }
        if (e) {
            str = hVar.mo69985c();
        } else {
            str = hVar.mo69986d();
        }
        if (str == null) {
            str = "";
        }
        return new StringSource.Raw(str);
    }
}
