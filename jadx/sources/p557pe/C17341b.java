package p557pe;

import java.util.List;
import lf1.C41699c;
import mf1.C41760b;
import mf1.C41761c;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import p543oe.C17180a;
import p543oe.C17181b;
import p543oe.C17182c;

/* renamed from: pe.b */
public abstract class C17341b {

    /* renamed from: a */
    private static C41760b f48657a = new C41760b();

    /* renamed from: a */
    private static void m60700a(List list, C17182c cVar, boolean z, String str, String[] strArr, int i) {
        if (list != null && cVar != null && str != null && strArr != null) {
            m60702c(cVar, z, str, strArr, i);
            list.add(cVar);
        }
    }

    /* renamed from: b */
    private static void m60701b(C17180a aVar, String str, String str2) {
        if (aVar != null && str != null && str2 != null) {
            aVar.mo44598d(new String(str));
            aVar.mo44599e(new String(str2));
            int length = str2.length();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.delete(0, stringBuffer.length());
            for (int i = 0; i < length; i++) {
                stringBuffer.append(C17342c.m60705b(str2.charAt(i)));
            }
            aVar.mo44596c(new String(stringBuffer.toString()));
            stringBuffer.delete(0, stringBuffer.length());
        }
    }

    /* renamed from: c */
    private static void m60702c(C17182c cVar, boolean z, String str, String[] strArr, int i) {
        if (cVar != null && str != null && strArr != null) {
            cVar.mo44608d(z);
            cVar.mo44609e(i);
            if (z) {
                int i2 = 1;
                if (r0 > 1) {
                    C17180a aVar = new C17180a();
                    m60701b(aVar, str, strArr[0]);
                    cVar.mo44604a().add(aVar);
                    while (i2 < r0) {
                        int size = cVar.mo44604a().size();
                        int i3 = 0;
                        while (i3 < size && !((C17180a) cVar.mo44604a().get(i3)).mo44595b().equals(strArr[i2])) {
                            i3++;
                        }
                        if (i3 == size) {
                            C17180a aVar2 = new C17180a();
                            m60701b(aVar2, str, strArr[i2]);
                            cVar.mo44604a().add(aVar2);
                        }
                        i2++;
                    }
                    return;
                }
            }
            for (String b : strArr) {
                C17180a aVar3 = new C17180a();
                m60701b(aVar3, str, b);
                cVar.mo44604a().add(aVar3);
            }
        }
    }

    /* renamed from: d */
    public static void m60703d(C17181b bVar) {
        int i;
        if (bVar != null && !C17340a.m60699a(bVar.mo44600a()) && bVar.mo44602c() != null) {
            String lowerCase = bVar.mo44600a().toLowerCase();
            if (f48657a == null) {
                f48657a = new C41760b();
            }
            f48657a.mo96544e(C41761c.f98037c);
            int length = lowerCase.length();
            StringBuffer stringBuffer = new StringBuffer();
            C17182c cVar = null;
            boolean z = true;
            int i2 = 0;
            int i3 = -1;
            String[] strArr = null;
            while (i2 < length) {
                char charAt = lowerCase.charAt(i2);
                try {
                    strArr = C41699c.m120949c(charAt, f48657a);
                } catch (BadHanyuPinyinOutputFormatCombination e) {
                    e.printStackTrace();
                }
                if (strArr == null) {
                    if (true == z) {
                        cVar = new C17182c();
                        stringBuffer.delete(0, stringBuffer.length());
                        z = false;
                        i3 = i2;
                    }
                    stringBuffer.append(charAt);
                    i = i2;
                } else {
                    if (!z) {
                        m60700a(bVar.mo44602c(), cVar, false, stringBuffer.toString(), new String[]{stringBuffer.toString()}, i3);
                        stringBuffer.delete(0, stringBuffer.length());
                        z = true;
                    }
                    C17182c cVar2 = new C17182c();
                    i = i2;
                    m60700a(bVar.mo44602c(), cVar2, true, String.valueOf(charAt), strArr, i);
                    cVar = cVar2;
                    i3 = i;
                }
                i2 = i + 1;
            }
            if (!z) {
                m60700a(bVar.mo44602c(), cVar, false, stringBuffer.toString(), new String[]{stringBuffer.toString()}, i3);
                stringBuffer.delete(0, stringBuffer.length());
            }
        }
    }
}
