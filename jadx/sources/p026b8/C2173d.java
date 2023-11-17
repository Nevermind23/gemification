package p026b8;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b8.d */
public class C2173d {

    /* renamed from: a */
    private final SimpleArrayMap f6356a = new SimpleArrayMap();

    /* renamed from: b */
    private final SimpleArrayMap f6357b = new SimpleArrayMap();

    /* renamed from: a */
    private static void m8296a(C2173d dVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            dVar.mo7064k(objectAnimator.getPropertyName(), objectAnimator.getValues());
            dVar.mo7065l(objectAnimator.getPropertyName(), C2174e.m8308b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    private PropertyValuesHolder[] m8297b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* renamed from: c */
    public static C2173d m8298c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m8299d(context, resourceId);
    }

    /* renamed from: d */
    public static C2173d m8299d(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m8300e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m8300e(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: e */
    private static C2173d m8300e(List list) {
        C2173d dVar = new C2173d();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m8296a(dVar, (Animator) list.get(i));
        }
        return dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2173d)) {
            return false;
        }
        return this.f6356a.equals(((C2173d) obj).f6356a);
    }

    /* renamed from: f */
    public ObjectAnimator mo7058f(String str, Object obj, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, mo7059g(str));
        ofPropertyValuesHolder.setProperty(property);
        mo7060h(str).mo7067a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: g */
    public PropertyValuesHolder[] mo7059g(String str) {
        if (mo7062i(str)) {
            return m8297b((PropertyValuesHolder[]) this.f6357b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public C2174e mo7060h(String str) {
        if (mo7063j(str)) {
            return (C2174e) this.f6356a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f6356a.hashCode();
    }

    /* renamed from: i */
    public boolean mo7062i(String str) {
        return this.f6357b.get(str) != null;
    }

    /* renamed from: j */
    public boolean mo7063j(String str) {
        return this.f6356a.get(str) != null;
    }

    /* renamed from: k */
    public void mo7064k(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f6357b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: l */
    public void mo7065l(String str, C2174e eVar) {
        this.f6356a.put(str, eVar);
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f6356a + "}\n";
    }
}
