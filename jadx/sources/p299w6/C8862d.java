package p299w6;

import android.os.IBinder;
import java.lang.reflect.Field;
import p182n6.C7264i;
import p299w6.C8859b;

/* renamed from: w6.d */
public final class C8862d extends C8859b.C8860a {

    /* renamed from: b */
    private final Object f24832b;

    private C8862d(Object obj) {
        this.f24832b = obj;
    }

    /* renamed from: T1 */
    public static C8859b m32984T1(Object obj) {
        return new C8862d(obj);
    }

    /* renamed from: y */
    public static Object m32985y(C8859b bVar) {
        if (bVar instanceof C8862d) {
            return ((C8862d) bVar).f24832b;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C7264i.m27902k(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }
}
