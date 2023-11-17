package p233r5;

/* renamed from: r5.b */
public abstract class C8064b {
    /* renamed from: a */
    public static Object m30568a(int i, Object obj, C8063a aVar, C8065c cVar) {
        Object apply;
        if (i < 1) {
            return aVar.apply(obj);
        }
        do {
            apply = aVar.apply(obj);
            obj = cVar.mo11431a(obj, apply);
            if (obj == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(obj);
            obj = cVar.mo11431a(obj, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
