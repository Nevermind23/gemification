package p651wd;

import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p374ce.C10396b;
import p458id.C15600b;

/* renamed from: wd.a */
public abstract class C18500a {

    /* renamed from: a */
    private static final C15600b f51975a = C15600b.m56349a(C18500a.class.getSimpleName());

    /* renamed from: b */
    private static Map f51976b;

    /* renamed from: wd.a$a */
    class C18501a implements Comparator {

        /* renamed from: d */
        final /* synthetic */ long f51977d;

        C18501a(long j) {
            this.f51977d = j;
        }

        /* renamed from: a */
        public int compare(C10396b bVar, C10396b bVar2) {
            int i = (Math.abs(((long) (bVar.mo27062e() * bVar.mo27060c())) - this.f51977d) > Math.abs(((long) (bVar2.mo27062e() * bVar2.mo27060c())) - this.f51977d) ? 1 : (Math.abs(((long) (bVar.mo27062e() * bVar.mo27060c())) - this.f51977d) == Math.abs(((long) (bVar2.mo27062e() * bVar2.mo27060c())) - this.f51977d) ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i == 0) {
                return 0;
            }
            return 1;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f51976b = hashMap;
        hashMap.put(new C10396b(176, 144), 2);
        f51976b.put(new C10396b(320, 240), 7);
        f51976b.put(new C10396b(352, 288), 3);
        f51976b.put(new C10396b(720, 480), 4);
        f51976b.put(new C10396b(1280, 720), 5);
        f51976b.put(new C10396b(1920, 1080), 6);
        f51976b.put(new C10396b(3840, 2160), 8);
    }

    /* renamed from: a */
    public static CamcorderProfile m62986a(int i, C10396b bVar) {
        long e = ((long) bVar.mo27062e()) * ((long) bVar.mo27060c());
        ArrayList arrayList = new ArrayList(f51976b.keySet());
        Collections.sort(arrayList, new C18501a(e));
        while (arrayList.size() > 0) {
            int intValue = ((Integer) f51976b.get((C10396b) arrayList.remove(0))).intValue();
            if (CamcorderProfile.hasProfile(i, intValue)) {
                return CamcorderProfile.get(i, intValue);
            }
        }
        return CamcorderProfile.get(i, 0);
    }

    /* renamed from: b */
    public static CamcorderProfile m62987b(String str, C10396b bVar) {
        try {
            return m62986a(Integer.parseInt(str), bVar);
        } catch (NumberFormatException unused) {
            f51975a.mo42880h("NumberFormatException for Camera2 id:", str);
            return CamcorderProfile.get(0);
        }
    }
}
