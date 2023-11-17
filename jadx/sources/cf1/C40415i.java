package cf1;

import cf1.C40412h;
import ie1.C41301a;
import ie1.C41308c;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import ze1.C43420e;

/* renamed from: cf1.i */
final class C40415i implements C40412h {

    /* renamed from: a */
    private final Matcher f96010a;

    /* renamed from: b */
    private final CharSequence f96011b;

    /* renamed from: c */
    private final C40411g f96012c = new C40417b(this);

    /* renamed from: d */
    private List f96013d;

    /* renamed from: cf1.i$a */
    public static final class C40416a extends C41308c {

        /* renamed from: e */
        final /* synthetic */ C40415i f96014e;

        C40416a(C40415i iVar) {
            this.f96014e = iVar;
        }

        /* renamed from: b */
        public int mo94472b() {
            return this.f96014e.m116994e().groupCount() + 1;
        }

        /* renamed from: c */
        public /* bridge */ boolean mo94473c(String str) {
            return super.contains(str);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return mo94473c((String) obj);
        }

        /* renamed from: i */
        public String get(int i) {
            String group = this.f96014e.m116994e().group(i);
            return group == null ? "" : group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo94478j((String) obj);
        }

        /* renamed from: j */
        public /* bridge */ int mo94478j(String str) {
            return super.indexOf(str);
        }

        /* renamed from: l */
        public /* bridge */ int mo94479l(String str) {
            return super.lastIndexOf(str);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo94479l((String) obj);
        }
    }

    /* renamed from: cf1.i$b */
    public static final class C40417b extends C41301a implements C40411g {

        /* renamed from: d */
        final /* synthetic */ C40415i f96015d;

        /* renamed from: cf1.i$b$a */
        static final class C40418a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C40417b f96016d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C40418a(C40417b bVar) {
                super(1);
                this.f96016d = bVar;
            }

            /* renamed from: a */
            public final C40410f mo94485a(int i) {
                return this.f96016d.mo94482i(i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo94485a(((Number) obj).intValue());
            }
        }

        C40417b(C40415i iVar) {
            this.f96015d = iVar;
        }

        /* renamed from: b */
        public int mo94472b() {
            return this.f96015d.m116994e().groupCount() + 1;
        }

        /* renamed from: c */
        public /* bridge */ boolean mo94481c(C40410f fVar) {
            return super.contains(fVar);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj == null ? true : obj instanceof C40410f)) {
                return false;
            }
            return mo94481c((C40410f) obj);
        }

        /* renamed from: i */
        public C40410f mo94482i(int i) {
            C43420e c = C40425k.m117027f(this.f96015d.m116994e(), i);
            if (c.mo102098b().intValue() < 0) {
                return null;
            }
            String group = this.f96015d.m116994e().group(i);
            C41536l.m120488h(group, "matchResult.group(index)");
            return new C40410f(group, c);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator iterator() {
            return C40355o.m116863u(C41358y.m119997M(C41341q.m119908k(this)), new C40418a(this)).iterator();
        }
    }

    public C40415i(Matcher matcher, CharSequence charSequence) {
        C41536l.m120489i(matcher, "matcher");
        C41536l.m120489i(charSequence, "input");
        this.f96010a = matcher;
        this.f96011b = charSequence;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final MatchResult m116994e() {
        return this.f96010a;
    }

    /* renamed from: a */
    public C40412h.C40414b mo94466a() {
        return C40412h.C40413a.m116991a(this);
    }

    /* renamed from: b */
    public List mo94467b() {
        if (this.f96013d == null) {
            this.f96013d = new C40416a(this);
        }
        List list = this.f96013d;
        C41536l.m120486f(list);
        return list;
    }

    /* renamed from: c */
    public C43420e mo94468c() {
        return C40425k.m117026e(m116994e());
    }

    public String getValue() {
        String group = m116994e().group();
        C41536l.m120488h(group, "matchResult.group()");
        return group;
    }

    public C40412h next() {
        int i;
        int end = m116994e().end();
        if (m116994e().end() == m116994e().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f96011b.length()) {
            return null;
        }
        Matcher matcher = this.f96010a.pattern().matcher(this.f96011b);
        C41536l.m120488h(matcher, "matcher.pattern().matcher(input)");
        return C40425k.m117025d(matcher, i2, this.f96011b);
    }
}
