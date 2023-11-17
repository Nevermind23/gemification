package kotlin.properties;

import af1.C40303i;
import kotlin.jvm.internal.C41536l;

/* renamed from: kotlin.properties.c */
public abstract class C41553c implements C41555e {
    private Object value;

    public C41553c(Object obj) {
        this.value = obj;
    }

    /* access modifiers changed from: protected */
    public void afterChange(C40303i iVar, Object obj, Object obj2) {
        C41536l.m120489i(iVar, "property");
    }

    /* access modifiers changed from: protected */
    public boolean beforeChange(C40303i iVar, Object obj, Object obj2) {
        C41536l.m120489i(iVar, "property");
        return true;
    }

    public Object getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(iVar, "property");
        return this.value;
    }

    public void setValue(Object obj, C40303i iVar, Object obj2) {
        C41536l.m120489i(iVar, "property");
        Object obj3 = this.value;
        if (beforeChange(iVar, obj3, obj2)) {
            this.value = obj2;
            afterChange(iVar, obj3, obj2);
        }
    }
}
