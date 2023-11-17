package kotlin.jvm.internal;

import af1.C40295b;
import af1.C40298e;

/* renamed from: kotlin.jvm.internal.j */
public abstract class C41534j extends C41525d implements C41533i, C40298e {
    private final int arity;
    private final int flags;

    public C41534j(int i) {
        this(i, C41525d.NO_RECEIVER, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C40295b computeReflected() {
        return C41520a0.m120435a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41534j) {
            C41534j jVar = (C41534j) obj;
            if (!getName().equals(jVar.getName()) || !getSignature().equals(jVar.getSignature()) || this.flags != jVar.flags || this.arity != jVar.arity || !C41536l.m120484d(getBoundReceiver(), jVar.getBoundReceiver()) || !C41536l.m120484d(getOwner(), jVar.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof C40298e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C40295b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C41534j(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* access modifiers changed from: protected */
    public C40298e getReflected() {
        return (C40298e) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41534j(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
