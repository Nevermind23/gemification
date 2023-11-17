package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.c */
public class C0627c {

    /* renamed from: a */
    private final ConstraintLayout f2605a;

    /* renamed from: b */
    C0630d f2606b;

    /* renamed from: c */
    int f2607c = -1;

    /* renamed from: d */
    int f2608d = -1;

    /* renamed from: e */
    private SparseArray f2609e = new SparseArray();

    /* renamed from: f */
    private SparseArray f2610f = new SparseArray();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    static class C0628a {

        /* renamed from: a */
        int f2611a;

        /* renamed from: b */
        ArrayList f2612b = new ArrayList();

        /* renamed from: c */
        int f2613c = -1;

        /* renamed from: d */
        C0630d f2614d;

        public C0628a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0639g.f2809G6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0639g.f2817H6) {
                    this.f2611a = obtainStyledAttributes.getResourceId(index, this.f2611a);
                } else if (index == C0639g.f2825I6) {
                    this.f2613c = obtainStyledAttributes.getResourceId(index, this.f2613c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2613c);
                    context.getResources().getResourceName(this.f2613c);
                    if ("layout".equals(resourceTypeName)) {
                        C0630d dVar = new C0630d();
                        this.f2614d = dVar;
                        dVar.mo2941g(context, this.f2613c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2934a(C0629b bVar) {
            this.f2612b.add(bVar);
        }

        /* renamed from: b */
        public int mo2935b(float f, float f2) {
            for (int i = 0; i < this.f2612b.size(); i++) {
                if (((C0629b) this.f2612b.get(i)).mo2936a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    static class C0629b {

        /* renamed from: a */
        float f2615a = Float.NaN;

        /* renamed from: b */
        float f2616b = Float.NaN;

        /* renamed from: c */
        float f2617c = Float.NaN;

        /* renamed from: d */
        float f2618d = Float.NaN;

        /* renamed from: e */
        int f2619e = -1;

        /* renamed from: f */
        C0630d f2620f;

        public C0629b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0639g.f3006e7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0639g.f3015f7) {
                    this.f2619e = obtainStyledAttributes.getResourceId(index, this.f2619e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2619e);
                    context.getResources().getResourceName(this.f2619e);
                    if ("layout".equals(resourceTypeName)) {
                        C0630d dVar = new C0630d();
                        this.f2620f = dVar;
                        dVar.mo2941g(context, this.f2619e);
                    }
                } else if (index == C0639g.f3024g7) {
                    this.f2618d = obtainStyledAttributes.getDimension(index, this.f2618d);
                } else if (index == C0639g.f3033h7) {
                    this.f2616b = obtainStyledAttributes.getDimension(index, this.f2616b);
                } else if (index == C0639g.f3042i7) {
                    this.f2617c = obtainStyledAttributes.getDimension(index, this.f2617c);
                } else if (index == C0639g.f3051j7) {
                    this.f2615a = obtainStyledAttributes.getDimension(index, this.f2615a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2936a(float f, float f2) {
            if (!Float.isNaN(this.f2615a) && f < this.f2615a) {
                return false;
            }
            if (!Float.isNaN(this.f2616b) && f2 < this.f2616b) {
                return false;
            }
            if (!Float.isNaN(this.f2617c) && f > this.f2617c) {
                return false;
            }
            if (Float.isNaN(this.f2618d) || f2 <= this.f2618d) {
                return true;
            }
            return false;
        }
    }

    C0627c(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2605a = constraintLayout;
        m2421a(context, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2421a(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r1 = 0
        L_0x000d:
            r2 = 1
            if (r0 == r2) goto L_0x008b
            if (r0 == 0) goto L_0x007a
            r3 = 2
            if (r0 == r3) goto L_0x0017
            goto L_0x007d
        L_0x0017:
            java.lang.String r0 = r9.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            int r4 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x004c;
                case 80204913: goto L_0x0042;
                case 1382829617: goto L_0x0039;
                case 1657696882: goto L_0x002f;
                case 1901439077: goto L_0x0025;
                default: goto L_0x0024;
            }     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
        L_0x0024:
            goto L_0x0056
        L_0x0025:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            r2 = r6
            goto L_0x0057
        L_0x002f:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            r2 = 0
            goto L_0x0057
        L_0x0039:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0042:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            r2 = r3
            goto L_0x0057
        L_0x004c:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r0 == 0) goto L_0x0056
            r2 = r5
            goto L_0x0057
        L_0x0056:
            r2 = -1
        L_0x0057:
            if (r2 == r3) goto L_0x006d
            if (r2 == r6) goto L_0x0062
            if (r2 == r5) goto L_0x005e
            goto L_0x007d
        L_0x005e:
            r7.m2422b(r8, r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            goto L_0x007d
        L_0x0062:
            androidx.constraintlayout.widget.c$b r0 = new androidx.constraintlayout.widget.c$b     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r0.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            if (r1 == 0) goto L_0x007d
            r1.mo2934a(r0)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            goto L_0x007d
        L_0x006d:
            androidx.constraintlayout.widget.c$a r1 = new androidx.constraintlayout.widget.c$a     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r1.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            android.util.SparseArray r0 = r7.f2609e     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            int r2 = r1.f2611a     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            r0.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            goto L_0x007d
        L_0x007a:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
        L_0x007d:
            int r0 = r9.next()     // Catch:{ XmlPullParserException -> 0x0087, IOException -> 0x0082 }
            goto L_0x000d
        L_0x0082:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x008b
        L_0x0087:
            r8 = move-exception
            r8.printStackTrace()
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0627c.m2421a(android.content.Context, int):void");
    }

    /* renamed from: b */
    private void m2422b(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0630d dVar = new C0630d();
        int attributeCount = xmlPullParser.getAttributeCount();
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName == null || attributeValue == null || !"id".equals(attributeName)) {
                i2++;
            } else {
                if (attributeValue.contains(C11110u2.f31950c)) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.mo2948q(context, xmlPullParser);
                this.f2610f.put(i, dVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo2932c(C0637e eVar) {
    }

    /* renamed from: d */
    public void mo2933d(int i, float f, float f2) {
        C0630d dVar;
        C0628a aVar;
        int b;
        C0630d dVar2;
        int i2 = this.f2607c;
        if (i2 == i) {
            if (i == -1) {
                aVar = (C0628a) this.f2609e.valueAt(0);
            } else {
                aVar = (C0628a) this.f2609e.get(i2);
            }
            int i3 = this.f2608d;
            if ((i3 == -1 || !((C0629b) aVar.f2612b.get(i3)).mo2936a(f, f2)) && this.f2608d != (b = aVar.mo2935b(f, f2))) {
                if (b == -1) {
                    dVar2 = this.f2606b;
                } else {
                    dVar2 = ((C0629b) aVar.f2612b.get(b)).f2620f;
                }
                if (b != -1) {
                    int i4 = ((C0629b) aVar.f2612b.get(b)).f2619e;
                }
                if (dVar2 != null) {
                    this.f2608d = b;
                    dVar2.mo2937c(this.f2605a);
                    return;
                }
                return;
            }
            return;
        }
        this.f2607c = i;
        C0628a aVar2 = (C0628a) this.f2609e.get(i);
        int b2 = aVar2.mo2935b(f, f2);
        if (b2 == -1) {
            dVar = aVar2.f2614d;
        } else {
            dVar = ((C0629b) aVar2.f2612b.get(b2)).f2620f;
        }
        if (b2 != -1) {
            int i5 = ((C0629b) aVar2.f2612b.get(b2)).f2619e;
        }
        if (dVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f2608d = b2;
        dVar.mo2937c(this.f2605a);
    }
}
