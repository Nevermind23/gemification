package bf1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import ve1.C43151a;

/* renamed from: bf1.o */
abstract class C40355o extends C40353n {

    /* renamed from: bf1.o$a */
    public static final class C40356a implements Iterable, C43151a {

        /* renamed from: d */
        final /* synthetic */ C40342g f95849d;

        public C40356a(C40342g gVar) {
            this.f95849d = gVar;
        }

        public Iterator iterator() {
            return this.f95849d.iterator();
        }
    }

    /* renamed from: bf1.o$b */
    static final class C40357b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C40357b f95850d = new C40357b();

        C40357b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj == null);
        }
    }

    /* renamed from: bf1.o$c */
    public static final class C40358c implements C40342g {

        /* renamed from: a */
        final /* synthetic */ C40342g f95851a;

        /* renamed from: b */
        final /* synthetic */ Comparator f95852b;

        C40358c(C40342g gVar, Comparator comparator) {
            this.f95851a = gVar;
            this.f95852b = comparator;
        }

        public Iterator iterator() {
            List B = C40355o.m116851B(this.f95851a);
            C41349u.m119946y(B, this.f95852b);
            return B.iterator();
        }
    }

    /* renamed from: A */
    public static List m116850A(C40342g gVar) {
        C41536l.m120489i(gVar, "<this>");
        return C41341q.m119914q(m116851B(gVar));
    }

    /* renamed from: B */
    public static List m116851B(C40342g gVar) {
        C41536l.m120489i(gVar, "<this>");
        return (List) m116868z(gVar, new ArrayList());
    }

    /* renamed from: j */
    public static Iterable m116852j(C40342g gVar) {
        C41536l.m120489i(gVar, "<this>");
        return new C40356a(gVar);
    }

    /* renamed from: k */
    public static C40342g m116853k(C40342g gVar, int i) {
        boolean z;
        C41536l.m120489i(gVar, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return gVar;
        } else {
            if (gVar instanceof C40336c) {
                return ((C40336c) gVar).mo94367a(i);
            }
            return new C40334b(gVar, i);
        }
    }

    /* renamed from: l */
    public static C40342g m116854l(C40342g gVar, C43075l lVar) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(lVar, "predicate");
        return new C40338e(gVar, true, lVar);
    }

    /* renamed from: m */
    public static final C40342g m116855m(C40342g gVar, C43075l lVar) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(lVar, "predicate");
        return new C40338e(gVar, false, lVar);
    }

    /* renamed from: n */
    public static C40342g m116856n(C40342g gVar) {
        C41536l.m120489i(gVar, "<this>");
        C40342g m = m116855m(gVar, C40357b.f95850d);
        C41536l.m120487g(m, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return m;
    }

    /* renamed from: o */
    public static Object m116857o(C40342g gVar) {
        C41536l.m120489i(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: p */
    public static Object m116858p(C40342g gVar) {
        C41536l.m120489i(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: q */
    public static final Appendable m116859q(C40342g gVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(appendable, "buffer");
        C41536l.m120489i(charSequence, "separator");
        C41536l.m120489i(charSequence2, "prefix");
        C41536l.m120489i(charSequence3, "postfix");
        C41536l.m120489i(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object next : gVar) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C40429o.m117087a(appendable, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: r */
    public static final String m116860r(C40342g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(charSequence, "separator");
        C41536l.m120489i(charSequence2, "prefix");
        C41536l.m120489i(charSequence3, "postfix");
        C41536l.m120489i(charSequence4, "truncated");
        String sb = ((StringBuilder) m116859q(gVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C41536l.m120488h(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: s */
    public static /* synthetic */ String m116861s(C40342g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m116860r(gVar, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    /* renamed from: t */
    public static Object m116862t(C40342g gVar) {
        C41536l.m120489i(gVar, "<this>");
        Iterator it = gVar.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: u */
    public static C40342g m116863u(C40342g gVar, C43075l lVar) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(lVar, "transform");
        return new C40365s(gVar, lVar);
    }

    /* renamed from: v */
    public static C40342g m116864v(C40342g gVar, C43075l lVar) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(lVar, "transform");
        return m116856n(new C40365s(gVar, lVar));
    }

    /* renamed from: w */
    public static C40342g m116865w(C40342g gVar, Comparator comparator) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(comparator, "comparator");
        return new C40358c(gVar, comparator);
    }

    /* renamed from: x */
    public static C40342g m116866x(C40342g gVar, int i) {
        boolean z;
        C41536l.m120489i(gVar, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C40349m.m116844e();
        } else {
            if (gVar instanceof C40336c) {
                return ((C40336c) gVar).mo94368b(i);
            }
            return new C40361q(gVar, i);
        }
    }

    /* renamed from: y */
    public static C40342g m116867y(C40342g gVar, C43075l lVar) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(lVar, "predicate");
        return new C40363r(gVar, lVar);
    }

    /* renamed from: z */
    public static final Collection m116868z(C40342g gVar, Collection collection) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(collection, "destination");
        for (Object add : gVar) {
            collection.add(add);
        }
        return collection;
    }
}
