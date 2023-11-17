package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.ArrayMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p073f1.C6149a;

public abstract class VersionedParcel {

    /* renamed from: a */
    protected final ArrayMap f5732a;

    /* renamed from: b */
    protected final ArrayMap f5733b;

    /* renamed from: c */
    protected final ArrayMap f5734c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        this.f5732a = arrayMap;
        this.f5733b = arrayMap2;
        this.f5734c = arrayMap3;
    }

    /* renamed from: N */
    private void m7378N(C6149a aVar) {
        try {
            mo6437I(m7379c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m7379c(Class cls) {
        Class cls2 = (Class) this.f5734c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f5734c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m7380d(String str) {
        Method method = (Method) this.f5732a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f5732a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m7381e(Class cls) {
        Method method = (Method) this.f5733b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m7379c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f5733b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo6429A(byte[] bArr);

    /* renamed from: B */
    public void mo6430B(byte[] bArr, int i) {
        mo6461w(i);
        mo6429A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo6431C(CharSequence charSequence);

    /* renamed from: D */
    public void mo6432D(CharSequence charSequence, int i) {
        mo6461w(i);
        mo6431C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo6433E(int i);

    /* renamed from: F */
    public void mo6434F(int i, int i2) {
        mo6461w(i2);
        mo6433E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo6435G(Parcelable parcelable);

    /* renamed from: H */
    public void mo6436H(Parcelable parcelable, int i) {
        mo6461w(i);
        mo6435G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo6437I(String str);

    /* renamed from: J */
    public void mo6438J(String str, int i) {
        mo6461w(i);
        mo6437I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo6439K(C6149a aVar, VersionedParcel versionedParcel) {
        try {
            m7381e(aVar.getClass()).invoke((Object) null, new Object[]{aVar, versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6440L(C6149a aVar) {
        if (aVar == null) {
            mo6437I((String) null);
            return;
        }
        m7378N(aVar);
        VersionedParcel b = mo6443b();
        mo6439K(aVar, b);
        b.mo6442a();
    }

    /* renamed from: M */
    public void mo6441M(C6149a aVar, int i) {
        mo6461w(i);
        mo6440L(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6442a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract VersionedParcel mo6443b();

    /* renamed from: f */
    public boolean mo6444f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo6445g();

    /* renamed from: h */
    public boolean mo6446h(boolean z, int i) {
        if (!mo6451m(i)) {
            return z;
        }
        return mo6445g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo6447i();

    /* renamed from: j */
    public byte[] mo6448j(byte[] bArr, int i) {
        if (!mo6451m(i)) {
            return bArr;
        }
        return mo6447i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo6449k();

    /* renamed from: l */
    public CharSequence mo6450l(CharSequence charSequence, int i) {
        if (!mo6451m(i)) {
            return charSequence;
        }
        return mo6449k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo6451m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C6149a mo6452n(String str, VersionedParcel versionedParcel) {
        try {
            return (C6149a) m7380d(str).invoke((Object) null, new Object[]{versionedParcel});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo6453o();

    /* renamed from: p */
    public int mo6454p(int i, int i2) {
        if (!mo6451m(i2)) {
            return i;
        }
        return mo6453o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract Parcelable mo6455q();

    /* renamed from: r */
    public Parcelable mo6456r(Parcelable parcelable, int i) {
        if (!mo6451m(i)) {
            return parcelable;
        }
        return mo6455q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo6457s();

    /* renamed from: t */
    public String mo6458t(String str, int i) {
        if (!mo6451m(i)) {
            return str;
        }
        return mo6457s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public C6149a mo6459u() {
        String s = mo6457s();
        if (s == null) {
            return null;
        }
        return mo6452n(s, mo6443b());
    }

    /* renamed from: v */
    public C6149a mo6460v(C6149a aVar, int i) {
        if (!mo6451m(i)) {
            return aVar;
        }
        return mo6459u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo6461w(int i);

    /* renamed from: x */
    public void mo6462x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo6463y(boolean z);

    /* renamed from: z */
    public void mo6464z(boolean z, int i) {
        mo6461w(i);
        mo6463y(z);
    }
}
