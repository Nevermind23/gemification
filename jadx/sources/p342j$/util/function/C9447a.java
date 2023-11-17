package p342j$.util.function;

import java.util.function.BiConsumer;
import p342j$.util.function.BiConsumer;

/* renamed from: j$.util.function.a */
public final /* synthetic */ class C9447a implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f26095a;

    private /* synthetic */ C9447a(BiConsumer biConsumer) {
        this.f26095a = biConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ BiConsumer m34803a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).f26070a : new C9447a(biConsumer);
    }

    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.f26095a.accept(obj, obj2);
    }

    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return m34803a(this.f26095a.mo25420c(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiConsumer biConsumer = this.f26095a;
        if (obj instanceof C9447a) {
            obj = ((C9447a) obj).f26095a;
        }
        return biConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26095a.hashCode();
    }
}
