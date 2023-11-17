package p001a0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: a0.b */
abstract class C0006b {

    /* renamed from: a0.b$a */
    public interface C0007a {
        /* renamed from: a */
        void mo28a(Object obj, Rect rect);
    }

    /* renamed from: a0.b$b */
    public interface C0008b {
        /* renamed from: a */
        Object mo30a(Object obj, int i);

        /* renamed from: b */
        int mo31b(Object obj);
    }

    /* renamed from: a0.b$c */
    private static class C0009c implements Comparator {

        /* renamed from: d */
        private final Rect f16d = new Rect();

        /* renamed from: e */
        private final Rect f17e = new Rect();

        /* renamed from: f */
        private final boolean f18f;

        /* renamed from: g */
        private final C0007a f19g;

        C0009c(boolean z, C0007a aVar) {
            this.f18f = z;
            this.f19g = aVar;
        }

        public int compare(Object obj, Object obj2) {
            Rect rect = this.f16d;
            Rect rect2 = this.f17e;
            this.f19g.mo28a(obj, rect);
            this.f19g.mo28a(obj2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                if (this.f18f) {
                    return 1;
                }
                return -1;
            } else if (i3 <= i4) {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    if (this.f18f) {
                        return 1;
                    }
                    return -1;
                } else if (i7 <= i8) {
                    return 0;
                } else {
                    if (this.f18f) {
                        return -1;
                    }
                    return 1;
                }
            } else if (this.f18f) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    /* renamed from: a */
    private static boolean m50a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b = m51b(i, rect, rect2);
        if (m51b(i, rect, rect3) || !b) {
            return false;
        }
        if (!m59j(i, rect, rect3) || i == 17 || i == 66) {
            return true;
        }
        if (m60k(i, rect, rect2) < m62m(i, rect, rect3)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m51b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static Object m52c(Object obj, C0008b bVar, C0007a aVar, Object obj2, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int b = bVar.mo31b(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i2 = 0; i2 < b; i2++) {
            Object a = bVar.mo30a(obj, i2);
            if (a != obj2) {
                aVar.mo28a(a, rect3);
                if (m57h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = a;
                }
            }
        }
        return obj3;
    }

    /* renamed from: d */
    public static Object m53d(Object obj, C0008b bVar, C0007a aVar, Object obj2, int i, boolean z, boolean z2) {
        int b = bVar.mo31b(obj);
        ArrayList arrayList = new ArrayList(b);
        for (int i2 = 0; i2 < b; i2++) {
            arrayList.add(bVar.mo30a(obj, i2));
        }
        Collections.sort(arrayList, new C0009c(z, aVar));
        if (i == 1) {
            return m55f(obj2, arrayList, z2);
        }
        if (i == 2) {
            return m54e(obj2, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    private static Object m54e(Object obj, ArrayList arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (obj == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(obj);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static Object m55f(Object obj, ArrayList arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (obj == null) {
            i = size;
        } else {
            i = arrayList.indexOf(obj);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m56g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    private static boolean m57h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m58i(rect, rect2, i)) {
            return false;
        }
        if (!m58i(rect, rect3, i) || m50a(i, rect, rect2, rect3)) {
            return true;
        }
        if (!m50a(i, rect, rect3, rect2) && m56g(m60k(i, rect, rect2), m64o(i, rect, rect2)) < m56g(m60k(i, rect, rect3), m64o(i, rect, rect3))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m58i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    private static boolean m59j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else if (rect.bottom <= rect2.top) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    private static int m60k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m61l(i, rect, rect2));
    }

    /* renamed from: l */
    private static int m61l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    private static int m62m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m63n(i, rect, rect2));
    }

    /* renamed from: n */
    private static int m63n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    private static int m64o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
