package mh1;

import af1.C40296c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.error.NoParameterFoundException;
import sh1.C42576a;

/* renamed from: mh1.a */
public class C41769a {

    /* renamed from: b */
    public static final C41770a f98074b = new C41770a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final List f98075a;

    /* renamed from: mh1.a$a */
    public static final class C41770a {
        private C41770a() {
        }

        public /* synthetic */ C41770a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C41769a(List list) {
        C41536l.m120489i(list, "values");
        this.f98075a = list;
    }

    /* renamed from: a */
    public Object mo96591a(int i, C40296c cVar) {
        C41536l.m120489i(cVar, "clazz");
        if (this.f98075a.size() > i) {
            return this.f98075a.get(i);
        }
        throw new NoParameterFoundException("Can't get injected parameter #" + i + " from " + this + " for type '" + C42576a.m123264a(cVar) + '\'');
    }

    /* renamed from: b */
    public Object mo94869b(C40296c cVar) {
        C41536l.m120489i(cVar, "clazz");
        List T = C41358y.m120004T(this.f98075a);
        ArrayList arrayList = new ArrayList();
        for (Object next : T) {
            if (C41536l.m120484d(C41520a0.m120436b(next.getClass()), cVar)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            Object W = C41358y.m120007W(arrayList);
            if (W != null) {
                return W;
            }
            throw new NullPointerException("null cannot be cast to non-null type T");
        }
        throw new DefinitionParameterException("Ambiguous parameter injection: more than one value of type '" + C42576a.m123264a(cVar) + "' to get from " + this + ". Check your injection parameters");
    }

    /* renamed from: c */
    public final List mo96592c() {
        return this.f98075a;
    }

    public String toString() {
        return "DefinitionParameters" + C41358y.m120036z0(this.f98075a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41769a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41341q.m119907j() : list);
    }
}
