package zh1;

import java.lang.annotation.Annotation;

/* renamed from: zh1.z */
final class C43516z implements C43515y {

    /* renamed from: a */
    private static final C43515y f101490a = new C43516z();

    C43516z() {
    }

    /* renamed from: a */
    static Annotation[] m124801a(Annotation[] annotationArr) {
        if (C43439a0.m124624l(annotationArr, C43515y.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f101490a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class annotationType() {
        return C43515y.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C43515y;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + C43515y.class.getName() + "()";
    }
}
