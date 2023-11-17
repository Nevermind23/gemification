package p347af;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C41536l;
import p469io.reactivex.exceptions.CompositeException;
import p652we.C18559k;

/* renamed from: af.f */
public final class C9853f {

    /* renamed from: a */
    private final List f26711a;

    public C9853f(List list) {
        C41536l.m120490j(list, "streamAdapterFactories");
        this.f26711a = list;
    }

    /* renamed from: a */
    public final C18559k mo26346a(Type type) {
        C41536l.m120490j(type, "type");
        ArrayList arrayList = new ArrayList();
        for (C18559k.C18560a a : this.f26711a) {
            try {
                return a.mo33551a(type);
            } catch (Throwable th) {
                arrayList.add(th);
            }
        }
        Object[] array = arrayList.toArray(new Throwable[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Throwable[] thArr = (Throwable[]) array;
        CompositeException compositeException = new CompositeException((Throwable[]) Arrays.copyOf(thArr, thArr.length));
        throw new IllegalStateException("Cannot resolve stream adapter for type " + type + '.', compositeException);
    }
}
