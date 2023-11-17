package of1;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41224m;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.C41523c;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe1.C42193c;
import pf1.C42197d;
import ve1.C43151a;

/* renamed from: of1.u */
public final class C41928u implements Iterable, C43151a {

    /* renamed from: e */
    public static final C41930b f98549e = new C41930b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final String[] f98550d;

    /* renamed from: of1.u$a */
    public static final class C41929a {

        /* renamed from: a */
        private final List f98551a = new ArrayList(20);

        /* renamed from: a */
        public final C41929a mo96936a(String str, String str2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            C41930b bVar = C41928u.f98549e;
            bVar.m121616d(str);
            bVar.m121617e(str2, str);
            mo96939d(str, str2);
            return this;
        }

        /* renamed from: b */
        public final C41929a mo96937b(C41928u uVar) {
            C41536l.m120489i(uVar, "headers");
            int size = uVar.size();
            for (int i = 0; i < size; i++) {
                mo96939d(uVar.mo96926c(i), uVar.mo96932n(i));
            }
            return this;
        }

        /* renamed from: c */
        public final C41929a mo96938c(String str) {
            C41536l.m120489i(str, "line");
            int W = C40440x.m117155W(str, ':', 1, false, 4, (Object) null);
            if (W != -1) {
                String substring = str.substring(0, W);
                C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(W + 1);
                C41536l.m120488h(substring2, "this as java.lang.String).substring(startIndex)");
                mo96939d(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                C41536l.m120488h(substring3, "this as java.lang.String).substring(startIndex)");
                mo96939d("", substring3);
            } else {
                mo96939d("", str);
            }
            return this;
        }

        /* renamed from: d */
        public final C41929a mo96939d(String str, String str2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            mo96942g().add(str);
            mo96942g().add(C40440x.m117146P0(str2).toString());
            return this;
        }

        /* renamed from: e */
        public final C41929a mo96940e(String str, String str2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            C41928u.f98549e.m121616d(str);
            mo96939d(str, str2);
            return this;
        }

        /* renamed from: f */
        public final C41928u mo96941f() {
            Object[] array = this.f98551a.toArray(new String[0]);
            if (array != null) {
                return new C41928u((String[]) array, (DefaultConstructorMarker) null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: g */
        public final List mo96942g() {
            return this.f98551a;
        }

        /* renamed from: h */
        public final C41929a mo96943h(String str) {
            C41536l.m120489i(str, "name");
            int i = 0;
            while (i < mo96942g().size()) {
                if (C40439w.m117115s(str, (String) mo96942g().get(i), true)) {
                    mo96942g().remove(i);
                    mo96942g().remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: i */
        public final C41929a mo96944i(String str, String str2) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            C41930b bVar = C41928u.f98549e;
            bVar.m121616d(str);
            bVar.m121617e(str2, str);
            mo96943h(str);
            mo96939d(str, str2);
            return this;
        }
    }

    /* renamed from: of1.u$b */
    public static final class C41930b {
        private C41930b() {
        }

        public /* synthetic */ C41930b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m121616d(String str) {
            boolean z;
            boolean z2;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if ('!' > charAt || charAt >= 127) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        i = i2;
                    } else {
                        throw new IllegalArgumentException(C42197d.m122554t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[LOOP:0: B:1:0x0006->B:20:0x005b, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0026 A[SYNTHETIC] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m121617e(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = r1
            L_0x0006:
                if (r2 >= r0) goto L_0x005d
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L_0x0023
                r5 = 32
                if (r5 > r4) goto L_0x001d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L_0x001d
                r5 = r6
                goto L_0x001e
            L_0x001d:
                r5 = r1
            L_0x001e:
                if (r5 == 0) goto L_0x0021
                goto L_0x0023
            L_0x0021:
                r5 = r1
                goto L_0x0024
            L_0x0023:
                r5 = r6
            L_0x0024:
                if (r5 != 0) goto L_0x005b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = pf1.C42197d.m122554t(r1, r0)
                boolean r9 = pf1.C42197d.m122513G(r9)
                if (r9 == 0) goto L_0x0047
                java.lang.String r8 = ""
                goto L_0x004d
            L_0x0047:
                java.lang.String r9 = ": "
                java.lang.String r8 = kotlin.jvm.internal.C41536l.m120497q(r9, r8)
            L_0x004d:
                java.lang.String r8 = kotlin.jvm.internal.C41536l.m120497q(r0, r8)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L_0x005b:
                r2 = r3
                goto L_0x0006
            L_0x005d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: of1.C41928u.C41930b.m121617e(java.lang.String, java.lang.String):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final String m121618f(String[] strArr, String str) {
            int length = strArr.length - 2;
            int c = C42193c.m122497c(length, 0, -2);
            if (c > length) {
                return null;
            }
            while (true) {
                int i = length - 2;
                if (C40439w.m117115s(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == c) {
                    return null;
                }
                length = i;
            }
        }

        /* renamed from: g */
        public final C41928u mo96945g(String... strArr) {
            boolean z;
            boolean z2;
            C41536l.m120489i(strArr, "namesAndValues");
            int i = 0;
            if (strArr.length % 2 == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    String str = strArr2[i2];
                    if (str != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        strArr2[i2] = C40440x.m117146P0(str).toString();
                        i2 = i3;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int c = C42193c.m122497c(0, strArr2.length - 1, 2);
                if (c >= 0) {
                    while (true) {
                        int i4 = i + 2;
                        String str2 = strArr2[i];
                        String str3 = strArr2[i + 1];
                        m121616d(str2);
                        m121617e(str3, str2);
                        if (i == c) {
                            break;
                        }
                        i = i4;
                    }
                }
                return new C41928u(strArr2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public /* synthetic */ C41928u(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    /* renamed from: l */
    public static final C41928u m121597l(String... strArr) {
        return f98549e.mo96945g(strArr);
    }

    /* renamed from: b */
    public final String mo96925b(String str) {
        C41536l.m120489i(str, "name");
        return f98549e.m121618f(this.f98550d, str);
    }

    /* renamed from: c */
    public final String mo96926c(int i) {
        return this.f98550d[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C41928u) && Arrays.equals(this.f98550d, ((C41928u) obj).f98550d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f98550d);
    }

    /* renamed from: i */
    public final Set mo96929i() {
        TreeSet treeSet = new TreeSet(C40439w.m117117u(C41524c0.f97701a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(mo96926c(i));
        }
        Set unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C41536l.m120488h(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public Iterator iterator() {
        int size = size();
        C41224m[] mVarArr = new C41224m[size];
        for (int i = 0; i < size; i++) {
            mVarArr[i] = C41233s.m119492a(mo96926c(i), mo96932n(i));
        }
        return C41523c.m120452a(mVarArr);
    }

    /* renamed from: j */
    public final C41929a mo96931j() {
        C41929a aVar = new C41929a();
        boolean unused = C41352v.m119956A(aVar.mo96942g(), this.f98550d);
        return aVar;
    }

    /* renamed from: n */
    public final String mo96932n(int i) {
        return this.f98550d[(i * 2) + 1];
    }

    /* renamed from: o */
    public final List mo96933o(String str) {
        C41536l.m120489i(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (C40439w.m117115s(str, mo96926c(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo96932n(i));
            }
            i = i2;
        }
        if (arrayList == null) {
            return C41341q.m119907j();
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C41536l.m120488h(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    public final int size() {
        return this.f98550d.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String c = mo96926c(i);
            String n = mo96932n(i);
            sb.append(c);
            sb.append(": ");
            if (C42197d.m122513G(c)) {
                n = "██";
            }
            sb.append(n);
            sb.append("\n");
            i = i2;
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private C41928u(String[] strArr) {
        this.f98550d = strArr;
    }
}
