package kotlin.jvm.internal;

import af1.C40295b;
import af1.C40297d;
import af1.C40304j;
import af1.C40305k;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import te1.C42995b;

/* renamed from: kotlin.jvm.internal.d */
public abstract class C41525d implements C40295b, Serializable {
    public static final Object NO_RECEIVER = C41526a.f97702d;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C40295b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.d$a */
    private static class C41526a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static final C41526a f97702d = new C41526a();

        private C41526a() {
        }

        private Object readResolve() {
            return f97702d;
        }
    }

    protected C41525d(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C40295b compute() {
        C40295b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C40295b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C40295b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C40297d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return C41520a0.m120437c(cls);
        }
        return C41520a0.m120436b(cls);
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C40295b getReflected() {
        C40295b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C42995b();
    }

    public C40304j getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C40305k getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
