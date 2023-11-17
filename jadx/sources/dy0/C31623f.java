package dy0;

import g91.C32289b0;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import u61.C39033a;
import u61.C39034b;
import ue1.C43075l;

/* renamed from: dy0.f */
public abstract class C31623f {

    /* renamed from: dy0.f$a */
    public static final class C31624a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C39034b) obj).mo92708a(), ((C39034b) obj2).mo92708a());
        }
    }

    /* renamed from: dy0.f$b */
    static final class C31625b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f78193d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31625b(List list) {
            super(1);
            this.f78193d = list;
        }

        /* renamed from: a */
        public final CharSequence invoke(C39034b bVar) {
            C41536l.m120489i(bVar, "it");
            if (!C41358y.m119999O(this.f78193d, bVar.mo92709b())) {
                return "";
            }
            String c = bVar.mo92710c();
            if (c == null) {
                c = " ";
            }
            return c + " ";
        }
    }

    /* renamed from: a */
    public static final String m93744a(String str, String str2, String str3) {
        boolean z;
        boolean z2 = false;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C32289b0.m95093e(str2);
        }
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            return C32289b0.m95093e(str);
        }
        return C32289b0.m95091c(str3);
    }

    /* renamed from: b */
    public static final C31622e m93745b(C39033a aVar, String str, List list) {
        String str2;
        String str3;
        List t0;
        List list2 = list;
        C41536l.m120489i(aVar, "<this>");
        C41536l.m120489i(list2, "templateNameParams");
        StringBuilder sb = new StringBuilder();
        String g = aVar.mo92704g();
        if (g == null) {
            g = aVar.mo92698b();
        }
        sb.append(g);
        if (sb.length() > 20) {
            sb.replace(20, sb.length(), "...");
        }
        List h = aVar.mo92705h();
        if (h == null || (t0 = C41358y.m120030t0(h, new C31624a())) == null || (str2 = C41358y.m120017g0(t0, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C31625b(list2), 30, (Object) null)) == null) {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder(str2);
        while (C40440x.m117143O(sb2, " ", false, 2, (Object) null)) {
            sb2.deleteCharAt(C40440x.m117149R(sb2));
        }
        long c = aVar.mo92699c();
        List h2 = aVar.mo92705h();
        String sb3 = sb.toString();
        C41536l.m120488h(sb3, "shortNameBuilder.toString()");
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        String sb4 = sb2.toString();
        C41536l.m120488h(sb4, "paramNameBuilder.toString()");
        return new C31622e(c, h2, sb3, str3, sb4, m93744a(aVar.mo92700d(), aVar.mo92703f(), aVar.mo92697a()));
    }
}
