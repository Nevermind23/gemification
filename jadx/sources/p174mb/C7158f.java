package p174mb;

import android.content.Intent;
import com.google.zxing.C5751a;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: mb.f */
public abstract class C7158f {

    /* renamed from: a */
    private static final Pattern f21184a = Pattern.compile(",");

    /* renamed from: b */
    static final Set f21185b;

    /* renamed from: c */
    static final Set f21186c;

    /* renamed from: d */
    private static final Set f21187d;

    /* renamed from: e */
    static final Set f21188e;

    /* renamed from: f */
    static final Set f21189f;

    /* renamed from: g */
    static final Set f21190g;

    /* renamed from: h */
    static final Set f21191h;

    /* renamed from: i */
    private static final Map f21192i;

    static {
        EnumSet of = EnumSet.of(C5751a.QR_CODE);
        f21188e = of;
        EnumSet of2 = EnumSet.of(C5751a.DATA_MATRIX);
        f21189f = of2;
        EnumSet of3 = EnumSet.of(C5751a.AZTEC);
        f21190g = of3;
        EnumSet of4 = EnumSet.of(C5751a.PDF_417);
        f21191h = of4;
        EnumSet of5 = EnumSet.of(C5751a.UPC_A, new C5751a[]{C5751a.UPC_E, C5751a.EAN_13, C5751a.EAN_8, C5751a.RSS_14, C5751a.RSS_EXPANDED});
        f21185b = of5;
        EnumSet of6 = EnumSet.of(C5751a.CODE_39, C5751a.CODE_93, C5751a.CODE_128, C5751a.ITF, C5751a.CODABAR);
        f21186c = of6;
        EnumSet copyOf = EnumSet.copyOf(of5);
        f21187d = copyOf;
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f21192i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }

    /* renamed from: a */
    public static Set m27540a(Intent intent) {
        List list;
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        if (stringExtra != null) {
            list = Arrays.asList(f21184a.split(stringExtra));
        } else {
            list = null;
        }
        return m27541b(list, intent.getStringExtra("SCAN_MODE"));
    }

    /* renamed from: b */
    private static Set m27541b(Iterable iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(C5751a.class);
            try {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    noneOf.add(C5751a.valueOf((String) it.next()));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return (Set) f21192i.get(str);
        }
        return null;
    }
}
