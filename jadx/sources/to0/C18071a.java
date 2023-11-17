package to0;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;

/* renamed from: to0.a */
public final class C18071a {

    /* renamed from: b */
    public static final C18072a f51302b = new C18072a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final PreferencesApiManager f51303a;

    /* renamed from: to0.a$a */
    public static final class C18072a {
        private C18072a() {
        }

        public /* synthetic */ C18072a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C18071a(PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(preferencesApiManager, "preferences");
        this.f51303a = preferencesApiManager;
    }

    /* renamed from: a */
    private final boolean m62107a(String str) {
        if (Calendar.getInstance().getTimeInMillis() - Long.parseLong(str) > 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo45755b(String str) {
        ArrayList arrayList;
        C41536l.m120489i(str, "key");
        Set<String> allDismissedOffers = this.f51303a.getAllDismissedOffers(str);
        Set set = null;
        if (allDismissedOffers != null) {
            arrayList = new ArrayList();
            for (T next : allDismissedOffers) {
                String str2 = (String) next;
                C41536l.m120488h(str2, "offer");
                if (!m62107a((String) C40440x.m117182x0(str2, new String[]{"_"}, false, 0, 6, (Object) null).get(1))) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        PreferencesApiManager preferencesApiManager = this.f51303a;
        if (arrayList != null) {
            set = C41358y.m119993D0(arrayList);
        }
        preferencesApiManager.setAllDismissedOffers(str, set);
    }

    /* renamed from: c */
    public final boolean mo45756c(String str, long j) {
        C41536l.m120489i(str, "preferenceKey");
        Set<String> allDismissedOffers = this.f51303a.getAllDismissedOffers(str);
        if (allDismissedOffers == null || allDismissedOffers.isEmpty()) {
            return false;
        }
        for (String str2 : allDismissedOffers) {
            C41536l.m120488h(str2, "it");
            if (C41536l.m120484d(C40440x.m117182x0(str2, new String[]{"_"}, false, 0, 6, (Object) null).get(0), String.valueOf(j))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void mo45757d(String str, long j) {
        C41536l.m120489i(str, "preferenceKey");
        Set allDismissedOffers = this.f51303a.getAllDismissedOffers(str);
        if (allDismissedOffers == null) {
            allDismissedOffers = new LinkedHashSet();
        }
        long currentTimeMillis = System.currentTimeMillis();
        allDismissedOffers.add(j + "_" + currentTimeMillis);
        this.f51303a.setAllDismissedOffers(str, allDismissedOffers);
    }
}
