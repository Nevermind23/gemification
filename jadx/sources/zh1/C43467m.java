package zh1;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: zh1.m */
public final class C43467m {

    /* renamed from: a */
    private final Method f101338a;

    /* renamed from: b */
    private final List f101339b;

    C43467m(Method method, List list) {
        this.f101338a = method;
        this.f101339b = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public Method mo102172a() {
        return this.f101338a;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.f101338a.getDeclaringClass().getName(), this.f101338a.getName(), this.f101339b});
    }
}
