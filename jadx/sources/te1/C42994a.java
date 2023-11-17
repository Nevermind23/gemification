package te1;

import af1.C40296c;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41528e;
import kotlin.jvm.internal.C41536l;

/* renamed from: te1.a */
public abstract class C42994a {
    /* renamed from: a */
    public static final Class m123348a(C40296c cVar) {
        C41536l.m120489i(cVar, "<this>");
        Class b = ((C41528e) cVar).mo96307b();
        C41536l.m120487g(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b;
    }

    /* renamed from: b */
    public static final Class m123349b(C40296c cVar) {
        C41536l.m120489i(cVar, "<this>");
        Class b = ((C41528e) cVar).mo96307b();
        if (!b.isPrimitive()) {
            C41536l.m120487g(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b;
        }
        String name = b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b = Short.class;
                    break;
                }
                break;
        }
        C41536l.m120487g(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b;
    }

    /* renamed from: c */
    public static final C40296c m123350c(Class cls) {
        C41536l.m120489i(cls, "<this>");
        return C41520a0.m120436b(cls);
    }
}
