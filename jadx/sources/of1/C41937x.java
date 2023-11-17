package of1;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe1.C42193c;

/* renamed from: of1.x */
public final class C41937x {

    /* renamed from: e */
    public static final C41938a f98573e = new C41938a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Pattern f98574f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Pattern f98575g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f98576a;

    /* renamed from: b */
    private final String f98577b;

    /* renamed from: c */
    private final String f98578c;

    /* renamed from: d */
    private final String[] f98579d;

    /* renamed from: of1.x$a */
    public static final class C41938a {
        private C41938a() {
        }

        public /* synthetic */ C41938a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41937x mo97019a(String str) {
            C41536l.m120489i(str, "<this>");
            Matcher matcher = C41937x.f98574f.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C41536l.m120488h(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                C41536l.m120488h(locale, "US");
                String lowerCase = group.toLowerCase(locale);
                C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                C41536l.m120488h(group2, "typeSubtype.group(2)");
                C41536l.m120488h(locale, "US");
                String lowerCase2 = group2.toLowerCase(locale);
                C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = C41937x.f98575g.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (C40439w.m117109H(group4, "'", false, 2, (Object) null) && C40439w.m117114r(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                C41536l.m120488h(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new C41937x(str, lowerCase, lowerCase2, (String[]) array, (DefaultConstructorMarker) null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        /* renamed from: b */
        public final C41937x mo97020b(String str) {
            C41536l.m120489i(str, "<this>");
            try {
                return mo97019a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public /* synthetic */ C41937x(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m121707d(C41937x xVar, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return xVar.mo97012c(charset);
    }

    /* renamed from: e */
    public static final C41937x m121708e(String str) {
        return f98573e.mo97019a(str);
    }

    /* renamed from: g */
    public static final C41937x m121709g(String str) {
        return f98573e.mo97020b(str);
    }

    /* renamed from: c */
    public final Charset mo97012c(Charset charset) {
        String f = mo97014f("charset");
        if (f == null) {
            return charset;
        }
        try {
            return Charset.forName(f);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C41937x) && C41536l.m120484d(((C41937x) obj).f98576a, this.f98576a);
    }

    /* renamed from: f */
    public final String mo97014f(String str) {
        C41536l.m120489i(str, "name");
        int i = 0;
        int c = C42193c.m122497c(0, this.f98579d.length - 1, 2);
        if (c < 0) {
            return null;
        }
        while (true) {
            int i2 = i + 2;
            if (C40439w.m117115s(this.f98579d[i], str, true)) {
                return this.f98579d[i + 1];
            }
            if (i == c) {
                return null;
            }
            i = i2;
        }
    }

    /* renamed from: h */
    public final String mo97015h() {
        return this.f98578c;
    }

    public int hashCode() {
        return this.f98576a.hashCode();
    }

    /* renamed from: i */
    public final String mo97017i() {
        return this.f98577b;
    }

    public String toString() {
        return this.f98576a;
    }

    private C41937x(String str, String str2, String str3, String[] strArr) {
        this.f98576a = str;
        this.f98577b = str2;
        this.f98578c = str3;
        this.f98579d = strArr;
    }
}
