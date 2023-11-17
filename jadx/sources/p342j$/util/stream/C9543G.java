package p342j$.util.stream;

import p342j$.util.C9359D;
import p342j$.util.C9499g;
import p342j$.util.C9504k;
import p342j$.util.C9510q;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9467k;
import p342j$.util.function.C9468k0;
import p342j$.util.function.C9475o;
import p342j$.util.function.C9481r;
import p342j$.util.function.C9483s;
import p342j$.util.function.C9485t;
import p342j$.util.function.C9491w;
import p342j$.util.function.C9493x;
import p342j$.util.function.C9494x0;

/* renamed from: j$.util.stream.G */
public interface C9543G extends C9664i {
    /* renamed from: C */
    C9504k mo25706C(C9467k kVar);

    /* renamed from: E */
    Object mo25709E(C9494x0 x0Var, C9468k0 k0Var, BiConsumer biConsumer);

    /* renamed from: I */
    double mo25710I(double d, C9467k kVar);

    /* renamed from: L */
    Stream mo25711L(C9481r rVar);

    /* renamed from: R */
    C9543G mo25713R(C9493x xVar);

    /* renamed from: W */
    IntStream mo25714W(C9485t tVar);

    /* renamed from: Z */
    C9543G mo25715Z(C9483s sVar);

    C9504k average();

    Stream boxed();

    /* renamed from: c */
    C9543G mo25718c(C9475o oVar);

    long count();

    C9543G distinct();

    C9504k findAny();

    C9504k findFirst();

    C9510q iterator();

    /* renamed from: j0 */
    boolean mo25724j0(C9483s sVar);

    /* renamed from: k */
    void mo25678k(C9475o oVar);

    /* renamed from: l */
    boolean mo25725l(C9483s sVar);

    /* renamed from: l0 */
    void mo25679l0(C9475o oVar);

    C9543G limit(long j);

    /* renamed from: m0 */
    boolean mo25727m0(C9483s sVar);

    C9504k max();

    C9504k min();

    C9543G parallel();

    C9543G sequential();

    C9543G skip(long j);

    C9543G sorted();

    C9359D spliterator();

    double sum();

    C9499g summaryStatistics();

    double[] toArray();

    /* renamed from: v */
    C9543G mo25738v(C9481r rVar);

    /* renamed from: w */
    C9690n0 mo25739w(C9491w wVar);
}
