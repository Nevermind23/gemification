package p060e1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.collection.ArrayMap;
import androidx.core.content.res.C0820l;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: e1.j0 */
public class C5946j0 {

    /* renamed from: b */
    private static final Class[] f18614b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final ArrayMap f18615c = new ArrayMap();

    /* renamed from: a */
    private final Context f18616a;

    private C5946j0(Context context) {
        this.f18616a = context;
    }

    /* renamed from: a */
    private Object m23873a(AttributeSet attributeSet, Class cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        if (attributeValue != null) {
            try {
                ArrayMap arrayMap = f18615c;
                synchronized (arrayMap) {
                    Constructor<? extends U> constructor = (Constructor) arrayMap.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f18616a.getClassLoader()).asSubclass(cls)) != null) {
                        constructor = asSubclass.getConstructor(f18614b);
                        constructor.setAccessible(true);
                        arrayMap.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(new Object[]{this.f18616a, attributeSet});
                }
                return newInstance;
            } catch (Exception e) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e);
            }
        } else {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
    }

    /* renamed from: b */
    private C5936i0 m23874b(XmlPullParser xmlPullParser, AttributeSet attributeSet, C5936i0 i0Var) {
        C5968n0 n0Var;
        C5936i0 i0Var2;
        int depth = xmlPullParser.getDepth();
        if (i0Var instanceof C5968n0) {
            n0Var = (C5968n0) i0Var;
        } else {
            n0Var = null;
        }
        loop0:
        while (true) {
            i0Var2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            i0Var2 = new C5965n(this.f18616a, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            i0Var2 = new C5905g(this.f18616a, attributeSet);
                        } else if ("slide".equals(name)) {
                            i0Var2 = new C5917g0(this.f18616a, attributeSet);
                        } else if ("explode".equals(name)) {
                            i0Var2 = new C5962m(this.f18616a, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            i0Var2 = new C5932i(this.f18616a, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            i0Var2 = new C5948k(this.f18616a, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            i0Var2 = new C5928h(this.f18616a, attributeSet);
                        } else if ("autoTransition".equals(name)) {
                            i0Var2 = new C5893c(this.f18616a, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            i0Var2 = new C5945j(this.f18616a, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            i0Var2 = new C5968n0(this.f18616a, attributeSet);
                        } else if ("transition".equals(name)) {
                            i0Var2 = (C5936i0) m23873a(attributeSet, C5936i0.class, "transition");
                        } else if ("targets".equals(name)) {
                            m23876d(xmlPullParser, attributeSet, i0Var);
                        } else if ("arcMotion".equals(name)) {
                            if (i0Var != null) {
                                i0Var.mo19359v0(new C5890b(this.f18616a, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        } else if ("pathMotion".equals(name)) {
                            if (i0Var != null) {
                                i0Var.mo19359v0((C6011z) m23873a(attributeSet, C6011z.class, "pathMotion"));
                            } else {
                                throw new RuntimeException("Invalid use of pathMotion element");
                            }
                        } else if (!"patternPathMotion".equals(name)) {
                            throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                        } else if (i0Var != null) {
                            i0Var.mo19359v0(new C5886a0(this.f18616a, attributeSet));
                        } else {
                            throw new RuntimeException("Invalid use of patternPathMotion element");
                        }
                        if (i0Var2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                m23874b(xmlPullParser, attributeSet, i0Var2);
                            }
                            if (n0Var != null) {
                                break;
                            } else if (i0Var != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            n0Var.mo19402F0(i0Var2);
        }
        return i0Var2;
    }

    /* renamed from: c */
    public static C5946j0 m23875c(Context context) {
        return new C5946j0(context);
    }

    /* renamed from: d */
    private void m23876d(XmlPullParser xmlPullParser, AttributeSet attributeSet, C5936i0 i0Var) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals("target")) {
                    TypedArray obtainStyledAttributes = this.f18616a.obtainStyledAttributes(attributeSet, C5930h0.f18552a);
                    int l = C0820l.m3069l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (l != 0) {
                        i0Var.mo19334b(l);
                    } else {
                        int l2 = C0820l.m3069l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (l2 != 0) {
                            i0Var.mo19313A(l2, true);
                        } else {
                            String m = C0820l.m3070m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (m != null) {
                                i0Var.mo19339e(m);
                            } else {
                                String m2 = C0820l.m3070m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (m2 != null) {
                                    i0Var.mo19315C(m2, true);
                                } else {
                                    String m3 = C0820l.m3070m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (m3 != null) {
                                        try {
                                            i0Var.mo19314B(Class.forName(m3), true);
                                        } catch (ClassNotFoundException e) {
                                            obtainStyledAttributes.recycle();
                                            throw new RuntimeException("Could not create " + m3, e);
                                        }
                                    } else {
                                        String m4 = C0820l.m3070m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                        if (m4 != null) {
                                            i0Var.mo19338d(Class.forName(m4));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                } else {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
            }
        }
    }

    /* renamed from: e */
    public C5936i0 mo19369e(int i) {
        XmlResourceParser xml = this.f18616a.getResources().getXml(i);
        try {
            C5936i0 b = m23874b(xml, Xml.asAttributeSet(xml), (C5936i0) null);
            xml.close();
            return b;
        } catch (XmlPullParserException e) {
            throw new InflateException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new InflateException(xml.getPositionDescription() + ": " + e2.getMessage(), e2);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
