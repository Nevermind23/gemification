package p341ge.bog.mobilebank.shared2.environment;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41217g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p342j$.util.Map;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.Function;
import ue1.C43064a;
import ve1.C43151a;

/* renamed from: ge.bog.mobilebank.shared2.environment.e */
public final class C34676e implements Map, C43151a, p342j$.util.Map {

    /* renamed from: d */
    private final /* synthetic */ Map f83818d;

    /* renamed from: e */
    private final C41217g f83819e = C41219i.m119470b(new C34677a(this));

    /* renamed from: ge.bog.mobilebank.shared2.environment.e$a */
    static final class C34677a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C34676e f83820d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34677a(C34676e eVar) {
            super(0);
            this.f83820d = eVar;
        }

        /* renamed from: b */
        public final String[] invoke() {
            Set<EnvironmentType> keySet = this.f83820d.keySet();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(keySet, 10));
            for (EnvironmentType name : keySet) {
                arrayList.add(name.name());
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
    }

    public C34676e(Map map) {
        C41536l.m120489i(map, "map");
        this.f83818d = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public boolean mo84657a(EnvironmentType environmentType) {
        C41536l.m120489i(environmentType, "key");
        return this.f83818d.containsKey(environmentType);
    }

    /* renamed from: b */
    public boolean mo84658b(Map map) {
        C41536l.m120489i(map, C11755a.C11756a.f34100b);
        return this.f83818d.containsValue(map);
    }

    /* renamed from: c */
    public Map mo84659c(EnvironmentType environmentType) {
        C41536l.m120489i(environmentType, "key");
        return (Map) this.f83818d.get(environmentType);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof EnvironmentType)) {
            return false;
        }
        return mo84657a((EnvironmentType) obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        return mo84658b((Map) obj);
    }

    /* renamed from: d */
    public Set mo84666d() {
        return this.f83818d.entrySet();
    }

    /* renamed from: e */
    public Set mo84667e() {
        return this.f83818d.keySet();
    }

    public final /* bridge */ Set entrySet() {
        return mo84666d();
    }

    /* renamed from: f */
    public int mo84669f() {
        return this.f83818d.size();
    }

    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof EnvironmentType)) {
            return null;
        }
        return mo84659c((EnvironmentType) obj);
    }

    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    /* renamed from: h */
    public final String[] mo84672h() {
        return (String[]) this.f83819e.getValue();
    }

    /* renamed from: i */
    public Collection mo84673i() {
        return this.f83818d.values();
    }

    public boolean isEmpty() {
        return this.f83818d.isEmpty();
    }

    /* renamed from: j */
    public java.util.Map remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ Set keySet() {
        return mo84667e();
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(java.util.Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* bridge */ int size() {
        return mo84669f();
    }

    public final /* bridge */ Collection values() {
        return mo84673i();
    }

    public /* bridge */ /* synthetic */ Object compute(Object obj, p342j$.util.function.BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, p342j$.util.function.Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, p342j$.util.function.BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void forEach(p342j$.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, p342j$.util.function.BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(p342j$.util.function.BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
