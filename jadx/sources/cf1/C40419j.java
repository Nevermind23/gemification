package cf1;

import bf1.C40342g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: cf1.j */
public final class C40419j implements Serializable {

    /* renamed from: e */
    public static final C40420a f96017e = new C40420a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final Pattern f96018d;

    /* renamed from: cf1.j$a */
    public static final class C40420a {
        private C40420a() {
        }

        public /* synthetic */ C40420a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final int m117018b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        /* renamed from: c */
        public final String mo94495c(String str) {
            C41536l.m120489i(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            C41536l.m120488h(quoteReplacement, "quoteReplacement(literal)");
            return quoteReplacement;
        }
    }

    /* renamed from: cf1.j$b */
    private static final class C40421b implements Serializable {

        /* renamed from: f */
        public static final C40422a f96019f = new C40422a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;

        /* renamed from: d */
        private final String f96020d;

        /* renamed from: e */
        private final int f96021e;

        /* renamed from: cf1.j$b$a */
        public static final class C40422a {
            private C40422a() {
            }

            public /* synthetic */ C40422a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C40421b(String str, int i) {
            C41536l.m120489i(str, "pattern");
            this.f96020d = str;
            this.f96021e = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f96020d, this.f96021e);
            C41536l.m120488h(compile, "compile(pattern, flags)");
            return new C40419j(compile);
        }
    }

    /* renamed from: cf1.j$c */
    static final class C40423c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40419j f96022d;

        /* renamed from: e */
        final /* synthetic */ CharSequence f96023e;

        /* renamed from: f */
        final /* synthetic */ int f96024f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40423c(C40419j jVar, CharSequence charSequence, int i) {
            super(0);
            this.f96022d = jVar;
            this.f96023e = charSequence;
            this.f96024f = i;
        }

        /* renamed from: b */
        public final C40412h invoke() {
            return this.f96022d.mo94486a(this.f96023e, this.f96024f);
        }
    }

    /* renamed from: cf1.j$d */
    /* synthetic */ class C40424d extends C41535k implements C43075l {

        /* renamed from: d */
        public static final C40424d f96025d = new C40424d();

        C40424d() {
            super(1, C40412h.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        /* renamed from: b */
        public final C40412h invoke(C40412h hVar) {
            C41536l.m120489i(hVar, "p0");
            return hVar.next();
        }
    }

    public C40419j(Pattern pattern) {
        C41536l.m120489i(pattern, "nativePattern");
        this.f96018d = pattern;
    }

    /* renamed from: b */
    public static /* synthetic */ C40412h m117007b(C40419j jVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return jVar.mo94486a(charSequence, i);
    }

    /* renamed from: d */
    public static /* synthetic */ C40342g m117008d(C40419j jVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return jVar.mo94487c(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.f96018d.pattern();
        C41536l.m120488h(pattern, "nativePattern.pattern()");
        return new C40421b(pattern, this.f96018d.flags());
    }

    /* renamed from: a */
    public final C40412h mo94486a(CharSequence charSequence, int i) {
        C41536l.m120489i(charSequence, "input");
        Matcher matcher = this.f96018d.matcher(charSequence);
        C41536l.m120488h(matcher, "nativePattern.matcher(input)");
        return C40425k.m117025d(matcher, i, charSequence);
    }

    /* renamed from: c */
    public final C40342g mo94487c(CharSequence charSequence, int i) {
        C41536l.m120489i(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return C40349m.m116847h(new C40423c(this, charSequence, i), C40424d.f96025d);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    /* renamed from: e */
    public final String mo94488e() {
        String pattern = this.f96018d.pattern();
        C41536l.m120488h(pattern, "nativePattern.pattern()");
        return pattern;
    }

    /* renamed from: f */
    public final boolean mo94489f(CharSequence charSequence) {
        C41536l.m120489i(charSequence, "input");
        return this.f96018d.matcher(charSequence).matches();
    }

    /* renamed from: g */
    public final String mo94490g(CharSequence charSequence, String str) {
        C41536l.m120489i(charSequence, "input");
        C41536l.m120489i(str, "replacement");
        String replaceAll = this.f96018d.matcher(charSequence).replaceAll(str);
        C41536l.m120488h(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: h */
    public final String mo94491h(CharSequence charSequence, C43075l lVar) {
        C41536l.m120489i(charSequence, "input");
        C41536l.m120489i(lVar, "transform");
        int i = 0;
        C40412h b = m117007b(this, charSequence, 0, 2, (Object) null);
        if (b == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, b.mo94468c().mo102098b().intValue());
            sb.append((CharSequence) lVar.invoke(b));
            i = b.mo94468c().mo102100i().intValue() + 1;
            b = b.next();
            if (i >= length) {
                break;
            }
        } while (b != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: i */
    public final List mo94492i(CharSequence charSequence, int i) {
        C41536l.m120489i(charSequence, "input");
        C40440x.m117177s0(i);
        Matcher matcher = this.f96018d.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C41339p.m119900e(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = C43429k.m124588g(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if ((i3 >= 0 && arrayList.size() == i3) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: k */
    public final Pattern mo94493k() {
        return this.f96018d;
    }

    public String toString() {
        String pattern = this.f96018d.toString();
        C41536l.m120488h(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40419j(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cf1.C40419j.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40419j(java.lang.String r2, cf1.C40426l r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            cf1.j$a r0 = f96017e
            int r3 = r3.mo94498b()
            int r3 = r0.m117018b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cf1.C40419j.<init>(java.lang.String, cf1.l):void");
    }
}
