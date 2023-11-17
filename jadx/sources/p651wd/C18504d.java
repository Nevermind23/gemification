package p651wd;

import android.os.Build;
import android.util.Range;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p458id.C15600b;

/* renamed from: wd.d */
public abstract class C18504d {

    /* renamed from: a */
    private static final C15600b f51978a = C15600b.m56349a("FpsRangeValidator");

    /* renamed from: b */
    private static final Map f51979b;

    static {
        HashMap hashMap = new HashMap();
        f51979b = hashMap;
        hashMap.put("Google Pixel 4", Arrays.asList(new Range[]{new Range(15, 60)}));
        hashMap.put("Google Pixel 4a", Arrays.asList(new Range[]{new Range(15, 60)}));
    }

    /* renamed from: a */
    public static boolean m62992a(Range range) {
        C15600b bVar = f51978a;
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        bVar.mo42878c("Build.MODEL:", str, "Build.BRAND:", Build.BRAND, "Build.MANUFACTURER:", str2);
        List list = (List) f51979b.get(str2 + " " + str);
        if (list == null || !list.contains(range)) {
            return true;
        }
        bVar.mo42878c("Dropping range:", range);
        return false;
    }
}
