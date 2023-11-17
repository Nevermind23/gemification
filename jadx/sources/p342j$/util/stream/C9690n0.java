package p342j$.util.stream;

import p342j$.util.C9365J;
import p342j$.util.C9503j;
import p342j$.util.C9504k;
import p342j$.util.C9506m;
import p342j$.util.C9759y;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9440T;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9448a0;
import p342j$.util.function.C9450b0;
import p342j$.util.function.C9452c0;
import p342j$.util.function.C9454d0;
import p342j$.util.function.C9462h0;
import p342j$.util.function.C9480q0;
import p342j$.util.function.C9494x0;

/* renamed from: j$.util.stream.n0 */
public interface C9690n0 extends C9664i {
    /* renamed from: A */
    long mo26077A(long j, C9440T t);

    /* renamed from: D */
    IntStream mo26078D(C9454d0 d0Var);

    /* renamed from: H */
    boolean mo26079H(C9450b0 b0Var);

    /* renamed from: J */
    boolean mo26080J(C9450b0 b0Var);

    /* renamed from: O */
    Stream mo26081O(C9448a0 a0Var);

    /* renamed from: Q */
    C9690n0 mo26082Q(C9450b0 b0Var);

    /* renamed from: a0 */
    void mo26065a0(C9444X x);

    C9543G asDoubleStream();

    C9504k average();

    Stream boxed();

    long count();

    C9690n0 distinct();

    /* renamed from: e */
    void mo26066e(C9444X x);

    /* renamed from: e0 */
    Object mo26088e0(C9494x0 x0Var, C9480q0 q0Var, BiConsumer biConsumer);

    C9506m findAny();

    C9506m findFirst();

    /* renamed from: i */
    C9506m mo26091i(C9440T t);

    C9759y iterator();

    C9690n0 limit(long j);

    C9506m max();

    C9506m min();

    C9690n0 parallel();

    /* renamed from: q */
    C9690n0 mo26095q(C9444X x);

    /* renamed from: r */
    C9690n0 mo26096r(C9448a0 a0Var);

    C9690n0 sequential();

    C9690n0 skip(long j);

    C9690n0 sorted();

    C9365J spliterator();

    long sum();

    C9503j summaryStatistics();

    /* renamed from: t */
    C9543G mo26101t(C9452c0 c0Var);

    long[] toArray();

    /* renamed from: x */
    boolean mo26103x(C9450b0 b0Var);

    /* renamed from: y */
    C9690n0 mo26104y(C9462h0 h0Var);
}
