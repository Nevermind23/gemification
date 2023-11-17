package p342j$.util;

import java.util.PrimitiveIterator;
import p342j$.util.function.C9443W;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9461h;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.w */
public final /* synthetic */ class C9757w implements C9759y, C9502i {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfLong f26538a;

    private /* synthetic */ C9757w(PrimitiveIterator.OfLong ofLong) {
        this.f26538a = ofLong;
    }

    /* renamed from: b */
    public static /* synthetic */ C9759y m35900b(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C9758x ? ((C9758x) ofLong).f26539a : new C9757w(ofLong);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25279a(Consumer consumer) {
        this.f26538a.forEachRemaining(C9461h.m34819a(consumer));
    }

    /* renamed from: d */
    public final /* synthetic */ void mo25288d(C9444X x) {
        this.f26538a.forEachRemaining(C9443W.m34799a(x));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f26538a;
        if (obj instanceof C9757w) {
            obj = ((C9757w) obj).f26538a;
        }
        return ofLong.equals(obj);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26538a.forEachRemaining(obj);
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f26538a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26538a.hashCode();
    }

    public final /* synthetic */ long nextLong() {
        return this.f26538a.nextLong();
    }

    public final /* synthetic */ void remove() {
        this.f26538a.remove();
    }
}
