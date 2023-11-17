package p342j$.time.zone;

import com.salesforce.marketingcloud.C11398b;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.g */
public abstract class C9355g {

    /* renamed from: a */
    private static final CopyOnWriteArrayList f25919a;

    /* renamed from: b */
    private static final ConcurrentHashMap f25920b = new ConcurrentHashMap(C11398b.f33140s, 0.75f, 2);

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f25919a = copyOnWriteArrayList;
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new C9353e(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    protected C9355g() {
    }

    /* renamed from: a */
    public static C9351c m34559a(String str, boolean z) {
        if (str != null) {
            ConcurrentHashMap concurrentHashMap = f25920b;
            C9355g gVar = (C9355g) concurrentHashMap.get(str);
            if (gVar != null) {
                return gVar.mo25166b(str);
            }
            if (concurrentHashMap.isEmpty()) {
                throw new C9352d("No time-zone data files registered");
            }
            throw new C9352d("Unknown time-zone ID: ".concat(str));
        }
        throw new NullPointerException("zoneId");
    }

    /* renamed from: d */
    public static void m34560d(C9355g gVar) {
        if (gVar != null) {
            for (String str : gVar.mo25167c()) {
                if (str == null) {
                    throw new NullPointerException("zoneId");
                } else if (((C9355g) f25920b.putIfAbsent(str, gVar)) != null) {
                    throw new C9352d("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + gVar);
                }
            }
            f25919a.add(gVar);
            return;
        }
        throw new NullPointerException("provider");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C9351c mo25166b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Set mo25167c();
}
