package cf1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: cf1.p */
abstract class C40430p extends C40429o {

    /* renamed from: cf1.p$a */
    static final class C40431a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C40431a f96038d = new C40431a();

        C40431a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C41536l.m120489i(str, "line");
            return str;
        }
    }

    /* renamed from: cf1.p$b */
    static final class C40432b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f96039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40432b(String str) {
            super(1);
            this.f96039d = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C41536l.m120489i(str, "line");
            return this.f96039d + str;
        }
    }

    /* renamed from: b */
    private static final C43075l m117088b(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C40431a.f96038d;
        }
        return new C40432b(str);
    }

    /* renamed from: c */
    public static final String m117089c(String str, String str2, String str3) {
        int i;
        String str4;
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "newIndent");
        C41536l.m120489i(str3, "marginPrefix");
        if (!C40439w.m117118v(str3)) {
            List f0 = C40440x.m117164f0(str);
            int length = str.length() + (str2.length() * f0.size());
            C43075l b = m117088b(str2);
            int l = C41341q.m119909l(f0);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object next : f0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C41341q.m119917t();
                }
                String str5 = (String) next;
                String str6 = null;
                if ((i2 == 0 || i2 == l) && C40439w.m117118v(str5)) {
                    str5 = null;
                } else {
                    int length2 = str5.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C40405b.m116978c(str5.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (C40439w.m117108G(str5, str3, i, false, 4, (Object) null)) {
                            C41536l.m120487g(str5, "null cannot be cast to non-null type java.lang.String");
                            str6 = str5.substring(i5 + str3.length());
                            C41536l.m120488h(str6, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (!(str6 == null || (str4 = (String) b.invoke(str6)) == null)) {
                        str5 = str4;
                    }
                }
                if (str5 != null) {
                    arrayList.add(str5);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) C41358y.m120015e0(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 124, (Object) null)).toString();
            C41536l.m120488h(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: d */
    public static final String m117090d(String str, String str2) {
        C41536l.m120489i(str, "<this>");
        C41536l.m120489i(str2, "marginPrefix");
        return m117089c(str, "", str2);
    }

    /* renamed from: e */
    public static /* synthetic */ String m117091e(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m117090d(str, str2);
    }
}
